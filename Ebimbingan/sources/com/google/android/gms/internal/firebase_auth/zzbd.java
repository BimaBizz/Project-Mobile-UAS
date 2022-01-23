package com.google.android.gms.internal.firebase_auth;

import java.util.Iterator;
import java.util.Map;

final class zzbd<K, V> extends zzbc<Map.Entry<K, V>> {
    /* access modifiers changed from: private */
    public final transient int size;
    private final transient zzaz<K, V> zzhe;
    /* access modifiers changed from: private */
    public final transient Object[] zzhf;
    private final transient int zzhg = 0;

    zzbd(zzaz<K, V> zzaz, Object[] objArr, int i, int i2) {
        int i3 = i;
        this.zzhe = zzaz;
        this.zzhf = objArr;
        this.size = i2;
    }

    public final zzbk<Map.Entry<K, V>> zzbz() {
        return (zzbk) zzcd().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zzcd().zza(objArr, i);
    }

    /* access modifiers changed from: package-private */
    public final zzay<Map.Entry<K, V>> zzci() {
        zzay<Map.Entry<K, V>> zzay;
        new zzbg(this);
        return zzay;
    }

    public final boolean contains(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.zzhe.get(key));
    }

    public final int size() {
        return this.size;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
