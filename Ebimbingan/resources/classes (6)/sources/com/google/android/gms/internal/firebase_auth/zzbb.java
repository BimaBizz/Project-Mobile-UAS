package com.google.android.gms.internal.firebase_auth;

final class zzbb<E> extends zzay<E> {
    static final zzay<Object> zzhb;
    private final transient int size;
    private final transient Object[] zzhc;

    zzbb(Object[] objArr, int i) {
        this.zzhc = objArr;
        this.size = i;
    }

    public final int size() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzca() {
        return this.zzhc;
    }

    /* access modifiers changed from: package-private */
    public final int zzcb() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzcc() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        int i2 = i;
        System.arraycopy(this.zzhc, 0, objArr, i2, this.size);
        return i2 + this.size;
    }

    public final E get(int i) {
        int i2 = i;
        int zza = zzaj.zza(i2, this.size);
        return this.zzhc[i2];
    }

    static {
        zzay<Object> zzay;
        new zzbb(new Object[0], 0);
        zzhb = zzay;
    }
}
