package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;

public class NotificationOpenedActivityHMS extends Activity {
    public NotificationOpenedActivityHMS() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        processIntent();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        processIntent();
    }

    private void processIntent() {
        processOpen(getIntent());
        finish();
    }

    private void processOpen(@Nullable Intent intent) {
        NotificationPayloadProcessorHMS.handleHMSNotificationOpenIntent(this, intent);
    }
}
