package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;

public class NotificationRestoreService extends IntentService {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationRestoreService() {
        super("NotificationRestoreService");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        Intent intent2 = intent;
        if (intent2 != null) {
            Thread.currentThread().setPriority(10);
            OneSignal.setAppContext(this);
            NotificationRestorer.restore(this);
            boolean completeWakefulIntent = WakefulBroadcastReceiver.completeWakefulIntent(intent2);
        }
    }
}
