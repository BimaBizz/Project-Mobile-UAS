package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.WakeLockTracker;

@ShowFirstParty
@KeepForSdk
public abstract class GCoreWakefulBroadcastReceiver extends WakefulBroadcastReceiver {
    private static String TAG = "GCoreWakefulBroadcastReceiver";

    public GCoreWakefulBroadcastReceiver() {
    }

    @SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
    @KeepForSdk
    public static boolean completeWakefulIntent(Context context, Intent intent) {
        String str;
        String str2;
        Context context2 = context;
        Intent intent2 = intent;
        if (intent2 == null) {
            return false;
        }
        if (context2 != null) {
            WakeLockTracker.getInstance().registerReleaseEvent(context2, intent2);
        } else {
            String str3 = TAG;
            String valueOf = String.valueOf(intent2.toUri(0));
            String str4 = valueOf;
            if (valueOf.length() != 0) {
                str2 = "context shouldn't be null. intent: ".concat(str4);
            } else {
                str2 = str;
                new String("context shouldn't be null. intent: ");
            }
            int w = Log.w(str3, str2);
        }
        return WakefulBroadcastReceiver.completeWakefulIntent(intent2);
    }
}
