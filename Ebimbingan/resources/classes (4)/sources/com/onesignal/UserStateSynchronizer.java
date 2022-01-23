package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import com.onesignal.OneSignalStateSynchronizer;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

abstract class UserStateSynchronizer {
    protected final Object LOCK;
    /* access modifiers changed from: private */
    public boolean canMakeUpdates;
    private OneSignalStateSynchronizer.UserStateSynchronizerType channel;
    protected UserState currentUserState;
    private final Queue<OneSignal.OSInternalExternalUserIdUpdateCompletionHandler> externalUserIdUpdateHandlers;
    private final Object networkHandlerSyncLock;
    HashMap<Integer, NetworkHandlerThread> networkHandlerThreads;
    /* access modifiers changed from: private */
    public AtomicBoolean runningSyncUserState;
    private final Queue<OneSignal.ChangeTagsUpdateHandler> sendTagsHandlers;
    protected UserState toSyncUserState;
    protected boolean waitingForSessionResponse = false;

    /* access modifiers changed from: protected */
    public abstract void addOnSessionOrCreateExtras(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract void fireEventsForUpdateFailure(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract String getExternalId(boolean z);

    /* access modifiers changed from: protected */
    public abstract String getId();

    /* access modifiers changed from: protected */
    public abstract OneSignal.LOG_LEVEL getLogLevel();

    /* access modifiers changed from: package-private */
    public abstract boolean getSubscribed();

    /* access modifiers changed from: package-private */
    public abstract GetTagsResult getTags(boolean z);

    public abstract boolean getUserSubscribePreference();

    /* access modifiers changed from: package-private */
    public abstract void logoutEmail();

    /* access modifiers changed from: protected */
    public abstract UserState newUserState(String str, boolean z);

    /* access modifiers changed from: protected */
    public abstract void onSuccessfulSync(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract void scheduleSyncToServer();

    public abstract void setPermission(boolean z);

    /* access modifiers changed from: package-private */
    public abstract void setSubscription(boolean z);

    /* access modifiers changed from: package-private */
    public abstract void updateIdDependents(String str);

    /* access modifiers changed from: package-private */
    public abstract void updateState(JSONObject jSONObject);

    UserStateSynchronizer(OneSignalStateSynchronizer.UserStateSynchronizerType channel2) {
        Object obj;
        AtomicBoolean atomicBoolean;
        Queue<OneSignal.ChangeTagsUpdateHandler> queue;
        Queue<OneSignal.OSInternalExternalUserIdUpdateCompletionHandler> queue2;
        HashMap<Integer, NetworkHandlerThread> hashMap;
        Object obj2;
        new Object();
        this.LOCK = obj;
        new AtomicBoolean();
        this.runningSyncUserState = atomicBoolean;
        new ConcurrentLinkedQueue();
        this.sendTagsHandlers = queue;
        new ConcurrentLinkedQueue();
        this.externalUserIdUpdateHandlers = queue2;
        new HashMap<>();
        this.networkHandlerThreads = hashMap;
        new Object(this) {
            final /* synthetic */ UserStateSynchronizer this$0;

            {
                this.this$0 = this$0;
            }
        };
        this.networkHandlerSyncLock = obj2;
        this.channel = channel2;
    }

    /* access modifiers changed from: package-private */
    public OneSignalStateSynchronizer.UserStateSynchronizerType getChannelType() {
        return this.channel;
    }

    /* access modifiers changed from: package-private */
    public String getChannelString() {
        return this.channel.name().toLowerCase();
    }

    static class GetTagsResult {
        JSONObject result;
        boolean serverSuccess;

        GetTagsResult(boolean serverSuccess2, JSONObject result2) {
            this.serverSuccess = serverSuccess2;
            this.result = result2;
        }
    }

    /* access modifiers changed from: package-private */
    public String getRegistrationId() {
        return getToSyncUserState().getSyncValues().optString("identifier", (String) null);
    }

    /* access modifiers changed from: package-private */
    public boolean hasQueuedHandlers() {
        return this.externalUserIdUpdateHandlers.size() > 0;
    }

    class NetworkHandlerThread extends HandlerThread {
        static final int MAX_RETRIES = 3;
        static final int NETWORK_CALL_DELAY_TO_BUFFER_MS = 5000;
        protected static final int NETWORK_HANDLER_USERSTATE = 0;
        int currentRetry;
        Handler mHandler = null;
        int mType;
        final /* synthetic */ UserStateSynchronizer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        NetworkHandlerThread(UserStateSynchronizer this$02, int type) {
            super("OSH_NetworkHandlerThread");
            Handler handler;
            this.this$0 = this$02;
            this.mType = type;
            start();
            new Handler(getLooper());
            this.mHandler = handler;
        }

        /* access modifiers changed from: package-private */
        public void runNewJobDelayed() {
            if (this.this$0.canMakeUpdates) {
                Handler handler = this.mHandler;
                Handler handler2 = handler;
                synchronized (handler) {
                    try {
                        this.currentRetry = 0;
                        this.mHandler.removeCallbacksAndMessages((Object) null);
                        boolean postDelayed = this.mHandler.postDelayed(getNewRunnable(), 5000);
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        Handler handler3 = handler2;
                        throw th2;
                    }
                }
            }
        }

        private Runnable getNewRunnable() {
            Runnable runnable;
            switch (this.mType) {
                case 0:
                    new Runnable(this) {
                        final /* synthetic */ NetworkHandlerThread this$1;

                        {
                            this.this$1 = this$1;
                        }

                        public void run() {
                            if (!this.this$1.this$0.runningSyncUserState.get()) {
                                this.this$1.this$0.syncUserState(false);
                            }
                        }
                    };
                    return runnable;
                default:
                    return null;
            }
        }

        /* access modifiers changed from: package-private */
        public void stopScheduledRunnable() {
            this.mHandler.removeCallbacksAndMessages((Object) null);
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public boolean doRetry() {
            Handler handler = this.mHandler;
            Handler handler2 = handler;
            synchronized (handler) {
                try {
                    boolean doRetry = this.currentRetry < 3;
                    boolean futureSync = this.mHandler.hasMessages(0);
                    if (doRetry && !futureSync) {
                        this.currentRetry++;
                        boolean postDelayed = this.mHandler.postDelayed(getNewRunnable(), (long) (this.currentRetry * 15000));
                    }
                    boolean hasMessages = this.mHandler.hasMessages(0);
                    return hasMessages;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Handler handler3 = handler2;
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public JSONObject generateJsonDiff(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject cur = jSONObject;
        JSONObject changedTo = jSONObject2;
        JSONObject baseOutput = jSONObject3;
        Set<String> includeFields = set;
        Object obj = this.LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                JSONObject generateJsonDiff = JSONUtils.generateJsonDiff(cur, changedTo, baseOutput, includeFields);
                return generateJsonDiff;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public UserState getCurrentUserState() {
        Object obj = this.LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                if (this.currentUserState == null) {
                    this.currentUserState = newUserState("CURRENT_STATE", true);
                }
                return this.currentUserState;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public UserState getToSyncUserState() {
        Object obj = this.LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                if (this.toSyncUserState == null) {
                    this.toSyncUserState = newUserState("TOSYNC_STATE", true);
                }
                return this.toSyncUserState;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void initUserState() {
        Object obj = this.LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                if (this.currentUserState == null) {
                    this.currentUserState = newUserState("CURRENT_STATE", true);
                }
                UserState toSyncUserState2 = getToSyncUserState();
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void clearLocation() {
        getToSyncUserState().clearLocation();
        getToSyncUserState().persistState();
    }

    /* access modifiers changed from: package-private */
    public boolean persist() {
        if (this.toSyncUserState == null) {
            return false;
        }
        Object obj = this.LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                boolean unSynced = this.currentUserState.generateJsonDiff(this.toSyncUserState, isSessionCall()) != null;
                this.toSyncUserState.persistState();
                boolean z = unSynced;
                return z;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    private boolean isSessionCall() {
        return (getToSyncUserState().getDependValues().optBoolean("session") || getId() == null) && !this.waitingForSessionResponse;
    }

    private boolean syncEmailLogout() {
        return getToSyncUserState().getDependValues().optBoolean("logoutEmail", false);
    }

    /* access modifiers changed from: package-private */
    public void syncUserState(boolean fromSyncService) {
        this.runningSyncUserState.set(true);
        internalSyncUserState(fromSyncService);
        this.runningSyncUserState.set(false);
    }

    /* JADX INFO: finally extract failed */
    private void internalSyncUserState(boolean z) {
        boolean fromSyncService = z;
        String userId = getId();
        if (!syncEmailLogout() || userId == null) {
            if (this.currentUserState == null) {
                initUserState();
            }
            boolean isSessionCall = !fromSyncService && isSessionCall();
            Object obj = this.LOCK;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    JSONObject jsonBody = this.currentUserState.generateJsonDiff(getToSyncUserState(), isSessionCall);
                    JSONObject dependDiff = this.currentUserState.generateJsonDiffFromDependValues(getToSyncUserState(), (Set<String>) null);
                    if (jsonBody == null) {
                        this.currentUserState.persistStateAfterSync(dependDiff, (JSONObject) null);
                        sendTagsHandlersPerformOnSuccess();
                        externalUserIdUpdateHandlersPerformOnSuccess();
                        return;
                    }
                    getToSyncUserState().persistState();
                    if (!isSessionCall) {
                        doPutSync(userId, jsonBody, dependDiff);
                    } else {
                        doCreateOrNewSession(userId, jsonBody, dependDiff);
                    }
                } catch (Throwable th) {
                    while (true) {
                        Throwable th2 = th;
                        Object obj3 = obj2;
                        throw th2;
                    }
                }
            }
        } else {
            doEmailLogout(userId);
        }
    }

    private void doEmailLogout(String userId) {
        StringBuilder sb;
        JSONObject jSONObject;
        OneSignalRestClient.ResponseHandler responseHandler;
        new StringBuilder();
        String urlStr = sb.append("players/").append(userId).append("/email_logout").toString();
        new JSONObject();
        JSONObject jsonBody = jSONObject;
        try {
            ImmutableJSONObject dependValues = this.currentUserState.getDependValues();
            if (dependValues.has("email_auth_hash")) {
                JSONObject put = jsonBody.put("email_auth_hash", dependValues.optString("email_auth_hash"));
            }
            ImmutableJSONObject syncValues = this.currentUserState.getSyncValues();
            if (syncValues.has("parent_player_id")) {
                JSONObject put2 = jsonBody.put("parent_player_id", syncValues.optString("parent_player_id"));
            }
            JSONObject put3 = jsonBody.put("app_id", syncValues.optString("app_id"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        new OneSignalRestClient.ResponseHandler(this) {
            final /* synthetic */ UserStateSynchronizer this$0;

            {
                this.this$0 = this$0;
            }

            /* access modifiers changed from: package-private */
            public void onFailure(int i, String str, Throwable th) {
                StringBuilder sb;
                int statusCode = i;
                String response = str;
                Throwable th2 = th;
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.WARN;
                new StringBuilder();
                OneSignal.Log(log_level, sb.append("Failed last request. statusCode: ").append(statusCode).append("\nresponse: ").append(response).toString());
                if (this.this$0.response400WithErrorsContaining(statusCode, response, "already logged out of email")) {
                    this.this$0.logoutEmailSyncSuccess();
                } else if (this.this$0.response400WithErrorsContaining(statusCode, response, "not a valid device_type")) {
                    this.this$0.handlePlayerDeletedFromServer();
                } else {
                    this.this$0.handleNetworkFailure(statusCode);
                }
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String str) {
                String str2 = str;
                this.this$0.logoutEmailSyncSuccess();
            }
        };
        OneSignalRestClient.postSync(urlStr, jsonBody, responseHandler);
    }

    /* access modifiers changed from: private */
    public void logoutEmailSyncSuccess() {
        StringBuilder sb;
        getToSyncUserState().removeFromDependValues("logoutEmail");
        this.toSyncUserState.removeFromDependValues("email_auth_hash");
        this.toSyncUserState.removeFromSyncValues("parent_player_id");
        this.toSyncUserState.removeFromSyncValues("email");
        this.toSyncUserState.persistState();
        this.currentUserState.removeFromDependValues("email_auth_hash");
        this.currentUserState.removeFromSyncValues("parent_player_id");
        String emailLoggedOut = this.currentUserState.getSyncValues().optString("email");
        this.currentUserState.removeFromSyncValues("email");
        OneSignalStateSynchronizer.setNewSessionForEmail();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("Device successfully logged out of email: ").append(emailLoggedOut).toString());
        OneSignal.handleSuccessfulEmailLogout();
    }

    private void doPutSync(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        StringBuilder sb;
        OneSignalRestClient.ResponseHandler responseHandler;
        OneSignal.SendTagsError sendTagsError;
        String userId = str;
        JSONObject jsonBody = jSONObject;
        JSONObject dependDiff = jSONObject2;
        if (userId == null) {
            OneSignal.onesignalLog(getLogLevel(), "Error updating the user record because of the null user id");
            new OneSignal.SendTagsError(-1, "Unable to update tags: the current user is not registered with OneSignal");
            sendTagsHandlersPerformOnFailure(sendTagsError);
            externalUserIdUpdateHandlersPerformOnFailure();
            return;
        }
        new StringBuilder();
        final JSONObject jSONObject3 = jsonBody;
        final JSONObject jSONObject4 = dependDiff;
        new OneSignalRestClient.ResponseHandler(this) {
            final /* synthetic */ UserStateSynchronizer this$0;

            {
                this.this$0 = this$0;
            }

            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: package-private */
            public void onFailure(int i, String str, Throwable th) {
                StringBuilder sb;
                StringBuilder sb2;
                OneSignal.SendTagsError sendTagsError;
                int statusCode = i;
                String response = str;
                Throwable th2 = th;
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                new StringBuilder();
                OneSignal.Log(log_level, sb.append("Failed PUT sync request with status code: ").append(statusCode).append(" and response: ").append(response).toString());
                Object obj = this.this$0.LOCK;
                Object obj2 = obj;
                synchronized (obj) {
                    try {
                        if (this.this$0.response400WithErrorsContaining(statusCode, response, "No user with this id found")) {
                            this.this$0.handlePlayerDeletedFromServer();
                        } else {
                            this.this$0.handleNetworkFailure(statusCode);
                        }
                        if (jSONObject3.has(UserState.TAGS)) {
                            new OneSignal.SendTagsError(statusCode, response);
                            this.this$0.sendTagsHandlersPerformOnFailure(sendTagsError);
                        }
                        if (jSONObject3.has("external_user_id")) {
                            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.ERROR;
                            new StringBuilder();
                            OneSignal.onesignalLog(log_level2, sb2.append("Error setting external user id for push with status code: ").append(statusCode).append(" and message: ").append(response).toString());
                            this.this$0.externalUserIdUpdateHandlersPerformOnFailure();
                        }
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        Object obj3 = obj2;
                        throw th4;
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String str) {
                String str2 = str;
                Object obj = this.this$0.LOCK;
                Object obj2 = obj;
                synchronized (obj) {
                    try {
                        this.this$0.currentUserState.persistStateAfterSync(jSONObject4, jSONObject3);
                        this.this$0.onSuccessfulSync(jSONObject3);
                        if (jSONObject3.has(UserState.TAGS)) {
                            this.this$0.sendTagsHandlersPerformOnSuccess();
                        }
                        if (jSONObject3.has("external_user_id")) {
                            this.this$0.externalUserIdUpdateHandlersPerformOnSuccess();
                        }
                    } catch (Throwable th) {
                        while (true) {
                            Throwable th2 = th;
                            Object obj3 = obj2;
                            throw th2;
                        }
                    }
                }
            }
        };
        OneSignalRestClient.putSync(sb.append("players/").append(userId).toString(), jsonBody, responseHandler);
    }

    private void doCreateOrNewSession(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        StringBuilder sb;
        String urlStr;
        OneSignalRestClient.ResponseHandler responseHandler;
        String userId = str;
        JSONObject jsonBody = jSONObject;
        JSONObject dependDiff = jSONObject2;
        if (userId == null) {
            urlStr = "players";
        } else {
            new StringBuilder();
            urlStr = sb.append("players/").append(userId).append("/on_session").toString();
        }
        this.waitingForSessionResponse = true;
        addOnSessionOrCreateExtras(jsonBody);
        final JSONObject jSONObject3 = dependDiff;
        final JSONObject jSONObject4 = jsonBody;
        final String str2 = userId;
        new OneSignalRestClient.ResponseHandler(this) {
            final /* synthetic */ UserStateSynchronizer this$0;

            {
                this.this$0 = this$0;
            }

            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: package-private */
            public void onFailure(int i, String str, Throwable th) {
                StringBuilder sb;
                int statusCode = i;
                String response = str;
                Throwable th2 = th;
                Object obj = this.this$0.LOCK;
                Object obj2 = obj;
                synchronized (obj) {
                    try {
                        this.this$0.waitingForSessionResponse = false;
                        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.WARN;
                        new StringBuilder();
                        OneSignal.Log(log_level, sb.append("Failed last request. statusCode: ").append(statusCode).append("\nresponse: ").append(response).toString());
                        if (this.this$0.response400WithErrorsContaining(statusCode, response, "not a valid device_type")) {
                            this.this$0.handlePlayerDeletedFromServer();
                        } else {
                            this.this$0.handleNetworkFailure(statusCode);
                        }
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        Object obj3 = obj2;
                        throw th4;
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String str) {
                StringBuilder sb;
                JSONObject jSONObject;
                StringBuilder sb2;
                StringBuilder sb3;
                String response = str;
                Object obj = this.this$0.LOCK;
                Object obj2 = obj;
                synchronized (obj) {
                    try {
                        this.this$0.waitingForSessionResponse = false;
                        this.this$0.currentUserState.persistStateAfterSync(jSONObject3, jSONObject4);
                        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                        new StringBuilder();
                        OneSignal.onesignalLog(log_level, sb.append("doCreateOrNewSession:response: ").append(response).toString());
                        new JSONObject(response);
                        JSONObject jsonResponse = jSONObject;
                        if (jsonResponse.has(CommonProperties.ID)) {
                            String newUserId = jsonResponse.optString(CommonProperties.ID);
                            this.this$0.updateIdDependents(newUserId);
                            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.INFO;
                            new StringBuilder();
                            OneSignal.Log(log_level2, sb3.append("Device registered, UserId = ").append(newUserId).toString());
                        } else {
                            OneSignal.LOG_LEVEL log_level3 = OneSignal.LOG_LEVEL.INFO;
                            new StringBuilder();
                            OneSignal.Log(log_level3, sb2.append("session sent, UserId = ").append(str2).toString());
                        }
                        this.this$0.getUserStateForModification().putOnDependValues("session", false);
                        this.this$0.getUserStateForModification().persistState();
                        if (jsonResponse.has(OSInAppMessageController.IN_APP_MESSAGES_JSON_KEY)) {
                            OneSignal.getInAppMessageController().receivedInAppMessageJson(jsonResponse.getJSONArray(OSInAppMessageController.IN_APP_MESSAGES_JSON_KEY));
                        }
                        this.this$0.onSuccessfulSync(jSONObject4);
                    } catch (JSONException e) {
                        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "ERROR parsing on_session or create JSON Response.", e);
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        Object obj3 = obj2;
                        throw th2;
                    }
                }
            }
        };
        OneSignalRestClient.postSync(urlStr, jsonBody, responseHandler);
    }

    /* access modifiers changed from: private */
    public void handleNetworkFailure(int statusCode) {
        if (statusCode == 403) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "403 error updating player, omitting further retries!");
            fireNetworkFailureEvents();
        } else if (!getNetworkHandlerThread(0).doRetry()) {
            fireNetworkFailureEvents();
        }
    }

    private void fireNetworkFailureEvents() {
        JSONObject jsonBody = this.currentUserState.generateJsonDiff(this.toSyncUserState, false);
        if (jsonBody != null) {
            fireEventsForUpdateFailure(jsonBody);
        }
        if (getToSyncUserState().getDependValues().optBoolean("logoutEmail", false)) {
            OneSignal.handleFailedEmailLogout();
        }
    }

    /* access modifiers changed from: private */
    public boolean response400WithErrorsContaining(int statusCode, String str, String str2) {
        JSONObject jSONObject;
        String response = str;
        String contains = str2;
        if (statusCode == 400 && response != null) {
            try {
                new JSONObject(response);
                JSONObject responseJson = jSONObject;
                return responseJson.has("errors") && responseJson.optString("errors").contains(contains);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public NetworkHandlerThread getNetworkHandlerThread(Integer num) {
        Object obj;
        Integer type = num;
        Object obj2 = this.networkHandlerSyncLock;
        Object obj3 = obj2;
        synchronized (obj2) {
            try {
                if (!this.networkHandlerThreads.containsKey(type)) {
                    new NetworkHandlerThread(this, type.intValue());
                    NetworkHandlerThread put = this.networkHandlerThreads.put(type, obj);
                }
                NetworkHandlerThread networkHandlerThread = this.networkHandlerThreads.get(type);
                return networkHandlerThread;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj4 = obj3;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public UserState getUserStateForModification() {
        if (this.toSyncUserState == null) {
            this.toSyncUserState = getCurrentUserState().deepClone("TOSYNC_STATE");
        }
        scheduleSyncToServer();
        return this.toSyncUserState;
    }

    /* access modifiers changed from: package-private */
    public void updateDeviceInfo(JSONObject deviceInfo) {
        JSONObject generateJsonDiffFromIntoSyncValued = getUserStateForModification().generateJsonDiffFromIntoSyncValued(deviceInfo, (Set<String>) null);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void setNewSession() {
        Object obj;
        try {
            Object obj2 = this.LOCK;
            obj = obj2;
            synchronized (obj2) {
                getUserStateForModification().putOnDependValues("session", true);
                getUserStateForModification().persistState();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            Throwable th2 = th;
            Object obj3 = obj;
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean getSyncAsNewSession() {
        return getUserStateForModification().getDependValues().optBoolean("session");
    }

    /* access modifiers changed from: package-private */
    public void sendTags(JSONObject jSONObject, @Nullable OneSignal.ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        JSONObject tags = jSONObject;
        OneSignal.ChangeTagsUpdateHandler handler = changeTagsUpdateHandler;
        if (handler != null) {
            boolean add = this.sendTagsHandlers.add(handler);
        }
        JSONObject generateJsonDiffFromIntoSyncValued = getUserStateForModification().generateJsonDiffFromIntoSyncValued(tags, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public void syncHashedEmail(JSONObject emailFields) {
        JSONObject generateJsonDiffFromIntoSyncValued = getUserStateForModification().generateJsonDiffFromIntoSyncValued(emailFields, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public void setExternalUserId(String str, String str2, OneSignal.OSInternalExternalUserIdUpdateCompletionHandler oSInternalExternalUserIdUpdateCompletionHandler) throws JSONException {
        String externalId = str;
        String externalIdAuthHash = str2;
        OneSignal.OSInternalExternalUserIdUpdateCompletionHandler handler = oSInternalExternalUserIdUpdateCompletionHandler;
        if (handler != null) {
            boolean add = this.externalUserIdUpdateHandlers.add(handler);
        }
        UserState userState = getUserStateForModification();
        userState.putOnSyncValues("external_user_id", externalId);
        if (externalIdAuthHash != null) {
            userState.putOnSyncValues("external_user_id_auth_hash", externalIdAuthHash);
        }
    }

    /* access modifiers changed from: private */
    public void handlePlayerDeletedFromServer() {
        OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Creating new player based on missing player_id noted above.");
        OneSignal.handleSuccessfulEmailLogout();
        resetCurrentState();
        updateIdDependents((String) null);
        scheduleSyncToServer();
    }

    /* access modifiers changed from: package-private */
    public void resetCurrentState() {
        JSONObject jSONObject;
        new JSONObject();
        this.currentUserState.setSyncValues(jSONObject);
        this.currentUserState.persistState();
    }

    /* access modifiers changed from: package-private */
    public void updateLocation(LocationController.LocationPoint point) {
        getUserStateForModification().setLocation(point);
    }

    /* access modifiers changed from: package-private */
    public void readyToUpdate(boolean z) {
        boolean canMakeUpdates2 = z;
        boolean changed = this.canMakeUpdates != canMakeUpdates2;
        this.canMakeUpdates = canMakeUpdates2;
        if (changed && canMakeUpdates2) {
            scheduleSyncToServer();
        }
    }

    /* access modifiers changed from: private */
    public void sendTagsHandlersPerformOnSuccess() {
        JSONObject tags = OneSignalStateSynchronizer.getTags(false).result;
        while (true) {
            OneSignal.ChangeTagsUpdateHandler poll = this.sendTagsHandlers.poll();
            OneSignal.ChangeTagsUpdateHandler handler = poll;
            if (poll != null) {
                handler.onSuccess(tags);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void sendTagsHandlersPerformOnFailure(OneSignal.SendTagsError sendTagsError) {
        OneSignal.SendTagsError error = sendTagsError;
        while (true) {
            OneSignal.ChangeTagsUpdateHandler poll = this.sendTagsHandlers.poll();
            OneSignal.ChangeTagsUpdateHandler handler = poll;
            if (poll != null) {
                handler.onFailure(error);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void externalUserIdUpdateHandlersPerformOnSuccess() {
        while (true) {
            OneSignal.OSInternalExternalUserIdUpdateCompletionHandler poll = this.externalUserIdUpdateHandlers.poll();
            OneSignal.OSInternalExternalUserIdUpdateCompletionHandler handler = poll;
            if (poll != null) {
                handler.onComplete(getChannelString(), true);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void externalUserIdUpdateHandlersPerformOnFailure() {
        while (true) {
            OneSignal.OSInternalExternalUserIdUpdateCompletionHandler poll = this.externalUserIdUpdateHandlers.poll();
            OneSignal.OSInternalExternalUserIdUpdateCompletionHandler handler = poll;
            if (poll != null) {
                handler.onComplete(getChannelString(), false);
            } else {
                return;
            }
        }
    }
}
