package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C0184ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.zacl */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0336zacl implements Runnable {
    final /* synthetic */ C0339zaco zaa;

    C0336zacl(C0339zaco zaco) {
        this.zaa = zaco;
    }

    public final void run() {
        C0184ConnectionResult connectionResult;
        C0338zacn zae = this.zaa.zah;
        new C0184ConnectionResult(4);
        zae.zaa(connectionResult);
    }
}
