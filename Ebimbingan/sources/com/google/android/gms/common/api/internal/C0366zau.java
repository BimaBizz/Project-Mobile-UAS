package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.zau */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0366zau implements Runnable {
    final /* synthetic */ C0369zax zaa;

    C0366zau(C0369zax zax) {
        this.zaa = zax;
    }

    public final void run() {
        this.zaa.zam.lock();
        try {
            C0369zax.zap(this.zaa);
            this.zaa.zam.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaa.zam.unlock();
            throw th2;
        }
    }
}
