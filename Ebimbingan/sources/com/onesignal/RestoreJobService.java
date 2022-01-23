package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.NotificationExtenderService;

public class RestoreJobService extends JobIntentService {
    static final int RESTORE_SERVICE_JOB_ID = 2071862122;

    public RestoreJobService() {
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

    /* access modifiers changed from: protected */
    public final void onHandleWork(Intent intent) {
        Bundle extras;
        BundleCompat bundleCompat;
        Intent intent2 = intent;
        if (intent2 != null && (extras = intent2.getExtras()) != null) {
            new BundleCompatBundle(extras);
            NotificationBundleProcessor.ProcessFromGCMIntentService(getApplicationContext(), bundleCompat, (NotificationExtenderService.OverrideSettings) null);
        }
    }
}
