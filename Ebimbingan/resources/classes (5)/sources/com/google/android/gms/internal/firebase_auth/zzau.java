package com.google.android.gms.internal.firebase_auth;

import java.util.NoSuchElementException;

abstract class zzau<E> extends zzbj<E> {
    private int position;
    private final int size;

    protected zzau(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int zzb = zzaj.zzb(i4, i3);
        this.size = i3;
        this.position = i4;
    }

    /* access modifiers changed from: protected */
    public abstract E get(int i);

    public final boolean hasNext() {
        return this.position < this.size;
    }

    public final E next() {
        Throwable th;
        if (!hasNext()) {
            Throwable th2 = th;
            new NoSuchElementException();
            throw th2;
        }
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        return get(i);
    }

    public final int nextIndex() {
        return this.position;
    }

    public final boolean hasPrevious() {
        return this.position > 0;
    }

    public final E previous() {
        Throwable th;
        if (!hasPrevious()) {
            Throwable th2 = th;
            new NoSuchElementException();
            throw th2;
        }
        int i = this.position - 1;
        int i2 = i;
        this.position = i2;
        return get(i);
    }

    public final int previousIndex() {
        return this.position - 1;
    }
}
