package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.onesignal.NotificationExtenderService;

@RequiresApi(api = 21)
public class GcmIntentJobService extends JobIntentService {
    public static final String BUNDLE_EXTRA = "Bundle:Parcelable:Extras";
    private static final int JOB_ID = 123890;

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

    public GcmIntentJobService() {
    }

    /* access modifiers changed from: protected */
    public void onHandleWork(@NonNull Intent intent) {
        BundleCompat bundle = BundleCompatFactory.getInstance();
        bundle.setBundle(intent.getExtras().getParcelable(BUNDLE_EXTRA));
        NotificationBundleProcessor.ProcessFromGCMIntentService(this, bundle, (NotificationExtenderService.OverrideSettings) null);
    }

    public static void enqueueWork(Context context, Intent intent) {
        enqueueWork(context, GcmIntentJobService.class, (int) JOB_ID, intent, false);
    }
}
