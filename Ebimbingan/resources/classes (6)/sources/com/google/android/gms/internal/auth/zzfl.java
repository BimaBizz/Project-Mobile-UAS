package com.google.android.gms.internal.auth;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzfl<E> extends zzez<E> {
    static final zzfl<Object> zza;
    private final transient Object[] zzb;
    private final transient Object[] zzc;
    private final transient int zzd;
    private final transient int zze;
    private final transient int zzf;

    zzfl(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zzc = objArr2;
        this.zzd = i2;
        this.zze = i;
        this.zzf = i3;
    }

    public final boolean contains(@NullableDecl Object obj) {
        Object obj2 = obj;
        Object[] objArr = this.zzc;
        if (obj2 == null || objArr == null) {
            return false;
        }
        int zza2 = zzeo.zza(obj2);
        while (true) {
            int i = zza2 & this.zzd;
            Object obj3 = objArr[i];
            Object obj4 = obj3;
            if (obj3 == null) {
                return false;
            }
            if (obj4.equals(obj2)) {
                return true;
            }
            zza2 = i + 1;
        }
    }

    public final int size() {
        return this.zzf;
    }

    public final zzfm<E> zzb() {
        return (zzfm) zzc().iterator();
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
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final int zzb(Object[] objArr, int i) {
        int i2 = i;
        System.arraycopy(this.zzb, 0, objArr, i2, this.zzf);
        return i2 + this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final zzeq<E> zzh() {
        return zzeq.zza(this.zzb, this.zzf);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return false;
    }

    public final int hashCode() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza() {
        return true;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    static {
        zzfl<Object> zzfl;
        new zzfl<>(new Object[0], 0, (Object[]) null, 0, 0);
        zza = zzfl;
    }
}
