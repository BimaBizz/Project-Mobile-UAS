package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zabi implements Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ zabl zab;

    zabi(zabl zabl, int i) {
        this.zab = zabl;
        this.zaa = i;
    }

    public final void run() {
        this.zab.zaC(this.zaa);
    }
}
