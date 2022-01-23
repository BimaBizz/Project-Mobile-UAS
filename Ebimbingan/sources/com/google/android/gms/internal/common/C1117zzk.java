package com.google.android.gms.internal.common;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.common.zzk */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C1117zzk extends C1116zzj {
    public static boolean zza(@NullableDecl Object obj, @NullableDecl Object obj2) {
        boolean z;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (obj3 == obj4) {
            z = true;
        } else if (obj3 == null) {
            z = false;
        } else if (!obj3.equals(obj4)) {
            return false;
        } else {
            z = true;
        }
        return z;
    }
}
