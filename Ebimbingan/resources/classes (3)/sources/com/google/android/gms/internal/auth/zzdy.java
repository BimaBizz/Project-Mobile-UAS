package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
abstract class zzdy<E> extends zzfp<E> {
    private final int zza;
    private int zzb;

    protected zzdy(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int zzb2 = zzdq.zzb(i4, i3);
        this.zza = i3;
        this.zzb = i4;
    }

    /* access modifiers changed from: protected */
    public abstract E zza(int i);

    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    public final E next() {
        Throwable th;
        if (!hasNext()) {
            Throwable th2 = th;
            new NoSuchElementException();
            throw th2;
        }
        int i = this.zzb;
        int i2 = i + 1;
        this.zzb = i2;
        return zza(i);
    }

    public final int nextIndex() {
        return this.zzb;
    }

    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    public final E previous() {
        Throwable th;
        if (!hasPrevious()) {
            Throwable th2 = th;
            new NoSuchElementException();
            throw th2;
        }
        int i = this.zzb - 1;
        int i2 = i;
        this.zzb = i2;
        return zza(i);
    }

    public final int previousIndex() {
        return this.zzb - 1;
    }
}
