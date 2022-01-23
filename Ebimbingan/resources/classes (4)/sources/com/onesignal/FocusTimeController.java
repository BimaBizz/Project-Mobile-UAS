package com.onesignal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import com.onesignal.influence.model.OSInfluence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

class FocusTimeController {
    private static FocusTimeController sInstance;
    private List<FocusTimeProcessorBase> focusTimeProcessors;
    @Nullable
    private Long timeFocusedAtMs;

    private enum FocusEventType {
    }

    private FocusTimeController() {
        FocusTimeProcessorBase focusTimeProcessorBase;
        FocusTimeProcessorBase focusTimeProcessorBase2;
        FocusTimeProcessorBase[] focusTimeProcessorBaseArr = new FocusTimeProcessorBase[2];
        new FocusTimeProcessorUnattributed();
        focusTimeProcessorBaseArr[0] = focusTimeProcessorBase;
        FocusTimeProcessorBase[] focusTimeProcessorBaseArr2 = focusTimeProcessorBaseArr;
        new FocusTimeProcessorAttributed();
        focusTimeProcessorBaseArr2[1] = focusTimeProcessorBase2;
        this.focusTimeProcessors = Arrays.asList(focusTimeProcessorBaseArr2);
    }

    public static synchronized FocusTimeController getInstance() {
        FocusTimeController focusTimeController;
        FocusTimeController focusTimeController2;
        synchronized (FocusTimeController.class) {
            if (sInstance == null) {
                new FocusTimeController();
                sInstance = focusTimeController2;
            }
            focusTimeController = sInstance;
        }
        return focusTimeController;
    }

    /* access modifiers changed from: package-private */
    public void appForegrounded() {
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        this.timeFocusedAtMs = valueOf;
    }

    /* access modifiers changed from: package-private */
    public void appBackgrounded() {
        boolean giveProcessorsValidFocusTime = giveProcessorsValidFocusTime(OneSignal.getSessionManager().getSessionInfluences(), FocusEventType.BACKGROUND);
        this.timeFocusedAtMs = null;
    }

    /* access modifiers changed from: package-private */
    public void onSessionEnded(@NonNull List<OSInfluence> lastInfluences) {
        FocusEventType focusEventType = FocusEventType.END_SESSION;
        if (!giveProcessorsValidFocusTime(lastInfluences, focusEventType)) {
            for (FocusTimeProcessorBase focusTimeProcessor : this.focusTimeProcessors) {
                focusTimeProcessor.sendUnsentTimeNow(focusEventType);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void doBlockingBackgroundSyncOfUnsentTime() {
        if (!OneSignal.isForeground()) {
            for (FocusTimeProcessorBase focusTimeProcessor : this.focusTimeProcessors) {
                focusTimeProcessor.syncUnsentTimeFromSyncJob();
            }
        }
    }

    private boolean giveProcessorsValidFocusTime(@NonNull List<OSInfluence> list, @NonNull FocusEventType focusEventType) {
        List<OSInfluence> influences = list;
        FocusEventType focusType = focusEventType;
        Long timeElapsed = getTimeFocusedElapsed();
        if (timeElapsed == null) {
            return false;
        }
        for (FocusTimeProcessorBase focusTimeProcessor : this.focusTimeProcessors) {
            focusTimeProcessor.addTime(timeElapsed.longValue(), influences, focusType);
        }
        return true;
    }

    @Nullable
    private Long getTimeFocusedElapsed() {
        if (this.timeFocusedAtMs == null) {
            return null;
        }
        long timeElapsed = (long) ((((double) (SystemClock.elapsedRealtime() - this.timeFocusedAtMs.longValue())) / 1000.0d) + 0.5d);
        if (timeElapsed < 1 || timeElapsed > 86400) {
            return null;
        }
        return Long.valueOf(timeElapsed);
    }

    private static class FocusTimeProcessorUnattributed extends FocusTimeProcessorBase {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        FocusTimeProcessorUnattributed() {
            super((AnonymousClass1) null);
            this.MIN_ON_FOCUS_TIME_SEC = 60;
            this.PREF_KEY_FOR_UNSENT_TIME = OneSignalPrefs.PREFS_GT_UNSENT_ACTIVE_TIME;
        }

        /* access modifiers changed from: protected */
        public boolean timeTypeApplies(@NonNull List<OSInfluence> list) {
            StringBuilder sb;
            List<OSInfluence> influences = list;
            for (OSInfluence influence : influences) {
                if (influence.getInfluenceType().isAttributed()) {
                    return false;
                }
            }
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.Log(log_level, sb.append(getClass().getSimpleName()).append(":timeTypeApplies for influences: ").append(influences.toString()).append(" true").toString());
            return true;
        }

        /* access modifiers changed from: protected */
        public void sendTime(@NonNull FocusEventType focusType) {
            if (!focusType.equals(FocusEventType.END_SESSION)) {
                syncUnsentTimeOnBackgroundEvent();
            }
        }

        /* access modifiers changed from: protected */
        public void saveInfluences(List<OSInfluence> list) {
        }
    }

    private static class FocusTimeProcessorAttributed extends FocusTimeProcessorBase {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        FocusTimeProcessorAttributed() {
            super((AnonymousClass1) null);
            this.MIN_ON_FOCUS_TIME_SEC = 1;
            this.PREF_KEY_FOR_UNSENT_TIME = OneSignalPrefs.PREFS_OS_UNSENT_ATTRIBUTED_ACTIVE_TIME;
        }

        private List<OSInfluence> getInfluences() {
            List<OSInfluence> list;
            Set set;
            StringBuilder sb;
            Object obj;
            new ArrayList();
            List<OSInfluence> influences = list;
            new HashSet();
            for (String influenceJSON : OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_ATTRIBUTED_INFLUENCES, set)) {
                List<OSInfluence> list2 = influences;
                try {
                    new OSInfluence(influenceJSON);
                    boolean add = list2.add(obj);
                } catch (JSONException e) {
                    JSONException exception = e;
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                    new StringBuilder();
                    OneSignal.Log(log_level, sb.append(getClass().getSimpleName()).append(": error generation OSInfluence from json object: ").append(exception).toString());
                }
            }
            return influences;
        }

        /* access modifiers changed from: protected */
        public void saveInfluences(List<OSInfluence> influences) {
            Set<String> set;
            StringBuilder sb;
            new HashSet<>();
            Set<String> setInfluences = set;
            for (OSInfluence influence : influences) {
                try {
                    boolean add = setInfluences.add(influence.toJSONString());
                } catch (JSONException e) {
                    JSONException exception = e;
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                    new StringBuilder();
                    OneSignal.Log(log_level, sb.append(getClass().getSimpleName()).append(": error generation json object OSInfluence: ").append(exception).toString());
                }
            }
            OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_ATTRIBUTED_INFLUENCES, setInfluences);
        }

        /* access modifiers changed from: protected */
        public boolean timeTypeApplies(@NonNull List<OSInfluence> list) {
            StringBuilder sb;
            List<OSInfluence> influences = list;
            for (OSInfluence influence : influences) {
                if (influence.getInfluenceType().isAttributed()) {
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                    new StringBuilder();
                    OneSignal.Log(log_level, sb.append(getClass().getSimpleName()).append(":timeTypeApplies for influences: ").append(influences.toString()).append(" true").toString());
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void additionalFieldsToAddToOnFocusPayload(@NonNull JSONObject jsonBody) {
            OneSignal.getSessionManager().addSessionIds(jsonBody, getInfluences());
        }

        /* access modifiers changed from: protected */
        public void sendTime(@NonNull FocusEventType focusType) {
            if (focusType.equals(FocusEventType.END_SESSION)) {
                syncOnFocusTime();
            } else {
                OneSignalSyncServiceUtils.scheduleSyncTask(OneSignal.appContext);
            }
        }
    }

    private static abstract class FocusTimeProcessorBase {
        protected long MIN_ON_FOCUS_TIME_SEC;
        @NonNull
        protected String PREF_KEY_FOR_UNSENT_TIME;
        @NonNull
        private final AtomicBoolean runningOnFocusTime;
        @Nullable
        private Long unsentActiveTime;

        /* access modifiers changed from: protected */
        public abstract void saveInfluences(List<OSInfluence> list);

        /* access modifiers changed from: protected */
        public abstract void sendTime(@NonNull FocusEventType focusEventType);

        /* access modifiers changed from: protected */
        public abstract boolean timeTypeApplies(@NonNull List<OSInfluence> list);

        private FocusTimeProcessorBase() {
            AtomicBoolean atomicBoolean;
            this.unsentActiveTime = null;
            new AtomicBoolean();
            this.runningOnFocusTime = atomicBoolean;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ FocusTimeProcessorBase(AnonymousClass1 r4) {
            this();
            AnonymousClass1 r1 = r4;
        }

        private long getUnsentActiveTime() {
            StringBuilder sb;
            if (this.unsentActiveTime == null) {
                this.unsentActiveTime = Long.valueOf(OneSignalPrefs.getLong(OneSignalPrefs.PREFS_ONESIGNAL, this.PREF_KEY_FOR_UNSENT_TIME, 0));
            }
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.Log(log_level, sb.append(getClass().getSimpleName()).append(":getUnsentActiveTime: ").append(this.unsentActiveTime).toString());
            return this.unsentActiveTime.longValue();
        }

        /* access modifiers changed from: private */
        public void saveUnsentActiveTime(long j) {
            StringBuilder sb;
            long time = j;
            this.unsentActiveTime = Long.valueOf(time);
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.Log(log_level, sb.append(getClass().getSimpleName()).append(":saveUnsentActiveTime: ").append(this.unsentActiveTime).toString());
            OneSignalPrefs.saveLong(OneSignalPrefs.PREFS_ONESIGNAL, this.PREF_KEY_FOR_UNSENT_TIME, time);
        }

        /* access modifiers changed from: private */
        public void addTime(long j, @NonNull List<OSInfluence> list, @NonNull FocusEventType focusEventType) {
            StringBuilder sb;
            long time = j;
            List<OSInfluence> influences = list;
            FocusEventType focusType = focusEventType;
            if (timeTypeApplies(influences)) {
                saveInfluences(influences);
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                new StringBuilder();
                OneSignal.Log(log_level, sb.append(getClass().getSimpleName()).append(":addTime with lastFocusTimeInfluences: ").append(influences.toString()).toString());
                saveUnsentActiveTime(getUnsentActiveTime() + time);
                sendUnsentTimeNow(focusType);
            }
        }

        /* access modifiers changed from: private */
        public void sendUnsentTimeNow(FocusEventType focusEventType) {
            FocusEventType focusType = focusEventType;
            if (OneSignal.hasUserId()) {
                sendTime(focusType);
            }
        }

        private boolean hasMinSyncTime() {
            return getUnsentActiveTime() >= this.MIN_ON_FOCUS_TIME_SEC;
        }

        /* access modifiers changed from: protected */
        public void syncUnsentTimeOnBackgroundEvent() {
            if (hasMinSyncTime()) {
                OneSignalSyncServiceUtils.scheduleSyncTask(OneSignal.appContext);
                syncOnFocusTime();
            }
        }

        /* access modifiers changed from: private */
        public void syncUnsentTimeFromSyncJob() {
            if (hasMinSyncTime()) {
                syncOnFocusTime();
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        @WorkerThread
        public void syncOnFocusTime() {
            if (!this.runningOnFocusTime.get()) {
                AtomicBoolean atomicBoolean = this.runningOnFocusTime;
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                synchronized (atomicBoolean) {
                    try {
                        this.runningOnFocusTime.set(true);
                        if (hasMinSyncTime()) {
                            sendOnFocus(getUnsentActiveTime());
                        }
                        this.runningOnFocusTime.set(false);
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        AtomicBoolean atomicBoolean3 = atomicBoolean2;
                        throw th2;
                    }
                }
            }
        }

        private void sendOnFocusToPlayer(@NonNull String userId, @NonNull JSONObject jsonBody) {
            OneSignalRestClient.ResponseHandler responseHandler;
            StringBuilder sb;
            new OneSignalRestClient.ResponseHandler(this) {
                final /* synthetic */ FocusTimeProcessorBase this$0;

                {
                    this.this$0 = this$0;
                }

                /* access modifiers changed from: package-private */
                public void onFailure(int statusCode, String response, Throwable throwable) {
                    OneSignal.logHttpError("sending on_focus Failed", statusCode, throwable, response);
                }

                /* access modifiers changed from: package-private */
                public void onSuccess(String str) {
                    String str2 = str;
                    this.this$0.saveUnsentActiveTime(0);
                }
            };
            new StringBuilder();
            OneSignalRestClient.postSync(sb.append("players/").append(userId).append("/on_focus").toString(), jsonBody, responseHandler);
        }

        /* access modifiers changed from: protected */
        public void additionalFieldsToAddToOnFocusPayload(@NonNull JSONObject jsonBody) {
        }

        @NonNull
        private JSONObject generateOnFocusPayload(long totalTimeActive) throws JSONException {
            JSONObject jSONObject;
            OSUtils oSUtils;
            new JSONObject();
            JSONObject put = jSONObject.put("app_id", OneSignal.getSavedAppId()).put(CommonProperties.TYPE, 1).put("state", "ping").put("active_time", totalTimeActive);
            new OSUtils();
            JSONObject jsonBody = put.put("device_type", oSUtils.getDeviceType());
            OneSignal.addNetType(jsonBody);
            return jsonBody;
        }

        private void sendOnFocus(long j) {
            StringBuilder sb;
            long totalTimeActive = j;
            try {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                new StringBuilder();
                OneSignal.Log(log_level, sb.append(getClass().getSimpleName()).append(":sendOnFocus with totalTimeActive: ").append(totalTimeActive).toString());
                JSONObject jsonBody = generateOnFocusPayload(totalTimeActive);
                additionalFieldsToAddToOnFocusPayload(jsonBody);
                sendOnFocusToPlayer(OneSignal.getUserId(), jsonBody);
                if (OneSignal.hasEmailId()) {
                    sendOnFocusToPlayer(OneSignal.getEmailId(), generateOnFocusPayload(totalTimeActive));
                }
            } catch (JSONException e) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Generating on_focus:JSON Failed.", e);
            }
        }
    }
}
