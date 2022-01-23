package com.google.android.gms.internal.auth;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzdu */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0878zzdu {
    public static <T> C0879zzdv<T> zza(C0879zzdv<T> zzdv) {
        C0879zzdv<T> zzdv2;
        C0879zzdv<T> zzdv3;
        C0879zzdv<T> zzdv4 = zzdv;
        if ((zzdv4 instanceof C0880zzdw) || (zzdv4 instanceof C0881zzdx)) {
            return zzdv4;
        }
        if (zzdv4 instanceof Serializable) {
            new C0881zzdx(zzdv4);
            return zzdv3;
        }
        new C0880zzdw(zzdv4);
        return zzdv2;
    }

    public static <T> C0879zzdv<T> zza(@NullableDecl T t) {
        C0879zzdv<T> zzdv;
        new C0883zzdz(t);
        return zzdv;
    }
}
