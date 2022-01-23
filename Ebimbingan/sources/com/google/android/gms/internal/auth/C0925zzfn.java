package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.auth.zzfn */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0925zzfn<E> extends C0910zzez<E> {
    private final transient E zza;
    private transient int zzb;

    C0925zzfn(E e) {
        this.zza = C0874zzdq.zza(e);
    }

    C0925zzfn(E e, int i) {
        this.zza = e;
        this.zzb = i;
    }

    public final int size() {
        return 1;
    }

    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    public final C0924zzfm<E> zzb() {
        C0924zzfm<E> zzfm;
        new C0912zzfa(this.zza);
        return zzfm;
    }

    /* access modifiers changed from: package-private */
    public final C0901zzeq<E> zzh() {
        return C0901zzeq.zza(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int zzb(Object[] objArr, int i) {
        int i2 = i;
        objArr[i2] = this.zza;
        return i2 + 1;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i;
        if (i == 0) {
            int hashCode = this.zza.hashCode();
            i2 = hashCode;
            this.zzb = hashCode;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza() {
        return this.zzb != 0;
    }

    public final String toString() {
        StringBuilder sb;
        String obj = this.zza.toString();
        new StringBuilder(2 + String.valueOf(obj).length());
        return sb.append('[').append(obj).append(']').toString();
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
