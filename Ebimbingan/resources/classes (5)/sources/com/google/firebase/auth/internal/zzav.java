package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

final class zzav implements BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ zzas zzvb;

    zzav(zzas zzas) {
        this.zzvb = zzas;
    }

    public final void onBackgroundStateChanged(boolean z) {
        if (z) {
            boolean zza = zzas.zza(this.zzvb, true);
            this.zzvb.cancel();
            return;
        }
        boolean zza2 = zzas.zza(this.zzvb, false);
        if (this.zzvb.zzfq()) {
            this.zzvb.zzuw.zzfh();
        }
    }
}
