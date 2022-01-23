package com.google.android.gms.internal.firebase_auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.shaded.apache.http.protocol.HTTP;

public final class zzht {
    public static final byte[] EMPTY_BYTE_ARRAY;
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    static final Charset UTF_8 = Charset.forName(HTTP.UTF_8);
    private static final ByteBuffer zzabb;
    private static final zzgr zzabc;

    static <T> T checkNotNull(T t) {
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

    public static boolean zze(byte[] bArr) {
        return zzkt.zze(bArr);
    }

    public static String zzf(byte[] bArr) {
        String str;
        new String(bArr, UTF_8);
        return str;
    }

    public static int zzk(long j) {
        long j2 = j;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int zzv(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int hashCode(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        int zza = zza(length, bArr2, 0, length);
        int i = zza;
        if (zza == 0) {
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

    static boolean zzg(zzjc zzjc) {
        zzjc zzjc2 = zzjc;
        return false;
    }

    static Object zzb(Object obj, Object obj2) {
        return ((zzjc) obj).zzin().zzb((zzjc) obj2).zzig();
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        zzabb = ByteBuffer.wrap(bArr);
        byte[] bArr2 = EMPTY_BYTE_ARRAY;
        zzabc = zzgr.zza(bArr2, 0, bArr2.length, false);
    }
}
