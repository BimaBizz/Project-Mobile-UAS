package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzdz<T> implements zzdv<T>, Serializable {
    @NullableDecl
    private final T zza;

    zzdz(@NullableDecl T t) {
        this.zza = t;
    }

    public final T zza() {
        return this.zza;
    }

    public final boolean equals(@NullableDecl Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof zzdz)) {
            return false;
        }
        return zzdo.zza(this.zza, ((zzdz) obj2).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        StringBuilder sb;
        String valueOf = String.valueOf(this.zza);
        new StringBuilder(22 + String.valueOf(valueOf).length());
        return sb.append("Suppliers.ofInstance(").append(valueOf).append(")").toString();
    }
}
