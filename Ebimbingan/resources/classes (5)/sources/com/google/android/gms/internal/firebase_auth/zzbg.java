package com.google.android.gms.internal.firebase_auth;

import java.util.AbstractMap;
import java.util.Map;

final class zzbg extends zzay<Map.Entry<K, V>> {
    private final /* synthetic */ zzbd zzhj;

    zzbg(zzbd zzbd) {
        this.zzhj = zzbd;
    }

    public final int size() {
        return this.zzhj.size;
    }

    public final /* synthetic */ Object get(int i) {
        Object obj;
        int i2 = i;
        int zza = zzaj.zza(i2, this.zzhj.size);
        zzbd zzbd = this.zzhj;
        Object obj2 = this.zzhj.zzhf[2 * i2];
        zzbd zzbd2 = this.zzhj;
        new AbstractMap.SimpleImmutableEntry(obj2, this.zzhj.zzhf[(2 * i2) + (0 ^ 1)]);
        return obj;
    }
}
