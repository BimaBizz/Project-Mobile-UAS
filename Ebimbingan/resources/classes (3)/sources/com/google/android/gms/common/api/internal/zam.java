package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zam {
    private final int zaa;
    private final ConnectionResult zab;

    zam(ConnectionResult connectionResult, int i) {
        ConnectionResult connectionResult2 = connectionResult;
        Object checkNotNull = Preconditions.checkNotNull(connectionResult2);
        this.zab = connectionResult2;
        this.zaa = i;
    }

    /* access modifiers changed from: package-private */
    public final int zaa() {
        return this.zaa;
    }

    /* access modifiers changed from: package-private */
    public final ConnectionResult zab() {
        return this.zab;
    }
}