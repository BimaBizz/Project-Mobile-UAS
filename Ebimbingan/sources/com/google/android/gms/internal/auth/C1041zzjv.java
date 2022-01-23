package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.auth.zzjv */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1041zzjv implements Iterator<Map.Entry<K, V>> {
    private int zza;
    private boolean zzb;
    private Iterator<Map.Entry<K, V>> zzc;
    private final /* synthetic */ C1033zzjn zzd;

    private C1041zzjv(C1033zzjn zzjn) {
        this.zzd = zzjn;
        this.zza = -1;
    }

    public final boolean hasNext() {
        if (this.zza + 1 < this.zzd.zzb.size() || (!this.zzd.zzc.isEmpty() && zza().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        Throwable th;
        if (!this.zzb) {
            Throwable th2 = th;
            new IllegalStateException("remove() was called before next()");
            throw th2;
        }
        this.zzb = false;
        this.zzd.zzf();
        if (this.zza < this.zzd.zzb.size()) {
            C1033zzjn zzjn = this.zzd;
            int i = this.zza;
            int i2 = i - 1;
            this.zza = i2;
            Object zza2 = zzjn.zzc(i);
            return;
        }
        zza().remove();
    }

    private final Iterator<Map.Entry<K, V>> zza() {
        if (this.zzc == null) {
            this.zzc = this.zzd.zzc.entrySet().iterator();
        }
        return this.zzc;
    }

    public final /* synthetic */ Object next() {
        this.zzb = true;
        int i = this.zza + 1;
        int i2 = i;
        this.zza = i;
        if (i2 < this.zzd.zzb.size()) {
            return (Map.Entry) this.zzd.zzb.get(this.zza);
        }
        return (Map.Entry) zza().next();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C1041zzjv(C1033zzjn zzjn, C1032zzjm zzjm) {
        this(zzjn);
        C1032zzjm zzjm2 = zzjm;
    }
}
