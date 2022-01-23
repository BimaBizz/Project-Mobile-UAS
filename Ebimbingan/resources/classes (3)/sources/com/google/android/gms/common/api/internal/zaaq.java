package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
abstract class zaaq implements Runnable {
    final /* synthetic */ zaar zab;

    /* synthetic */ zaaq(zaar zaar, zaah zaah) {
        zaah zaah2 = zaah;
        this.zab = zaar;
    }

    @WorkerThread
    public final void run() {
        this.zab.zab.lock();
        try {
            if (Thread.interrupted()) {
                this.zab.zab.unlock();
                return;
            }
            zaa();
            this.zab.zab.unlock();
        } catch (RuntimeException e) {
            this.zab.zaa.zas(e);
            this.zab.zab.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            this.zab.zab.unlock();
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract void zaa();
}
