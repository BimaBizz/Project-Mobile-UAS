package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzff */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0917zzff<E> extends C0901zzeq<E> {
    static final C0901zzeq<Object> zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    C0917zzff(Object[] objArr, int i) {
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
        int zza2 = C0874zzdq.zza(i2, this.zzc);
        return this.zzb[i2];
    }

    static {
        C0901zzeq<Object> zzeq;
        new C0917zzff(new Object[0], 0);
        zza = zzeq;
    }
}
