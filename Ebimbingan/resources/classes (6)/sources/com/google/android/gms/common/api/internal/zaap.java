package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.internal.zae;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaap implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ zaar zaa;

    /* synthetic */ zaap(zaar zaar, zaah zaah) {
        zaah zaah2 = zaah;
        this.zaa = zaar;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        zae zae;
        Bundle bundle2 = bundle;
        ClientSettings clientSettings = (ClientSettings) Preconditions.checkNotNull(this.zaa.zar);
        com.google.android.gms.signin.zae zae2 = (com.google.android.gms.signin.zae) Preconditions.checkNotNull(this.zaa.zak);
        new zaao(this.zaa);
        zae2.zaa(zae);
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        ConnectionResult connectionResult2 = connectionResult;
        this.zaa.zab.lock();
        try {
            if (this.zaa.zaE(connectionResult2)) {
                this.zaa.zaD();
                this.zaa.zaA();
            } else {
                this.zaa.zaF(connectionResult2);
            }
            this.zaa.zab.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaa.zab.unlock();
            throw th2;
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}
