package com.google.android.gms.dynamic;

import android.os.Bundle;

/* renamed from: com.google.android.gms.dynamic.zac */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0669zac implements C0674zah {
    final /* synthetic */ Bundle zaa;
    final /* synthetic */ C0658DeferredLifecycleHelper zab;

    C0669zac(C0658DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.zab = deferredLifecycleHelper;
        this.zaa = bundle;
    }

    public final int zaa() {
        return 1;
    }

    public final void zab(C0662LifecycleDelegate lifecycleDelegate) {
        C0662LifecycleDelegate lifecycleDelegate2 = lifecycleDelegate;
        this.zab.zaa.onCreate(this.zaa);
    }
}
