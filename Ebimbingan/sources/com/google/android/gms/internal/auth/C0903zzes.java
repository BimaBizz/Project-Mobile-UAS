package com.google.android.gms.internal.auth;

import java.util.List;

/* renamed from: com.google.android.gms.internal.auth.zzes */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0903zzes extends C0901zzeq<E> {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ C0901zzeq zzc;

    C0903zzes(C0901zzeq zzeq, int i, int i2) {
        this.zzc = zzeq;
        this.zza = i;
        this.zzb = i2;
    }

    public final int size() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzd() {
        return this.zzc.zzd();
    }

    /* access modifiers changed from: package-private */
    public final int zze() {
        return this.zzc.zze() + this.zza;
    }

    /* access modifiers changed from: package-private */
    public final int zzf() {
        return this.zzc.zze() + this.zza + this.zzb;
    }

    public final E get(int i) {
        int i2 = i;
        int zza2 = C0874zzdq.zza(i2, this.zzb);
        return this.zzc.get(i2 + this.zza);
    }

    public final C0901zzeq<E> zza(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        C0874zzdq.zza(i3, i4, this.zzb);
        return (C0901zzeq) this.zzc.subList(i3 + this.zza, i4 + this.zza);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return true;
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
