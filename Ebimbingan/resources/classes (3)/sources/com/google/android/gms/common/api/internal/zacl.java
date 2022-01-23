package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zacl implements Runnable {
    final /* synthetic */ zaco zaa;

    zacl(zaco zaco) {
        this.zaa = zaco;
    }

    public final void run() {
        ConnectionResult connectionResult;
        zacn zae = this.zaa.zah;
        new ConnectionResult(4);
        zae.zaa(connectionResult);
    }
}
