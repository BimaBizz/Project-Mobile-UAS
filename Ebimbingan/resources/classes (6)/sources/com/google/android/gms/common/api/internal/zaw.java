package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaw implements zabt {
    final /* synthetic */ zax zaa;

    /* synthetic */ zaw(zax zax, zau zau) {
        zau zau2 = zau;
        this.zaa = zax;
    }

    public final void zaa(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        this.zaa.zam.lock();
        try {
            ConnectionResult zax = zax.zax(this.zaa, ConnectionResult.RESULT_SUCCESS);
            zax.zap(this.zaa);
            this.zaa.zam.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaa.zam.unlock();
            throw th2;
        }
    }

    public final void zab(@NonNull ConnectionResult connectionResult) {
        ConnectionResult connectionResult2 = connectionResult;
        this.zaa.zam.lock();
        try {
            ConnectionResult zax = zax.zax(this.zaa, connectionResult2);
            zax.zap(this.zaa);
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
            if (this.zaa.zal) {
                boolean zau = zax.zau(this.zaa, false);
                zax.zav(this.zaa, i2, z2);
                this.zaa.zam.unlock();
                return;
            }
            boolean zau2 = zax.zau(this.zaa, true);
            this.zaa.zad.onConnectionSuspended(i2);
            this.zaa.zam.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaa.zam.unlock();
            throw th2;
        }
    }
}
