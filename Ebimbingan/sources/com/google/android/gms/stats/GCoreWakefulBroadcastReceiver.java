package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.stats.C0585WakeLockTracker;

@C0452ShowFirstParty
@C0206KeepForSdk
public abstract class GCoreWakefulBroadcastReceiver extends WakefulBroadcastReceiver {
    private static String TAG = "GCoreWakefulBroadcastReceiver";

    public GCoreWakefulBroadcastReceiver() {
    }

    @SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
    @C0206KeepForSdk
    public static boolean completeWakefulIntent(Context context, Intent intent) {
        String str;
        String str2;
        Context context2 = context;
        Intent intent2 = intent;
        if (intent2 == null) {
            return false;
        }
        if (context2 != null) {
            C0585WakeLockTracker.getInstance().registerReleaseEvent(context2, intent2);
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
