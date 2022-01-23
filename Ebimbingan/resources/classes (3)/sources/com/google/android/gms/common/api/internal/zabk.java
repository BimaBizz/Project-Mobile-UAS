package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zabk implements BaseGmsClient.SignOutCallbacks {
    final /* synthetic */ zabl zaa;

    zabk(zabl zabl) {
        this.zaa = zabl;
    }

    public final void onSignOutComplete() {
        Runnable runnable;
        Handler zas = this.zaa.zaa.zat;
        new zabj(this);
        boolean post = zas.post(runnable);
    }
}
