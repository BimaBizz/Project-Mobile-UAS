package com.google.android.gms.internal.common;

/* renamed from: com.google.android.gms.internal.common.zzw */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C1129zzw<E> extends C1127zzu<E> {
    static final C1127zzu<Object> zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static {
        C1127zzu<Object> zzu;
        new C1129zzw(new Object[0], 0);
        zza = zzu;
    }

    C1129zzw(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    public final E get(int i) {
        int i2 = i;
        int zza2 = C1118zzl.zza(i2, this.zzc, "index");
        return this.zzb[i2];
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzb() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzd() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int zzg(Object[] objArr, int i) {
        int i2 = i;
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }
}
