package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zab extends ActivityLifecycleObserver {
    private final WeakReference<zaa> zaa;

    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.VisibleForTesting(otherwise = 2)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zab(com.google.android.gms.common.api.internal.zaa r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zab.<init>(com.google.android.gms.common.api.internal.zaa):void");
    }

    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        Throwable th;
        Runnable runnable2 = runnable;
        zaa zaa2 = (zaa) this.zaa.get();
        if (zaa2 == null) {
            new IllegalStateException("The target activity has already been GC'd");
            throw th;
        }
        zaa2.zac(runnable2);
        return this;
    }
}
