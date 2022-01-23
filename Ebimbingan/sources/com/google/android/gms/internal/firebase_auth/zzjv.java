package com.google.android.gms.internal.firebase_auth;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzjv implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzaea;
    private final /* synthetic */ zzjt zzaeb;

    private zzjv(zzjt zzjt) {
        this.zzaeb = zzjt;
        this.pos = this.zzaeb.zzadr.size();
    }

    public final boolean hasNext() {
        return (this.pos > 0 && this.pos <= this.zzaeb.zzadr.size()) || zzki().hasNext();
    }

    public final void remove() {
        Throwable th;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    private final Iterator<Map.Entry<K, V>> zzki() {
        if (this.zzaea == null) {
            this.zzaea = this.zzaeb.zzadu.entrySet().iterator();
        }
        return this.zzaea;
    }

    public final /* synthetic */ Object next() {
        if (zzki().hasNext()) {
            return (Map.Entry) zzki().next();
        }
        List zzb = this.zzaeb.zzadr;
        int i = this.pos - 1;
        int i2 = i;
        this.pos = i2;
        return (Map.Entry) zzb.get(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzjv(zzjt zzjt, zzjw zzjw) {
        this(zzjt);
        zzjw zzjw2 = zzjw;
    }
}
