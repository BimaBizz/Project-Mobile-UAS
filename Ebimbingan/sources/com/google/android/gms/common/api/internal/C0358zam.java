package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.internal.C0446Preconditions;

/* renamed from: com.google.android.gms.common.api.internal.zam */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0358zam {
    private final int zaa;
    private final C0184ConnectionResult zab;

    C0358zam(C0184ConnectionResult connectionResult, int i) {
        C0184ConnectionResult connectionResult2 = connectionResult;
        Object checkNotNull = C0446Preconditions.checkNotNull(connectionResult2);
        this.zab = connectionResult2;
        this.zaa = i;
    }

    /* access modifiers changed from: package-private */
    public final int zaa() {
        return this.zaa;
    }

    /* access modifiers changed from: package-private */
    public final C0184ConnectionResult zab() {
        return this.zab;
    }
}
