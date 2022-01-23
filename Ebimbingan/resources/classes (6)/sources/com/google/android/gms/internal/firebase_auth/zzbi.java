package com.google.android.gms.internal.firebase_auth;

final class zzbi extends zzay<Object> {
    private final transient int offset;
    private final transient int size;
    private final transient Object[] zzhf;

    zzbi(Object[] objArr, int i, int i2) {
        this.zzhf = objArr;
        this.offset = i;
        this.size = i2;
    }

    public final Object get(int i) {
        int i2 = i;
        int zza = zzaj.zza(i2, this.size);
        return this.zzhf[(2 * i2) + this.offset];
    }

    public final int size() {
        return this.size;
    }
}
