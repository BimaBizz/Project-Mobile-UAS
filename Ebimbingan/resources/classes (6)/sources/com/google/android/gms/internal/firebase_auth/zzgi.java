package com.google.android.gms.internal.firebase_auth;

import java.util.NoSuchElementException;

final class zzgi extends zzgk {
    private final int limit = this.zzvz.size();
    private int position = 0;
    private final /* synthetic */ zzgf zzvz;

    zzgi(zzgf zzgf) {
        this.zzvz = zzgf;
    }

    public final boolean hasNext() {
        return this.position < this.limit;
    }

    public final byte nextByte() {
        Throwable th;
        int i = this.position;
        int i2 = i;
        if (i >= this.limit) {
            Throwable th2 = th;
            new NoSuchElementException();
            throw th2;
        }
        this.position = i2 + 1;
        return this.zzvz.zzq(i2);
    }
}
