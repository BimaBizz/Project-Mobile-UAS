package com.google.android.gms.internal.auth;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzfe<K, V> extends zzev<K, V> {
    static final zzev<Object, Object> zza;
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v17, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v30, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v33, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v44, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v72, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v95, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v13, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v100, resolved type: short[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x011d, code lost:
        r10[r15] = (byte) r12;
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01d0, code lost:
        r10[r15] = (short) r12;
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0272, code lost:
        r10[r15] = r12;
        r11 = r11 + 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> com.google.android.gms.internal.auth.zzfe<K, V> zza(int r23, java.lang.Object[] r24) {
        /*
            r2 = r23
            r3 = r24
            r17 = r2
            if (r17 != 0) goto L_0x000f
            com.google.android.gms.internal.auth.zzev<java.lang.Object, java.lang.Object> r17 = zza
            com.google.android.gms.internal.auth.zzfe r17 = (com.google.android.gms.internal.auth.zzfe) r17
            r2 = r17
        L_0x000e:
            return r2
        L_0x000f:
            r17 = r2
            r18 = 1
            r0 = r17
            r1 = r18
            if (r0 != r1) goto L_0x003c
            r17 = r3
            r18 = 0
            r17 = r17[r18]
            r18 = r3
            r19 = 1
            r18 = r18[r19]
            com.google.android.gms.internal.auth.zzec.zza(r17, r18)
            com.google.android.gms.internal.auth.zzfe r17 = new com.google.android.gms.internal.auth.zzfe
            r22 = r17
            r17 = r22
            r18 = r22
            r19 = 0
            r20 = r3
            r21 = 1
            r18.<init>(r19, r20, r21)
            r2 = r17
            goto L_0x000e
        L_0x003c:
            r17 = r2
            r18 = r3
            r0 = r18
            int r0 = r0.length
            r18 = r0
            r19 = 1
            int r18 = r18 >> 1
            int r17 = com.google.android.gms.internal.auth.zzdq.zzb((int) r17, (int) r18)
            r17 = r2
            int r17 = com.google.android.gms.internal.auth.zzez.zza(r17)
            r4 = r17
            r17 = r3
            r18 = r2
            r19 = r4
            r8 = r19
            r7 = r18
            r6 = r17
            r17 = r7
            r18 = 1
            r0 = r17
            r1 = r18
            if (r0 != r1) goto L_0x0093
            r17 = r6
            r18 = 0
            r17 = r17[r18]
            r18 = r6
            r19 = 1
            r18 = r18[r19]
            com.google.android.gms.internal.auth.zzec.zza(r17, r18)
            r17 = 0
        L_0x007c:
            r5 = r17
            com.google.android.gms.internal.auth.zzfe r17 = new com.google.android.gms.internal.auth.zzfe
            r22 = r17
            r17 = r22
            r18 = r22
            r19 = r5
            r20 = r3
            r21 = r2
            r18.<init>(r19, r20, r21)
            r2 = r17
            goto L_0x000e
        L_0x0093:
            r17 = r8
            r18 = 1
            int r17 = r17 + -1
            r9 = r17
            r17 = r8
            r18 = 128(0x80, float:1.794E-43)
            r0 = r17
            r1 = r18
            if (r0 > r1) goto L_0x014f
            r17 = r8
            r0 = r17
            byte[] r0 = new byte[r0]
            r17 = r0
            r22 = r17
            r17 = r22
            r18 = r22
            r10 = r18
            r18 = -1
            java.util.Arrays.fill(r17, r18)
            r17 = 0
            r11 = r17
        L_0x00be:
            r17 = r11
            r18 = r7
            r0 = r17
            r1 = r18
            if (r0 >= r1) goto L_0x014b
            r17 = 2
            r18 = r11
            int r17 = r17 * r18
            r12 = r17
            r17 = r6
            r18 = r12
            r17 = r17[r18]
            r13 = r17
            r17 = r6
            r18 = r12
            r19 = 1
            r18 = r18 ^ 1
            r17 = r17[r18]
            r14 = r17
            r17 = r13
            r18 = r14
            com.google.android.gms.internal.auth.zzec.zza(r17, r18)
            r17 = r13
            int r17 = r17.hashCode()
            int r17 = com.google.android.gms.internal.auth.zzeo.zza((int) r17)
            r15 = r17
        L_0x00f7:
            r17 = r15
            r18 = r9
            r17 = r17 & r18
            r15 = r17
            r17 = r10
            r18 = r15
            byte r17 = r17[r18]
            r18 = 255(0xff, float:3.57E-43)
            r0 = r17
            r0 = r0 & 255(0xff, float:3.57E-43)
            r17 = r0
            r22 = r17
            r17 = r22
            r18 = r22
            r16 = r18
            r18 = 255(0xff, float:3.57E-43)
            r0 = r17
            r1 = r18
            if (r0 != r1) goto L_0x012d
            r17 = r10
            r18 = r15
            r19 = r12
            r0 = r19
            byte r0 = (byte) r0
            r19 = r0
            r17[r18] = r19
            int r11 = r11 + 1
            goto L_0x00be
        L_0x012d:
            r17 = r6
            r18 = r16
            r17 = r17[r18]
            r18 = r13
            boolean r17 = r17.equals(r18)
            if (r17 == 0) goto L_0x0148
            r17 = r13
            r18 = r14
            r19 = r6
            r20 = r16
            java.lang.IllegalArgumentException r17 = zza(r17, r18, r19, r20)
            throw r17
        L_0x0148:
            int r15 = r15 + 1
            goto L_0x00f7
        L_0x014b:
            r17 = r10
            goto L_0x007c
        L_0x014f:
            r17 = r8
            r18 = 32768(0x8000, float:4.5918E-41)
            r0 = r17
            r1 = r18
            if (r0 > r1) goto L_0x0202
            r17 = r8
            r0 = r17
            short[] r0 = new short[r0]
            r17 = r0
            r22 = r17
            r17 = r22
            r18 = r22
            r10 = r18
            r18 = -1
            java.util.Arrays.fill(r17, r18)
            r17 = 0
            r11 = r17
        L_0x0173:
            r17 = r11
            r18 = r7
            r0 = r17
            r1 = r18
            if (r0 >= r1) goto L_0x01fe
            r17 = 2
            r18 = r11
            int r17 = r17 * r18
            r12 = r17
            r17 = r6
            r18 = r12
            r17 = r17[r18]
            r13 = r17
            r17 = r6
            r18 = r12
            r19 = 1
            r18 = r18 ^ 1
            r17 = r17[r18]
            r14 = r17
            r17 = r13
            r18 = r14
            com.google.android.gms.internal.auth.zzec.zza(r17, r18)
            r17 = r13
            int r17 = r17.hashCode()
            int r17 = com.google.android.gms.internal.auth.zzeo.zza((int) r17)
            r15 = r17
        L_0x01ac:
            r17 = r15
            r18 = r9
            r17 = r17 & r18
            r15 = r17
            r17 = r10
            r18 = r15
            short r17 = r17[r18]
            r18 = 65535(0xffff, float:9.1834E-41)
            r17 = r17 & r18
            r22 = r17
            r17 = r22
            r18 = r22
            r16 = r18
            r18 = 65535(0xffff, float:9.1834E-41)
            r0 = r17
            r1 = r18
            if (r0 != r1) goto L_0x01e0
            r17 = r10
            r18 = r15
            r19 = r12
            r0 = r19
            short r0 = (short) r0
            r19 = r0
            r17[r18] = r19
            int r11 = r11 + 1
            goto L_0x0173
        L_0x01e0:
            r17 = r6
            r18 = r16
            r17 = r17[r18]
            r18 = r13
            boolean r17 = r17.equals(r18)
            if (r17 == 0) goto L_0x01fb
            r17 = r13
            r18 = r14
            r19 = r6
            r20 = r16
            java.lang.IllegalArgumentException r17 = zza(r17, r18, r19, r20)
            throw r17
        L_0x01fb:
            int r15 = r15 + 1
            goto L_0x01ac
        L_0x01fe:
            r17 = r10
            goto L_0x007c
        L_0x0202:
            r17 = r8
            r0 = r17
            int[] r0 = new int[r0]
            r17 = r0
            r22 = r17
            r17 = r22
            r18 = r22
            r10 = r18
            r18 = -1
            java.util.Arrays.fill(r17, r18)
            r17 = 0
            r11 = r17
        L_0x021b:
            r17 = r11
            r18 = r7
            r0 = r17
            r1 = r18
            if (r0 >= r1) goto L_0x029b
            r17 = 2
            r18 = r11
            int r17 = r17 * r18
            r12 = r17
            r17 = r6
            r18 = r12
            r17 = r17[r18]
            r13 = r17
            r17 = r6
            r18 = r12
            r19 = 1
            r18 = r18 ^ 1
            r17 = r17[r18]
            r14 = r17
            r17 = r13
            r18 = r14
            com.google.android.gms.internal.auth.zzec.zza(r17, r18)
            r17 = r13
            int r17 = r17.hashCode()
            int r17 = com.google.android.gms.internal.auth.zzeo.zza((int) r17)
            r15 = r17
        L_0x0254:
            r17 = r15
            r18 = r9
            r17 = r17 & r18
            r15 = r17
            r17 = r10
            r18 = r15
            r17 = r17[r18]
            r22 = r17
            r17 = r22
            r18 = r22
            r16 = r18
            r18 = -1
            r0 = r17
            r1 = r18
            if (r0 != r1) goto L_0x027d
            r17 = r10
            r18 = r15
            r19 = r12
            r17[r18] = r19
            int r11 = r11 + 1
            goto L_0x021b
        L_0x027d:
            r17 = r6
            r18 = r16
            r17 = r17[r18]
            r18 = r13
            boolean r17 = r17.equals(r18)
            if (r17 == 0) goto L_0x0298
            r17 = r13
            r18 = r14
            r19 = r6
            r20 = r16
            java.lang.IllegalArgumentException r17 = zza(r17, r18, r19, r20)
            throw r17
        L_0x0298:
            int r15 = r15 + 1
            goto L_0x0254
        L_0x029b:
            r17 = r10
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfe.zza(int, java.lang.Object[]):com.google.android.gms.internal.auth.zzfe");
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

    private zzfe(Object obj, Object[] objArr, int i) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i;
    }

    public final int size() {
        return this.zzd;
    }

    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.zzb;
        V[] vArr = this.zzc;
        Object obj3 = obj;
        int i = this.zzd;
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
                int zza2 = zzeo.zza(obj3.hashCode());
                while (true) {
                    int i2 = zza2 & length;
                    byte b = bArr2[i2] & 255;
                    byte b2 = b;
                    if (b == 255) {
                        return null;
                    }
                    if (vArr2[b2].equals(obj3)) {
                        return vArr2[b2 ^ 1];
                    }
                    zza2 = i2 + 1;
                }
            } else if (obj4 instanceof short[]) {
                short[] sArr = (short[]) obj4;
                short[] sArr2 = sArr;
                int length2 = sArr.length - 1;
                int zza3 = zzeo.zza(obj3.hashCode());
                while (true) {
                    int i3 = zza3 & length2;
                    short s = sArr2[i3] & 65535;
                    short s2 = s;
                    if (s == 65535) {
                        return null;
                    }
                    if (vArr2[s2].equals(obj3)) {
                        return vArr2[s2 ^ 1];
                    }
                    zza3 = i3 + 1;
                }
            } else {
                int[] iArr = (int[]) obj4;
                int[] iArr2 = iArr;
                int length3 = iArr.length - 1;
                int zza4 = zzeo.zza(obj3.hashCode());
                while (true) {
                    int i4 = zza4 & length3;
                    int i5 = iArr2[i4];
                    int i6 = i5;
                    if (i5 == -1) {
                        return null;
                    }
                    if (vArr2[i6].equals(obj3)) {
                        return vArr2[i6 ^ 1];
                    }
                    zza4 = i4 + 1;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzez<Map.Entry<K, V>> zza() {
        zzez<Map.Entry<K, V>> zzez;
        new zzfh(this, this.zzc, 0, this.zzd);
        return zzez;
    }

    /* access modifiers changed from: package-private */
    public final zzez<K> zzb() {
        zzeq zzeq;
        zzez<K> zzez;
        new zzfi(this.zzc, 0, this.zzd);
        new zzfj(this, zzeq);
        return zzez;
    }

    /* access modifiers changed from: package-private */
    public final zzer<V> zzc() {
        zzer<V> zzer;
        new zzfi(this.zzc, 1, this.zzd);
        return zzer;
    }

    static {
        zzev<Object, Object> zzev;
        new zzfe((Object) null, new Object[0], 0);
        zza = zzev;
    }
}
