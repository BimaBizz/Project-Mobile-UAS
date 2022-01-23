package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzff<E> extends zzeq<E> {
    static final zzeq<Object> zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    zzff(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzd() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zze() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzf() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int zzb(Object[] objArr, int i) {
        int i2 = i;
        System.arraycopy(this.zzb, 0, objArr, i2, this.zzc);
        return i2 + this.zzc;
    }

    public final E get(int i) {
        int i2 = i;
        int zza2 = zzdq.zza(i2, this.zzc);
        return this.zzb[i2];
    }

    static {
        zzeq<Object> zzeq;
        new zzff(new Object[0], 0);
        zza = zzeq;
    }
}
