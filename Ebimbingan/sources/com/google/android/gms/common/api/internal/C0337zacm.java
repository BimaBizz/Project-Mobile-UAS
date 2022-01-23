package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.C1146zak;

/* renamed from: com.google.android.gms.common.api.internal.zacm */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0337zacm implements Runnable {
    final /* synthetic */ C1146zak zaa;
    final /* synthetic */ C0339zaco zab;

    C0337zacm(C0339zaco zaco, C1146zak zak) {
        this.zab = zaco;
        this.zaa = zak;
    }

    public final void run() {
        C0339zaco.zaf(this.zab, this.zaa);
    }
}
