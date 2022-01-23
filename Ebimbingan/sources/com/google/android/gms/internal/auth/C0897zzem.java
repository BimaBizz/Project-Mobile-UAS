package com.google.android.gms.internal.auth;

import com.google.appinventor.components.runtime.util.Ev3Constants;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzem */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0897zzem {
    static Object zza(int i) {
        Throwable th;
        StringBuilder sb;
        int i2 = i;
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            Throwable th2 = th;
            new StringBuilder(52);
            new IllegalArgumentException(sb.append("must be power of 2 between 2^1 and 2^30: ").append(i2).toString());
            throw th2;
        } else if (i2 <= 256) {
            return new byte[i2];
        } else {
            if (i2 <= 65536) {
                return new short[i2];
            }
            return new int[i2];
        }
    }

    static int zza(Object obj, int i) {
        Object obj2 = obj;
        int i2 = i;
        if (obj2 instanceof byte[]) {
            return ((byte[]) obj2)[i2] & Ev3Constants.Opcode.TST;
        }
        if (obj2 instanceof short[]) {
            return ((short[]) obj2)[i2] & 65535;
        }
        return ((int[]) obj2)[i2];
    }

    static void zza(Object obj, int i, int i2) {
        Object obj2 = obj;
        int i3 = i;
        int i4 = i2;
        if (obj2 instanceof byte[]) {
            ((byte[]) obj2)[i3] = (byte) i4;
        } else if (obj2 instanceof short[]) {
            ((short[]) obj2)[i3] = (short) i4;
        } else {
            ((int[]) obj2)[i3] = i4;
        }
    }

    static int zzb(int i) {
        int i2 = i;
        return (i2 < 32 ? 4 : 2) * (i2 + 1);
    }

    static int zza(int i, int i2, int i3) {
        int i4 = i3;
        return (i & (i4 ^ -1)) | (i2 & i4);
    }

    static int zza(@NullableDecl Object obj, @NullableDecl Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @NullableDecl Object[] objArr2) {
        int i2;
        Object obj4 = obj;
        Object obj5 = obj2;
        int i3 = i;
        Object obj6 = obj3;
        int[] iArr2 = iArr;
        Object[] objArr3 = objArr;
        Object[] objArr4 = objArr2;
        int zza = C0899zzeo.zza(obj4);
        int i4 = zza;
        int i5 = zza & i3;
        int zza2 = zza(obj6, i5);
        int i6 = zza2;
        if (zza2 == 0) {
            return -1;
        }
        int i7 = i4 & (i3 ^ -1);
        int i8 = -1;
        do {
            int i9 = i6 - 1;
            int i10 = iArr2[i9];
            int i11 = i10;
            if ((i10 & (i3 ^ -1)) != i7 || !C0872zzdo.zza(obj4, objArr3[i9]) || (objArr4 != null && !C0872zzdo.zza(obj5, objArr4[i9]))) {
                i8 = i9;
                i2 = i11 & i3;
                i6 = i2;
            } else {
                int i12 = i11 & i3;
                if (i8 == -1) {
                    zza(obj6, i5, i12);
                } else {
                    iArr2[i8] = zza(iArr2[i8], i12, i3);
                }
                return i9;
            }
        } while (i2 != 0);
        return -1;
    }
}
