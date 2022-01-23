package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.zab */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0297zab extends C0239ActivityLifecycleObserver {
    private final WeakReference<C0270zaa> zaa;

    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.VisibleForTesting(otherwise = 2)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0297zab(com.google.android.gms.common.api.internal.C0270zaa r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r3 = r0
            r3.<init>()
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r2 = r3
            r3 = r2
            r4 = r1
            r3.<init>(r4)
            r3 = r0
            r4 = r2
            r3.zaa = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0297zab.<init>(com.google.android.gms.common.api.internal.zaa):void");
    }

    public final C0239ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        Throwable th;
        Runnable runnable2 = runnable;
        C0270zaa zaa2 = (C0270zaa) this.zaa.get();
        if (zaa2 == null) {
            new IllegalStateException("The target activity has already been GC'd");
            throw th;
        }
        zaa2.zac(runnable2);
        return this;
    }
}
