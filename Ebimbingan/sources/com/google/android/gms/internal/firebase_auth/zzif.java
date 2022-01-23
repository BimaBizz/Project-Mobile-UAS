package com.google.android.gms.internal.firebase_auth;

import java.util.Map;

final class zzif<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzid> zzabu;

    private zzif(Map.Entry<K, zzid> entry) {
        this.zzabu = entry;
    }

    public final K getKey() {
        return this.zzabu.getKey();
    }

    public final Object getValue() {
        if (this.zzabu.getValue() == null) {
            return null;
        }
        return zzid.zzja();
    }

    public final zzid zzjc() {
        return this.zzabu.getValue();
    }

    public final Object setValue(Object obj) {
        Throwable th;
        Object obj2 = obj;
        if (obj2 instanceof zzjc) {
            return this.zzabu.getValue().zzj((zzjc) obj2);
        }
        Throwable th2 = th;
        new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        throw th2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzif(Map.Entry entry, zzig zzig) {
        this(entry);
        zzig zzig2 = zzig;
    }
}
