package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.zabi */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0306zabi implements Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ C0309zabl zab;

    C0306zabi(C0309zabl zabl, int i) {
        this.zab = zabl;
        this.zaa = i;
    }

    public final void run() {
        this.zab.zaC(this.zaa);
    }
}
