package com.google.android.gms.internal.firebase_auth;

import gnu.expr.Declaration;

final class zzkt {
    private static final zzku zzafm;

    public static boolean zze(byte[] bArr) {
        byte[] bArr2 = bArr;
        return zzafm.zze(bArr2, 0, bArr2.length);
    }

    public static boolean zze(byte[] bArr, int i, int i2) {
        return zzafm.zze(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    public static int zzbh(int i) {
        int i2 = i;
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    /* access modifiers changed from: private */
    public static int zzs(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (i3 > -12 || i4 > -65) {
            return -1;
        }
        return i3 ^ (i4 << 8);
    }

    /* access modifiers changed from: private */
    public static int zzd(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (i4 > -12 || i5 > -65 || i6 > -65) {
            return -1;
        }
        return (i4 ^ (i5 << 8)) ^ (i6 << 16);
    }

    /* access modifiers changed from: private */
    public static int zzf(byte[] bArr, int i, int i2) {
        Throwable th;
        byte[] bArr2 = bArr;
        int i3 = i;
        byte b = bArr2[i3 - 1];
        switch (i2 - i3) {
            case 0:
                return zzbh(b);
            case 1:
                return zzs(b, bArr2[i3]);
            case 2:
                return zzd(b, bArr2[i3], bArr2[i3 + 1]);
            default:
                Throwable th2 = th;
                new AssertionError();
                throw th2;
        }
    }

    static int zzb(CharSequence charSequence) {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        CharSequence charSequence2 = charSequence;
        int length = charSequence2.length();
        int i = length;
        int i2 = length;
        int i3 = 0;
        while (i3 < i && charSequence2.charAt(i3) < 128) {
            i3++;
        }
        while (true) {
            if (i3 >= i) {
                break;
            }
            char charAt = charSequence2.charAt(i3);
            char c = charAt;
            if (charAt < 2048) {
                i2 += (127 - c) >>> 31;
                i3++;
            } else {
                int i4 = i2;
                CharSequence charSequence3 = charSequence2;
                CharSequence charSequence4 = charSequence3;
                int length2 = charSequence3.length();
                int i5 = 0;
                int i6 = i3;
                while (i6 < length2) {
                    char charAt2 = charSequence4.charAt(i6);
                    char c2 = charAt2;
                    if (charAt2 < 2048) {
                        i5 += (127 - c2) >>> 31;
                    } else {
                        i5 += 2;
                        if (55296 <= c2 && c2 <= 57343) {
                            if (Character.codePointAt(charSequence4, i6) < 65536) {
                                Throwable th3 = th2;
                                new zzkw(i6, length2);
                                throw th3;
                            }
                            i6++;
                        }
                    }
                    i6++;
                }
                i2 = i4 + i5;
            }
        }
        if (i2 >= i) {
            return i2;
        }
        Throwable th4 = th;
        long j = ((long) i2) + Declaration.TRANSIENT_ACCESS;
        new StringBuilder(54);
        new IllegalArgumentException(sb.append("UTF-8 length does not fit in int: ").append(j).toString());
        throw th4;
    }

    static int zza(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return zzafm.zzb(charSequence, bArr, i, i2);
    }

    static String zzg(byte[] bArr, int i, int i2) throws zzic {
        return zzafm.zzg(bArr, i, i2);
    }

    static {
        zzku zzku;
        zzku zzku2;
        zzku zzku3;
        if (!(zzkq.zzkr() && zzkq.zzks()) || zzge.zzga()) {
            zzku2 = zzku;
            new zzkx();
        } else {
            zzku2 = zzku3;
            new zzkz();
        }
        zzafm = zzku2;
    }
}
