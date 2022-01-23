package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzkn extends zzkk {
    zzkn() {
    }

    /* access modifiers changed from: package-private */
    public final int zza(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        int i5 = i3;
        int i6 = i2;
        byte[] bArr2 = bArr;
        while (i6 < i5 && bArr2[i6] >= 0) {
            i6++;
        }
        if (i6 >= i5) {
            return 0;
        }
        int i7 = i5;
        int i8 = i6;
        byte[] bArr3 = bArr2;
        while (i8 < i7) {
            int i9 = i8;
            i8++;
            byte b = bArr3[i9];
            byte b2 = b;
            if (b < 0) {
                if (b2 < -32) {
                    if (i8 >= i7) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        int i10 = i8;
                        i8++;
                        if (bArr3[i10] > -65) {
                        }
                    }
                    return -1;
                } else if (b2 < -16) {
                    if (i8 >= i7 - 1) {
                        return zzkj.zzd(bArr3, i8, i7);
                    }
                    int i11 = i8;
                    int i12 = i8 + 1;
                    byte b3 = bArr3[i11];
                    byte b4 = b3;
                    if (b3 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                        int i13 = i12;
                        i8 = i12 + 1;
                        if (bArr3[i13] > -65) {
                        }
                    }
                    return -1;
                } else if (i8 >= i7 - 2) {
                    return zzkj.zzd(bArr3, i8, i7);
                } else {
                    int i14 = i8;
                    int i15 = i8 + 1;
                    byte b5 = bArr3[i14];
                    byte b6 = b5;
                    if (b5 <= -65 && (((b2 << 28) + (b6 + 112)) >> 30) == 0) {
                        int i16 = i15;
                        int i17 = i15 + 1;
                        if (bArr3[i16] <= -65) {
                            int i18 = i17;
                            i8 = i17 + 1;
                            if (bArr3[i18] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: CFG modification limit reached, blocks count: 147 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzb(byte[] r20, int r21, int r22) throws com.google.android.gms.internal.auth.zzhs {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r11 = r3
            r12 = r4
            r11 = r11 | r12
            r12 = r2
            int r12 = r12.length
            r13 = r3
            int r12 = r12 - r13
            r13 = r4
            int r12 = r12 - r13
            r11 = r11 | r12
            if (r11 >= 0) goto L_0x005f
            java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
            r18 = r11
            r11 = r18
            r12 = r18
            java.lang.String r13 = "buffer length=%d, index=%d, size=%d"
            r14 = 3
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r18 = r14
            r14 = r18
            r15 = r18
            r16 = 0
            r17 = r2
            r0 = r17
            int r0 = r0.length
            r17 = r0
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r15[r16] = r17
            r18 = r14
            r14 = r18
            r15 = r18
            r16 = 1
            r17 = r3
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r15[r16] = r17
            r18 = r14
            r14 = r18
            r15 = r18
            r16 = 2
            r17 = r4
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r15[r16] = r17
            java.lang.String r13 = java.lang.String.format(r13, r14)
            r12.<init>(r13)
            throw r11
        L_0x005f:
            r11 = r3
            r18 = r11
            r11 = r18
            r12 = r18
            r5 = r12
            r12 = r4
            int r11 = r11 + r12
            r6 = r11
            r11 = r4
            char[] r11 = new char[r11]
            r7 = r11
            r11 = 0
            r8 = r11
        L_0x0070:
            r11 = r5
            r12 = r6
            if (r11 >= r12) goto L_0x009e
            r11 = r2
            r12 = r5
            byte r11 = r11[r12]
            r18 = r11
            r11 = r18
            r12 = r18
            r9 = r12
            boolean r11 = com.google.android.gms.internal.auth.zzkl.zzd(r11)
            if (r11 == 0) goto L_0x009e
            int r5 = r5 + 1
            r11 = r9
            r12 = r7
            r13 = r8
            int r8 = r8 + 1
            com.google.android.gms.internal.auth.zzkl.zzb(r11, r12, r13)
            goto L_0x0070
        L_0x0090:
            r11 = r9
            r12 = r2
            r13 = r5
            int r5 = r5 + 1
            byte r12 = r12[r13]
            r13 = r7
            r14 = r8
            int r8 = r8 + 1
            com.google.android.gms.internal.auth.zzkl.zzb(r11, r12, r13, r14)
        L_0x009e:
            r11 = r5
            r12 = r6
            if (r11 >= r12) goto L_0x0140
            r11 = r2
            r12 = r5
            int r5 = r5 + 1
            byte r11 = r11[r12]
            r18 = r11
            r11 = r18
            r12 = r18
            r9 = r12
            boolean r11 = com.google.android.gms.internal.auth.zzkl.zzd(r11)
            if (r11 == 0) goto L_0x00dd
            r11 = r9
            r12 = r7
            r13 = r8
            int r8 = r8 + 1
            com.google.android.gms.internal.auth.zzkl.zzb(r11, r12, r13)
        L_0x00bd:
            r11 = r5
            r12 = r6
            if (r11 >= r12) goto L_0x013e
            r11 = r2
            r12 = r5
            byte r11 = r11[r12]
            r18 = r11
            r11 = r18
            r12 = r18
            r10 = r12
            boolean r11 = com.google.android.gms.internal.auth.zzkl.zzd(r11)
            if (r11 == 0) goto L_0x013e
            int r5 = r5 + 1
            r11 = r10
            r12 = r7
            r13 = r8
            int r8 = r8 + 1
            com.google.android.gms.internal.auth.zzkl.zzb(r11, r12, r13)
            goto L_0x00bd
        L_0x00dd:
            r11 = r9
            boolean r11 = com.google.android.gms.internal.auth.zzkl.zze(r11)
            if (r11 == 0) goto L_0x00ed
            r11 = r5
            r12 = r6
            if (r11 < r12) goto L_0x0090
            com.google.android.gms.internal.auth.zzhs r11 = com.google.android.gms.internal.auth.zzhs.zzf()
            throw r11
        L_0x00ed:
            r11 = r9
            boolean r11 = com.google.android.gms.internal.auth.zzkl.zzf(r11)
            if (r11 == 0) goto L_0x0115
            r11 = r5
            r12 = r6
            r13 = 1
            int r12 = r12 + -1
            if (r11 < r12) goto L_0x0100
            com.google.android.gms.internal.auth.zzhs r11 = com.google.android.gms.internal.auth.zzhs.zzf()
            throw r11
        L_0x0100:
            r11 = r9
            r12 = r2
            r13 = r5
            int r5 = r5 + 1
            byte r12 = r12[r13]
            r13 = r2
            r14 = r5
            int r5 = r5 + 1
            byte r13 = r13[r14]
            r14 = r7
            r15 = r8
            int r8 = r8 + 1
            com.google.android.gms.internal.auth.zzkl.zzb(r11, r12, r13, r14, r15)
            goto L_0x009e
        L_0x0115:
            r11 = r5
            r12 = r6
            r13 = 2
            int r12 = r12 + -2
            if (r11 < r12) goto L_0x0121
            com.google.android.gms.internal.auth.zzhs r11 = com.google.android.gms.internal.auth.zzhs.zzf()
            throw r11
        L_0x0121:
            r11 = r9
            r12 = r2
            r13 = r5
            int r5 = r5 + 1
            byte r12 = r12[r13]
            r13 = r2
            r14 = r5
            int r5 = r5 + 1
            byte r13 = r13[r14]
            r14 = r2
            r15 = r5
            int r5 = r5 + 1
            byte r14 = r14[r15]
            r15 = r7
            r16 = r8
            int r8 = r8 + 1
            com.google.android.gms.internal.auth.zzkl.zzb(r11, r12, r13, r14, r15, r16)
            int r8 = r8 + 1
        L_0x013e:
            goto L_0x009e
        L_0x0140:
            java.lang.String r11 = new java.lang.String
            r18 = r11
            r11 = r18
            r12 = r18
            r13 = r7
            r14 = 0
            r15 = r8
            r12.<init>(r13, r14, r15)
            r1 = r11
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzkn.zzb(byte[], int, int):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final int zza(CharSequence charSequence, byte[] bArr, int i, int i2) {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        Throwable th3;
        CharSequence charSequence2 = charSequence;
        byte[] bArr2 = bArr;
        int i3 = i;
        int length = charSequence2.length();
        int i4 = i3;
        int i5 = 0;
        int i6 = i3 + i2;
        while (i5 < length && i5 + i4 < i6) {
            char charAt = charSequence2.charAt(i5);
            char c = charAt;
            if (charAt >= 128) {
                break;
            }
            bArr2[i4 + i5] = (byte) c;
            i5++;
        }
        if (i5 == length) {
            return i4 + length;
        }
        int i7 = i4 + i5;
        while (i5 < length) {
            char charAt2 = charSequence2.charAt(i5);
            char c2 = charAt2;
            if (charAt2 < 128 && i7 < i6) {
                int i8 = i7;
                i7++;
                bArr2[i8] = (byte) c2;
            } else if (c2 < 2048 && i7 <= i6 - 2) {
                int i9 = i7;
                int i10 = i7 + 1;
                bArr2[i9] = (byte) (960 | (c2 >>> 6));
                int i11 = i10;
                i7 = i10 + 1;
                bArr2[i11] = (byte) (128 | ('?' & c2));
            } else if ((c2 < 55296 || 57343 < c2) && i7 <= i6 - 3) {
                int i12 = i7;
                int i13 = i7 + 1;
                bArr2[i12] = (byte) (480 | (c2 >>> 12));
                int i14 = i13;
                int i15 = i13 + 1;
                bArr2[i14] = (byte) (128 | (63 & (c2 >>> 6)));
                int i16 = i15;
                i7 = i15 + 1;
                bArr2[i16] = (byte) (128 | ('?' & c2));
            } else if (i7 <= i6 - 4) {
                if (i5 + 1 != charSequence2.length()) {
                    i5++;
                    char charAt3 = charSequence2.charAt(i5);
                    char c3 = charAt3;
                    if (Character.isSurrogatePair(c2, charAt3)) {
                        int codePoint = Character.toCodePoint(c2, c3);
                        int i17 = i7;
                        int i18 = i7 + 1;
                        bArr2[i17] = (byte) (240 | (codePoint >>> 18));
                        int i19 = i18;
                        int i20 = i18 + 1;
                        bArr2[i19] = (byte) (128 | (63 & (codePoint >>> 12)));
                        int i21 = i20;
                        int i22 = i20 + 1;
                        bArr2[i21] = (byte) (128 | (63 & (codePoint >>> 6)));
                        int i23 = i22;
                        i7 = i22 + 1;
                        bArr2[i23] = (byte) (128 | (63 & codePoint));
                    }
                }
                Throwable th4 = th3;
                new zzkm(i5 - 1, length);
                throw th4;
            } else if (55296 > c2 || c2 > 57343 || (i5 + 1 != charSequence2.length() && Character.isSurrogatePair(c2, charSequence2.charAt(i5 + 1)))) {
                Throwable th5 = th;
                new StringBuilder(37);
                new ArrayIndexOutOfBoundsException(sb.append("Failed writing ").append(c2).append(" at index ").append(i7).toString());
                throw th5;
            } else {
                Throwable th6 = th2;
                new zzkm(i5, length);
                throw th6;
            }
            i5++;
        }
        return i7;
    }
}
