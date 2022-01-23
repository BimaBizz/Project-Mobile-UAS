package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class zzdr<T> implements Serializable {
    public static <T> zzdr<T> zzc() {
        return zzdn.zza;
    }

    public abstract boolean zza();

    public abstract T zzb();

    public static <T> zzdr<T> zza(T t) {
        zzdr<T> zzdr;
        new zzdt(zzdq.zza(t));
        return zzdr;
    }

    zzdr() {
    }
}
