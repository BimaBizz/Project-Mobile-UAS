package com.google.android.gms.iid;

import android.util.Log;

final class zzj implements Runnable {
    private final /* synthetic */ zzg zzbn;
    private final /* synthetic */ zzi zzbo;

    zzj(zzi zzi, zzg zzg) {
        this.zzbo = zzi;
        this.zzbn = zzg;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            int d = Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.zzbo.zzbm.handleIntent(this.zzbn.intent);
        this.zzbn.finish();
    }
}
