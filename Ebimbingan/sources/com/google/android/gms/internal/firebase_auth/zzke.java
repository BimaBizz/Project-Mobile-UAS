package com.google.android.gms.internal.firebase_auth;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class zzke extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ zzjt zzaeb;

    private zzke(zzjt zzjt) {
        this.zzaeb = zzjt;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        Iterator<Map.Entry<K, V>> it;
        new zzkb(this.zzaeb, (zzjw) null);
        return it;
    }

    public int size() {
        return this.zzaeb.size();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zzaeb.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        Object remove = this.zzaeb.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.zzaeb.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        Object zza = this.zzaeb.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzke(zzjt zzjt, zzjw zzjw) {
        this(zzjt);
        zzjw zzjw2 = zzjw;
    }
}
