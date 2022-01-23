package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzv {
    static Object[] zza(Object[] objArr, int i) {
        Throwable th;
        StringBuilder sb;
        Object[] objArr2 = objArr;
        int i2 = i;
        int i3 = 0;
        while (i3 < i2) {
            if (objArr2[i3] != null) {
                i3++;
            } else {
                new StringBuilder(20);
                StringBuilder append = sb.append("at index ");
                StringBuilder append2 = sb.append(i3);
                new NullPointerException(sb.toString());
                throw th;
            }
        }
        return objArr2;
    }
}
