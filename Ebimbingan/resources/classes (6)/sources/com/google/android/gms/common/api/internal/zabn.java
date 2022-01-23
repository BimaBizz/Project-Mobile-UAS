package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zabn implements Runnable {
    final /* synthetic */ ConnectionResult zaa;
    final /* synthetic */ zabo zab;

    zabn(zabo zabo, ConnectionResult connectionResult) {
        this.zab = zabo;
        this.zaa = connectionResult;
    }

    public final void run() {
        ConnectionResult connectionResult;
        zabl zabl = (zabl) this.zab.zaa.zap.get(this.zab.zac);
        if (zabl != null) {
            if (this.zaa.isSuccess()) {
                boolean zad = zabo.zad(this.zab, true);
                if (this.zab.zab.requiresSignIn()) {
                    this.zab.zag();
                    return;
                }
                try {
                    this.zab.zab.getRemoteService((IAccountAccessor) null, this.zab.zab.getScopesForConnectionlessNonSignIn());
                } catch (SecurityException e) {
                    int e2 = Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.zab.zab.disconnect("Failed to get service from broker.");
                    new ConnectionResult(10);
                    zabl.zac(connectionResult, (Exception) null);
                }
            } else {
                zabl.zac(this.zaa, (Exception) null);
            }
        }
    }
}
