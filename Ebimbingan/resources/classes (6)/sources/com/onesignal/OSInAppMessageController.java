package com.onesignal;

import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OSDynamicTriggerController;
import com.onesignal.OSInAppMessageAction;
import com.onesignal.OSSystemConditionController;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageController implements OSDynamicTriggerController.OSDynamicTriggerControllerObserver, OSSystemConditionController.OSSystemConditionObserver {
    public static final String IN_APP_MESSAGES_JSON_KEY = "in_app_messages";
    private static final Object LOCK;
    private static final String OS_SAVE_IN_APP_MESSAGE = "OS_SAVE_IN_APP_MESSAGE";
    private static ArrayList<String> PREFERRED_VARIANT_ORDER;
    /* access modifiers changed from: private */
    @NonNull
    public final Set<String> clickedClickIds;
    private OSInAppMessagePrompt currentPrompt = null;
    @NonNull
    private final Set<String> dismissedMessages;
    /* access modifiers changed from: private */
    public int htmlNetworkRequestAttemptCount = 0;
    /* access modifiers changed from: private */
    @NonNull
    public final Set<String> impressionedMessages;
    /* access modifiers changed from: private */
    public OSInAppMessageRepository inAppMessageRepository;
    private boolean inAppMessageShowing = false;
    private boolean inAppMessagingEnabled = true;
    @Nullable
    Date lastTimeInAppDismissed = null;
    @NonNull
    private final ArrayList<OSInAppMessage> messageDisplayQueue;
    @NonNull
    private ArrayList<OSInAppMessage> messages;
    @NonNull
    private List<OSInAppMessage> redisplayedInAppMessages;
    private OSSystemConditionController systemConditionController;
    OSTriggerController triggerController;

    static /* synthetic */ OSInAppMessagePrompt access$302(OSInAppMessageController x0, OSInAppMessagePrompt x1) {
        OSInAppMessagePrompt oSInAppMessagePrompt = x1;
        OSInAppMessagePrompt oSInAppMessagePrompt2 = oSInAppMessagePrompt;
        x0.currentPrompt = oSInAppMessagePrompt2;
        return oSInAppMessagePrompt;
    }

    static /* synthetic */ boolean access$802(OSInAppMessageController x0, boolean x1) {
        boolean z = x1;
        boolean z2 = z;
        x0.inAppMessageShowing = z2;
        return z;
    }

    static /* synthetic */ int access$902(OSInAppMessageController x0, int x1) {
        int i = x1;
        int i2 = i;
        x0.htmlNetworkRequestAttemptCount = i2;
        return i;
    }

    static /* synthetic */ int access$908(OSInAppMessageController x0) {
        OSInAppMessageController oSInAppMessageController = x0;
        int i = oSInAppMessageController.htmlNetworkRequestAttemptCount;
        int i2 = i + 1;
        oSInAppMessageController.htmlNetworkRequestAttemptCount = i2;
        return i;
    }

    static {
        ArrayList<String> arrayList;
        Object obj;
        new ArrayList<String>() {
            {
                boolean add = add("android");
                boolean add2 = add("app");
                boolean add3 = add("all");
            }
        };
        PREFERRED_VARIANT_ORDER = arrayList;
        new Object();
        LOCK = obj;
    }

    protected OSInAppMessageController(OneSignalDbHelper oneSignalDbHelper) {
        ArrayList<OSInAppMessage> arrayList;
        ArrayList<OSInAppMessage> arrayList2;
        OSTriggerController oSTriggerController;
        OSSystemConditionController oSSystemConditionController;
        OneSignalDbHelper dbHelper = oneSignalDbHelper;
        new ArrayList<>();
        this.messages = arrayList;
        this.dismissedMessages = OSUtils.newConcurrentSet();
        new ArrayList<>();
        this.messageDisplayQueue = arrayList2;
        this.impressionedMessages = OSUtils.newConcurrentSet();
        this.clickedClickIds = OSUtils.newConcurrentSet();
        new OSTriggerController(this);
        this.triggerController = oSTriggerController;
        new OSSystemConditionController(this);
        this.systemConditionController = oSSystemConditionController;
        Set<String> tempDismissedSet = OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_DISMISSED_IAMS, (Set<String>) null);
        if (tempDismissedSet != null) {
            boolean addAll = this.dismissedMessages.addAll(tempDismissedSet);
        }
        Set<String> tempImpressionsSet = OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_IMPRESSIONED_IAMS, (Set<String>) null);
        if (tempImpressionsSet != null) {
            boolean addAll2 = this.impressionedMessages.addAll(tempImpressionsSet);
        }
        Set<String> tempClickedMessageIdsSet = OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CLICKED_CLICK_IDS_IAMS, (Set<String>) null);
        if (tempClickedMessageIdsSet != null) {
            boolean addAll3 = this.clickedClickIds.addAll(tempClickedMessageIdsSet);
        }
        initRedisplayData(dbHelper);
    }

    /* access modifiers changed from: package-private */
    public OSInAppMessageRepository getInAppMessageRepository(OneSignalDbHelper oneSignalDbHelper) {
        OSInAppMessageRepository oSInAppMessageRepository;
        OneSignalDbHelper dbHelper = oneSignalDbHelper;
        if (this.inAppMessageRepository == null) {
            new OSInAppMessageRepository(dbHelper);
            this.inAppMessageRepository = oSInAppMessageRepository;
        }
        return this.inAppMessageRepository;
    }

    /* access modifiers changed from: protected */
    public void initRedisplayData(OneSignalDbHelper dbHelper) {
        StringBuilder sb;
        this.inAppMessageRepository = getInAppMessageRepository(dbHelper);
        this.redisplayedInAppMessages = this.inAppMessageRepository.getCachedInAppMessages();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("redisplayedInAppMessages: ").append(this.redisplayedInAppMessages.toString()).toString());
    }

    /* access modifiers changed from: package-private */
    public void resetSessionLaunchTime() {
        OSDynamicTriggerController.resetSessionLaunchTime();
    }

    /* access modifiers changed from: package-private */
    public void initWithCachedInAppMessages() {
        StringBuilder sb;
        JSONArray jSONArray;
        StringBuilder sb2;
        if (!this.messages.isEmpty()) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.Log(log_level, sb2.append("initWithCachedInAppMessages with already in memory messages: ").append(this.messages).toString());
            return;
        }
        String cachedInAppMessageString = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CACHED_IAMS, (String) null);
        OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level2, sb.append("initWithCachedInAppMessages: ").append(cachedInAppMessageString).toString());
        if (cachedInAppMessageString != null && !cachedInAppMessageString.isEmpty()) {
            Object obj = LOCK;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    if (!this.messages.isEmpty()) {
                        return;
                    }
                    new JSONArray(cachedInAppMessageString);
                    processInAppMessageJson(jSONArray);
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void receivedInAppMessageJson(@NonNull JSONArray jSONArray) throws JSONException {
        JSONArray json = jSONArray;
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CACHED_IAMS, json.toString());
        resetRedisplayMessagesBySession();
        processInAppMessageJson(json);
    }

    private void resetRedisplayMessagesBySession() {
        for (OSInAppMessage redisplayInAppMessage : this.redisplayedInAppMessages) {
            redisplayInAppMessage.setDisplayedInSession(false);
        }
    }

    /* JADX INFO: finally extract failed */
    private void processInAppMessageJson(@NonNull JSONArray jSONArray) throws JSONException {
        ArrayList<OSInAppMessage> arrayList;
        Object obj;
        JSONArray json = jSONArray;
        Object obj2 = LOCK;
        Object obj3 = obj2;
        synchronized (obj2) {
            try {
                new ArrayList();
                ArrayList<OSInAppMessage> newMessages = arrayList;
                for (int i = 0; i < json.length(); i++) {
                    new OSInAppMessage(json.getJSONObject(i));
                    boolean add = newMessages.add(obj);
                }
                this.messages = newMessages;
                evaluateInAppMessages();
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Object obj4 = obj3;
                    throw th2;
                }
            }
        }
    }

    private void evaluateInAppMessages() {
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Starting evaluateInAppMessages");
        Iterator<OSInAppMessage> it = this.messages.iterator();
        while (it.hasNext()) {
            OSInAppMessage message = it.next();
            if (this.triggerController.evaluateMessageTriggers(message)) {
                setDataForRedisplay(message);
                if (!this.dismissedMessages.contains(message.messageId) && !message.isFinished()) {
                    queueMessageForDisplay(message);
                }
            }
        }
    }

    @Nullable
    private static String variantIdForMessage(@NonNull OSInAppMessage oSInAppMessage) {
        OSInAppMessage message = oSInAppMessage;
        String languageIdentifier = OSUtils.getCorrectedLanguage();
        Iterator<String> it = PREFERRED_VARIANT_ORDER.iterator();
        while (it.hasNext()) {
            String variant = it.next();
            if (message.variants.containsKey(variant)) {
                HashMap<String, String> variantMap = message.variants.get(variant);
                if (variantMap.containsKey(languageIdentifier)) {
                    return variantMap.get(languageIdentifier);
                }
                return variantMap.get("default");
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static void printHttpSuccessForInAppMessageRequest(String requestType, String response) {
        StringBuilder sb;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.onesignalLog(log_level, sb.append("Successful post for in-app message ").append(requestType).append(" request: ").append(response).toString());
    }

    /* access modifiers changed from: private */
    public static void printHttpErrorForInAppMessageRequest(String requestType, int statusCode, String response) {
        StringBuilder sb;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
        new StringBuilder();
        OneSignal.onesignalLog(log_level, sb.append("Encountered a ").append(statusCode).append(" error while attempting in-app message ").append(requestType).append(" request: ").append(response).toString());
    }

    /* access modifiers changed from: package-private */
    public void onMessageWasShown(@NonNull OSInAppMessage oSInAppMessage) {
        JSONObject json;
        StringBuilder sb;
        OneSignalRestClient.ResponseHandler responseHandler;
        OSInAppMessage message = oSInAppMessage;
        if (!message.isPreview && !this.impressionedMessages.contains(message.messageId)) {
            boolean add = this.impressionedMessages.add(message.messageId);
            String variantId = variantIdForMessage(message);
            if (variantId != null) {
                try {
                    final String str = variantId;
                    new JSONObject(this) {
                        final /* synthetic */ OSInAppMessageController this$0;

                        {
                            OSUtils oSUtils;
                            this.this$0 = this$0;
                            JSONObject put = put("app_id", OneSignal.appId);
                            JSONObject put2 = put("player_id", OneSignal.getUserId());
                            JSONObject put3 = put("variant_id", str);
                            new OSUtils();
                            JSONObject put4 = put("device_type", oSUtils.getDeviceType());
                            JSONObject put5 = put("first_impression", true);
                        }
                    };
                    new StringBuilder();
                    final OSInAppMessage oSInAppMessage2 = message;
                    new OneSignalRestClient.ResponseHandler(this) {
                        final /* synthetic */ OSInAppMessageController this$0;

                        {
                            this.this$0 = this$0;
                        }

                        /* access modifiers changed from: package-private */
                        public void onSuccess(String response) {
                            OSInAppMessageController.printHttpSuccessForInAppMessageRequest("impression", response);
                            OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_IMPRESSIONED_IAMS, this.this$0.impressionedMessages);
                        }

                        /* access modifiers changed from: package-private */
                        public void onFailure(int statusCode, String response, Throwable th) {
                            Throwable th2 = th;
                            OSInAppMessageController.printHttpErrorForInAppMessageRequest("impression", statusCode, response);
                            boolean remove = this.this$0.impressionedMessages.remove(oSInAppMessage2.messageId);
                        }
                    };
                    OneSignalRestClient.post(sb.append("in_app_messages/").append(message.messageId).append("/impression").toString(), json, responseHandler);
                } catch (JSONException e) {
                    e.printStackTrace();
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.ERROR, "Unable to execute in-app message impression HTTP request due to invalid JSON");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onMessageActionOccurredOnMessage(@NonNull OSInAppMessage oSInAppMessage, @NonNull JSONObject actionJson) throws JSONException {
        OSInAppMessageAction oSInAppMessageAction;
        OSInAppMessage message = oSInAppMessage;
        new OSInAppMessageAction(actionJson);
        OSInAppMessageAction action = oSInAppMessageAction;
        action.firstClick = message.takeActionAsUnique();
        firePublicClickHandler(message.messageId, action);
        beginProcessingPrompts(message, action.prompts);
        fireClickAction(action);
        fireRESTCallForClick(message, action);
        fireTagCallForClick(action);
        fireOutcomesForClick(message.messageId, action.outcomes);
    }

    /* access modifiers changed from: package-private */
    public void onMessageActionOccurredOnPreview(@NonNull OSInAppMessage oSInAppMessage, @NonNull JSONObject actionJson) throws JSONException {
        OSInAppMessageAction oSInAppMessageAction;
        OSInAppMessage message = oSInAppMessage;
        new OSInAppMessageAction(actionJson);
        OSInAppMessageAction action = oSInAppMessageAction;
        action.firstClick = message.takeActionAsUnique();
        firePublicClickHandler(message.messageId, action);
        beginProcessingPrompts(message, action.prompts);
        fireClickAction(action);
        logInAppMessagePreviewActions(action);
    }

    private void logInAppMessagePreviewActions(OSInAppMessageAction oSInAppMessageAction) {
        StringBuilder sb;
        StringBuilder sb2;
        OSInAppMessageAction action = oSInAppMessageAction;
        if (action.tags != null) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.onesignalLog(log_level, sb2.append("Tags detected inside of the action click payload, ignoring because action came from IAM preview:: ").append(action.tags.toString()).toString());
        }
        if (action.outcomes.size() > 0) {
            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.onesignalLog(log_level2, sb.append("Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: ").append(action.outcomes.toString()).toString());
        }
    }

    private void beginProcessingPrompts(OSInAppMessage oSInAppMessage, List<OSInAppMessagePrompt> list) {
        StringBuilder sb;
        OSInAppMessage message = oSInAppMessage;
        List<OSInAppMessagePrompt> prompts = list;
        if (prompts.size() > 0) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.onesignalLog(log_level, sb.append("IAM showing prompts from IAM: ").append(message.toString()).toString());
            WebViewManager.dismissCurrentInAppMessage();
            showMultiplePrompts(message, prompts);
        }
    }

    /* access modifiers changed from: private */
    public void showMultiplePrompts(OSInAppMessage oSInAppMessage, List<OSInAppMessagePrompt> list) {
        StringBuilder sb;
        StringBuilder sb2;
        OneSignal.OSPromptActionCompletionCallback oSPromptActionCompletionCallback;
        OSInAppMessage inAppMessage = oSInAppMessage;
        List<OSInAppMessagePrompt> prompts = list;
        Iterator<OSInAppMessagePrompt> it = prompts.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            OSInAppMessagePrompt prompt = it.next();
            if (!prompt.hasPrompted()) {
                this.currentPrompt = prompt;
                break;
            }
        }
        if (this.currentPrompt != null) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.onesignalLog(log_level, sb2.append("IAM prompt to handle: ").append(this.currentPrompt.toString()).toString());
            this.currentPrompt.setPrompted(true);
            final OSInAppMessage oSInAppMessage2 = inAppMessage;
            final List<OSInAppMessagePrompt> list2 = prompts;
            new OneSignal.OSPromptActionCompletionCallback(this) {
                final /* synthetic */ OSInAppMessageController this$0;

                {
                    this.this$0 = this$0;
                }

                public void onCompleted(OneSignal.PromptActionResult promptActionResult) {
                    StringBuilder sb;
                    OneSignal.PromptActionResult result = promptActionResult;
                    OSInAppMessagePrompt access$302 = OSInAppMessageController.access$302(this.this$0, (OSInAppMessagePrompt) null);
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                    new StringBuilder();
                    OneSignal.onesignalLog(log_level, sb.append("IAM prompt to handle finished with result: ").append(result).toString());
                    if (!oSInAppMessage2.isPreview || result != OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                        this.this$0.showMultiplePrompts(oSInAppMessage2, list2);
                    } else {
                        this.this$0.showAlertDialogMessage(oSInAppMessage2, list2);
                    }
                }
            };
            this.currentPrompt.handlePrompt(oSPromptActionCompletionCallback);
            return;
        }
        OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.onesignalLog(log_level2, sb.append("No IAM prompt to handle, dismiss message: ").append(inAppMessage.messageId).toString());
        messageWasDismissed(inAppMessage);
    }

    /* access modifiers changed from: private */
    public void showAlertDialogMessage(OSInAppMessage inAppMessage, List<OSInAppMessagePrompt> prompts) {
        AlertDialog.Builder builder;
        DialogInterface.OnClickListener onClickListener;
        String messageTitle = OneSignal.appContext.getString(R.string.location_not_available_title);
        String message = OneSignal.appContext.getString(R.string.location_not_available_message);
        new AlertDialog.Builder(OneSignal.getCurrentActivity());
        final OSInAppMessage oSInAppMessage = inAppMessage;
        final List<OSInAppMessagePrompt> list = prompts;
        new DialogInterface.OnClickListener(this) {
            final /* synthetic */ OSInAppMessageController this$0;

            {
                this.this$0 = this$0;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                DialogInterface dialogInterface2 = dialogInterface;
                int i2 = i;
                this.this$0.showMultiplePrompts(oSInAppMessage, list);
            }
        };
        AlertDialog show = builder.setTitle(messageTitle).setMessage(message).setPositiveButton(17039370, onClickListener).show();
    }

    private void fireOutcomesForClick(String messageId, @NonNull List<OSInAppMessageOutcome> outcomes) {
        OneSignal.getSessionManager().onDirectInfluenceFromIAMClick(messageId);
        OneSignal.sendClickActionOutcomes(outcomes);
    }

    private void fireTagCallForClick(@NonNull OSInAppMessageAction oSInAppMessageAction) {
        OSInAppMessageAction action = oSInAppMessageAction;
        if (action.tags != null) {
            OSInAppMessageTag tags = action.tags;
            if (tags.getTagsToAdd() != null) {
                OneSignal.sendTags(tags.getTagsToAdd());
            }
            if (tags.getTagsToRemove() != null) {
                OneSignal.deleteTags(tags.getTagsToRemove(), (OneSignal.ChangeTagsUpdateHandler) null);
            }
        }
    }

    private void firePublicClickHandler(@NonNull String str, @NonNull OSInAppMessageAction oSInAppMessageAction) {
        Runnable runnable;
        String messageId = str;
        OSInAppMessageAction action = oSInAppMessageAction;
        if (OneSignal.mInitBuilder.mInAppMessageClickHandler != null) {
            final String str2 = messageId;
            final OSInAppMessageAction oSInAppMessageAction2 = action;
            new Runnable(this) {
                final /* synthetic */ OSInAppMessageController this$0;

                {
                    this.this$0 = this$0;
                }

                public void run() {
                    OneSignal.getSessionManager().onDirectInfluenceFromIAMClick(str2);
                    OneSignal.mInitBuilder.mInAppMessageClickHandler.inAppMessageClicked(oSInAppMessageAction2);
                }
            };
            OSUtils.runOnMainUIThread(runnable);
        }
    }

    private void fireClickAction(@NonNull OSInAppMessageAction oSInAppMessageAction) {
        OSInAppMessageAction action = oSInAppMessageAction;
        if (action.clickUrl != null && !action.clickUrl.isEmpty()) {
            if (action.urlTarget == OSInAppMessageAction.OSInAppMessageActionUrlType.BROWSER) {
                OSUtils.openURLInBrowser(action.clickUrl);
            } else if (action.urlTarget == OSInAppMessageAction.OSInAppMessageActionUrlType.IN_APP_WEBVIEW) {
                boolean open = OneSignalChromeTab.open(action.clickUrl, true);
            }
        }
    }

    private void fireRESTCallForClick(@NonNull OSInAppMessage oSInAppMessage, @NonNull OSInAppMessageAction oSInAppMessageAction) {
        JSONObject json;
        StringBuilder sb;
        OneSignalRestClient.ResponseHandler responseHandler;
        OSInAppMessage message = oSInAppMessage;
        OSInAppMessageAction action = oSInAppMessageAction;
        String variantId = variantIdForMessage(message);
        if (variantId != null) {
            String clickId = action.clickId;
            if ((message.getRedisplayStats().isRedisplayEnabled() && message.isClickAvailable(clickId)) || !this.clickedClickIds.contains(clickId)) {
                boolean add = this.clickedClickIds.add(clickId);
                message.addClickId(clickId);
                try {
                    final String str = clickId;
                    final String str2 = variantId;
                    final OSInAppMessageAction oSInAppMessageAction2 = action;
                    new JSONObject(this) {
                        final /* synthetic */ OSInAppMessageController this$0;

                        {
                            OSUtils oSUtils;
                            this.this$0 = this$0;
                            JSONObject put = put("app_id", OneSignal.getSavedAppId());
                            new OSUtils();
                            JSONObject put2 = put("device_type", oSUtils.getDeviceType());
                            JSONObject put3 = put("player_id", OneSignal.getUserId());
                            JSONObject put4 = put("click_id", str);
                            JSONObject put5 = put("variant_id", str2);
                            if (oSInAppMessageAction2.firstClick) {
                                JSONObject put6 = put("first_click", true);
                            }
                        }
                    };
                    new StringBuilder();
                    final OSInAppMessageAction oSInAppMessageAction3 = action;
                    new OneSignalRestClient.ResponseHandler(this) {
                        final /* synthetic */ OSInAppMessageController this$0;

                        {
                            this.this$0 = this$0;
                        }

                        /* access modifiers changed from: package-private */
                        public void onSuccess(String response) {
                            OSInAppMessageController.printHttpSuccessForInAppMessageRequest("engagement", response);
                            OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CLICKED_CLICK_IDS_IAMS, this.this$0.clickedClickIds);
                        }

                        /* access modifiers changed from: package-private */
                        public void onFailure(int statusCode, String response, Throwable th) {
                            Throwable th2 = th;
                            OSInAppMessageController.printHttpErrorForInAppMessageRequest("engagement", statusCode, response);
                            boolean remove = this.this$0.clickedClickIds.remove(oSInAppMessageAction3.clickId);
                        }
                    };
                    OneSignalRestClient.post(sb.append("in_app_messages/").append(message.messageId).append("/click").toString(), json, responseHandler);
                } catch (JSONException e) {
                    e.printStackTrace();
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.ERROR, "Unable to execute in-app message action HTTP request due to invalid JSON");
                }
            }
        }
    }

    private void setDataForRedisplay(OSInAppMessage oSInAppMessage) {
        StringBuilder sb;
        StringBuilder sb2;
        OSInAppMessage message = oSInAppMessage;
        boolean messageDismissed = this.dismissedMessages.contains(message.messageId);
        int index = this.redisplayedInAppMessages.indexOf(message);
        if (messageDismissed && index != -1) {
            OSInAppMessage savedIAM = this.redisplayedInAppMessages.get(index);
            message.getRedisplayStats().setDisplayStats(savedIAM.getRedisplayStats());
            message.setDisplayedInSession(savedIAM.isDisplayedInSession());
            boolean triggerHasChanged = hasMessageTriggerChanged(message);
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.onesignalLog(log_level, sb.append("setDataForRedisplay: ").append(message.toString()).append(" triggerHasChanged: ").append(triggerHasChanged).toString());
            if (triggerHasChanged && message.getRedisplayStats().isDelayTimeSatisfied() && message.getRedisplayStats().shouldDisplayAgain()) {
                OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
                new StringBuilder();
                OneSignal.onesignalLog(log_level2, sb2.append("setDataForRedisplay message available for redisplay: ").append(message.messageId).toString());
                boolean remove = this.dismissedMessages.remove(message.messageId);
                boolean remove2 = this.impressionedMessages.remove(message.messageId);
                message.clearClickIds();
            }
        }
    }

    private boolean hasMessageTriggerChanged(OSInAppMessage oSInAppMessage) {
        OSInAppMessage message = oSInAppMessage;
        if (this.triggerController.messageHasOnlyDynamicTriggers(message)) {
            return !message.isDisplayedInSession();
        }
        return message.isTriggerChanged() || (!message.isDisplayedInSession() && message.triggers.isEmpty());
    }

    /* access modifiers changed from: private */
    public void queueMessageForDisplay(@NonNull OSInAppMessage oSInAppMessage) {
        StringBuilder sb;
        OSInAppMessage message = oSInAppMessage;
        ArrayList<OSInAppMessage> arrayList = this.messageDisplayQueue;
        ArrayList<OSInAppMessage> arrayList2 = arrayList;
        synchronized (arrayList) {
            try {
                if (!this.messageDisplayQueue.contains(message)) {
                    boolean add = this.messageDisplayQueue.add(message);
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                    new StringBuilder();
                    OneSignal.onesignalLog(log_level, sb.append("In app message with id, ").append(message.messageId).append(", added to the queue").toString());
                }
                attemptToShowInAppMessage();
            } catch (Throwable th) {
                Throwable th2 = th;
                ArrayList<OSInAppMessage> arrayList3 = arrayList2;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void attemptToShowInAppMessage() {
        StringBuilder sb;
        ArrayList<OSInAppMessage> arrayList = this.messageDisplayQueue;
        ArrayList<OSInAppMessage> arrayList2 = arrayList;
        synchronized (arrayList) {
            try {
                if (!this.systemConditionController.systemConditionsAvailable()) {
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.WARN, "In app message not showing due to system condition not correct");
                    return;
                }
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                new StringBuilder();
                OneSignal.onesignalLog(log_level, sb.append("displayFirstIAMOnQueue: ").append(this.messageDisplayQueue).toString());
                if (this.messageDisplayQueue.size() <= 0 || isInAppMessageShowing()) {
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "In app message is currently showing or there are no IAMs left in the queue!");
                    return;
                }
                OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "No IAM showing currently, showing first item in the queue!");
                displayMessage(this.messageDisplayQueue.get(0));
            } catch (Throwable th) {
                Throwable th2 = th;
                ArrayList<OSInAppMessage> arrayList3 = arrayList2;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isInAppMessageShowing() {
        return this.inAppMessageShowing;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public OSInAppMessage getCurrentDisplayedInAppMessage() {
        return this.inAppMessageShowing ? this.messageDisplayQueue.get(0) : null;
    }

    /* access modifiers changed from: package-private */
    public void messageWasDismissed(@NonNull OSInAppMessage message) {
        messageWasDismissed(message, false);
    }

    /* access modifiers changed from: package-private */
    public void messageWasDismissed(@NonNull OSInAppMessage oSInAppMessage, boolean z) {
        StringBuilder sb;
        Date date;
        OSInAppMessage message = oSInAppMessage;
        boolean failed = z;
        if (!message.isPreview) {
            boolean add = this.dismissedMessages.add(message.messageId);
            if (!failed) {
                OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_DISMISSED_IAMS, this.dismissedMessages);
                new Date();
                this.lastTimeInAppDismissed = date;
                persistInAppMessage(message);
            }
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.onesignalLog(log_level, sb.append("OSInAppMessageController messageWasDismissed dismissedMessages: ").append(this.dismissedMessages.toString()).toString());
        }
        dismissCurrentMessage(message);
    }

    /* access modifiers changed from: package-private */
    public void messageWasDismissedByBackPress(@NonNull OSInAppMessage oSInAppMessage) {
        StringBuilder sb;
        OSInAppMessage message = oSInAppMessage;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.onesignalLog(log_level, sb.append("OSInAppMessageController messageWasDismissed by back press: ").append(message.toString()).toString());
        dismissCurrentMessage(message);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public void dismissCurrentMessage(@Nullable OSInAppMessage oSInAppMessage) {
        StringBuilder sb;
        StringBuilder sb2;
        OSInAppMessage message = oSInAppMessage;
        OneSignal.getSessionManager().onDirectInfluenceFromIAMClickFinished();
        if (this.currentPrompt != null) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "Stop evaluateMessageDisplayQueue because prompt is currently displayed");
            return;
        }
        this.inAppMessageShowing = false;
        ArrayList<OSInAppMessage> arrayList = this.messageDisplayQueue;
        ArrayList<OSInAppMessage> arrayList2 = arrayList;
        synchronized (arrayList) {
            try {
                if (this.messageDisplayQueue.size() > 0) {
                    if (message == null || this.messageDisplayQueue.contains(message)) {
                        String removedMessageId = this.messageDisplayQueue.remove(0).messageId;
                        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                        new StringBuilder();
                        OneSignal.onesignalLog(log_level, sb2.append("In app message with id, ").append(removedMessageId).append(", dismissed (removed) from the queue!").toString());
                    } else {
                        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "Message already removed from the queue!");
                        return;
                    }
                }
                if (this.messageDisplayQueue.size() > 0) {
                    OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
                    new StringBuilder();
                    OneSignal.onesignalLog(log_level2, sb.append("In app message on queue available: ").append(this.messageDisplayQueue.get(0).messageId).toString());
                    displayMessage(this.messageDisplayQueue.get(0));
                } else {
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "In app message dismissed evaluating messages");
                    evaluateInAppMessages();
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                ArrayList<OSInAppMessage> arrayList3 = arrayList2;
                throw th2;
            }
        }
    }

    private void persistInAppMessage(OSInAppMessage oSInAppMessage) {
        Thread thread;
        Runnable runnable;
        StringBuilder sb;
        OSInAppMessage message = oSInAppMessage;
        message.getRedisplayStats().setLastDisplayTime(System.currentTimeMillis() / 1000);
        message.getRedisplayStats().incrementDisplayQuantity();
        message.setTriggerChanged(false);
        message.setDisplayedInSession(true);
        final OSInAppMessage oSInAppMessage2 = message;
        new Runnable(this) {
            final /* synthetic */ OSInAppMessageController this$0;

            {
                this.this$0 = this$0;
            }

            public void run() {
                Thread.currentThread().setPriority(10);
                this.this$0.inAppMessageRepository.saveInAppMessage(oSInAppMessage2);
            }
        };
        new Thread(runnable, OS_SAVE_IN_APP_MESSAGE);
        thread.start();
        int index = this.redisplayedInAppMessages.indexOf(message);
        if (index != -1) {
            OSInAppMessage oSInAppMessage3 = this.redisplayedInAppMessages.set(index, message);
        } else {
            boolean add = this.redisplayedInAppMessages.add(message);
        }
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.onesignalLog(log_level, sb.append("persistInAppMessageForRedisplay: ").append(message.toString()).append(" with msg array data: ").append(this.redisplayedInAppMessages.toString()).toString());
    }

    @Nullable
    private static String htmlPathForMessage(OSInAppMessage oSInAppMessage) {
        StringBuilder sb;
        StringBuilder sb2;
        OSInAppMessage message = oSInAppMessage;
        String variantId = variantIdForMessage(message);
        if (variantId == null) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
            new StringBuilder();
            OneSignal.onesignalLog(log_level, sb2.append("Unable to find a variant for in-app message ").append(message.messageId).toString());
            return null;
        }
        new StringBuilder();
        return sb.append("in_app_messages/").append(message.messageId).append("/variants/").append(variantId).append("/html?app_id=").append(OneSignal.appId).toString();
    }

    private void displayMessage(@NonNull OSInAppMessage oSInAppMessage) {
        OneSignalRestClient.ResponseHandler responseHandler;
        OSInAppMessage message = oSInAppMessage;
        if (!this.inAppMessagingEnabled) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.VERBOSE, "In app messaging is currently paused, iam will not be shown!");
            return;
        }
        this.inAppMessageShowing = true;
        final OSInAppMessage oSInAppMessage2 = message;
        new OneSignalRestClient.ResponseHandler(this) {
            final /* synthetic */ OSInAppMessageController this$0;

            {
                this.this$0 = this$0;
            }

            /* access modifiers changed from: package-private */
            public void onFailure(int i, String response, Throwable th) {
                int statusCode = i;
                Throwable th2 = th;
                boolean access$802 = OSInAppMessageController.access$802(this.this$0, false);
                OSInAppMessageController.printHttpErrorForInAppMessageRequest("html", statusCode, response);
                if (!OSUtils.shouldRetryNetworkRequest(statusCode) || this.this$0.htmlNetworkRequestAttemptCount >= OSUtils.MAX_NETWORK_REQUEST_ATTEMPT_COUNT) {
                    int access$902 = OSInAppMessageController.access$902(this.this$0, 0);
                    this.this$0.messageWasDismissed(oSInAppMessage2, true);
                    return;
                }
                int access$908 = OSInAppMessageController.access$908(this.this$0);
                this.this$0.queueMessageForDisplay(oSInAppMessage2);
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String str) {
                JSONObject jSONObject;
                String response = str;
                int access$902 = OSInAppMessageController.access$902(this.this$0, 0);
                try {
                    new JSONObject(response);
                    JSONObject jsonResponse = jSONObject;
                    String htmlStr = jsonResponse.getString("html");
                    oSInAppMessage2.setDisplayDuration(jsonResponse.optDouble("display_duration"));
                    OneSignal.getSessionManager().onInAppMessageReceived(oSInAppMessage2.messageId);
                    WebViewManager.showHTMLString(oSInAppMessage2, htmlStr);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        OneSignalRestClient.get(htmlPathForMessage(message), responseHandler, (String) null);
    }

    /* access modifiers changed from: package-private */
    public void displayPreviewMessage(@NonNull String previewUUID) {
        StringBuilder sb;
        OneSignalRestClient.ResponseHandler responseHandler;
        this.inAppMessageShowing = true;
        new StringBuilder();
        new OneSignalRestClient.ResponseHandler(this) {
            final /* synthetic */ OSInAppMessageController this$0;

            {
                this.this$0 = this$0;
            }

            /* access modifiers changed from: package-private */
            public void onFailure(int statusCode, String response, Throwable th) {
                Throwable th2 = th;
                OSInAppMessageController.printHttpErrorForInAppMessageRequest("html", statusCode, response);
                this.this$0.dismissCurrentMessage((OSInAppMessage) null);
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String response) {
                JSONObject jSONObject;
                OSInAppMessage oSInAppMessage;
                try {
                    new JSONObject(response);
                    JSONObject jsonResponse = jSONObject;
                    String htmlStr = jsonResponse.getString("html");
                    new OSInAppMessage(true);
                    OSInAppMessage message = oSInAppMessage;
                    message.setDisplayDuration(jsonResponse.optDouble("display_duration"));
                    WebViewManager.showHTMLString(message, htmlStr);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        OneSignalRestClient.get(sb.append("in_app_messages/device_preview?preview_id=").append(previewUUID).append("&app_id=").append(OneSignal.appId).toString(), responseHandler, (String) null);
    }

    public void messageDynamicTriggerCompleted(String str) {
        StringBuilder sb;
        Set<String> set;
        String triggerId = str;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.onesignalLog(log_level, sb.append("messageDynamicTriggerCompleted called with triggerId: ").append(triggerId).toString());
        new HashSet<>();
        Set<String> triggerIds = set;
        boolean add = triggerIds.add(triggerId);
        makeRedisplayMessagesAvailableWithTriggers(triggerIds);
    }

    public void messageTriggerConditionChanged() {
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "messageTriggerConditionChanged called");
        evaluateInAppMessages();
    }

    public void systemConditionChanged() {
        attemptToShowInAppMessage();
    }

    private void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection) {
        StringBuilder sb;
        Collection<String> newTriggersKeys = collection;
        Iterator<OSInAppMessage> it = this.messages.iterator();
        while (it.hasNext()) {
            OSInAppMessage message = it.next();
            if (!message.isTriggerChanged() && this.redisplayedInAppMessages.contains(message) && this.triggerController.isTriggerOnMessage(message, newTriggersKeys)) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                new StringBuilder();
                OneSignal.onesignalLog(log_level, sb.append("Trigger changed for message: ").append(message.toString()).toString());
                message.setTriggerChanged(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void addTriggers(Map<String, Object> map) {
        StringBuilder sb;
        Map<String, Object> newTriggers = map;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.onesignalLog(log_level, sb.append("Add trigger called with: ").append(newTriggers.toString()).toString());
        this.triggerController.addTriggers(newTriggers);
        makeRedisplayMessagesAvailableWithTriggers(newTriggers.keySet());
        evaluateInAppMessages();
    }

    /* access modifiers changed from: package-private */
    public void removeTriggersForKeys(Collection<String> collection) {
        StringBuilder sb;
        Collection<String> keys = collection;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.onesignalLog(log_level, sb.append("Remove trigger called with keys: ").append(keys).toString());
        this.triggerController.removeTriggersForKeys(keys);
        makeRedisplayMessagesAvailableWithTriggers(keys);
        evaluateInAppMessages();
    }

    /* access modifiers changed from: package-private */
    public void setInAppMessagingEnabled(boolean z) {
        boolean enabled = z;
        this.inAppMessagingEnabled = enabled;
        if (enabled) {
            evaluateInAppMessages();
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Object getTriggerValue(String key) {
        return this.triggerController.getTriggerValue(key);
    }

    @NonNull
    public ArrayList<OSInAppMessage> getInAppMessageDisplayQueue() {
        return this.messageDisplayQueue;
    }

    @NonNull
    public List<OSInAppMessage> getRedisplayedInAppMessages() {
        return this.redisplayedInAppMessages;
    }
}
