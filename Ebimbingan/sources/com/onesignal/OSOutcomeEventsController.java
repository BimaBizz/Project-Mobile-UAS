package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OneSignal;
import com.onesignal.influence.model.OSInfluence;
import com.onesignal.influence.model.OSInfluenceType;
import com.onesignal.outcomes.OSOutcomeEventsFactory;
import com.onesignal.outcomes.model.OSOutcomeEventParams;
import com.onesignal.outcomes.model.OSOutcomeSource;
import com.onesignal.outcomes.model.OSOutcomeSourceBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class OSOutcomeEventsController {
    private static final String OS_SAVE_OUTCOMES = "OS_SAVE_OUTCOMES";
    private static final String OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS = "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS";
    private static final String OS_SEND_SAVED_OUTCOMES = "OS_SEND_SAVED_OUTCOMES";
    @NonNull
    private final OSSessionManager osSessionManager;
    /* access modifiers changed from: private */
    @NonNull
    public final OSOutcomeEventsFactory outcomeEventsFactory;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    public OSOutcomeEventsController(@NonNull OSSessionManager osSessionManager2, @NonNull OSOutcomeEventsFactory outcomeEventsFactory2) {
        this.osSessionManager = osSessionManager2;
        this.outcomeEventsFactory = outcomeEventsFactory2;
        initUniqueOutcomeEventsSentSets();
    }

    private void initUniqueOutcomeEventsSentSets() {
        this.unattributedUniqueOutcomeEventsSentOnSession = OSUtils.newConcurrentSet();
        Set<String> tempUnattributedUniqueOutcomeEventsSentSet = this.outcomeEventsFactory.getRepository().getUnattributedUniqueOutcomeEventsSent();
        if (tempUnattributedUniqueOutcomeEventsSentSet != null) {
            this.unattributedUniqueOutcomeEventsSentOnSession = tempUnattributedUniqueOutcomeEventsSentSet;
        }
    }

    /* access modifiers changed from: package-private */
    public void cleanOutcomes() {
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "OneSignal cleanOutcomes for session");
        this.unattributedUniqueOutcomeEventsSentOnSession = OSUtils.newConcurrentSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    /* access modifiers changed from: package-private */
    public void sendSavedOutcomes() {
        Thread thread;
        Runnable runnable;
        new Runnable(this) {
            final /* synthetic */ OSOutcomeEventsController this$0;

            {
                this.this$0 = this$0;
            }

            public void run() {
                Thread.currentThread().setPriority(10);
                for (OSOutcomeEventParams event : this.this$0.outcomeEventsFactory.getRepository().getSavedOutcomeEvents()) {
                    this.this$0.sendSavedOutcomeEvent(event);
                }
            }
        };
        new Thread(runnable, OS_SEND_SAVED_OUTCOMES);
        thread.start();
    }

    /* access modifiers changed from: private */
    public void sendSavedOutcomeEvent(@NonNull OSOutcomeEventParams oSOutcomeEventParams) {
        OSUtils oSUtils;
        OneSignalApiResponseHandler responseHandler;
        OSOutcomeEventParams event = oSOutcomeEventParams;
        new OSUtils();
        int deviceType = oSUtils.getDeviceType();
        String appId = OneSignal.appId;
        final OSOutcomeEventParams oSOutcomeEventParams2 = event;
        new OneSignalApiResponseHandler(this) {
            final /* synthetic */ OSOutcomeEventsController this$0;

            {
                this.this$0 = this$0;
            }

            public void onSuccess(String str) {
                String str2 = str;
                this.this$0.outcomeEventsFactory.getRepository().removeEvent(oSOutcomeEventParams2);
            }

            public void onFailure(int statusCode, String response, Throwable throwable) {
            }
        };
        this.outcomeEventsFactory.getRepository().requestMeasureOutcomeEvent(appId, deviceType, event, responseHandler);
    }

    /* access modifiers changed from: package-private */
    public void sendClickActionOutcomes(List<OSInAppMessageOutcome> outcomes) {
        for (OSInAppMessageOutcome outcome : outcomes) {
            String name = outcome.getName();
            if (outcome.isUnique()) {
                sendUniqueOutcomeEvent(name, (OneSignal.OutcomeCallback) null);
            } else if (outcome.getWeight() > 0.0f) {
                sendOutcomeEventWithValue(name, outcome.getWeight(), (OneSignal.OutcomeCallback) null);
            } else {
                sendOutcomeEvent(name, (OneSignal.OutcomeCallback) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void sendUniqueOutcomeEvent(@NonNull String name, @Nullable OneSignal.OutcomeCallback callback) {
        sendUniqueOutcomeEvent(name, this.osSessionManager.getInfluences(), callback);
    }

    /* access modifiers changed from: package-private */
    public void sendOutcomeEvent(@NonNull String name, @Nullable OneSignal.OutcomeCallback callback) {
        sendAndCreateOutcomeEvent(name, 0.0f, this.osSessionManager.getInfluences(), callback);
    }

    /* access modifiers changed from: package-private */
    public void sendOutcomeEventWithValue(@NonNull String name, float weight, @Nullable OneSignal.OutcomeCallback callback) {
        sendAndCreateOutcomeEvent(name, weight, this.osSessionManager.getInfluences(), callback);
    }

    private void sendUniqueOutcomeEvent(@NonNull String str, @NonNull List<OSInfluence> sessionInfluences, @Nullable OneSignal.OutcomeCallback outcomeCallback) {
        StringBuilder sb;
        StringBuilder sb2;
        String name = str;
        OneSignal.OutcomeCallback callback = outcomeCallback;
        List<OSInfluence> influences = removeDisabledInfluences(sessionInfluences);
        if (influences.isEmpty()) {
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Unique Outcome disabled for current session");
            return;
        }
        boolean attributed = false;
        Iterator<OSInfluence> it = influences.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().getInfluenceType().isAttributed()) {
                    attributed = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (attributed) {
            List<OSInfluence> uniqueInfluences = getUniqueIds(name, influences);
            if (uniqueInfluences == null) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                new StringBuilder();
                OneSignal.Log(log_level, sb2.append("Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: ").append(influences.toString()).append("\nOutcome name: ").append(name).toString());
                if (callback != null) {
                    callback.onSuccess((OutcomeEvent) null);
                    return;
                }
                return;
            }
            sendAndCreateOutcomeEvent(name, 0.0f, uniqueInfluences, callback);
        } else if (this.unattributedUniqueOutcomeEventsSentOnSession.contains(name)) {
            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.Log(log_level2, sb.append("Measure endpoint will not send because unique outcome already sent for: \nSession: ").append(OSInfluenceType.UNATTRIBUTED).append("\nOutcome name: ").append(name).toString());
            if (callback != null) {
                callback.onSuccess((OutcomeEvent) null);
            }
        } else {
            boolean add = this.unattributedUniqueOutcomeEventsSentOnSession.add(name);
            sendAndCreateOutcomeEvent(name, 0.0f, influences, callback);
        }
    }

    private void sendAndCreateOutcomeEvent(@NonNull String str, @NonNull float f, @NonNull List<OSInfluence> influences, @Nullable OneSignal.OutcomeCallback outcomeCallback) {
        OSUtils oSUtils;
        OSOutcomeSource source;
        OSOutcomeEventParams oSOutcomeEventParams;
        OneSignalApiResponseHandler responseHandler;
        StringBuilder sb;
        OSOutcomeSourceBody oSOutcomeSourceBody;
        OSOutcomeSourceBody oSOutcomeSourceBody2;
        OSOutcomeSourceBody oSOutcomeSourceBody3;
        OSOutcomeSourceBody oSOutcomeSourceBody4;
        String name = str;
        float weight = f;
        OneSignal.OutcomeCallback callback = outcomeCallback;
        long timestampSeconds = System.currentTimeMillis() / 1000;
        new OSUtils();
        int deviceType = oSUtils.getDeviceType();
        String appId = OneSignal.appId;
        OSOutcomeSourceBody directSourceBody = null;
        OSOutcomeSourceBody indirectSourceBody = null;
        boolean unattributed = false;
        for (OSInfluence influence : influences) {
            switch (influence.getInfluenceType()) {
                case DIRECT:
                    OSInfluence oSInfluence = influence;
                    if (directSourceBody == null) {
                        oSOutcomeSourceBody3 = oSOutcomeSourceBody4;
                        new OSOutcomeSourceBody();
                    } else {
                        oSOutcomeSourceBody3 = directSourceBody;
                    }
                    directSourceBody = setSourceChannelIds(oSInfluence, oSOutcomeSourceBody3);
                    break;
                case INDIRECT:
                    OSInfluence oSInfluence2 = influence;
                    if (indirectSourceBody == null) {
                        oSOutcomeSourceBody = oSOutcomeSourceBody2;
                        new OSOutcomeSourceBody();
                    } else {
                        oSOutcomeSourceBody = indirectSourceBody;
                    }
                    indirectSourceBody = setSourceChannelIds(oSInfluence2, oSOutcomeSourceBody);
                    break;
                case UNATTRIBUTED:
                    unattributed = true;
                    break;
                case DISABLED:
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.VERBOSE;
                    new StringBuilder();
                    OneSignal.Log(log_level, sb.append("Outcomes disabled for channel: ").append(influence.getInfluenceChannel()).toString());
                    if (callback != null) {
                        callback.onSuccess((OutcomeEvent) null);
                        return;
                    }
                    return;
            }
        }
        if (directSourceBody == null && indirectSourceBody == null && !unattributed) {
            OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, "Outcomes disabled for all channels");
            if (callback != null) {
                callback.onSuccess((OutcomeEvent) null);
                return;
            }
            return;
        }
        new OSOutcomeSource(directSourceBody, indirectSourceBody);
        new OSOutcomeEventParams(name, source, weight);
        OSOutcomeEventParams eventParams = oSOutcomeEventParams;
        final OSOutcomeEventParams oSOutcomeEventParams2 = eventParams;
        final OneSignal.OutcomeCallback outcomeCallback2 = callback;
        final long j = timestampSeconds;
        final String str2 = name;
        new OneSignalApiResponseHandler(this) {
            final /* synthetic */ OSOutcomeEventsController this$0;

            {
                this.this$0 = this$0;
            }

            public void onSuccess(String str) {
                String str2 = str;
                this.this$0.saveUniqueOutcome(oSOutcomeEventParams2);
                if (outcomeCallback2 != null) {
                    outcomeCallback2.onSuccess(OutcomeEvent.fromOutcomeEventParamsV2toOutcomeEventV1(oSOutcomeEventParams2));
                }
            }

            public void onFailure(int statusCode, String response, Throwable th) {
                Thread thread;
                Runnable runnable;
                StringBuilder sb;
                Throwable th2 = th;
                new Runnable(this) {
                    final /* synthetic */ AnonymousClass3 this$1;

                    {
                        this.this$1 = this$1;
                    }

                    public void run() {
                        Thread.currentThread().setPriority(10);
                        oSOutcomeEventParams2.setTimestamp(j);
                        this.this$1.this$0.outcomeEventsFactory.getRepository().saveOutcomeEvent(oSOutcomeEventParams2);
                    }
                };
                new Thread(runnable, OSOutcomeEventsController.OS_SAVE_OUTCOMES);
                thread.start();
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.WARN;
                new StringBuilder();
                OneSignal.onesignalLog(log_level, sb.append("Sending outcome with name: ").append(str2).append(" failed with status code: ").append(statusCode).append(" and response: ").append(response).append("\nOutcome event was cached and will be reattempted on app cold start").toString());
                if (outcomeCallback2 != null) {
                    outcomeCallback2.onSuccess((OutcomeEvent) null);
                }
            }
        };
        this.outcomeEventsFactory.getRepository().requestMeasureOutcomeEvent(appId, deviceType, eventParams, responseHandler);
    }

    private OSOutcomeSourceBody setSourceChannelIds(OSInfluence oSInfluence, OSOutcomeSourceBody oSOutcomeSourceBody) {
        OSInfluence influence = oSInfluence;
        OSOutcomeSourceBody sourceBody = oSOutcomeSourceBody;
        switch (influence.getInfluenceChannel()) {
            case IAM:
                sourceBody.setInAppMessagesIds(influence.getIds());
                break;
            case NOTIFICATION:
                sourceBody.setNotificationIds(influence.getIds());
                break;
        }
        return sourceBody;
    }

    private List<OSInfluence> removeDisabledInfluences(List<OSInfluence> list) {
        List<OSInfluence> list2;
        StringBuilder sb;
        List<OSInfluence> influences = list;
        new ArrayList(influences);
        List<OSInfluence> availableInfluences = list2;
        for (OSInfluence influence : influences) {
            if (influence.getInfluenceType().isDisabled()) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                new StringBuilder();
                OneSignal.onesignalLog(log_level, sb.append("Outcomes disabled for channel: ").append(influence.getInfluenceChannel().toString()).toString());
                boolean remove = availableInfluences.remove(influence);
            }
        }
        return availableInfluences;
    }

    /* access modifiers changed from: private */
    public void saveUniqueOutcome(OSOutcomeEventParams oSOutcomeEventParams) {
        OSOutcomeEventParams eventParams = oSOutcomeEventParams;
        if (eventParams.isUnattributed()) {
            saveUnattributedUniqueOutcomeEvents();
        } else {
            saveAttributedUniqueOutcomeNotifications(eventParams);
        }
    }

    private void saveAttributedUniqueOutcomeNotifications(OSOutcomeEventParams eventParams) {
        Thread thread;
        Runnable runnable;
        final OSOutcomeEventParams oSOutcomeEventParams = eventParams;
        new Runnable(this) {
            final /* synthetic */ OSOutcomeEventsController this$0;

            {
                this.this$0 = this$0;
            }

            public void run() {
                Thread.currentThread().setPriority(10);
                this.this$0.outcomeEventsFactory.getRepository().saveUniqueOutcomeNotifications(oSOutcomeEventParams);
            }
        };
        new Thread(runnable, OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS);
        thread.start();
    }

    private void saveUnattributedUniqueOutcomeEvents() {
        this.outcomeEventsFactory.getRepository().saveUnattributedUniqueOutcomeEventsSent(this.unattributedUniqueOutcomeEventsSentOnSession);
    }

    private List<OSInfluence> getUniqueIds(String name, List<OSInfluence> influences) {
        List<OSInfluence> uniqueInfluences = this.outcomeEventsFactory.getRepository().getNotCachedUniqueOutcome(name, influences);
        return uniqueInfluences.size() > 0 ? uniqueInfluences : null;
    }
}
