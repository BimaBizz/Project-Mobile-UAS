package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.zabb */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
abstract class C0299zabb {
    private final C0298zaba zaa;

    protected C0299zabb(C0298zaba zaba) {
        this.zaa = zaba;
    }

    /* access modifiers changed from: protected */
    public abstract void zaa();

    public final void zab(C0301zabd zabd) {
        C0301zabd zabd2 = zabd;
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
