package com.google.android.gms.internal.auth;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzdu {
    public static <T> zzdv<T> zza(zzdv<T> zzdv) {
        zzdv<T> zzdv2;
        zzdv<T> zzdv3;
        zzdv<T> zzdv4 = zzdv;
        if ((zzdv4 instanceof zzdw) || (zzdv4 instanceof zzdx)) {
            return zzdv4;
        }
        if (zzdv4 instanceof Serializable) {
            new zzdx(zzdv4);
            return zzdv3;
        }
        new zzdw(zzdv4);
        return zzdv2;
    }

    public static <T> zzdv<T> zza(@NullableDecl T t) {
        zzdv<T> zzdv;
        new zzdz(t);
        return zzdv;
    }
}
