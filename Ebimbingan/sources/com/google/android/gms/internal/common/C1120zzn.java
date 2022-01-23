package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.common.zzn */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
abstract class C1120zzn<E> extends C1131zzy<E> {
    private final int zza;
    private int zzb;

    protected C1120zzn(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int zzb2 = C1118zzl.zzb(i4, i3, "index");
        this.zza = i3;
        this.zzb = i4;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    public final E next() {
        Throwable th;
        if (!hasNext()) {
            new NoSuchElementException();
            throw th;
        }
        int i = this.zzb;
        this.zzb = i + 1;
        return zza(i);
    }

    public final int nextIndex() {
        return this.zzb;
    }

    public final E previous() {
        Throwable th;
        if (!hasPrevious()) {
            new NoSuchElementException();
            throw th;
        }
        int i = this.zzb - 1;
        this.zzb = i;
        return zza(i);
    }

    public final int previousIndex() {
        return this.zzb - 1;
    }

    /* access modifiers changed from: protected */
    public abstract E zza(int i);
}
