package com.google.android.gms.internal.auth;

import com.google.appinventor.components.runtime.util.Ev3Constants;

/* renamed from: com.google.android.gms.internal.auth.zzkl */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1058zzkl {
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
    public static void zzb(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    public static void zzb(byte b, byte b2, char[] cArr, int i) throws C0984zzhs {
        byte b3 = b;
        byte b4 = b2;
        char[] cArr2 = cArr;
        int i2 = i;
        if (b3 < -62 || zzg(b4)) {
            throw C0984zzhs.zzf();
        }
        cArr2[i2] = (char) (((b3 & 31) << 6) | (b4 & Ev3Constants.Opcode.MOVEF_F));
    }

    /* access modifiers changed from: private */
    public static void zzb(byte b, byte b2, byte b3, char[] cArr, int i) throws C0984zzhs {
        byte b4 = b;
        byte b5 = b2;
        byte b6 = b3;
        char[] cArr2 = cArr;
        int i2 = i;
        if (zzg(b5) || ((b4 == -32 && b5 < -96) || ((b4 == -19 && b5 >= -96) || zzg(b6)))) {
            throw C0984zzhs.zzf();
        }
        cArr2[i2] = (char) (((b4 & 15) << 12) | ((b5 & Ev3Constants.Opcode.MOVEF_F) << 6) | (b6 & Ev3Constants.Opcode.MOVEF_F));
    }

    /* access modifiers changed from: private */
    public static void zzb(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C0984zzhs {
        byte b5 = b;
        byte b6 = b2;
        byte b7 = b3;
        byte b8 = b4;
        char[] cArr2 = cArr;
        int i2 = i;
        if (zzg(b6) || (((b5 << 28) + (b6 + Ev3Constants.Opcode.JR_NEQ8)) >> 30) != 0 || zzg(b7) || zzg(b8)) {
            throw C0984zzhs.zzf();
        }
        byte b9 = ((b5 & 7) << 18) | ((b6 & Ev3Constants.Opcode.MOVEF_F) << 12) | ((b7 & Ev3Constants.Opcode.MOVEF_F) << 6) | (b8 & Ev3Constants.Opcode.MOVEF_F);
        cArr2[i2] = (char) (55232 + (b9 >>> 10));
        cArr2[i2 + 1] = (char) (56320 + (b9 & Ev3Constants.Opcode.TST));
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }
}
