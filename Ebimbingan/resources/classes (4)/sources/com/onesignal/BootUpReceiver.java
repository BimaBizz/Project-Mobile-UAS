package com.onesignal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootUpReceiver extends BroadcastReceiver {
    public BootUpReceiver() {
    }

    public void onReceive(Context context, Intent intent) {
        Intent intent2 = intent;
        NotificationRestorer.startDelayedRestoreTaskFromReceiver(context);
    }
}
