package com.google.android.gms.dynamic;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zac implements zah {
    final /* synthetic */ Bundle zaa;
    final /* synthetic */ DeferredLifecycleHelper zab;

    zac(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.zab = deferredLifecycleHelper;
        this.zaa = bundle;
    }

    public final int zaa() {
        return 1;
    }

    public final void zab(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2 = lifecycleDelegate;
        this.zab.zaa.onCreate(this.zaa);
    }
}
