package com.onesignal;

import androidx.annotation.Nullable;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.UserStateSynchronizer;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

class OneSignalStateSynchronizer {
    /* access modifiers changed from: private */
    public static HashMap<UserStateSynchronizerType, UserStateSynchronizer> userStateSynchronizers;

    OneSignalStateSynchronizer() {
    }

    enum UserStateSynchronizerType {
        ;

        public boolean isPush() {
            return equals(PUSH);
        }

        public boolean isEmail() {
            return equals(EMAIL);
        }
    }

    static {
        HashMap<UserStateSynchronizerType, UserStateSynchronizer> hashMap;
        new HashMap<>();
        userStateSynchronizers = hashMap;
    }

    static UserStatePushSynchronizer getPushStateSynchronizer() {
        Object obj;
        if (!userStateSynchronizers.containsKey(UserStateSynchronizerType.PUSH) || userStateSynchronizers.get(UserStateSynchronizerType.PUSH) == null) {
            new UserStatePushSynchronizer();
            UserStateSynchronizer put = userStateSynchronizers.put(UserStateSynchronizerType.PUSH, obj);
        }
        return (UserStatePushSynchronizer) userStateSynchronizers.get(UserStateSynchronizerType.PUSH);
    }

    static UserStateEmailSynchronizer getEmailStateSynchronizer() {
        Object obj;
        if (!userStateSynchronizers.containsKey(UserStateSynchronizerType.EMAIL) || userStateSynchronizers.get(UserStateSynchronizerType.EMAIL) == null) {
            new UserStateEmailSynchronizer();
            UserStateSynchronizer put = userStateSynchronizers.put(UserStateSynchronizerType.EMAIL, obj);
        }
        return (UserStateEmailSynchronizer) userStateSynchronizers.get(UserStateSynchronizerType.EMAIL);
    }

    static boolean persist() {
        boolean pushPersisted = getPushStateSynchronizer().persist();
        boolean emailPersisted = getEmailStateSynchronizer().persist();
        if (emailPersisted) {
            emailPersisted = getEmailStateSynchronizer().getRegistrationId() != null;
        }
        return pushPersisted || emailPersisted;
    }

    static void clearLocation() {
        getPushStateSynchronizer().clearLocation();
        getEmailStateSynchronizer().clearLocation();
    }

    static void initUserState() {
        getPushStateSynchronizer().initUserState();
        getEmailStateSynchronizer().initUserState();
    }

    static void syncUserState(boolean z) {
        boolean fromSyncService = z;
        getPushStateSynchronizer().syncUserState(fromSyncService);
        getEmailStateSynchronizer().syncUserState(fromSyncService);
    }

    static void sendTags(JSONObject jSONObject, @Nullable OneSignal.ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        OneSignal.SendTagsError sendTagsError;
        StringBuilder sb;
        JSONObject jSONObject2;
        JSONObject newTags = jSONObject;
        OneSignal.ChangeTagsUpdateHandler handler = changeTagsUpdateHandler;
        try {
            new JSONObject();
            JSONObject jsonField = jSONObject2.put(UserState.TAGS, newTags);
            getPushStateSynchronizer().sendTags(jsonField, handler);
            getEmailStateSynchronizer().sendTags(jsonField, handler);
        } catch (JSONException e) {
            JSONException e2 = e;
            if (handler != null) {
                new StringBuilder();
                new OneSignal.SendTagsError(-1, sb.append("Encountered an error attempting to serialize your tags into JSON: ").append(e2.getMessage()).append("\n").append(e2.getStackTrace()).toString());
                handler.onFailure(sendTagsError);
            }
            e2.printStackTrace();
        }
    }

    static void syncHashedEmail(String str) {
        JSONObject jSONObject;
        String email = str;
        try {
            new JSONObject();
            JSONObject emailFields = jSONObject;
            JSONObject put = emailFields.put("em_m", OSUtils.hexDigest(email, "MD5"));
            JSONObject put2 = emailFields.put("em_s", OSUtils.hexDigest(email, "SHA-1"));
            getPushStateSynchronizer().syncHashedEmail(emailFields);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static void setEmail(String str, String str2) {
        String email = str;
        String emailAuthHash = str2;
        getPushStateSynchronizer().setEmail(email, emailAuthHash);
        getEmailStateSynchronizer().setEmail(email, emailAuthHash);
    }

    static void setSubscription(boolean enable) {
        getPushStateSynchronizer().setSubscription(enable);
    }

    static boolean getUserSubscribePreference() {
        return getPushStateSynchronizer().getUserSubscribePreference();
    }

    static void setPermission(boolean enable) {
        getPushStateSynchronizer().setPermission(enable);
    }

    static void updateLocation(LocationController.LocationPoint locationPoint) {
        LocationController.LocationPoint point = locationPoint;
        getPushStateSynchronizer().updateLocation(point);
        getEmailStateSynchronizer().updateLocation(point);
    }

    static boolean getSubscribed() {
        return getPushStateSynchronizer().getSubscribed();
    }

    static String getRegistrationId() {
        return getPushStateSynchronizer().getRegistrationId();
    }

    static UserStateSynchronizer.GetTagsResult getTags(boolean fromServer) {
        return getPushStateSynchronizer().getTags(fromServer);
    }

    static void resetCurrentState() {
        getPushStateSynchronizer().resetCurrentState();
        getEmailStateSynchronizer().resetCurrentState();
        OneSignal.saveUserId((String) null);
        OneSignal.saveEmailId((String) null);
        OneSignal.setLastSessionTime(-3660);
    }

    static void updateDeviceInfo(JSONObject jSONObject) {
        JSONObject deviceInfo = jSONObject;
        getPushStateSynchronizer().updateDeviceInfo(deviceInfo);
        getEmailStateSynchronizer().updateDeviceInfo(deviceInfo);
    }

    static void updatePushState(JSONObject pushState) {
        getPushStateSynchronizer().updateState(pushState);
    }

    static void refreshEmailState() {
        getEmailStateSynchronizer().refresh();
    }

    static void setNewSession() {
        getPushStateSynchronizer().setNewSession();
        getEmailStateSynchronizer().setNewSession();
    }

    static boolean getSyncAsNewSession() {
        return getPushStateSynchronizer().getSyncAsNewSession() || getEmailStateSynchronizer().getSyncAsNewSession();
    }

    static void setNewSessionForEmail() {
        getEmailStateSynchronizer().setNewSession();
    }

    static void logoutEmail() {
        getPushStateSynchronizer().logoutEmail();
        getEmailStateSynchronizer().logoutEmail();
    }

    static void setExternalUserId(String str, String str2, OneSignal.OSExternalUserIdUpdateCompletionHandler completionHandler) throws JSONException {
        JSONObject responses;
        OneSignal.OSInternalExternalUserIdUpdateCompletionHandler oSInternalExternalUserIdUpdateCompletionHandler;
        String externalId = str;
        String externalIdAuthHash = str2;
        new JSONObject();
        final JSONObject jSONObject = responses;
        final OneSignal.OSExternalUserIdUpdateCompletionHandler oSExternalUserIdUpdateCompletionHandler = completionHandler;
        new OneSignal.OSInternalExternalUserIdUpdateCompletionHandler() {
            public void onComplete(String str, boolean z) {
                StringBuilder sb;
                StringBuilder sb2;
                Runnable runnable;
                StringBuilder sb3;
                JSONObject jSONObject;
                String channel = str;
                boolean success = z;
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.VERBOSE;
                new StringBuilder();
                OneSignal.onesignalLog(log_level, sb.append("Completed request to update external user id for channel: ").append(channel).append(" and success: ").append(success).toString());
                try {
                    new JSONObject();
                    JSONObject put = jSONObject.put(channel, jSONObject.put("success", success));
                } catch (JSONException e) {
                    JSONException e2 = e;
                    OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.ERROR;
                    new StringBuilder();
                    OneSignal.onesignalLog(log_level2, sb2.append("Error while adding the success status of external id for channel: ").append(channel).toString());
                    e2.printStackTrace();
                }
                for (UserStateSynchronizer userStateSynchronizer : OneSignalStateSynchronizer.userStateSynchronizers.values()) {
                    if (userStateSynchronizer.hasQueuedHandlers()) {
                        OneSignal.LOG_LEVEL log_level3 = OneSignal.LOG_LEVEL.VERBOSE;
                        new StringBuilder();
                        OneSignal.onesignalLog(log_level3, sb3.append("External user id handlers are still being processed for channel: ").append(userStateSynchronizer.getChannelString()).append(" , wait until finished before proceeding").toString());
                        return;
                    }
                }
                new Runnable(this) {
                    final /* synthetic */ AnonymousClass1 this$0;

                    {
                        this.this$0 = this$0;
                    }

                    public void run() {
                        if (oSExternalUserIdUpdateCompletionHandler != null) {
                            oSExternalUserIdUpdateCompletionHandler.onComplete(jSONObject);
                        }
                    }
                };
                OSUtils.runOnMainUIThread(runnable);
            }
        };
        OneSignal.OSInternalExternalUserIdUpdateCompletionHandler handler = oSInternalExternalUserIdUpdateCompletionHandler;
        getPushStateSynchronizer().setExternalUserId(externalId, externalIdAuthHash, handler);
        if (OneSignal.hasEmailId()) {
            getEmailStateSynchronizer().setExternalUserId(externalId, externalIdAuthHash, handler);
        }
    }

    static void readyToUpdate(boolean z) {
        boolean canMakeUpdates = z;
        getPushStateSynchronizer().readyToUpdate(canMakeUpdates);
        getEmailStateSynchronizer().readyToUpdate(canMakeUpdates);
    }
}
