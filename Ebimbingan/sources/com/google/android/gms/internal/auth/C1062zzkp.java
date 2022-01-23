package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzkp */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1062zzkp extends C1057zzkk {
    C1062zzkp() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(int r33, byte[] r34, int r35, int r36) {
        /*
            r32 = this;
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r23 = r5
            r24 = r6
            r23 = r23 | r24
            r24 = r4
            r0 = r24
            int r0 = r0.length
            r24 = r0
            r25 = r6
            int r24 = r24 - r25
            r23 = r23 | r24
            if (r23 >= 0) goto L_0x006f
            java.lang.ArrayIndexOutOfBoundsException r23 = new java.lang.ArrayIndexOutOfBoundsException
            r30 = r23
            r23 = r30
            r24 = r30
            java.lang.String r25 = "Array length=%d, index=%d, limit=%d"
            r26 = 3
            r0 = r26
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r26 = r0
            r30 = r26
            r26 = r30
            r27 = r30
            r28 = 0
            r29 = r4
            r0 = r29
            int r0 = r0.length
            r29 = r0
            java.lang.Integer r29 = java.lang.Integer.valueOf(r29)
            r27[r28] = r29
            r30 = r26
            r26 = r30
            r27 = r30
            r28 = 1
            r29 = r5
            java.lang.Integer r29 = java.lang.Integer.valueOf(r29)
            r27[r28] = r29
            r30 = r26
            r26 = r30
            r27 = r30
            r28 = 2
            r29 = r6
            java.lang.Integer r29 = java.lang.Integer.valueOf(r29)
            r27[r28] = r29
            java.lang.String r25 = java.lang.String.format(r25, r26)
            r24.<init>(r25)
            throw r23
        L_0x006f:
            r23 = r5
            r0 = r23
            long r0 = (long) r0
            r23 = r0
            r7 = r23
            r23 = r6
            r0 = r23
            long r0 = (long) r0
            r23 = r0
            r9 = r23
            r23 = r4
            r24 = r7
            r26 = r9
            r28 = r7
            long r26 = r26 - r28
            r0 = r26
            int r0 = (int) r0
            r26 = r0
            r14 = r26
            r12 = r24
            r30 = r23
            r23 = r30
            r24 = r30
            r11 = r24
            r24 = r12
            r26 = r14
            r21 = r26
            r19 = r24
            r18 = r23
            r23 = r21
            r24 = 16
            r0 = r23
            r1 = r24
            if (r0 >= r1) goto L_0x00f2
            r23 = 0
        L_0x00b2:
            r15 = r23
            r23 = r14
            r24 = r15
            int r23 = r23 - r24
            r14 = r23
            r23 = r12
            r25 = r15
            r0 = r25
            long r0 = (long) r0
            r25 = r0
            long r23 = r23 + r25
            r12 = r23
        L_0x00c9:
            r23 = 0
            r16 = r23
        L_0x00cd:
            r23 = r14
            if (r23 <= 0) goto L_0x011f
            r23 = r11
            r24 = r12
            r30 = r24
            r24 = r30
            r26 = r30
            r28 = 1
            long r26 = r26 + r28
            r12 = r26
            byte r23 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r23, (long) r24)
            r30 = r23
            r23 = r30
            r24 = r30
            r16 = r24
            if (r23 < 0) goto L_0x011f
            int r14 = r14 + -1
            goto L_0x00cd
        L_0x00f2:
            r23 = 0
            r22 = r23
        L_0x00f6:
            r23 = r22
            r24 = r21
            r0 = r23
            r1 = r24
            if (r0 >= r1) goto L_0x011c
            r23 = r18
            r24 = r19
            r30 = r24
            r24 = r30
            r26 = r30
            r28 = 1
            long r26 = r26 + r28
            r19 = r26
            byte r23 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r23, (long) r24)
            if (r23 >= 0) goto L_0x0119
            r23 = r22
            goto L_0x00b2
        L_0x0119:
            int r22 = r22 + 1
            goto L_0x00f6
        L_0x011c:
            r23 = r21
            goto L_0x00b2
        L_0x011f:
            r23 = r14
            if (r23 != 0) goto L_0x0128
            r23 = 0
            r2 = r23
        L_0x0127:
            return r2
        L_0x0128:
            int r14 = r14 + -1
            r23 = r16
            r24 = -32
            r0 = r23
            r1 = r24
            if (r0 >= r1) goto L_0x016a
            r23 = r14
            if (r23 != 0) goto L_0x013d
            r23 = r16
            r2 = r23
            goto L_0x0127
        L_0x013d:
            int r14 = r14 + -1
            r23 = r16
            r24 = -62
            r0 = r23
            r1 = r24
            if (r0 < r1) goto L_0x0165
            r23 = r11
            r24 = r12
            r30 = r24
            r24 = r30
            r26 = r30
            r28 = 1
            long r26 = r26 + r28
            r12 = r26
            byte r23 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r23, (long) r24)
            r24 = -65
            r0 = r23
            r1 = r24
            if (r0 <= r1) goto L_0x0291
        L_0x0165:
            r23 = -1
            r2 = r23
            goto L_0x0127
        L_0x016a:
            r23 = r16
            r24 = -16
            r0 = r23
            r1 = r24
            if (r0 >= r1) goto L_0x01ff
            r23 = r14
            r24 = 2
            r0 = r23
            r1 = r24
            if (r0 >= r1) goto L_0x018d
            r23 = r11
            r24 = r16
            r25 = r12
            r27 = r14
            int r23 = zza((byte[]) r23, (int) r24, (long) r25, (int) r27)
            r2 = r23
            goto L_0x0127
        L_0x018d:
            int r14 = r14 + -2
            r23 = r11
            r24 = r12
            r30 = r24
            r24 = r30
            r26 = r30
            r28 = 1
            long r26 = r26 + r28
            r12 = r26
            byte r23 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r23, (long) r24)
            r30 = r23
            r23 = r30
            r24 = r30
            r17 = r24
            r24 = -65
            r0 = r23
            r1 = r24
            if (r0 > r1) goto L_0x01f7
            r23 = r16
            r24 = -32
            r0 = r23
            r1 = r24
            if (r0 != r1) goto L_0x01c7
            r23 = r17
            r24 = -96
            r0 = r23
            r1 = r24
            if (r0 < r1) goto L_0x01f7
        L_0x01c7:
            r23 = r16
            r24 = -19
            r0 = r23
            r1 = r24
            if (r0 != r1) goto L_0x01db
            r23 = r17
            r24 = -96
            r0 = r23
            r1 = r24
            if (r0 >= r1) goto L_0x01f7
        L_0x01db:
            r23 = r11
            r24 = r12
            r30 = r24
            r24 = r30
            r26 = r30
            r28 = 1
            long r26 = r26 + r28
            r12 = r26
            byte r23 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r23, (long) r24)
            r24 = -65
            r0 = r23
            r1 = r24
            if (r0 <= r1) goto L_0x01fd
        L_0x01f7:
            r23 = -1
            r2 = r23
            goto L_0x0127
        L_0x01fd:
            goto L_0x00c9
        L_0x01ff:
            r23 = r14
            r24 = 3
            r0 = r23
            r1 = r24
            if (r0 >= r1) goto L_0x0219
            r23 = r11
            r24 = r16
            r25 = r12
            r27 = r14
            int r23 = zza((byte[]) r23, (int) r24, (long) r25, (int) r27)
            r2 = r23
            goto L_0x0127
        L_0x0219:
            int r14 = r14 + -3
            r23 = r11
            r24 = r12
            r30 = r24
            r24 = r30
            r26 = r30
            r28 = 1
            long r26 = r26 + r28
            r12 = r26
            byte r23 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r23, (long) r24)
            r30 = r23
            r23 = r30
            r24 = r30
            r17 = r24
            r24 = -65
            r0 = r23
            r1 = r24
            if (r0 > r1) goto L_0x028b
            r23 = r16
            r24 = 28
            int r23 = r23 << 28
            r24 = r17
            r25 = -112(0xffffffffffffff90, float:NaN)
            int r24 = r24 + 112
            int r23 = r23 + r24
            r24 = 30
            int r23 = r23 >> 30
            if (r23 != 0) goto L_0x028b
            r23 = r11
            r24 = r12
            r30 = r24
            r24 = r30
            r26 = r30
            r28 = 1
            long r26 = r26 + r28
            r12 = r26
            byte r23 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r23, (long) r24)
            r24 = -65
            r0 = r23
            r1 = r24
            if (r0 > r1) goto L_0x028b
            r23 = r11
            r24 = r12
            r30 = r24
            r24 = r30
            r26 = r30
            r28 = 1
            long r26 = r26 + r28
            r12 = r26
            byte r23 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r23, (long) r24)
            r24 = -65
            r0 = r23
            r1 = r24
            if (r0 <= r1) goto L_0x0291
        L_0x028b:
            r23 = -1
            r2 = r23
            goto L_0x0127
        L_0x0291:
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C1062zzkp.zza(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: CFG modification limit reached, blocks count: 147 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzb(byte[] r20, int r21, int r22) throws com.google.android.gms.internal.auth.C0984zzhs {
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
            if (r11 >= r12) goto L_0x00a4
            r11 = r2
            r12 = r5
            long r12 = (long) r12
            byte r11 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r11, (long) r12)
            r18 = r11
            r11 = r18
            r12 = r18
            r9 = r12
            boolean r11 = com.google.android.gms.internal.auth.C1058zzkl.zzd(r11)
            if (r11 == 0) goto L_0x00a4
            int r5 = r5 + 1
            r11 = r9
            r12 = r7
            r13 = r8
            int r8 = r8 + 1
            com.google.android.gms.internal.auth.C1058zzkl.zzb(r11, r12, r13)
            goto L_0x0070
        L_0x0093:
            r11 = r9
            r12 = r2
            r13 = r5
            int r5 = r5 + 1
            long r13 = (long) r13
            byte r12 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r12, (long) r13)
            r13 = r7
            r14 = r8
            int r8 = r8 + 1
            com.google.android.gms.internal.auth.C1058zzkl.zzb(r11, r12, r13, r14)
        L_0x00a4:
            r11 = r5
            r12 = r6
            if (r11 >= r12) goto L_0x015c
            r11 = r2
            r12 = r5
            int r5 = r5 + 1
            long r12 = (long) r12
            byte r11 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r11, (long) r12)
            r18 = r11
            r11 = r18
            r12 = r18
            r9 = r12
            boolean r11 = com.google.android.gms.internal.auth.C1058zzkl.zzd(r11)
            if (r11 == 0) goto L_0x00e9
            r11 = r9
            r12 = r7
            r13 = r8
            int r8 = r8 + 1
            com.google.android.gms.internal.auth.C1058zzkl.zzb(r11, r12, r13)
        L_0x00c6:
            r11 = r5
            r12 = r6
            if (r11 >= r12) goto L_0x015a
            r11 = r2
            r12 = r5
            long r12 = (long) r12
            byte r11 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r11, (long) r12)
            r18 = r11
            r11 = r18
            r12 = r18
            r10 = r12
            boolean r11 = com.google.android.gms.internal.auth.C1058zzkl.zzd(r11)
            if (r11 == 0) goto L_0x015a
            int r5 = r5 + 1
            r11 = r10
            r12 = r7
            r13 = r8
            int r8 = r8 + 1
            com.google.android.gms.internal.auth.C1058zzkl.zzb(r11, r12, r13)
            goto L_0x00c6
        L_0x00e9:
            r11 = r9
            boolean r11 = com.google.android.gms.internal.auth.C1058zzkl.zze(r11)
            if (r11 == 0) goto L_0x00f9
            r11 = r5
            r12 = r6
            if (r11 < r12) goto L_0x0093
            com.google.android.gms.internal.auth.zzhs r11 = com.google.android.gms.internal.auth.C0984zzhs.zzf()
            throw r11
        L_0x00f9:
            r11 = r9
            boolean r11 = com.google.android.gms.internal.auth.C1058zzkl.zzf(r11)
            if (r11 == 0) goto L_0x0128
            r11 = r5
            r12 = r6
            r13 = 1
            int r12 = r12 + -1
            if (r11 < r12) goto L_0x010c
            com.google.android.gms.internal.auth.zzhs r11 = com.google.android.gms.internal.auth.C0984zzhs.zzf()
            throw r11
        L_0x010c:
            r11 = r9
            r12 = r2
            r13 = r5
            int r5 = r5 + 1
            long r13 = (long) r13
            byte r12 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r12, (long) r13)
            r13 = r2
            r14 = r5
            int r5 = r5 + 1
            long r14 = (long) r14
            byte r13 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r13, (long) r14)
            r14 = r7
            r15 = r8
            int r8 = r8 + 1
            com.google.android.gms.internal.auth.C1058zzkl.zzb(r11, r12, r13, r14, r15)
            goto L_0x00a4
        L_0x0128:
            r11 = r5
            r12 = r6
            r13 = 2
            int r12 = r12 + -2
            if (r11 < r12) goto L_0x0134
            com.google.android.gms.internal.auth.zzhs r11 = com.google.android.gms.internal.auth.C0984zzhs.zzf()
            throw r11
        L_0x0134:
            r11 = r9
            r12 = r2
            r13 = r5
            int r5 = r5 + 1
            long r13 = (long) r13
            byte r12 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r12, (long) r13)
            r13 = r2
            r14 = r5
            int r5 = r5 + 1
            long r14 = (long) r14
            byte r13 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r13, (long) r14)
            r14 = r2
            r15 = r5
            int r5 = r5 + 1
            long r15 = (long) r15
            byte r14 = com.google.android.gms.internal.auth.C1053zzkg.zza((byte[]) r14, (long) r15)
            r15 = r7
            r16 = r8
            int r8 = r8 + 1
            com.google.android.gms.internal.auth.C1058zzkl.zzb(r11, r12, r13, r14, r15, r16)
            int r8 = r8 + 1
        L_0x015a:
            goto L_0x00a4
        L_0x015c:
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C1062zzkp.zzb(byte[], int, int):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final int zza(CharSequence charSequence, byte[] bArr, int i, int i2) {
        Throwable th;
        StringBuilder sb;
        long j;
        Throwable th2;
        StringBuilder sb2;
        Throwable th3;
        Throwable th4;
        CharSequence charSequence2 = charSequence;
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        long j2 = (long) i3;
        long j3 = j2;
        long j4 = j2 + ((long) i4);
        int length = charSequence2.length();
        int i5 = length;
        if (length > i4 || bArr2.length - i4 < i3) {
            Throwable th5 = th;
            char charAt = charSequence2.charAt(i5 - 1);
            new StringBuilder(37);
            new ArrayIndexOutOfBoundsException(sb.append("Failed writing ").append(charAt).append(" at index ").append(i3 + i4).toString());
            throw th5;
        }
        int i6 = 0;
        while (i6 < i5) {
            char charAt2 = charSequence2.charAt(i6);
            char c = charAt2;
            if (charAt2 >= 128) {
                break;
            }
            long j5 = j;
            j3 = j5 + 1;
            C1053zzkg.zza(bArr2, j5, (byte) c);
            i6++;
        }
        if (i6 == i5) {
            return (int) j;
        }
        while (i6 < i5) {
            char charAt3 = charSequence2.charAt(i6);
            char c2 = charAt3;
            if (charAt3 < 128 && j < j4) {
                long j6 = j;
                j = j6 + 1;
                C1053zzkg.zza(bArr2, j6, (byte) c2);
            } else if (c2 < 2048 && j <= j4 - 2) {
                long j7 = j;
                C1053zzkg.zza(bArr2, j7, (byte) (960 | (c2 >>> 6)));
                long j8 = j7 + 1;
                j = j8 + 1;
                C1053zzkg.zza(bArr2, j8, (byte) (128 | ('?' & c2)));
            } else if ((c2 < 55296 || 57343 < c2) && j <= j4 - 3) {
                long j9 = j;
                C1053zzkg.zza(bArr2, j9, (byte) (480 | (c2 >>> 12)));
                long j10 = j9 + 1;
                C1053zzkg.zza(bArr2, j10, (byte) (128 | (63 & (c2 >>> 6))));
                long j11 = j10 + 1;
                j = j11 + 1;
                C1053zzkg.zza(bArr2, j11, (byte) (128 | ('?' & c2)));
            } else if (j <= j4 - 4) {
                if (i6 + 1 != i5) {
                    i6++;
                    char charAt4 = charSequence2.charAt(i6);
                    char c3 = charAt4;
                    if (Character.isSurrogatePair(c2, charAt4)) {
                        int codePoint = Character.toCodePoint(c2, c3);
                        long j12 = j;
                        C1053zzkg.zza(bArr2, j12, (byte) (240 | (codePoint >>> 18)));
                        long j13 = j12 + 1;
                        C1053zzkg.zza(bArr2, j13, (byte) (128 | (63 & (codePoint >>> 12))));
                        long j14 = j13 + 1;
                        C1053zzkg.zza(bArr2, j14, (byte) (128 | (63 & (codePoint >>> 6))));
                        long j15 = j14 + 1;
                        j = j15 + 1;
                        C1053zzkg.zza(bArr2, j15, (byte) (128 | (63 & codePoint)));
                    }
                }
                Throwable th6 = th4;
                new C1059zzkm(i6 - 1, i5);
                throw th6;
            } else if (55296 > c2 || c2 > 57343 || (i6 + 1 != i5 && Character.isSurrogatePair(c2, charSequence2.charAt(i6 + 1)))) {
                Throwable th7 = th2;
                new StringBuilder(46);
                new ArrayIndexOutOfBoundsException(sb2.append("Failed writing ").append(c2).append(" at index ").append(j).toString());
                throw th7;
            } else {
                Throwable th8 = th3;
                new C1059zzkm(i6, i5);
                throw th8;
            }
            i6++;
        }
        return (int) j;
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        Throwable th;
        byte[] bArr2 = bArr;
        int i3 = i;
        long j2 = j;
        switch (i2) {
            case 0:
                return C1056zzkj.zzb(i3);
            case 1:
                return C1056zzkj.zzb(i3, C1053zzkg.zza(bArr2, j2));
            case 2:
                return C1056zzkj.zzb(i3, (int) C1053zzkg.zza(bArr2, j2), (int) C1053zzkg.zza(bArr2, j2 + 1));
            default:
                Throwable th2 = th;
                new AssertionError();
                throw th2;
        }
    }
}
