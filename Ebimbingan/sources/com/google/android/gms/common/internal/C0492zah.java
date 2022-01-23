package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.C0245ConnectionCallbacks;
import com.google.android.gms.common.internal.C0424BaseGmsClient;

/* renamed from: com.google.android.gms.common.internal.zah */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0492zah implements C0424BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ C0245ConnectionCallbacks zaa;

    C0492zah(C0245ConnectionCallbacks connectionCallbacks) {
        this.zaa = connectionCallbacks;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        this.zaa.onConnected(bundle);
    }

    public final void onConnectionSuspended(int i) {
        this.zaa.onConnectionSuspended(i);
    }
}
