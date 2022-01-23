package com.google.android.gms.internal.firebase_auth;

import java.util.Iterator;
import java.util.Map;

final class zzkb implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzaea;
    private final /* synthetic */ zzjt zzaeb;
    private boolean zzaee;

    private zzkb(zzjt zzjt) {
        this.zzaeb = zzjt;
        this.pos = -1;
    }

    public final boolean hasNext() {
        if (this.pos + 1 < this.zzaeb.zzadr.size() || (!this.zzaeb.zzads.isEmpty() && zzki().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        Throwable th;
        if (!this.zzaee) {
            Throwable th2 = th;
            new IllegalStateException("remove() was called before next()");
            throw th2;
        }
        this.zzaee = false;
        this.zzaeb.zzkb();
        if (this.pos < this.zzaeb.zzadr.size()) {
            zzjt zzjt = this.zzaeb;
            int i = this.pos;
            int i2 = i - 1;
            this.pos = i2;
            Object zza = zzjt.zzbg(i);
            return;
        }
        zzki().remove();
    }

    private final Iterator<Map.Entry<K, V>> zzki() {
        if (this.zzaea == null) {
            this.zzaea = this.zzaeb.zzads.entrySet().iterator();
        }
        return this.zzaea;
    }

    public final /* synthetic */ Object next() {
        this.zzaee = true;
        int i = this.pos + 1;
        int i2 = i;
        this.pos = i;
        if (i2 < this.zzaeb.zzadr.size()) {
            return (Map.Entry) this.zzaeb.zzadr.get(this.pos);
        }
        return (Map.Entry) zzki().next();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzkb(zzjt zzjt, zzjw zzjw) {
        this(zzjt);
        zzjw zzjw2 = zzjw;
    }
}
