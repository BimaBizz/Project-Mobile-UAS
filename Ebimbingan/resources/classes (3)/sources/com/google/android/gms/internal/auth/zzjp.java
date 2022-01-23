package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzjp implements Iterator<Map.Entry<K, V>> {
    private int zza;
    private Iterator<Map.Entry<K, V>> zzb;
    private final /* synthetic */ zzjn zzc;

    private zzjp(zzjn zzjn) {
        this.zzc = zzjn;
        this.zza = this.zzc.zzb.size();
    }

    public final boolean hasNext() {
        return (this.zza > 0 && this.zza <= this.zzc.zzb.size()) || zza().hasNext();
    }

    public final void remove() {
        Throwable th;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    private final Iterator<Map.Entry<K, V>> zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    public final /* synthetic */ Object next() {
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        List zzb2 = this.zzc.zzb;
        int i = this.zza - 1;
        int i2 = i;
        this.zza = i2;
        return (Map.Entry) zzb2.get(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzjp(zzjn zzjn, zzjm zzjm) {
        this(zzjn);
        zzjm zzjm2 = zzjm;
    }
}
