package com.google.android.gms.internal.firebase_auth;

import java.util.Iterator;
import java.util.Map;

final class zzii<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zzaby;

    public zzii(Iterator<Map.Entry<K, Object>> it) {
        this.zzaby = it;
    }

    public final boolean hasNext() {
        return this.zzaby.hasNext();
    }

    public final void remove() {
        this.zzaby.remove();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        Map.Entry next = this.zzaby.next();
        Map.Entry entry = next;
        if (!(next.getValue() instanceof zzid)) {
            return entry;
        }
        new zzif(entry, (zzig) null);
        return obj;
    }
}
