package com.google.android.gms.internal.auth;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzge {
    static int zza(byte[] bArr, int i, zzgd zzgd) {
        byte[] bArr2 = bArr;
        int i2 = i;
        zzgd zzgd2 = zzgd;
        int i3 = i2;
        int i4 = i2 + 1;
        byte b = bArr2[i3];
        byte b2 = b;
        if (b < 0) {
            return zza((int) b2, bArr2, i4, zzgd2);
        }
        zzgd2.zza = b2;
        return i4;
    }

    static int zza(int i, byte[] bArr, int i2, zzgd zzgd) {
        int i3;
        byte[] bArr2 = bArr;
        int i4 = i2;
        zzgd zzgd2 = zzgd;
        int i5 = i & 127;
        int i6 = i4;
        int i7 = i4 + 1;
        byte b = bArr2[i6];
        byte b2 = b;
        if (b >= 0) {
            zzgd2.zza = i5 | (b2 << 7);
            return i7;
        }
        int i8 = i5 | ((b2 & Byte.MAX_VALUE) << 7);
        int i9 = i7;
        int i10 = i7 + 1;
        byte b3 = bArr2[i9];
        byte b4 = b3;
        if (b3 >= 0) {
            zzgd2.zza = i8 | (b4 << 14);
            return i10;
        }
        int i11 = i8 | ((b4 & Byte.MAX_VALUE) << 14);
        int i12 = i10;
        int i13 = i10 + 1;
        byte b5 = bArr2[i12];
        byte b6 = b5;
        if (b5 >= 0) {
            zzgd2.zza = i11 | (b6 << 21);
            return i13;
        }
        int i14 = i11 | ((b6 & Byte.MAX_VALUE) << 21);
        int i15 = i13;
        int i16 = i13 + 1;
        byte b7 = bArr2[i15];
        byte b8 = b7;
        if (b7 >= 0) {
            zzgd2.zza = i14 | (b8 << 28);
            return i16;
        }
        int i17 = i14 | ((b8 & Byte.MAX_VALUE) << 28);
        do {
            i3 = i16;
            i16++;
        } while (bArr2[i3] < 0);
        zzgd2.zza = i17;
        return i16;
    }

    static int zzb(byte[] bArr, int i, zzgd zzgd) {
        byte[] bArr2 = bArr;
        int i2 = i;
        zzgd zzgd2 = zzgd;
        int i3 = i2;
        int i4 = i2 + 1;
        long j = (long) bArr2[i3];
        long j2 = j;
        if (j >= 0) {
            zzgd2.zzb = j2;
            return i4;
        }
        zzgd zzgd3 = zzgd2;
        int i5 = i4;
        byte[] bArr3 = bArr2;
        int i6 = i5;
        int i7 = i5 + 1;
        byte b = bArr3[i6];
        int i8 = 7;
        long j3 = j2 & 127;
        long j4 = (long) (b & Byte.MAX_VALUE);
        int i9 = 7;
        while (true) {
            long j5 = j3 | (j4 << i9);
            if (b < 0) {
                int i10 = i7;
                i7++;
                b = bArr3[i10];
                i8 += 7;
                j3 = j5;
                j4 = (long) (b & Byte.MAX_VALUE);
                i9 = i8;
            } else {
                zzgd3.zzb = j5;
                return i7;
            }
        }
    }

    static int zza(byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        int i2 = i;
        return (bArr2[i2] & 255) | ((bArr2[i2 + 1] & 255) << 8) | ((bArr2[i2 + 2] & 255) << 16) | ((bArr2[i2 + 3] & 255) << 24);
    }

    static long zzb(byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        int i2 = i;
        return (((long) bArr2[i2]) & 255) | ((((long) bArr2[i2 + 1]) & 255) << 8) | ((((long) bArr2[i2 + 2]) & 255) << 16) | ((((long) bArr2[i2 + 3]) & 255) << 24) | ((((long) bArr2[i2 + 4]) & 255) << 32) | ((((long) bArr2[i2 + 5]) & 255) << 40) | ((((long) bArr2[i2 + 6]) & 255) << 48) | ((((long) bArr2[i2 + 7]) & 255) << 56);
    }

    static double zzc(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzb(bArr, i));
    }

    static float zzd(byte[] bArr, int i) {
        return Float.intBitsToFloat(zza(bArr, i));
    }

    static int zzc(byte[] bArr, int i, zzgd zzgd) throws zzhs {
        Object obj;
        byte[] bArr2 = bArr;
        zzgd zzgd2 = zzgd;
        int zza = zza(bArr2, i, zzgd2);
        int i2 = zzgd2.zza;
        int i3 = i2;
        if (i2 < 0) {
            throw zzhs.zzb();
        } else if (i3 == 0) {
            zzgd2.zzc = "";
            return zza;
        } else {
            new String(bArr2, zza, i3, zzho.zza);
            zzgd2.zzc = obj;
            return zza + i3;
        }
    }

    static int zzd(byte[] bArr, int i, zzgd zzgd) throws zzhs {
        byte[] bArr2 = bArr;
        zzgd zzgd2 = zzgd;
        int zza = zza(bArr2, i, zzgd2);
        int i2 = zzgd2.zza;
        int i3 = i2;
        if (i2 < 0) {
            throw zzhs.zzb();
        } else if (i3 == 0) {
            zzgd2.zzc = "";
            return zza;
        } else {
            zzgd2.zzc = zzkj.zzb(bArr2, zza, i3);
            return zza + i3;
        }
    }

    static int zze(byte[] bArr, int i, zzgd zzgd) throws zzhs {
        byte[] bArr2 = bArr;
        zzgd zzgd2 = zzgd;
        int zza = zza(bArr2, i, zzgd2);
        int i2 = zzgd2.zza;
        int i3 = i2;
        if (i2 < 0) {
            throw zzhs.zzb();
        } else if (i3 > bArr2.length - zza) {
            throw zzhs.zza();
        } else if (i3 == 0) {
            zzgd2.zzc = zzgi.zza;
            return zza;
        } else {
            zzgd2.zzc = zzgi.zza(bArr2, zza, i3);
            return zza + i3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zza(com.google.android.gms.internal.auth.zzji r14, byte[] r15, int r16, int r17, com.google.android.gms.internal.auth.zzgd r18) throws java.io.IOException {
        /*
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r7 = r1
            r8 = r2
            int r2 = r2 + 1
            byte r7 = r7[r8]
            r13 = r7
            r7 = r13
            r8 = r13
            r5 = r8
            if (r7 >= 0) goto L_0x0021
            r7 = r5
            r8 = r1
            r9 = r2
            r10 = r4
            int r7 = zza((int) r7, (byte[]) r8, (int) r9, (com.google.android.gms.internal.auth.zzgd) r10)
            r2 = r7
            r7 = r4
            int r7 = r7.zza
            r5 = r7
        L_0x0021:
            r7 = r5
            if (r7 < 0) goto L_0x002a
            r7 = r5
            r8 = r3
            r9 = r2
            int r8 = r8 - r9
            if (r7 <= r8) goto L_0x002f
        L_0x002a:
            com.google.android.gms.internal.auth.zzhs r7 = com.google.android.gms.internal.auth.zzhs.zza()
            throw r7
        L_0x002f:
            r7 = r0
            java.lang.Object r7 = r7.zza()
            r6 = r7
            r7 = r0
            r8 = r6
            r9 = r1
            r10 = r2
            r11 = r2
            r12 = r5
            int r11 = r11 + r12
            r12 = r4
            r7.zza(r8, r9, r10, r11, r12)
            r7 = r0
            r8 = r6
            r7.zzc(r8)
            r7 = r4
            r8 = r6
            r7.zzc = r8
            r7 = r2
            r8 = r5
            int r7 = r7 + r8
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzge.zza(com.google.android.gms.internal.auth.zzji, byte[], int, int, com.google.android.gms.internal.auth.zzgd):int");
    }

    static int zza(zzji zzji, byte[] bArr, int i, int i2, int i3, zzgd zzgd) throws IOException {
        zzgd zzgd2 = zzgd;
        zziw zziw = (zziw) zzji;
        zziw zziw2 = zziw;
        Object zza = zziw.zza();
        int zza2 = zziw2.zza(zza, bArr, i, i2, i3, zzgd2);
        zziw2.zzc(zza);
        zzgd2.zzc = zza;
        return zza2;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzht<?> zzht, zzgd zzgd) {
        int i4 = i;
        byte[] bArr2 = bArr;
        int i5 = i3;
        zzgd zzgd2 = zzgd;
        zzhp zzhp = (zzhp) zzht;
        int zza = zza(bArr2, i2, zzgd2);
        zzhp.zzc(zzgd2.zza);
        while (zza < i5) {
            int zza2 = zza(bArr2, zza, zzgd2);
            if (i4 != zzgd2.zza) {
                break;
            }
            zza = zza(bArr2, zza2, zzgd2);
            zzhp.zzc(zzgd2.zza);
        }
        return zza;
    }

    static int zza(byte[] bArr, int i, zzht<?> zzht, zzgd zzgd) throws IOException {
        byte[] bArr2 = bArr;
        zzgd zzgd2 = zzgd;
        zzhp zzhp = (zzhp) zzht;
        int zza = zza(bArr2, i, zzgd2);
        int i2 = zza;
        int i3 = zza + zzgd2.zza;
        while (i2 < i3) {
            i2 = zza(bArr2, i2, zzgd2);
            zzhp.zzc(zzgd2.zza);
        }
        if (i2 == i3) {
            return i2;
        }
        throw zzhs.zza();
    }

    static int zza(zzji<?> zzji, int i, byte[] bArr, int i2, int i3, zzht<?> zzht, zzgd zzgd) throws IOException {
        zzji<?> zzji2 = zzji;
        int i4 = i;
        byte[] bArr2 = bArr;
        int i5 = i3;
        zzgd zzgd2 = zzgd;
        zzht<?> zzht2 = zzht;
        int zza = zza((zzji) zzji2, bArr2, i2, i5, zzgd2);
        boolean add = zzht2.add(zzgd2.zzc);
        while (zza < i5) {
            int zza2 = zza(bArr2, zza, zzgd2);
            if (i4 != zzgd2.zza) {
                break;
            }
            zza = zza((zzji) zzji2, bArr2, zza2, i5, zzgd2);
            boolean add2 = zzht2.add(zzgd2.zzc);
        }
        return zza;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zza(int r17, byte[] r18, int r19, int r20, com.google.android.gms.internal.auth.zzkd r21, com.google.android.gms.internal.auth.zzgd r22) throws com.google.android.gms.internal.auth.zzhs {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r10 = r0
            r11 = 3
            int r10 = r10 >>> 3
            if (r10 != 0) goto L_0x0017
            com.google.android.gms.internal.auth.zzhs r10 = com.google.android.gms.internal.auth.zzhs.zzc()
            throw r10
        L_0x0017:
            r10 = r0
            r11 = 7
            r10 = r10 & 7
            switch(r10) {
                case 0: goto L_0x0023;
                case 1: goto L_0x004f;
                case 2: goto L_0x0065;
                case 3: goto L_0x00a6;
                case 4: goto L_0x001e;
                case 5: goto L_0x003a;
                default: goto L_0x001e;
            }
        L_0x001e:
            com.google.android.gms.internal.auth.zzhs r10 = com.google.android.gms.internal.auth.zzhs.zzc()
            throw r10
        L_0x0023:
            r10 = r1
            r11 = r2
            r12 = r5
            int r10 = zzb(r10, r11, r12)
            r2 = r10
            r10 = r4
            r11 = r0
            r12 = r5
            long r12 = r12.zzb
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r10.zza((int) r11, (java.lang.Object) r12)
            r10 = r2
            r0 = r10
        L_0x0039:
            return r0
        L_0x003a:
            r10 = r4
            r11 = r0
            r12 = r1
            r13 = r2
            int r12 = zza(r12, r13)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r10.zza((int) r11, (java.lang.Object) r12)
            r10 = r2
            r11 = 4
            int r10 = r10 + 4
            r0 = r10
            goto L_0x0039
        L_0x004f:
            r10 = r4
            r11 = r0
            r12 = r1
            r13 = r2
            long r12 = zzb(r12, r13)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r10.zza((int) r11, (java.lang.Object) r12)
            r10 = r2
            r11 = 8
            int r10 = r10 + 8
            r0 = r10
            goto L_0x0039
        L_0x0065:
            r10 = r1
            r11 = r2
            r12 = r5
            int r10 = zza(r10, r11, r12)
            r2 = r10
            r10 = r5
            int r10 = r10.zza
            r16 = r10
            r10 = r16
            r11 = r16
            r6 = r11
            if (r10 >= 0) goto L_0x007e
            com.google.android.gms.internal.auth.zzhs r10 = com.google.android.gms.internal.auth.zzhs.zzb()
            throw r10
        L_0x007e:
            r10 = r6
            r11 = r1
            int r11 = r11.length
            r12 = r2
            int r11 = r11 - r12
            if (r10 <= r11) goto L_0x008a
            com.google.android.gms.internal.auth.zzhs r10 = com.google.android.gms.internal.auth.zzhs.zza()
            throw r10
        L_0x008a:
            r10 = r6
            if (r10 != 0) goto L_0x0099
            r10 = r4
            r11 = r0
            com.google.android.gms.internal.auth.zzgi r12 = com.google.android.gms.internal.auth.zzgi.zza
            r10.zza((int) r11, (java.lang.Object) r12)
        L_0x0094:
            r10 = r2
            r11 = r6
            int r10 = r10 + r11
            r0 = r10
            goto L_0x0039
        L_0x0099:
            r10 = r4
            r11 = r0
            r12 = r1
            r13 = r2
            r14 = r6
            com.google.android.gms.internal.auth.zzgi r12 = com.google.android.gms.internal.auth.zzgi.zza((byte[]) r12, (int) r13, (int) r14)
            r10.zza((int) r11, (java.lang.Object) r12)
            goto L_0x0094
        L_0x00a6:
            com.google.android.gms.internal.auth.zzkd r10 = com.google.android.gms.internal.auth.zzkd.zzb()
            r7 = r10
            r10 = r0
            r11 = -8
            r10 = r10 & -8
            r11 = 4
            r10 = r10 | 4
            r8 = r10
            r10 = 0
            r9 = r10
        L_0x00b5:
            r10 = r2
            r11 = r3
            if (r10 >= r11) goto L_0x00da
            r10 = r1
            r11 = r2
            r12 = r5
            int r10 = zza(r10, r11, r12)
            r2 = r10
            r10 = r5
            int r10 = r10.zza
            r16 = r10
            r10 = r16
            r11 = r16
            r9 = r11
            r11 = r8
            if (r10 == r11) goto L_0x00da
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r7
            r15 = r5
            int r10 = zza((int) r10, (byte[]) r11, (int) r12, (int) r13, (com.google.android.gms.internal.auth.zzkd) r14, (com.google.android.gms.internal.auth.zzgd) r15)
            r2 = r10
            goto L_0x00b5
        L_0x00da:
            r10 = r2
            r11 = r3
            if (r10 > r11) goto L_0x00e2
            r10 = r9
            r11 = r8
            if (r10 == r11) goto L_0x00e7
        L_0x00e2:
            com.google.android.gms.internal.auth.zzhs r10 = com.google.android.gms.internal.auth.zzhs.zze()
            throw r10
        L_0x00e7:
            r10 = r4
            r11 = r0
            r12 = r7
            r10.zza((int) r11, (java.lang.Object) r12)
            r10 = r2
            r0 = r10
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzge.zza(int, byte[], int, int, com.google.android.gms.internal.auth.zzkd, com.google.android.gms.internal.auth.zzgd):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zza(int r13, byte[] r14, int r15, int r16, com.google.android.gms.internal.auth.zzgd r17) throws com.google.android.gms.internal.auth.zzhs {
        /*
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r7 = r0
            r8 = 3
            int r7 = r7 >>> 3
            if (r7 != 0) goto L_0x0012
            com.google.android.gms.internal.auth.zzhs r7 = com.google.android.gms.internal.auth.zzhs.zzc()
            throw r7
        L_0x0012:
            r7 = r0
            r8 = 7
            r7 = r7 & 7
            switch(r7) {
                case 0: goto L_0x001e;
                case 1: goto L_0x002d;
                case 2: goto L_0x0034;
                case 3: goto L_0x0041;
                case 4: goto L_0x0019;
                case 5: goto L_0x0027;
                default: goto L_0x0019;
            }
        L_0x0019:
            com.google.android.gms.internal.auth.zzhs r7 = com.google.android.gms.internal.auth.zzhs.zzc()
            throw r7
        L_0x001e:
            r7 = r1
            r8 = r2
            r9 = r4
            int r7 = zzb(r7, r8, r9)
            r0 = r7
        L_0x0026:
            return r0
        L_0x0027:
            r7 = r2
            r8 = 4
            int r7 = r7 + 4
            r0 = r7
            goto L_0x0026
        L_0x002d:
            r7 = r2
            r8 = 8
            int r7 = r7 + 8
            r0 = r7
            goto L_0x0026
        L_0x0034:
            r7 = r1
            r8 = r2
            r9 = r4
            int r7 = zza(r7, r8, r9)
            r8 = r4
            int r8 = r8.zza
            int r7 = r7 + r8
            r0 = r7
            goto L_0x0026
        L_0x0041:
            r7 = r0
            r8 = -8
            r7 = r7 & -8
            r8 = 4
            r7 = r7 | 4
            r5 = r7
            r7 = 0
            r6 = r7
        L_0x004b:
            r7 = r2
            r8 = r3
            if (r7 >= r8) goto L_0x006c
            r7 = r1
            r8 = r2
            r9 = r4
            int r7 = zza(r7, r8, r9)
            r2 = r7
            r7 = r4
            int r7 = r7.zza
            r12 = r7
            r7 = r12
            r8 = r12
            r6 = r8
            r8 = r5
            if (r7 == r8) goto L_0x006c
            r7 = r6
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            int r7 = zza((int) r7, (byte[]) r8, (int) r9, (int) r10, (com.google.android.gms.internal.auth.zzgd) r11)
            r2 = r7
            goto L_0x004b
        L_0x006c:
            r7 = r2
            r8 = r3
            if (r7 > r8) goto L_0x0074
            r7 = r6
            r8 = r5
            if (r7 == r8) goto L_0x0079
        L_0x0074:
            com.google.android.gms.internal.auth.zzhs r7 = com.google.android.gms.internal.auth.zzhs.zze()
            throw r7
        L_0x0079:
            r7 = r2
            r0 = r7
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzge.zza(int, byte[], int, int, com.google.android.gms.internal.auth.zzgd):int");
    }
}
