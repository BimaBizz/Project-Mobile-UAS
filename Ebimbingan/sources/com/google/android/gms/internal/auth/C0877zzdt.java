package com.google.android.gms.internal.auth;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzdt */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0877zzdt<T> extends C0875zzdr<T> {
    private final T zza;

    C0877zzdt(T t) {
        this.zza = t;
    }

    public final boolean zza() {
        return true;
    }

    public final T zzb() {
        return this.zza;
    }

    public final boolean equals(@NullableDecl Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof C0877zzdt)) {
            return false;
        }
        return this.zza.equals(((C0877zzdt) obj2).zza);
    }

    public final int hashCode() {
        return 1502476572 + this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb;
        String valueOf = String.valueOf(this.zza);
        new StringBuilder(13 + String.valueOf(valueOf).length());
        return sb.append("Optional.of(").append(valueOf).append(")").toString();
    }
}
