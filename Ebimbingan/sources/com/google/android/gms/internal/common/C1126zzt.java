package com.google.android.gms.internal.common;

import java.util.List;

/* renamed from: com.google.android.gms.internal.common.zzt */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C1126zzt extends C1127zzu {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ C1127zzu zzc;

    C1126zzt(C1127zzu zzu, int i, int i2) {
        this.zzc = zzu;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        int i2 = i;
        int zza2 = C1118zzl.zza(i2, this.zzb, "index");
        return this.zzc.get(i2 + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* access modifiers changed from: package-private */
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }

    public final C1127zzu zzh(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        C1118zzl.zzc(i3, i4, this.zzb);
        C1127zzu zzu = this.zzc;
        int i5 = this.zza;
        return zzu.subList(i3 + i5, i4 + i5);
    }
}
