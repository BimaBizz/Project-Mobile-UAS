package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.auth.zzho */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0980zzho {
    static final Charset zza = Charset.forName("UTF-8");
    public static final byte[] zzb;
    private static final Charset zzc = Charset.forName("ISO-8859-1");
    private static final ByteBuffer zzd;
    private static final C0959zzgu zze;

    static <T> T zza(T t) {
        Throwable th;
        T t2 = t;
        if (t2 != null) {
            return t2;
        }
        Throwable th2 = th;
        new NullPointerException();
        throw th2;
    }

    static <T> T zza(T t, String str) {
        Throwable th;
        T t2 = t;
        String str2 = str;
        if (t2 != null) {
            return t2;
        }
        Throwable th2 = th;
        new NullPointerException(str2);
        throw th2;
    }

    public static boolean zza(byte[] bArr) {
        return C1056zzkj.zza(bArr);
    }

    public static String zzb(byte[] bArr) {
        String str;
        new String(bArr, zza);
        return str;
    }

    public static int zza(long j) {
        long j2 = j;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzc(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        int zza2 = zza(length, bArr2, 0, length);
        int i = zza2;
        if (zza2 == 0) {
            return 1;
        }
        return i;
    }

    static int zza(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        byte[] bArr2 = bArr;
        int i5 = i2;
        int i6 = i3;
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            i4 = (i4 * 31) + bArr2[i7];
        }
        return i4;
    }

    static boolean zza(C1011zzis zzis) {
        C1011zzis zzis2 = zzis;
        if (zzis2 instanceof C0939zzga) {
            C0939zzga zzga = (C0939zzga) zzis2;
        }
        return false;
    }

    static Object zza(Object obj, Object obj2) {
        return ((C1011zzis) obj).zzf().zza((C1011zzis) obj2).zzf();
    }

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzd = ByteBuffer.wrap(bArr);
        byte[] bArr2 = zzb;
        zze = C0959zzgu.zza(bArr2, 0, bArr2.length, false);
    }
}
