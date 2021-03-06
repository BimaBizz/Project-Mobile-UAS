package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

final class zzah extends BroadcastReceiver {
    private final /* synthetic */ zzaf zzdc;

    zzah(zzaf zzaf) {
        this.zzdc = zzaf;
    }

    public final void onReceive(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        if (Log.isLoggable("InstanceID", 3)) {
            int d = Log.d("InstanceID", "Received GSF callback via dynamic receiver");
        }
        this.zzdc.zzh(intent2);
    }
}
