package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.NotificationExtenderService;

public class GcmIntentService extends IntentService {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GcmIntentService() {
        super("GcmIntentService");
        setIntentRedelivery(true);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        BundleCompat bundleCompat;
        Intent intent2 = intent;
        Bundle extras = intent2.getExtras();
        if (extras != null) {
            new BundleCompatBundle(extras);
            NotificationBundleProcessor.ProcessFromGCMIntentService(this, bundleCompat, (NotificationExtenderService.OverrideSettings) null);
            boolean completeWakefulIntent = GcmBroadcastReceiver.completeWakefulIntent(intent2);
        }
    }
}
