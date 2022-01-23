package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.util.Arrays;

final class zzgt extends zzgr {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzwj;
    private int zzwk;
    private int zzwl;
    private int zzwm;
    private int zzwn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzgt(byte[] bArr, int i, int i2, boolean z) {
        super((zzgu) null);
        int i3 = i;
        this.zzwn = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i3 + i2;
        this.pos = i3;
        this.zzwl = this.pos;
        this.zzwj = z;
    }

    public final int zzgi() throws IOException {
        if (zzgy()) {
            this.zzwm = 0;
            return 0;
        }
        this.zzwm = zzha();
        if ((this.zzwm >>> 3) != 0) {
            return this.zzwm;
        }
        throw zzic.zziu();
    }

    public final void zzs(int i) throws zzic {
        if (this.zzwm != i) {
            throw zzic.zziv();
        }
    }

    public final boolean zzt(int i) throws IOException {
        int i2;
        int i3 = i;
        switch (i3 & 7) {
            case 0:
                if (this.limit - this.pos >= 10) {
                    int i4 = 0;
                    while (i4 < 10) {
                        byte[] bArr = this.buffer;
                        int i5 = this.pos;
                        int i6 = i5 + 1;
                        this.pos = i6;
                        if (bArr[i5] < 0) {
                            i4++;
                        }
                    }
                    throw zzic.zzit();
                }
                int i7 = 0;
                while (i7 < 10) {
                    if (zzhf() < 0) {
                        i7++;
                    }
                }
                throw zzic.zzit();
                return true;
            case 1:
                zzx(8);
                return true;
            case 2:
                zzx(zzha());
                return true;
            case 3:
                do {
                    int zzgi = zzgi();
                    i2 = zzgi;
                    if (zzgi == 0 || !zzt(i2)) {
                        zzs(((i3 >>> 3) << 3) | 4);
                        return true;
                    }
                    int zzgi2 = zzgi();
                    i2 = zzgi2;
                    zzs(((i3 >>> 3) << 3) | 4);
                    return true;
                } while (!zzt(i2));
                zzs(((i3 >>> 3) << 3) | 4);
                return true;
            case 4:
                return false;
            case 5:
                zzx(4);
                return true;
            default:
                throw zzic.zziw();
        }
    }

    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzhd());
    }

    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzhc());
    }

    public final long zzgj() throws IOException {
        return zzhb();
    }

    public final long zzgk() throws IOException {
        return zzhb();
    }

    public final int zzgl() throws IOException {
        return zzha();
    }

    public final long zzgm() throws IOException {
        return zzhd();
    }

    public final int zzgn() throws IOException {
        return zzhc();
    }

    public final boolean zzgo() throws IOException {
        return zzhb() != 0;
    }

    public final String readString() throws IOException {
        String str;
        int zzha = zzha();
        int i = zzha;
        if (zzha > 0 && i <= this.limit - this.pos) {
            new String(this.buffer, this.pos, i, zzht.UTF_8);
            String str2 = str;
            this.pos += i;
            return str2;
        } else if (i == 0) {
            return "";
        } else {
            if (i < 0) {
                throw zzic.zzis();
            }
            throw zzic.zzir();
        }
    }

    public final String zzgp() throws IOException {
        int zzha = zzha();
        int i = zzha;
        if (zzha > 0 && i <= this.limit - this.pos) {
            String zzg = zzkt.zzg(this.buffer, this.pos, i);
            this.pos += i;
            return zzg;
        } else if (i == 0) {
            return "";
        } else {
            if (i <= 0) {
                throw zzic.zzis();
            }
            throw zzic.zzir();
        }
    }

    public final zzgf zzgq() throws IOException {
        byte[] bArr;
        int zzha = zzha();
        int i = zzha;
        if (zzha > 0 && i <= this.limit - this.pos) {
            zzgf zza = zzgf.zza(this.buffer, this.pos, i);
            this.pos += i;
            return zza;
        } else if (i == 0) {
            return zzgf.zzvv;
        } else {
            int i2 = i;
            if (i2 > 0 && i2 <= this.limit - this.pos) {
                int i3 = this.pos;
                this.pos += i2;
                bArr = Arrays.copyOfRange(this.buffer, i3, this.pos);
            } else if (i2 > 0) {
                throw zzic.zzir();
            } else if (i2 == 0) {
                bArr = zzht.EMPTY_BYTE_ARRAY;
            } else {
                throw zzic.zzis();
            }
            return zzgf.zzb(bArr);
        }
    }

    public final int zzgr() throws IOException {
        return zzha();
    }

    public final int zzgs() throws IOException {
        return zzha();
    }

    public final int zzgt() throws IOException {
        return zzhc();
    }

    public final long zzgu() throws IOException {
        return zzhd();
    }

    public final int zzgv() throws IOException {
        return zzw(zzha());
    }

    public final long zzgw() throws IOException {
        return zza(zzhb());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        if (r3[r7] < 0) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzha() throws java.io.IOException {
        /*
            r10 = this;
            r1 = r10
            r6 = r1
            int r6 = r6.pos
            r2 = r6
            r6 = r1
            int r6 = r6.limit
            r7 = r2
            if (r6 == r7) goto L_0x00bb
            r6 = r1
            byte[] r6 = r6.buffer
            r9 = r6
            r6 = r9
            r7 = r9
            r3 = r7
            r7 = r2
            int r2 = r2 + 1
            byte r6 = r6[r7]
            r9 = r6
            r6 = r9
            r7 = r9
            r4 = r7
            if (r6 < 0) goto L_0x0024
            r6 = r1
            r7 = r2
            r6.pos = r7
            r6 = r4
            r1 = r6
        L_0x0023:
            return r1
        L_0x0024:
            r6 = r1
            int r6 = r6.limit
            r7 = r2
            int r6 = r6 - r7
            r7 = 9
            if (r6 < r7) goto L_0x00bb
            r6 = r4
            r7 = r3
            r8 = r2
            int r2 = r2 + 1
            byte r7 = r7[r8]
            r8 = 7
            int r7 = r7 << 7
            r6 = r6 ^ r7
            r9 = r6
            r6 = r9
            r7 = r9
            r4 = r7
            if (r6 >= 0) goto L_0x004b
            r6 = r4
            r7 = -128(0xffffffffffffff80, float:NaN)
            r6 = r6 ^ -128(0xffffffffffffff80, float:NaN)
            r4 = r6
        L_0x0044:
            r6 = r1
            r7 = r2
            r6.pos = r7
            r6 = r4
            r1 = r6
            goto L_0x0023
        L_0x004b:
            r6 = r4
            r7 = r3
            r8 = r2
            int r2 = r2 + 1
            byte r7 = r7[r8]
            r8 = 14
            int r7 = r7 << 14
            r6 = r6 ^ r7
            r9 = r6
            r6 = r9
            r7 = r9
            r4 = r7
            if (r6 < 0) goto L_0x0064
            r6 = r4
            r7 = 16256(0x3f80, float:2.278E-41)
            r6 = r6 ^ 16256(0x3f80, float:2.278E-41)
            r4 = r6
            goto L_0x0044
        L_0x0064:
            r6 = r4
            r7 = r3
            r8 = r2
            int r2 = r2 + 1
            byte r7 = r7[r8]
            r8 = 21
            int r7 = r7 << 21
            r6 = r6 ^ r7
            r9 = r6
            r6 = r9
            r7 = r9
            r4 = r7
            if (r6 >= 0) goto L_0x007d
            r6 = r4
            r7 = -2080896(0xffffffffffe03f80, float:NaN)
            r6 = r6 ^ r7
            r4 = r6
            goto L_0x0044
        L_0x007d:
            r6 = r3
            r7 = r2
            int r2 = r2 + 1
            byte r6 = r6[r7]
            r5 = r6
            r6 = r4
            r7 = r5
            r8 = 28
            int r7 = r7 << 28
            r6 = r6 ^ r7
            r7 = 266354560(0xfe03f80, float:2.2112565E-29)
            r6 = r6 ^ r7
            r4 = r6
            r6 = r5
            if (r6 >= 0) goto L_0x0044
            r6 = r3
            r7 = r2
            int r2 = r2 + 1
            byte r6 = r6[r7]
            if (r6 >= 0) goto L_0x0044
            r6 = r3
            r7 = r2
            int r2 = r2 + 1
            byte r6 = r6[r7]
            if (r6 >= 0) goto L_0x0044
            r6 = r3
            r7 = r2
            int r2 = r2 + 1
            byte r6 = r6[r7]
            if (r6 >= 0) goto L_0x0044
            r6 = r3
            r7 = r2
            int r2 = r2 + 1
            byte r6 = r6[r7]
            if (r6 >= 0) goto L_0x0044
            r6 = r3
            r7 = r2
            int r2 = r2 + 1
            byte r6 = r6[r7]
            if (r6 >= 0) goto L_0x0044
        L_0x00bb:
            r6 = r1
            long r6 = r6.zzgx()
            int r6 = (int) r6
            r1 = r6
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzgt.zzha():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0125, code lost:
        if (((long) r2[r7]) < 0) goto L_0x0127;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long zzhb() throws java.io.IOException {
        /*
            r13 = this;
            r0 = r13
            r6 = r0
            int r6 = r6.pos
            r1 = r6
            r6 = r0
            int r6 = r6.limit
            r7 = r1
            if (r6 == r7) goto L_0x0127
            r6 = r0
            byte[] r6 = r6.buffer
            r11 = r6
            r6 = r11
            r7 = r11
            r2 = r7
            r7 = r1
            int r1 = r1 + 1
            byte r6 = r6[r7]
            r11 = r6
            r6 = r11
            r7 = r11
            r5 = r7
            if (r6 < 0) goto L_0x0025
            r6 = r0
            r7 = r1
            r6.pos = r7
            r6 = r5
            long r6 = (long) r6
            r0 = r6
        L_0x0024:
            return r0
        L_0x0025:
            r6 = r0
            int r6 = r6.limit
            r7 = r1
            int r6 = r6 - r7
            r7 = 9
            if (r6 < r7) goto L_0x0127
            r6 = r5
            r7 = r2
            r8 = r1
            int r1 = r1 + 1
            byte r7 = r7[r8]
            r8 = 7
            int r7 = r7 << 7
            r6 = r6 ^ r7
            r11 = r6
            r6 = r11
            r7 = r11
            r5 = r7
            if (r6 >= 0) goto L_0x004d
            r6 = r5
            r7 = -128(0xffffffffffffff80, float:NaN)
            r6 = r6 ^ -128(0xffffffffffffff80, float:NaN)
            long r6 = (long) r6
            r3 = r6
        L_0x0046:
            r6 = r0
            r7 = r1
            r6.pos = r7
            r6 = r3
            r0 = r6
            goto L_0x0024
        L_0x004d:
            r6 = r5
            r7 = r2
            r8 = r1
            int r1 = r1 + 1
            byte r7 = r7[r8]
            r8 = 14
            int r7 = r7 << 14
            r6 = r6 ^ r7
            r11 = r6
            r6 = r11
            r7 = r11
            r5 = r7
            if (r6 < 0) goto L_0x0067
            r6 = r5
            r7 = 16256(0x3f80, float:2.278E-41)
            r6 = r6 ^ 16256(0x3f80, float:2.278E-41)
            long r6 = (long) r6
            r3 = r6
            goto L_0x0046
        L_0x0067:
            r6 = r5
            r7 = r2
            r8 = r1
            int r1 = r1 + 1
            byte r7 = r7[r8]
            r8 = 21
            int r7 = r7 << 21
            r6 = r6 ^ r7
            r11 = r6
            r6 = r11
            r7 = r11
            r5 = r7
            if (r6 >= 0) goto L_0x0081
            r6 = r5
            r7 = -2080896(0xffffffffffe03f80, float:NaN)
            r6 = r6 ^ r7
            long r6 = (long) r6
            r3 = r6
            goto L_0x0046
        L_0x0081:
            r6 = r5
            long r6 = (long) r6
            r8 = r2
            r9 = r1
            int r1 = r1 + 1
            byte r8 = r8[r9]
            long r8 = (long) r8
            r10 = 28
            long r8 = r8 << r10
            long r6 = r6 ^ r8
            r11 = r6
            r6 = r11
            r8 = r11
            r3 = r8
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x009f
            r6 = r3
            r8 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r6 = r6 ^ r8
            r3 = r6
            goto L_0x0046
        L_0x009f:
            r6 = r3
            r8 = r2
            r9 = r1
            int r1 = r1 + 1
            byte r8 = r8[r9]
            long r8 = (long) r8
            r10 = 35
            long r8 = r8 << r10
            long r6 = r6 ^ r8
            r11 = r6
            r6 = r11
            r8 = r11
            r3 = r8
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x00be
            r6 = r3
            r8 = -34093383808(0xfffffff80fe03f80, double:NaN)
            long r6 = r6 ^ r8
            r3 = r6
            goto L_0x0046
        L_0x00be:
            r6 = r3
            r8 = r2
            r9 = r1
            int r1 = r1 + 1
            byte r8 = r8[r9]
            long r8 = (long) r8
            r10 = 42
            long r8 = r8 << r10
            long r6 = r6 ^ r8
            r11 = r6
            r6 = r11
            r8 = r11
            r3 = r8
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x00de
            r6 = r3
            r8 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            long r6 = r6 ^ r8
            r3 = r6
            goto L_0x0046
        L_0x00de:
            r6 = r3
            r8 = r2
            r9 = r1
            int r1 = r1 + 1
            byte r8 = r8[r9]
            long r8 = (long) r8
            r10 = 49
            long r8 = r8 << r10
            long r6 = r6 ^ r8
            r11 = r6
            r6 = r11
            r8 = r11
            r3 = r8
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x00fe
            r6 = r3
            r8 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            long r6 = r6 ^ r8
            r3 = r6
            goto L_0x0046
        L_0x00fe:
            r6 = r3
            r8 = r2
            r9 = r1
            int r1 = r1 + 1
            byte r8 = r8[r9]
            long r8 = (long) r8
            r10 = 56
            long r8 = r8 << r10
            long r6 = r6 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r6 = r6 ^ r8
            r11 = r6
            r6 = r11
            r8 = r11
            r3 = r8
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0046
            r6 = r2
            r7 = r1
            int r1 = r1 + 1
            byte r6 = r6[r7]
            long r6 = (long) r6
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0046
        L_0x0127:
            r6 = r0
            long r6 = r6.zzgx()
            r0 = r6
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzgt.zzhb():long");
    }

    /* access modifiers changed from: package-private */
    public final long zzgx() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzhf = zzhf();
            j |= ((long) (zzhf & Byte.MAX_VALUE)) << i;
            if ((zzhf & 128) == 0) {
                return j;
            }
        }
        throw zzic.zzit();
    }

    private final int zzhc() throws IOException {
        int i = this.pos;
        if (this.limit - i < 4) {
            throw zzic.zzir();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    private final long zzhd() throws IOException {
        int i = this.pos;
        if (this.limit - i < 8) {
            throw zzic.zzir();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int zzu(int i) throws zzic {
        int i2 = i;
        if (i2 < 0) {
            throw zzic.zzis();
        }
        int zzgz = i2 + zzgz();
        int i3 = this.zzwn;
        if (zzgz > i3) {
            throw zzic.zzir();
        }
        this.zzwn = zzgz;
        zzhe();
        return i3;
    }

    private final void zzhe() {
        this.limit += this.zzwk;
        int i = this.limit - this.zzwl;
        int i2 = i;
        if (i > this.zzwn) {
            this.zzwk = i2 - this.zzwn;
            this.limit -= this.zzwk;
            return;
        }
        this.zzwk = 0;
    }

    public final void zzv(int i) {
        this.zzwn = i;
        zzhe();
    }

    public final boolean zzgy() throws IOException {
        return this.pos == this.limit;
    }

    public final int zzgz() {
        return this.pos - this.zzwl;
    }

    private final byte zzhf() throws IOException {
        if (this.pos == this.limit) {
            throw zzic.zzir();
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        int i2 = i + 1;
        this.pos = i2;
        return bArr[i];
    }

    private final void zzx(int i) throws IOException {
        int i2 = i;
        if (i2 >= 0 && i2 <= this.limit - this.pos) {
            this.pos += i2;
        } else if (i2 < 0) {
            throw zzic.zzis();
        } else {
            throw zzic.zzir();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzgt(byte[] bArr, int i, int i2, boolean z, zzgu zzgu) {
        this(bArr, i, i2, z);
        zzgu zzgu2 = zzgu;
    }
}
