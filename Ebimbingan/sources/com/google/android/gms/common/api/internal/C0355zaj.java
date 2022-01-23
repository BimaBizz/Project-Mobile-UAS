package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0222GoogleApiClient;

/* renamed from: com.google.android.gms.common.api.internal.zaj */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0355zaj implements C0222GoogleApiClient.OnConnectionFailedListener {
    public final int zaa;
    public final C0222GoogleApiClient zab;
    @Nullable
    public final C0222GoogleApiClient.OnConnectionFailedListener zac;
    final /* synthetic */ C0356zak zad;

    public C0355zaj(C0356zak zak, int i, @Nullable C0222GoogleApiClient googleApiClient, C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zad = zak;
        this.zaa = i;
        this.zab = googleApiClient;
        this.zac = onConnectionFailedListener;
    }

    public final void onConnectionFailed(@NonNull C0184ConnectionResult connectionResult) {
        StringBuilder sb;
        C0184ConnectionResult connectionResult2 = connectionResult;
        String valueOf = String.valueOf(connectionResult2);
        new StringBuilder(String.valueOf(valueOf).length() + 27);
        StringBuilder append = sb.append("beginFailureResolution for ");
        StringBuilder append2 = sb.append(valueOf);
        int d = Log.d("AutoManageHelper", sb.toString());
        this.zad.zaf(connectionResult2, this.zaa);
    }
}
