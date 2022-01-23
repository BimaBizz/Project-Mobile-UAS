package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaj implements GoogleApiClient.OnConnectionFailedListener {
    public final int zaa;
    public final GoogleApiClient zab;
    @Nullable
    public final GoogleApiClient.OnConnectionFailedListener zac;
    final /* synthetic */ zak zad;

    public zaj(zak zak, int i, @Nullable GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zad = zak;
        this.zaa = i;
        this.zab = googleApiClient;
        this.zac = onConnectionFailedListener;
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        StringBuilder sb;
        ConnectionResult connectionResult2 = connectionResult;
        String valueOf = String.valueOf(connectionResult2);
        new StringBuilder(String.valueOf(valueOf).length() + 27);
        StringBuilder append = sb.append("beginFailureResolution for ");
        StringBuilder append2 = sb.append(valueOf);
        int d = Log.d("AutoManageHelper", sb.toString());
        this.zad.zaf(connectionResult2, this.zaa);
    }
}
