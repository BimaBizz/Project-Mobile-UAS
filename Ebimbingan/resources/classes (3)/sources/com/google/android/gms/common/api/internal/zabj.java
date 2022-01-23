package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zabj implements Runnable {
    final /* synthetic */ zabk zaa;

    zabj(zabk zabk) {
        this.zaa = zabk;
    }

    public final void run() {
        this.zaa.zaa.zac.disconnect(String.valueOf(this.zaa.zaa.zac.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
