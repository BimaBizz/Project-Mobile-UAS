package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaav implements GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ StatusPendingResult zaa;

    zaav(zaaz zaaz, StatusPendingResult statusPendingResult) {
        zaaz zaaz2 = zaaz;
        this.zaa = statusPendingResult;
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Result result;
        ConnectionResult connectionResult2 = connectionResult;
        StatusPendingResult statusPendingResult = this.zaa;
        new Status(8);
        statusPendingResult.setResult(result);
    }
}
