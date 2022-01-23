package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import com.google.android.gms.signin.internal.C1138zac;
import com.google.android.gms.signin.internal.C1146zak;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.zaao */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0285zaao extends C1138zac {
    private final WeakReference<C0288zaar> zaa;

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0285zaao(com.google.android.gms.common.api.internal.C0288zaar r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0285zaao.<init>(com.google.android.gms.common.api.internal.zaar):void");
    }

    @BinderThread
    public final void zab(C1146zak zak) {
        C0299zabb zabb;
        C1146zak zak2 = zak;
        C0288zaar zaar = (C0288zaar) this.zaa.get();
        if (zaar != null) {
            C0301zabd zal = zaar.zaa;
            new C0284zaan(this, zaar, zaar, zak2);
            zal.zar(zabb);
        }
    }
}
