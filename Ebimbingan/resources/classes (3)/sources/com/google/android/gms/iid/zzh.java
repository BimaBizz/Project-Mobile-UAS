package com.google.android.gms.iid;

import android.content.Intent;
import android.util.Log;

final class zzh implements Runnable {
    private final /* synthetic */ Intent zzbf;
    private final /* synthetic */ zzg zzbl;

    zzh(zzg zzg, Intent intent) {
        this.zzbl = zzg;
        this.zzbf = intent;
    }

    public final void run() {
        StringBuilder sb;
        String action = this.zzbf.getAction();
        new StringBuilder(61 + String.valueOf(action).length());
        int w = Log.w("EnhancedIntentService", sb.append("Service took too long to process intent: ").append(action).append(" App may get closed.").toString());
        this.zzbl.finish();
    }
}
