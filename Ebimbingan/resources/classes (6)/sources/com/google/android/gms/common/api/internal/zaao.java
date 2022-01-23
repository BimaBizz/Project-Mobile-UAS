package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaao extends zac {
    private final WeakReference<zaar> zaa;

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zaao(com.google.android.gms.common.api.internal.zaar r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r3 = r0
            r3.<init>()
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r2 = r3
            r3 = r2
            r4 = r1
            r3.<init>(r4)
            r3 = r0
            r4 = r2
            r3.zaa = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaao.<init>(com.google.android.gms.common.api.internal.zaar):void");
    }

    @BinderThread
    public final void zab(zak zak) {
        zabb zabb;
        zak zak2 = zak;
        zaar zaar = (zaar) this.zaa.get();
        if (zaar != null) {
            zabd zal = zaar.zaa;
            new zaan(this, zaar, zaar, zak2);
            zal.zar(zabb);
        }
    }
}
