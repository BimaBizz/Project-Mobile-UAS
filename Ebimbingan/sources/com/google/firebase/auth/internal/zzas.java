package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.C0242BackgroundDetector;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzes;

public final class zzas {
    private volatile int zzuv;
    /* access modifiers changed from: private */
    public final zzv zzuw;
    private volatile boolean zzux;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzas(com.google.firebase.FirebaseApp r9) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r0
            r3 = r1
            android.content.Context r3 = r3.getApplicationContext()
            com.google.firebase.auth.internal.zzv r4 = new com.google.firebase.auth.internal.zzv
            r7 = r4
            r4 = r7
            r5 = r7
            r6 = r1
            r5.<init>(r6)
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.zzas.<init>(com.google.firebase.FirebaseApp):void");
    }

    @C0617VisibleForTesting
    private zzas(Context context, zzv zzv) {
        C0242BackgroundDetector.BackgroundStateChangeListener backgroundStateChangeListener;
        this.zzux = false;
        this.zzuv = 0;
        this.zzuw = zzv;
        C0242BackgroundDetector.initialize((Application) context.getApplicationContext());
        new zzav(this);
        C0242BackgroundDetector.getInstance().addListener(backgroundStateChangeListener);
    }

    public final void zzj(int i) {
        int i2 = i;
        if (i2 > 0 && this.zzuv == 0) {
            this.zzuv = i2;
            if (zzfq()) {
                this.zzuw.zzfh();
            }
        } else if (i2 == 0 && this.zzuv != 0) {
            this.zzuw.cancel();
        }
        this.zzuv = i2;
    }

    public final void zzc(zzes zzes) {
        zzes zzes2 = zzes;
        if (zzes2 != null) {
            long zzt = zzes2.zzt();
            long j = zzt;
            if (zzt <= 0) {
                j = 3600;
            }
            zzv zzv = this.zzuw;
            zzv.zztv = zzes2.zzev() + (j * 1000);
            zzv.zztw = -1;
            if (zzfq()) {
                this.zzuw.zzfh();
            }
        }
    }

    public final void cancel() {
        this.zzuw.cancel();
    }

    /* access modifiers changed from: private */
    public final boolean zzfq() {
        return this.zzuv > 0 && !this.zzux;
    }

    static /* synthetic */ boolean zza(zzas zzas, boolean z) {
        boolean z2 = z;
        boolean z3 = z2;
        zzas.zzux = z3;
        return z2;
    }
}
