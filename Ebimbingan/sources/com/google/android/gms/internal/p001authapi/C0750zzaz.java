package com.google.android.gms.internal.p001authapi;

import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

/* renamed from: com.google.android.gms.internal.auth-api.zzaz  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0750zzaz {
    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t) {
        Throwable th;
        T t2 = t;
        if (t2 != null) {
            return t2;
        }
        Throwable th2 = th;
        new NullPointerException();
        throw th2;
    }
}
