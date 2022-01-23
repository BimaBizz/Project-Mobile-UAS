package com.google.android.gms.internal.auth;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
abstract class zzei<T> implements Iterator<T> {
    private int zza;
    private int zzb;
    private int zzc;
    private final /* synthetic */ zzef zzd;

    private zzei(zzef zzef) {
        this.zzd = zzef;
        this.zza = this.zzd.zzf;
        this.zzb = this.zzd.zzd();
        this.zzc = -1;
    }

    /* access modifiers changed from: package-private */
    public abstract T zza(int i);

    public boolean hasNext() {
        return this.zzb >= 0;
    }

    public T next() {
        Throwable th;
        zza();
        if (!hasNext()) {
            Throwable th2 = th;
            new NoSuchElementException();
            throw th2;
        }
        this.zzc = this.zzb;
        T zza2 = zza(this.zzb);
        this.zzb = this.zzd.zza(this.zzb);
        return zza2;
    }

    public void remove() {
        zza();
        zzdq.zzb(this.zzc >= 0, (Object) "no calls to next() since the last call to remove()");
        this.zza += 32;
        Object remove = this.zzd.remove(this.zzd.zzb[this.zzc]);
        this.zzb = zzef.zzb(this.zzb, this.zzc);
        this.zzc = -1;
    }

    private final void zza() {
        Throwable th;
        if (this.zzd.zzf != this.zza) {
            Throwable th2 = th;
            new ConcurrentModificationException();
            throw th2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzei(zzef zzef, zzee zzee) {
        this(zzef);
        zzee zzee2 = zzee;
    }
}
