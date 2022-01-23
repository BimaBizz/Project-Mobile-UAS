package com.google.android.gms.internal.firebase_auth;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class zzaa<T> implements Iterator<T> {
    private int zzgb = zzab.zzge;
    @NullableDecl
    private T zzgc;

    protected zzaa() {
    }

    /* access modifiers changed from: protected */
    public abstract T zzbw();

    /* access modifiers changed from: protected */
    @NullableDecl
    public final T zzbx() {
        int i = zzab.zzgf;
        this.zzgb = i;
        return null;
    }

    public final boolean hasNext() {
        Throwable th;
        if (!(this.zzgb != zzab.zzgg)) {
            Throwable th2 = th;
            new IllegalStateException();
            throw th2;
        }
        switch (zzac.zzgi[this.zzgb - 1]) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                this.zzgb = zzab.zzgg;
                this.zzgc = zzbw();
                if (this.zzgb == zzab.zzgf) {
                    return false;
                }
                this.zzgb = zzab.zzgd;
                return true;
        }
    }

    public final T next() {
        Throwable th;
        if (!hasNext()) {
            Throwable th2 = th;
            new NoSuchElementException();
            throw th2;
        }
        this.zzgb = zzab.zzge;
        T t = this.zzgc;
        this.zzgc = null;
        return t;
    }

    public final void remove() {
        Throwable th;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }
}
