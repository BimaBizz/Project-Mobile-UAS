package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzfi extends zzeq<Object> {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzfi(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    public final Object get(int i) {
        int i2 = i;
        int zza2 = zzdq.zza(i2, this.zzc);
        return this.zza[(2 * i2) + this.zzb];
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return true;
    }

    public final int size() {
        return this.zzc;
    }
}
