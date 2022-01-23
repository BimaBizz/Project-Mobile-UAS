package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.zabj */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0307zabj implements Runnable {
    final /* synthetic */ C0308zabk zaa;

    C0307zabj(C0308zabk zabk) {
        this.zaa = zabk;
    }

    public final void run() {
        this.zaa.zaa.zac.disconnect(String.valueOf(this.zaa.zaa.zac.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
