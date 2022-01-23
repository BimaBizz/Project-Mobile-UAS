package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting(otherwise = 2)
/* renamed from: com.google.android.gms.common.api.internal.zaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0270zaa extends C0252LifecycleCallback {
    private List<Runnable> zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C0270zaa(C0253LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        List<Runnable> list;
        new ArrayList();
        this.zaa = list;
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    /* JADX INFO: finally extract failed */
    static /* synthetic */ C0270zaa zaa(Activity activity) {
        C0270zaa zaa2;
        C0270zaa zaa3;
        Activity activity2 = activity;
        synchronized (activity2) {
            try {
                C0253LifecycleFragment fragment = getFragment(activity2);
                C0270zaa zaa4 = (C0270zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", C0270zaa.class);
                if (zaa4 == null) {
                    new C0270zaa(fragment);
                    zaa2 = zaa3;
                } else {
                    zaa2 = zaa4;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Activity activity3 = activity2;
                throw th2;
            }
        }
        return zaa2;
    }

    /* access modifiers changed from: private */
    public final synchronized void zac(Runnable runnable) {
        Runnable runnable2 = runnable;
        synchronized (this) {
            boolean add = this.zaa.add(runnable2);
        }
    }

    /* JADX INFO: finally extract failed */
    @MainThread
    public final void onStop() {
        List<Runnable> list;
        List<Runnable> list2;
        synchronized (this) {
            try {
                list = this.zaa;
                new ArrayList();
                this.zaa = list2;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
        for (Runnable run : list) {
            run.run();
        }
    }
}
