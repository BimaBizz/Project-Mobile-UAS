package com.google.android.gms.dynamic;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: com.google.android.gms.dynamic.zaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0667zaa implements C0664OnDelegateCreatedListener {
    final /* synthetic */ C0658DeferredLifecycleHelper zaa;

    C0667zaa(C0658DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    public final void onDelegateCreated(C0662LifecycleDelegate lifecycleDelegate) {
        C0662LifecycleDelegate zaa2 = C0658DeferredLifecycleHelper.zaa(this.zaa, lifecycleDelegate);
        Iterator it = this.zaa.zac.iterator();
        while (it.hasNext()) {
            ((C0674zah) it.next()).zab(this.zaa.zaa);
        }
        this.zaa.zac.clear();
        Bundle zad = C0658DeferredLifecycleHelper.zad(this.zaa, (Bundle) null);
    }
}
