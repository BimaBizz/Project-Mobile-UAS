package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.onesignal.OneSignal;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class NotificationExtenderService extends JobIntentService {
    static final int EXTENDER_SERVICE_JOB_ID = 2071862121;
    private OverrideSettings currentBaseOverrideSettings = null;
    private JSONObject currentJsonPayload;
    private boolean currentlyRestoring;
    private OSNotificationDisplayedResult osNotificationDisplayedResult;
    private Long restoreTimestamp;

    /* access modifiers changed from: protected */
    public abstract boolean onNotificationProcessing(OSNotificationReceivedResult oSNotificationReceivedResult);

    public NotificationExtenderService() {
    }

    public /* bridge */ /* synthetic */ boolean isStopped() {
        return super.isStopped();
    }

    public /* bridge */ /* synthetic */ IBinder onBind(@NonNull Intent intent) {
        return super.onBind(intent);
    }

    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ int onStartCommand(@Nullable Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    public /* bridge */ /* synthetic */ boolean onStopCurrentWork() {
        return super.onStopCurrentWork();
    }

    public /* bridge */ /* synthetic */ void setInterruptIfStopped(boolean z) {
        super.setInterruptIfStopped(z);
    }

    public static class OverrideSettings {
        public Integer androidNotificationId;
        public NotificationCompat.Extender extender;

        public OverrideSettings() {
        }

        /* access modifiers changed from: package-private */
        public void override(OverrideSettings overrideSettings) {
            OverrideSettings overrideSettings2 = overrideSettings;
            if (overrideSettings2 != null && overrideSettings2.androidNotificationId != null) {
                this.androidNotificationId = overrideSettings2.androidNotificationId;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final OSNotificationDisplayedResult displayNotification(OverrideSettings overrideSettings) {
        OSNotificationDisplayedResult oSNotificationDisplayedResult;
        OverrideSettings overrideSettings2 = overrideSettings;
        if (this.osNotificationDisplayedResult != null || overrideSettings2 == null) {
            return null;
        }
        overrideSettings2.override(this.currentBaseOverrideSettings);
        new OSNotificationDisplayedResult();
        this.osNotificationDisplayedResult = oSNotificationDisplayedResult;
        NotificationGenerationJob notifJob = createNotifJobFromCurrent();
        notifJob.overrideSettings = overrideSettings2;
        this.osNotificationDisplayedResult.androidNotificationId = NotificationBundleProcessor.ProcessJobForDisplay(notifJob);
        return this.osNotificationDisplayedResult;
    }

    /* access modifiers changed from: protected */
    public final void onHandleWork(Intent intent) {
        Intent intent2 = intent;
        if (intent2 != null) {
            processIntent(intent2);
            boolean completeWakefulIntent = GcmBroadcastReceiver.completeWakefulIntent(intent2);
        }
    }

    private void processIntent(Intent intent) {
        JSONObject jSONObject;
        OverrideSettings overrideSettings;
        StringBuilder sb;
        StringBuilder sb2;
        Intent intent2 = intent;
        Bundle bundle = intent2.getExtras();
        if (bundle == null) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
            new StringBuilder();
            OneSignal.Log(log_level, sb2.append("No extras sent to NotificationExtenderService in its Intent!\n").append(intent2).toString());
            return;
        }
        String jsonStrPayload = bundle.getString("json_payload");
        if (jsonStrPayload == null) {
            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.ERROR;
            new StringBuilder();
            OneSignal.Log(log_level2, sb.append("json_payload key is nonexistent from bundle passed to NotificationExtenderService: ").append(bundle).toString());
            return;
        }
        try {
            new JSONObject(jsonStrPayload);
            this.currentJsonPayload = jSONObject;
            this.currentlyRestoring = bundle.getBoolean("restoring", false);
            if (bundle.containsKey("android_notif_id")) {
                new OverrideSettings();
                this.currentBaseOverrideSettings = overrideSettings;
                this.currentBaseOverrideSettings.androidNotificationId = Integer.valueOf(bundle.getInt("android_notif_id"));
            }
            if (this.currentlyRestoring || !OneSignal.notValidOrDuplicated(this, this.currentJsonPayload)) {
                this.restoreTimestamp = Long.valueOf(bundle.getLong("timestamp"));
                processJsonObject(this.currentJsonPayload, this.currentlyRestoring);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void processJsonObject(JSONObject jSONObject, boolean z) {
        OSNotificationReceivedResult oSNotificationReceivedResult;
        NotificationGenerationJob notificationGenerationJob;
        OverrideSettings overrideSettings;
        JSONObject currentJsonPayload2 = jSONObject;
        boolean restoring = z;
        new OSNotificationReceivedResult();
        OSNotificationReceivedResult receivedResult = oSNotificationReceivedResult;
        receivedResult.payload = NotificationBundleProcessor.OSNotificationPayloadFrom(currentJsonPayload2);
        receivedResult.restoring = restoring;
        receivedResult.isAppInFocus = OneSignal.isAppActive();
        this.osNotificationDisplayedResult = null;
        boolean developerProcessed = false;
        try {
            developerProcessed = onNotificationProcessing(receivedResult);
        } catch (Throwable th) {
            Throwable t = th;
            if (this.osNotificationDisplayedResult == null) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "onNotificationProcessing throw an exception. Displaying normal OneSignal notification.", t);
            } else {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "onNotificationProcessing throw an exception. Extended notification displayed but custom processing did not finish.", t);
            }
        }
        if (this.osNotificationDisplayedResult == null) {
            if (!developerProcessed && NotificationBundleProcessor.shouldDisplay(currentJsonPayload2.optString("alert"))) {
                int ProcessJobForDisplay = NotificationBundleProcessor.ProcessJobForDisplay(createNotifJobFromCurrent());
            } else if (!restoring) {
                new NotificationGenerationJob(this);
                NotificationGenerationJob notifJob = notificationGenerationJob;
                notifJob.jsonPayload = currentJsonPayload2;
                new OverrideSettings();
                notifJob.overrideSettings = overrideSettings;
                notifJob.overrideSettings.androidNotificationId = -1;
                NotificationBundleProcessor.processNotification(notifJob, true);
                OneSignal.handleNotificationReceived(NotificationBundleProcessor.newJsonArray(currentJsonPayload2), false, false);
            } else if (this.currentBaseOverrideSettings != null) {
                NotificationBundleProcessor.markRestoredNotificationAsDismissed(createNotifJobFromCurrent());
            }
            if (restoring) {
                OSUtils.sleep(100);
            }
        }
    }

    static Intent getIntent(Context context) {
        Intent intent;
        ComponentName componentName;
        Context context2 = context;
        PackageManager packageManager = context2.getPackageManager();
        new Intent();
        Intent intent2 = intent.setAction("com.onesignal.NotificationExtender").setPackage(context2.getPackageName());
        List<ResolveInfo> resolveInfo = packageManager.queryIntentServices(intent2, 128);
        if (resolveInfo.size() < 1) {
            return null;
        }
        new ComponentName(context2, resolveInfo.get(0).serviceInfo.name);
        Intent component = intent2.setComponent(componentName);
        return intent2;
    }

    private NotificationGenerationJob createNotifJobFromCurrent() {
        NotificationGenerationJob notificationGenerationJob;
        new NotificationGenerationJob(this);
        NotificationGenerationJob notifJob = notificationGenerationJob;
        notifJob.restoring = this.currentlyRestoring;
        notifJob.jsonPayload = this.currentJsonPayload;
        notifJob.shownTimeStamp = this.restoreTimestamp;
        notifJob.overrideSettings = this.currentBaseOverrideSettings;
        return notifJob;
    }
}
