package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zau implements Runnable {
    final /* synthetic */ zax zaa;

    zau(zax zax) {
        this.zaa = zax;
    }

    public final void run() {
        this.zaa.zam.lock();
        try {
            zax.zap(this.zaa);
            this.zaa.zam.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zaa.zam.unlock();
            throw th2;
        }
    }
}
