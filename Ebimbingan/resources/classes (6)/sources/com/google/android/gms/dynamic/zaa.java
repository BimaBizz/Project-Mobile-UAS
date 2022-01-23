package com.google.android.gms.dynamic;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaa implements OnDelegateCreatedListener {
    final /* synthetic */ DeferredLifecycleHelper zaa;

    zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate zaa2 = DeferredLifecycleHelper.zaa(this.zaa, lifecycleDelegate);
        Iterator it = this.zaa.zac.iterator();
        while (it.hasNext()) {
            ((zah) it.next()).zab(this.zaa.zaa);
        }
        this.zaa.zac.clear();
        Bundle zad = DeferredLifecycleHelper.zad(this.zaa, (Bundle) null);
    }
}
