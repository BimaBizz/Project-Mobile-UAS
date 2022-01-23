package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener;
import com.google.android.gms.common.internal.C0424BaseGmsClient;

/* renamed from: com.google.android.gms.common.internal.zai */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0493zai implements C0424BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ C0257OnConnectionFailedListener zaa;

    C0493zai(C0257OnConnectionFailedListener onConnectionFailedListener) {
        this.zaa = onConnectionFailedListener;
    }

    public final void onConnectionFailed(@NonNull C0184ConnectionResult connectionResult) {
        this.zaa.onConnectionFailed(connectionResult);
    }
}
