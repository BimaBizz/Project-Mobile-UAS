package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0184ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.zav */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0367zav implements C0317zabt {
    final /* synthetic */ C0369zax zaa;

    /* synthetic */ C0367zav(C0369zax zax, C0366zau zau) {
        C0366zau zau2 = zau;
        this.zaa = zax;
    }

    public final void zaa(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        this.zaa.zam.lock();
        try {
            C0369zax.zaq(this.zaa, bundle2);
            C0184ConnectionResult zar = C0369zax.zar(this.zaa, C0184ConnectionResult.RESULT_SUCCESS);
            C0369zax.zap(this.zaa);
            this.zaa.zam.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaa.zam.unlock();
            throw th2;
        }
    }

    public final void zab(@NonNull C0184ConnectionResult connectionResult) {
        C0184ConnectionResult connectionResult2 = connectionResult;
        this.zaa.zam.lock();
        try {
            C0184ConnectionResult zar = C0369zax.zar(this.zaa, connectionResult2);
            C0369zax.zap(this.zaa);
            this.zaa.zam.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaa.zam.unlock();
            throw th2;
        }
    }

    public final void zac(int i, boolean z) {
        int i2 = i;
        boolean z2 = z;
        this.zaa.zam.lock();
        try {
            if (this.zaa.zal || this.zaa.zak == null || !this.zaa.zak.isSuccess()) {
                boolean zau = C0369zax.zau(this.zaa, false);
                C0369zax.zav(this.zaa, i2, z2);
                this.zaa.zam.unlock();
                return;
            }
            boolean zau2 = C0369zax.zau(this.zaa, true);
            this.zaa.zae.onConnectionSuspended(i2);
            this.zaa.zam.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaa.zam.unlock();
            throw th2;
        }
    }
}
