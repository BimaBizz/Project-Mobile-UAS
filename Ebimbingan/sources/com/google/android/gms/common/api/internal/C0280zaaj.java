package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C0184ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.zaaj */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0280zaaj extends C0299zabb {
    final /* synthetic */ C0184ConnectionResult zaa;
    final /* synthetic */ C0282zaal zab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0280zaaj(C0282zaal zaal, C0298zaba zaba, C0184ConnectionResult connectionResult) {
        super(zaba);
        this.zab = zaal;
        this.zaa = connectionResult;
    }

    @GuardedBy("mLock")
    public final void zaa() {
        this.zab.zaa.zaF(this.zaa);
    }
}
