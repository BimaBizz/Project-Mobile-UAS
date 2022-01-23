package com.google.android.gms.internal.firebase_auth;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzbe<K, V> extends zzaz<K, V> {
    private static final zzaz<Object, Object> zzhh;
    private final transient int size;
    private final transient Object[] zzhf;
    private final transient Object zzhi;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v21, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v34, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v37, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v48, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v71, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v79, resolved type: byte[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00f6, code lost:
        r11[r16] = (byte) r13;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01d6, code lost:
        r11[r16] = (short) r13;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0278, code lost:
        r11[r16] = r13;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> com.google.android.gms.internal.firebase_auth.zzbe<K, V> zza(int r24, java.lang.Object[] r25) {
        /*
            r3 = r24
            r4 = r25
            r18 = 4
            r19 = r4
            r0 = r19
            int r0 = r0.length
            r19 = r0
            r20 = 1
            int r19 = r19 >> 1
            int r18 = com.google.android.gms.internal.firebase_auth.zzaj.zzb(r18, r19)
            r18 = 4
            r19 = 2
            int r18 = java.lang.Math.max(r18, r19)
            r23 = r18
            r18 = r23
            r19 = r23
            r7 = r19
            r19 = 751619276(0x2ccccccc, float:5.8207657E-12)
            r0 = r18
            r1 = r19
            if (r0 >= r1) goto L_0x0106
            r18 = r7
            r19 = 1
            int r18 = r18 + -1
            int r18 = java.lang.Integer.highestOneBit(r18)
            r19 = 1
            int r18 = r18 << 1
            r8 = r18
        L_0x003e:
            r18 = r8
            r0 = r18
            double r0 = (double) r0
            r18 = r0
            r20 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r18 = r18 * r20
            r20 = r7
            r0 = r20
            double r0 = (double) r0
            r20 = r0
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L_0x0060
            r18 = r8
            r19 = 1
            int r18 = r18 << 1
            r8 = r18
            goto L_0x003e
        L_0x0060:
            r18 = r8
        L_0x0062:
            r5 = r18
            r18 = r4
            r19 = r5
            r9 = r19
            r7 = r18
            r18 = r9
            r19 = 1
            int r18 = r18 + -1
            r10 = r18
            r18 = r9
            r19 = 128(0x80, float:1.794E-43)
            r0 = r18
            r1 = r19
            if (r0 > r1) goto L_0x0155
            r18 = r9
            r0 = r18
            byte[] r0 = new byte[r0]
            r18 = r0
            r23 = r18
            r18 = r23
            r19 = r23
            r11 = r19
            r19 = -1
            java.util.Arrays.fill(r18, r19)
            r18 = 0
            r12 = r18
        L_0x0097:
            r18 = r12
            r19 = 4
            r0 = r18
            r1 = r19
            if (r0 >= r1) goto L_0x013d
            r18 = 2
            r19 = r12
            int r18 = r18 * r19
            r13 = r18
            r18 = r7
            r19 = r13
            r18 = r18[r19]
            r14 = r18
            r18 = r7
            r19 = r13
            r20 = 1
            r19 = r19 ^ 1
            r18 = r18[r19]
            r15 = r18
            r18 = r14
            r19 = r15
            com.google.android.gms.internal.firebase_auth.zzat.zza(r18, r19)
            r18 = r14
            int r18 = r18.hashCode()
            int r18 = com.google.android.gms.internal.firebase_auth.zzaw.zzg(r18)
            r16 = r18
        L_0x00d0:
            r18 = r16
            r19 = r10
            r18 = r18 & r19
            r16 = r18
            r18 = r11
            r19 = r16
            byte r18 = r18[r19]
            r19 = 255(0xff, float:3.57E-43)
            r0 = r18
            r0 = r0 & 255(0xff, float:3.57E-43)
            r18 = r0
            r23 = r18
            r18 = r23
            r19 = r23
            r17 = r19
            r19 = 255(0xff, float:3.57E-43)
            r0 = r18
            r1 = r19
            if (r0 != r1) goto L_0x011f
            r18 = r11
            r19 = r16
            r20 = r13
            r0 = r20
            byte r0 = (byte) r0
            r20 = r0
            r18[r19] = r20
            int r12 = r12 + 1
            goto L_0x0097
        L_0x0106:
            r18 = r7
            r19 = 1073741824(0x40000000, float:2.0)
            r0 = r18
            r1 = r19
            if (r0 >= r1) goto L_0x011c
            r18 = 1
        L_0x0112:
            java.lang.String r19 = "collection too large"
            com.google.android.gms.internal.firebase_auth.zzaj.checkArgument(r18, r19)
            r18 = 1073741824(0x40000000, float:2.0)
            goto L_0x0062
        L_0x011c:
            r18 = 0
            goto L_0x0112
        L_0x011f:
            r18 = r7
            r19 = r17
            r18 = r18[r19]
            r19 = r14
            boolean r18 = r18.equals(r19)
            if (r18 == 0) goto L_0x013a
            r18 = r14
            r19 = r15
            r20 = r7
            r21 = r17
            java.lang.IllegalArgumentException r18 = zza(r18, r19, r20, r21)
            throw r18
        L_0x013a:
            int r16 = r16 + 1
            goto L_0x00d0
        L_0x013d:
            r18 = r11
        L_0x013f:
            r6 = r18
            com.google.android.gms.internal.firebase_auth.zzbe r18 = new com.google.android.gms.internal.firebase_auth.zzbe
            r23 = r18
            r18 = r23
            r19 = r23
            r20 = r6
            r21 = r4
            r22 = 4
            r19.<init>(r20, r21, r22)
            r3 = r18
            return r3
        L_0x0155:
            r18 = r9
            r19 = 32768(0x8000, float:4.5918E-41)
            r0 = r18
            r1 = r19
            if (r0 > r1) goto L_0x0208
            r18 = r9
            r0 = r18
            short[] r0 = new short[r0]
            r18 = r0
            r23 = r18
            r18 = r23
            r19 = r23
            r11 = r19
            r19 = -1
            java.util.Arrays.fill(r18, r19)
            r18 = 0
            r12 = r18
        L_0x0179:
            r18 = r12
            r19 = 4
            r0 = r18
            r1 = r19
            if (r0 >= r1) goto L_0x0204
            r18 = 2
            r19 = r12
            int r18 = r18 * r19
            r13 = r18
            r18 = r7
            r19 = r13
            r18 = r18[r19]
            r14 = r18
            r18 = r7
            r19 = r13
            r20 = 1
            r19 = r19 ^ 1
            r18 = r18[r19]
            r15 = r18
            r18 = r14
            r19 = r15
            com.google.android.gms.internal.firebase_auth.zzat.zza(r18, r19)
            r18 = r14
            int r18 = r18.hashCode()
            int r18 = com.google.android.gms.internal.firebase_auth.zzaw.zzg(r18)
            r16 = r18
        L_0x01b2:
            r18 = r16
            r19 = r10
            r18 = r18 & r19
            r16 = r18
            r18 = r11
            r19 = r16
            short r18 = r18[r19]
            r19 = 65535(0xffff, float:9.1834E-41)
            r18 = r18 & r19
            r23 = r18
            r18 = r23
            r19 = r23
            r17 = r19
            r19 = 65535(0xffff, float:9.1834E-41)
            r0 = r18
            r1 = r19
            if (r0 != r1) goto L_0x01e6
            r18 = r11
            r19 = r16
            r20 = r13
            r0 = r20
            short r0 = (short) r0
            r20 = r0
            r18[r19] = r20
            int r12 = r12 + 1
            goto L_0x0179
        L_0x01e6:
            r18 = r7
            r19 = r17
            r18 = r18[r19]
            r19 = r14
            boolean r18 = r18.equals(r19)
            if (r18 == 0) goto L_0x0201
            r18 = r14
            r19 = r15
            r20 = r7
            r21 = r17
            java.lang.IllegalArgumentException r18 = zza(r18, r19, r20, r21)
            throw r18
        L_0x0201:
            int r16 = r16 + 1
            goto L_0x01b2
        L_0x0204:
            r18 = r11
            goto L_0x013f
        L_0x0208:
            r18 = r9
            r0 = r18
            int[] r0 = new int[r0]
            r18 = r0
            r23 = r18
            r18 = r23
            r19 = r23
            r11 = r19
            r19 = -1
            java.util.Arrays.fill(r18, r19)
            r18 = 0
            r12 = r18
        L_0x0221:
            r18 = r12
            r19 = 4
            r0 = r18
            r1 = r19
            if (r0 >= r1) goto L_0x02a1
            r18 = 2
            r19 = r12
            int r18 = r18 * r19
            r13 = r18
            r18 = r7
            r19 = r13
            r18 = r18[r19]
            r14 = r18
            r18 = r7
            r19 = r13
            r20 = 1
            r19 = r19 ^ 1
            r18 = r18[r19]
            r15 = r18
            r18 = r14
            r19 = r15
            com.google.android.gms.internal.firebase_auth.zzat.zza(r18, r19)
            r18 = r14
            int r18 = r18.hashCode()
            int r18 = com.google.android.gms.internal.firebase_auth.zzaw.zzg(r18)
            r16 = r18
        L_0x025a:
            r18 = r16
            r19 = r10
            r18 = r18 & r19
            r16 = r18
            r18 = r11
            r19 = r16
            r18 = r18[r19]
            r23 = r18
            r18 = r23
            r19 = r23
            r17 = r19
            r19 = -1
            r0 = r18
            r1 = r19
            if (r0 != r1) goto L_0x0283
            r18 = r11
            r19 = r16
            r20 = r13
            r18[r19] = r20
            int r12 = r12 + 1
            goto L_0x0221
        L_0x0283:
            r18 = r7
            r19 = r17
            r18 = r18[r19]
            r19 = r14
            boolean r18 = r18.equals(r19)
            if (r18 == 0) goto L_0x029e
            r18 = r14
            r19 = r15
            r20 = r7
            r21 = r17
            java.lang.IllegalArgumentException r18 = zza(r18, r19, r20, r21)
            throw r18
        L_0x029e:
            int r16 = r16 + 1
            goto L_0x025a
        L_0x02a1:
            r18 = r11
            goto L_0x013f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzbe.zza(int, java.lang.Object[]):com.google.android.gms.internal.firebase_auth.zzbe");
    }

    private static IllegalArgumentException zza(Object obj, Object obj2, Object[] objArr, int i) {
        IllegalArgumentException illegalArgumentException;
        StringBuilder sb;
        Object[] objArr2 = objArr;
        int i2 = i;
        IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr2[i2]);
        String valueOf4 = String.valueOf(objArr2[i2 ^ 1]);
        new StringBuilder(39 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        new IllegalArgumentException(sb.append("Multiple entries with same key: ").append(valueOf).append("=").append(valueOf2).append(" and ").append(valueOf3).append("=").append(valueOf4).toString());
        return illegalArgumentException2;
    }

    private zzbe(Object obj, Object[] objArr, int i) {
        this.zzhi = obj;
        this.zzhf = objArr;
        this.size = i;
    }

    public final int size() {
        return this.size;
    }

    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.zzhi;
        V[] vArr = this.zzhf;
        Object obj3 = obj;
        int i = this.size;
        V[] vArr2 = vArr;
        Object obj4 = obj2;
        if (obj3 == null) {
            return null;
        }
        if (i == 1) {
            if (vArr2[0].equals(obj3)) {
                return vArr2[1];
            }
            return null;
        } else if (obj4 == null) {
            return null;
        } else {
            if (obj4 instanceof byte[]) {
                byte[] bArr = (byte[]) obj4;
                byte[] bArr2 = bArr;
                int length = bArr.length - 1;
                int zzg = zzaw.zzg(obj3.hashCode());
                while (true) {
                    int i2 = zzg & length;
                    byte b = bArr2[i2] & 255;
                    byte b2 = b;
                    if (b == 255) {
                        return null;
                    }
                    if (vArr2[b2].equals(obj3)) {
                        return vArr2[b2 ^ 1];
                    }
                    zzg = i2 + 1;
                }
            } else if (obj4 instanceof short[]) {
                short[] sArr = (short[]) obj4;
                short[] sArr2 = sArr;
                int length2 = sArr.length - 1;
                int zzg2 = zzaw.zzg(obj3.hashCode());
                while (true) {
                    int i3 = zzg2 & length2;
                    short s = sArr2[i3] & 65535;
                    short s2 = s;
                    if (s == 65535) {
                        return null;
                    }
                    if (vArr2[s2].equals(obj3)) {
                        return vArr2[s2 ^ 1];
                    }
                    zzg2 = i3 + 1;
                }
            } else {
                int[] iArr = (int[]) obj4;
                int[] iArr2 = iArr;
                int length3 = iArr.length - 1;
                int zzg3 = zzaw.zzg(obj3.hashCode());
                while (true) {
                    int i4 = zzg3 & length3;
                    int i5 = iArr2[i4];
                    int i6 = i5;
                    if (i5 == -1) {
                        return null;
                    }
                    if (vArr2[i6].equals(obj3)) {
                        return vArr2[i6 ^ 1];
                    }
                    zzg3 = i4 + 1;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzbc<Map.Entry<K, V>> zzcf() {
        zzbc<Map.Entry<K, V>> zzbc;
        new zzbd(this, this.zzhf, 0, this.size);
        return zzbc;
    }

    /* access modifiers changed from: package-private */
    public final zzbc<K> zzcg() {
        zzay zzay;
        zzbc<K> zzbc;
        new zzbi(this.zzhf, 0, this.size);
        new zzbf(this, zzay);
        return zzbc;
    }

    /* access modifiers changed from: package-private */
    public final zzav<V> zzch() {
        zzav<V> zzav;
        new zzbi(this.zzhf, 1, this.size);
        return zzav;
    }

    static {
        zzaz<Object, Object> zzaz;
        new zzbe((Object) null, new Object[0], 0);
        zzhh = zzaz;
    }
}
