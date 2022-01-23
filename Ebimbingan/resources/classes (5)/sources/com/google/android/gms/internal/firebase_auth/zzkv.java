package com.google.android.gms.internal.firebase_auth;

final class zzkv {
    /* access modifiers changed from: private */
    public static boolean zzd(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    public static boolean zze(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    public static boolean zzf(byte b) {
        return b < -16;
    }

    /* access modifiers changed from: private */
    public static void zza(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    public static void zza(byte b, byte b2, char[] cArr, int i) throws zzic {
        byte b3 = b;
        byte b4 = b2;
        char[] cArr2 = cArr;
        int i2 = i;
        if (b3 < -62 || zzg(b4)) {
            throw zzic.zziz();
        }
        cArr2[i2] = (char) (((b3 & 31) << 6) | (b4 & 63));
    }

    /* access modifiers changed from: private */
    public static void zza(byte b, byte b2, byte b3, char[] cArr, int i) throws zzic {
        byte b4 = b;
        byte b5 = b2;
        byte b6 = b3;
        char[] cArr2 = cArr;
        int i2 = i;
        if (zzg(b5) || ((b4 == -32 && b5 < -96) || ((b4 == -19 && b5 >= -96) || zzg(b6)))) {
            throw zzic.zziz();
        }
        cArr2[i2] = (char) (((b4 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
    }

    /* access modifiers changed from: private */
    public static void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzic {
        byte b5 = b;
        byte b6 = b2;
        byte b7 = b3;
        byte b8 = b4;
        char[] cArr2 = cArr;
        int i2 = i;
        if (zzg(b6) || (((b5 << 28) + (b6 + 112)) >> 30) != 0 || zzg(b7) || zzg(b8)) {
            throw zzic.zziz();
        }
        byte b9 = ((b5 & 7) << 18) | ((b6 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
        cArr2[i2] = (char) (55232 + (b9 >>> 10));
        cArr2[i2 + 1] = (char) (56320 + (b9 & 1023));
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }
}
