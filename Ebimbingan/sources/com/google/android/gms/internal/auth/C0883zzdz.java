package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzdz */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0883zzdz<T> implements C0879zzdv<T>, Serializable {
    @NullableDecl
    private final T zza;

    C0883zzdz(@NullableDecl T t) {
        this.zza = t;
    }

    public final T zza() {
        return this.zza;
    }

    public final boolean equals(@NullableDecl Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof C0883zzdz)) {
            return false;
        }
        return C0872zzdo.zza(this.zza, ((C0883zzdz) obj2).zza);
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
