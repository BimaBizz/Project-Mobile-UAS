package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zacm implements Runnable {
    final /* synthetic */ zak zaa;
    final /* synthetic */ zaco zab;

    zacm(zaco zaco, zak zak) {
        this.zab = zaco;
        this.zaa = zak;
    }

    public final void run() {
        zaco.zaf(this.zab, this.zaa);
    }
}
