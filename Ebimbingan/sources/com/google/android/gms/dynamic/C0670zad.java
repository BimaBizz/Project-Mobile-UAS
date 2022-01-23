package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.google.android.gms.dynamic.zad */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0670zad implements C0674zah {
    final /* synthetic */ FrameLayout zaa;
    final /* synthetic */ LayoutInflater zab;
    final /* synthetic */ ViewGroup zac;
    final /* synthetic */ Bundle zad;
    final /* synthetic */ C0658DeferredLifecycleHelper zae;

    C0670zad(C0658DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.zae = deferredLifecycleHelper;
        this.zaa = frameLayout;
        this.zab = layoutInflater;
        this.zac = viewGroup;
        this.zad = bundle;
    }

    public final int zaa() {
        return 2;
    }

    public final void zab(C0662LifecycleDelegate lifecycleDelegate) {
        C0662LifecycleDelegate lifecycleDelegate2 = lifecycleDelegate;
        this.zaa.removeAllViews();
        this.zaa.addView(this.zae.zaa.onCreateView(this.zab, this.zac, this.zad));
    }
}
