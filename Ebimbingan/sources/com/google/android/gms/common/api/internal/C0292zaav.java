package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.common.api.internal.zaav */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0292zaav implements C0222GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ C0266StatusPendingResult zaa;

    C0292zaav(C0296zaaz zaaz, C0266StatusPendingResult statusPendingResult) {
        C0296zaaz zaaz2 = zaaz;
        this.zaa = statusPendingResult;
    }

    public final void onConnectionFailed(@NonNull C0184ConnectionResult connectionResult) {
        C0231Result result;
        C0184ConnectionResult connectionResult2 = connectionResult;
        C0266StatusPendingResult statusPendingResult = this.zaa;
        new C0236Status(8);
        statusPendingResult.setResult(result);
    }
}
