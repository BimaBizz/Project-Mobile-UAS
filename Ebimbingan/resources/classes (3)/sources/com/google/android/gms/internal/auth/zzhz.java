package com.google.android.gms.internal.auth;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzhz<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzhx> zza;

    private zzhz(Map.Entry<K, zzhx> entry) {
        this.zza = entry;
    }

    public final K getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        return zzhx.zza();
    }

    public final zzhx zza() {
        return this.zza.getValue();
    }

    public final Object setValue(Object obj) {
        Throwable th;
        Object obj2 = obj;
        if (obj2 instanceof zzis) {
            return this.zza.getValue().zza((zzis) obj2);
        }
        Throwable th2 = th;
        new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        throw th2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzhz(Map.Entry entry, zzhw zzhw) {
        this(entry);
        zzhw zzhw2 = zzhw;
    }
}
