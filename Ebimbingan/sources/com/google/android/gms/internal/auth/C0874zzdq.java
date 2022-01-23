package com.google.android.gms.internal.auth;

import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzdq */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0874zzdq {
    public static void zza(boolean z, @NullableDecl Object obj) {
        Throwable th;
        Object obj2 = obj;
        if (!z) {
            Throwable th2 = th;
            new IllegalArgumentException(String.valueOf(obj2));
            throw th2;
        }
    }

    public static void zzb(boolean z, @NullableDecl Object obj) {
        Throwable th;
        Object obj2 = obj;
        if (!z) {
            Throwable th2 = th;
            new IllegalStateException(String.valueOf(obj2));
            throw th2;
        }
    }

    @NonNullDecl
    public static <T> T zza(@NonNullDecl T t) {
        Throwable th;
        T t2 = t;
        if (t2 != null) {
            return t2;
        }
        Throwable th2 = th;
        new NullPointerException();
        throw th2;
    }

    @NonNullDecl
    public static <T> T zza(@NonNullDecl T t, @NullableDecl Object obj) {
        Throwable th;
        T t2 = t;
        Object obj2 = obj;
        if (t2 != null) {
            return t2;
        }
        Throwable th2 = th;
        new NullPointerException(String.valueOf(obj2));
        throw th2;
    }

    public static int zza(int i, int i2) {
        String zza;
        Throwable th;
        StringBuilder sb;
        Object obj = "index";
        int i3 = i2;
        int i4 = i;
        int i5 = i4;
        if (i4 >= 0 && i5 < i3) {
            return i5;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = r15;
        Object obj2 = obj;
        int i6 = i3;
        int i7 = i5;
        int i8 = i7;
        if (i7 < 0) {
            Object[] objArr = new Object[2];
            objArr[0] = obj2;
            Object[] objArr2 = objArr;
            objArr2[1] = Integer.valueOf(i8);
            zza = C0876zzds.zza("%s (%s) must not be negative", objArr2);
        } else if (i6 < 0) {
            Throwable th2 = th;
            new StringBuilder(26);
            new IllegalArgumentException(sb.append("negative size: ").append(i6).toString());
            throw th2;
        } else {
            Object[] objArr3 = new Object[3];
            objArr3[0] = obj2;
            Object[] objArr4 = objArr3;
            objArr4[1] = Integer.valueOf(i8);
            Object[] objArr5 = objArr4;
            objArr5[2] = Integer.valueOf(i6);
            zza = C0876zzds.zza("%s (%s) must be less than size (%s)", objArr5);
        }
        IndexOutOfBoundsException indexOutOfBoundsException2 = new IndexOutOfBoundsException(zza);
        throw indexOutOfBoundsException;
    }

    public static int zzb(int i, int i2) {
        Throwable th;
        String str = "index";
        int i3 = i2;
        int i4 = i;
        int i5 = i4;
        if (i4 >= 0 && i5 <= i3) {
            return i5;
        }
        Throwable th2 = th;
        new IndexOutOfBoundsException(zza(i5, i3, str));
        throw th2;
    }

    private static String zza(int i, int i2, @NullableDecl String str) {
        Throwable th;
        StringBuilder sb;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        if (i3 < 0) {
            Object[] objArr = new Object[2];
            objArr[0] = str2;
            Object[] objArr2 = objArr;
            objArr2[1] = Integer.valueOf(i3);
            return C0876zzds.zza("%s (%s) must not be negative", objArr2);
        } else if (i4 < 0) {
            Throwable th2 = th;
            new StringBuilder(26);
            new IllegalArgumentException(sb.append("negative size: ").append(i4).toString());
            throw th2;
        } else {
            Object[] objArr3 = new Object[3];
            objArr3[0] = str2;
            Object[] objArr4 = objArr3;
            objArr4[1] = Integer.valueOf(i3);
            Object[] objArr5 = objArr4;
            objArr5[2] = Integer.valueOf(i4);
            return C0876zzds.zza("%s (%s) must not be greater than size (%s)", objArr5);
        }
    }

    public static void zza(int i, int i2, int i3) {
        String str;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            IndexOutOfBoundsException indexOutOfBoundsException = r13;
            int i7 = i6;
            int i8 = i5;
            int i9 = i4;
            int i10 = i9;
            if (i9 < 0 || i10 > i7) {
                str = zza(i10, i7, "start index");
            } else if (i8 < 0 || i8 > i7) {
                str = zza(i8, i7, "end index");
            } else {
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i8);
                Object[] objArr2 = objArr;
                objArr2[1] = Integer.valueOf(i10);
                str = C0876zzds.zza("end index (%s) must not be less than start index (%s)", objArr2);
            }
            IndexOutOfBoundsException indexOutOfBoundsException2 = new IndexOutOfBoundsException(str);
            throw indexOutOfBoundsException;
        }
    }
}
