package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.signin.C1152zae;
import com.google.android.gms.signin.internal.C1140zae;

/* renamed from: com.google.android.gms.common.api.internal.zaap */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0286zaap implements C0222GoogleApiClient.ConnectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ C0288zaar zaa;

    /* synthetic */ C0286zaap(C0288zaar zaar, C0278zaah zaah) {
        C0278zaah zaah2 = zaah;
        this.zaa = zaar;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        C1140zae zae;
        Bundle bundle2 = bundle;
        C0427ClientSettings clientSettings = (C0427ClientSettings) C0446Preconditions.checkNotNull(this.zaa.zar);
        C1152zae zae2 = (C1152zae) C0446Preconditions.checkNotNull(this.zaa.zak);
        new C0285zaao(this.zaa);
        zae2.zaa(zae);
    }

    public final void onConnectionFailed(@NonNull C0184ConnectionResult connectionResult) {
        C0184ConnectionResult connectionResult2 = connectionResult;
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
