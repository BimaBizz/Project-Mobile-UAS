package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0446Preconditions;

/* renamed from: com.google.android.gms.common.api.internal.zas */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0364zas implements C0222GoogleApiClient.ConnectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener {
    public final C0211Api<?> zaa;
    private final boolean zab;
    @Nullable
    private C0365zat zac;

    public C0364zas(C0211Api<?> api, boolean z) {
        this.zaa = api;
        this.zab = z;
    }

    private final C0365zat zab() {
        Object checkNotNull = C0446Preconditions.checkNotNull(this.zac, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.zac;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        zab().onConnected(bundle);
    }

    public final void onConnectionFailed(@NonNull C0184ConnectionResult connectionResult) {
        zab().zaa(connectionResult, this.zaa, this.zab);
    }

    public final void onConnectionSuspended(int i) {
        zab().onConnectionSuspended(i);
    }

    public final void zaa(C0365zat zat) {
        C0365zat zat2 = zat;
        this.zac = zat2;
    }
}
