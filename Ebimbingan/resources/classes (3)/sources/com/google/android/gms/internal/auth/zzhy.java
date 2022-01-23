package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzhy<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zza;

    public zzhy(Iterator<Map.Entry<K, Object>> it) {
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
        if (!(next.getValue() instanceof zzhx)) {
            return entry;
        }
        new zzhz(entry, (zzhw) null);
        return obj;
    }
}
