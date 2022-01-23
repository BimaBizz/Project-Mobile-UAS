package com.google.android.gms.internal.common;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.common.zzl */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C1118zzl {
    public static int zza(int i, int i2, @NullableDecl String str) {
        String zza;
        Throwable th;
        StringBuilder sb;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        if (i3 >= 0 && i3 < i4) {
            return i3;
        }
        Object obj = "index";
        if (i3 < 0) {
            zza = C1119zzm.zza("%s (%s) must not be negative", obj, Integer.valueOf(i3));
        } else if (i4 < 0) {
            new StringBuilder(26);
            StringBuilder append = sb.append("negative size: ");
            StringBuilder append2 = sb.append(i4);
            new IllegalArgumentException(sb.toString());
            throw th;
        } else {
            zza = C1119zzm.zza("%s (%s) must be less than size (%s)", obj, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        indexOutOfBoundsException = new IndexOutOfBoundsException(zza);
        throw r2;
    }

    public static int zzb(int i, int i2, @NullableDecl String str) {
        Throwable th;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        if (i3 >= 0 && i3 <= i4) {
            return i3;
        }
        new IndexOutOfBoundsException(zzd(i3, i4, "index"));
        throw th;
    }

    public static void zzc(int i, int i2, int i3) {
        String str;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            if (i4 < 0 || i4 > i6) {
                str = zzd(i4, i6, "start index");
            } else if (i5 < 0 || i5 > i6) {
                str = zzd(i5, i6, "end index");
            } else {
                str = C1119zzm.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
            }
            indexOutOfBoundsException = new IndexOutOfBoundsException(str);
            throw r3;
        }
    }

    private static String zzd(int i, int i2, @NullableDecl String str) {
        Throwable th;
        StringBuilder sb;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        if (i3 < 0) {
            return C1119zzm.zza("%s (%s) must not be negative", str2, Integer.valueOf(i3));
        } else if (i4 < 0) {
            new StringBuilder(26);
            StringBuilder append = sb.append("negative size: ");
            StringBuilder append2 = sb.append(i4);
            new IllegalArgumentException(sb.toString());
            throw th;
        } else {
            return C1119zzm.zza("%s (%s) must not be greater than size (%s)", str2, Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }
}
