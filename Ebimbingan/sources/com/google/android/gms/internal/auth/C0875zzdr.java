package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.auth.zzdr */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0875zzdr<T> implements Serializable {
    public static <T> C0875zzdr<T> zzc() {
        return C0871zzdn.zza;
    }

    public abstract boolean zza();

    public abstract T zzb();

    public static <T> C0875zzdr<T> zza(T t) {
        C0875zzdr<T> zzdr;
        new C0877zzdt(C0874zzdq.zza(t));
        return zzdr;
    }

    C0875zzdr() {
    }
}
