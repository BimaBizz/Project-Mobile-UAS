package com.google.android.gms.internal.auth;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.auth.zzhz */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0991zzhz<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, C0989zzhx> zza;

    private C0991zzhz(Map.Entry<K, C0989zzhx> entry) {
        this.zza = entry;
    }

    public final K getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        return C0989zzhx.zza();
    }

    public final C0989zzhx zza() {
        return this.zza.getValue();
    }

    public final Object setValue(Object obj) {
        Throwable th;
        Object obj2 = obj;
        if (obj2 instanceof C1011zzis) {
            return this.zza.getValue().zza((C1011zzis) obj2);
        }
        Throwable th2 = th;
        new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        throw th2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C0991zzhz(Map.Entry entry, C0988zzhw zzhw) {
        this(entry);
        C0988zzhw zzhw2 = zzhw;
    }
}
