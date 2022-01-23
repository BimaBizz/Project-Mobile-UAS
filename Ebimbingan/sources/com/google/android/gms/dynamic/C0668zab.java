package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: com.google.android.gms.dynamic.zab */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0668zab implements C0674zah {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ Bundle zab;
    final /* synthetic */ Bundle zac;
    final /* synthetic */ C0658DeferredLifecycleHelper zad;

    C0668zab(C0658DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.zad = deferredLifecycleHelper;
        this.zaa = activity;
        this.zab = bundle;
        this.zac = bundle2;
    }

    public final int zaa() {
        return 0;
    }

    public final void zab(C0662LifecycleDelegate lifecycleDelegate) {
        C0662LifecycleDelegate lifecycleDelegate2 = lifecycleDelegate;
        this.zad.zaa.onInflate(this.zaa, this.zab, this.zac);
    }
}
