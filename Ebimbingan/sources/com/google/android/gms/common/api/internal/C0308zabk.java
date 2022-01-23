package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C0424BaseGmsClient;

/* renamed from: com.google.android.gms.common.api.internal.zabk */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0308zabk implements C0424BaseGmsClient.SignOutCallbacks {
    final /* synthetic */ C0309zabl zaa;

    C0308zabk(C0309zabl zabl) {
        this.zaa = zabl;
    }

    public final void onSignOutComplete() {
        Runnable runnable;
        Handler zas = this.zaa.zaa.zat;
        new C0307zabj(this);
        boolean post = zas.post(runnable);
    }
}
