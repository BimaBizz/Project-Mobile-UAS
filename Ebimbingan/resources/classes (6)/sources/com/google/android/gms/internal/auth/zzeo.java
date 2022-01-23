package com.google.android.gms.internal.auth;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzeo {
    static int zza(int i) {
        return (int) (461845907 * ((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)));
    }

    static int zza(@NullableDecl Object obj) {
        Object obj2 = obj;
        return zza(obj2 == null ? 0 : obj2.hashCode());
    }
}
