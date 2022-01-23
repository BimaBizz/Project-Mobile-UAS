package com.google.android.gms.internal.auth;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
class zzju extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ zzjn zza;

    private zzju(zzjn zzjn) {
        this.zza = zzjn;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        Iterator<Map.Entry<K, V>> it;
        new zzjv(this.zza, (zzjm) null);
        return it;
    }

    public int size() {
        return this.zza.size();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zza.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        Object remove = this.zza.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.zza.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        Object zza2 = this.zza.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzju(zzjn zzjn, zzjm zzjm) {
        this(zzjn);
        zzjm zzjm2 = zzjm;
    }
}
