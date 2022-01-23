package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0446Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.zaau */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0291zaau implements C0222GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ AtomicReference zaa;
    final /* synthetic */ C0266StatusPendingResult zab;
    final /* synthetic */ C0296zaaz zac;

    C0291zaau(C0296zaaz zaaz, AtomicReference atomicReference, C0266StatusPendingResult statusPendingResult) {
        this.zac = zaaz;
        this.zaa = atomicReference;
        this.zab = statusPendingResult;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        C0296zaaz.zaj(this.zac, (C0222GoogleApiClient) C0446Preconditions.checkNotNull((C0222GoogleApiClient) this.zaa.get()), this.zab, true);
    }

    public final void onConnectionSuspended(int i) {
    }
}
