package com.onesignal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class UpgradeReceiver extends BroadcastReceiver {
    public UpgradeReceiver() {
    }

    public void onReceive(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        if (Build.VERSION.SDK_INT != 24) {
            NotificationRestorer.startDelayedRestoreTaskFromReceiver(context2);
        }
    }
}
