package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzfo */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0926zzfo extends C0929zzfr {
    public static int zza(int i, int i2, int i3) {
        Throwable th;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int i7 = i5;
        String str = "min (%s) must be less than or equal to max (%s)";
        if (i5 <= 1073741823) {
            return Math.min(Math.max(i4, i5), 1073741823);
        }
        Throwable th2 = th;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i7);
        Object[] objArr2 = objArr;
        objArr2[1] = 1073741823;
        new IllegalArgumentException(C0876zzds.zza(str, objArr2));
        throw th2;
    }
}
