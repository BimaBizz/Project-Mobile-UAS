package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
abstract class zabb {
    private final zaba zaa;

    protected zabb(zaba zaba) {
        this.zaa = zaba;
    }

    /* access modifiers changed from: protected */
    public abstract void zaa();

    public final void zab(zabd zabd) {
        zabd zabd2 = zabd;
        zabd2.zai.lock();
        try {
            if (zabd2.zan != this.zaa) {
                zabd2.zai.unlock();
                return;
            }
            zaa();
            zabd2.zai.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            zabd2.zai.unlock();
            throw th2;
        }
    }
}
