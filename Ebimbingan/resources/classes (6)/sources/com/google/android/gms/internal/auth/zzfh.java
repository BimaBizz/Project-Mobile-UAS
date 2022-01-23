package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzfh<K, V> extends zzez<Map.Entry<K, V>> {
    private final transient zzev<K, V> zza;
    /* access modifiers changed from: private */
    public final transient Object[] zzb;
    private final transient int zzc = 0;
    /* access modifiers changed from: private */
    public final transient int zzd;

    zzfh(zzev<K, V> zzev, Object[] objArr, int i, int i2) {
        int i3 = i;
        this.zza = zzev;
        this.zzb = objArr;
        this.zzd = i2;
    }

    public final zzfm<Map.Entry<K, V>> zzb() {
        return (zzfm) zzc().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zzb(Object[] objArr, int i) {
        return zzc().zzb(objArr, i);
    }

    /* access modifiers changed from: package-private */
    public final zzeq<Map.Entry<K, V>> zzh() {
        zzeq<Map.Entry<K, V>> zzeq;
        new zzfg(this);
        return zzeq;
    }

    public final boolean contains(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.zza.get(key));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return true;
    }

    public final int size() {
        return this.zzd;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
