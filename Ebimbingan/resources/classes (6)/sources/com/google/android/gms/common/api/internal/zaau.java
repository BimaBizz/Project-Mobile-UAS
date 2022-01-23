package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaau implements GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ AtomicReference zaa;
    final /* synthetic */ StatusPendingResult zab;
    final /* synthetic */ zaaz zac;

    zaau(zaaz zaaz, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.zac = zaaz;
        this.zaa = atomicReference;
        this.zab = statusPendingResult;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        zaaz.zaj(this.zac, (GoogleApiClient) Preconditions.checkNotNull((GoogleApiClient) this.zaa.get()), this.zab, true);
    }

    public final void onConnectionSuspended(int i) {
    }
}
