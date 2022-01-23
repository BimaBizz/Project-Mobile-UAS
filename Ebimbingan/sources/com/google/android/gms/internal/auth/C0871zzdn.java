package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzdn */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0871zzdn<T> extends C0875zzdr<T> {
    static final C0871zzdn<Object> zza;

    private C0871zzdn() {
    }

    public final boolean zza() {
        return false;
    }

    public final T zzb() {
        Throwable th;
        Throwable th2 = th;
        new IllegalStateException("Optional.get() cannot be called on an absent value");
        throw th2;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r1
            r3 = r0
            if (r2 != r3) goto L_0x0009
            r2 = 1
            r0 = r2
        L_0x0008:
            return r0
        L_0x0009:
            r2 = 0
            r0 = r2
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0871zzdn.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    static {
        C0871zzdn<Object> zzdn;
        new C0871zzdn<>();
        zza = zzdn;
    }
}
