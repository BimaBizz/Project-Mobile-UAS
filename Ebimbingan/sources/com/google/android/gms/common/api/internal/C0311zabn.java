package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.internal.C0437IAccountAccessor;

/* renamed from: com.google.android.gms.common.api.internal.zabn */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0311zabn implements Runnable {
    final /* synthetic */ C0184ConnectionResult zaa;
    final /* synthetic */ C0312zabo zab;

    C0311zabn(C0312zabo zabo, C0184ConnectionResult connectionResult) {
        this.zab = zabo;
        this.zaa = connectionResult;
    }

    public final void run() {
        C0184ConnectionResult connectionResult;
        C0309zabl zabl = (C0309zabl) this.zab.zaa.zap.get(this.zab.zac);
        if (zabl != null) {
            if (this.zaa.isSuccess()) {
                boolean zad = C0312zabo.zad(this.zab, true);
                if (this.zab.zab.requiresSignIn()) {
                    this.zab.zag();
                    return;
                }
                try {
                    this.zab.zab.getRemoteService((C0437IAccountAccessor) null, this.zab.zab.getScopesForConnectionlessNonSignIn());
                } catch (SecurityException e) {
                    int e2 = Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.zab.zab.disconnect("Failed to get service from broker.");
                    new C0184ConnectionResult(10);
                    zabl.zac(connectionResult, (Exception) null);
                }
            } else {
                zabl.zac(this.zaa, (Exception) null);
            }
        }
    }
}
