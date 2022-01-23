package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.auth.zzhy */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0990zzhy<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zza;

    public C0990zzhy(Iterator<Map.Entry<K, Object>> it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        this.zza.remove();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        Map.Entry next = this.zza.next();
        Map.Entry entry = next;
        if (!(next.getValue() instanceof C0989zzhx)) {
            return entry;
        }
        new C0991zzhz(entry, (C0988zzhw) null);
        return obj;
    }
}
