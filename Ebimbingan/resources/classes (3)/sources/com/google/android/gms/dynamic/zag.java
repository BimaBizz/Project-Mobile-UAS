package com.google.android.gms.dynamic;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zag implements zah {
    final /* synthetic */ DeferredLifecycleHelper zaa;

    zag(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    public final int zaa() {
        return 5;
    }

    public final void zab(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2 = lifecycleDelegate;
        this.zaa.zaa.onResume();
    }
}
