package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaaj extends zabb {
    final /* synthetic */ ConnectionResult zaa;
    final /* synthetic */ zaal zab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zaaj(zaal zaal, zaba zaba, ConnectionResult connectionResult) {
        super(zaba);
        this.zab = zaal;
        this.zaa = connectionResult;
    }

    @GuardedBy("mLock")
    public final void zaa() {
        this.zab.zaa.zaF(this.zaa);
    }
}
