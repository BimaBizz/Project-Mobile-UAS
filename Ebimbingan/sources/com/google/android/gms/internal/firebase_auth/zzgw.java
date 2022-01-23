package com.google.android.gms.internal.firebase_auth;

import com.google.appinventor.components.runtime.util.Ev3Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

final class zzgw extends zzgr {
    private final byte[] buffer;
    private int pos;
    private int zzwk;
    private int zzwm;
    private int zzwn;
    private final InputStream zzwo;
    private int zzwp;
    private int zzwq;
    private zzgv zzwr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzgw(InputStream inputStream, int i) {
        super((zzgu) null);
        InputStream inputStream2 = inputStream;
        this.zzwn = Integer.MAX_VALUE;
        this.zzwr = null;
        Object zza = zzht.zza(inputStream2, "input");
        this.zzwo = inputStream2;
        this.buffer = new byte[i];
        this.zzwp = 0;
        this.pos = 0;
        this.zzwq = 0;
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
                if (this.zzwp - this.pos >= 10) {
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
        String str2;
        String str3;
        int zzha = zzha();
        int i = zzha;
        if (zzha > 0 && i <= this.zzwp - this.pos) {
            new String(this.buffer, this.pos, i, zzht.UTF_8);
            String str4 = str3;
            this.pos += i;
            return str4;
        } else if (i == 0) {
            return "";
        } else {
            if (i <= this.zzwp) {
                zzy(i);
                new String(this.buffer, this.pos, i, zzht.UTF_8);
                String str5 = str2;
                this.pos += i;
                return str5;
            }
            new String(zzb(i, false), zzht.UTF_8);
            return str;
        }
    }

    public final String zzgp() throws IOException {
        byte[] zzb;
        int i;
        int zzha = zzha();
        int i2 = this.pos;
        if (zzha <= this.zzwp - i2 && zzha > 0) {
            zzb = this.buffer;
            this.pos = i2 + zzha;
            i = i2;
        } else if (zzha == 0) {
            return "";
        } else {
            if (zzha <= this.zzwp) {
                zzy(zzha);
                zzb = this.buffer;
                i = 0;
                this.pos = zzha;
            } else {
                zzb = zzb(zzha, false);
                i = 0;
            }
        }
        return zzkt.zzg(zzb, i, zzha);
    }

    public final zzgf zzgq() throws IOException {
        int zzha = zzha();
        int i = zzha;
        if (zzha <= this.zzwp - this.pos && i > 0) {
            zzgf zza = zzgf.zza(this.buffer, this.pos, i);
            this.pos += i;
            return zza;
        } else if (i == 0) {
            return zzgf.zzvv;
        } else {
            int i2 = i;
            byte[] zzaa = zzaa(i2);
            byte[] bArr = zzaa;
            if (zzaa != null) {
                return zzgf.zza(bArr);
            }
            int i3 = this.pos;
            int i4 = this.zzwp - this.pos;
            this.zzwq += this.zzwp;
            this.pos = 0;
            this.zzwp = 0;
            List<byte[]> zzab = zzab(i2 - i4);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(this.buffer, i3, bArr2, 0, i4);
            int i5 = i4;
            for (byte[] next : zzab) {
                byte[] bArr3 = next;
                System.arraycopy(next, 0, bArr2, i5, bArr3.length);
                i5 += bArr3.length;
            }
            return zzgf.zzb(bArr2);
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
            int r6 = r6.zzwp
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
            int r6 = r6.zzwp
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzgw.zzha():int");
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
            int r6 = r6.zzwp
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
            int r6 = r6.zzwp
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzgw.zzhb():long");
    }

    /* access modifiers changed from: package-private */
    public final long zzgx() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzhf = zzhf();
            j |= ((long) (zzhf & Ev3Constants.Opcode.MEMORY_READ)) << i;
            if ((zzhf & 128) == 0) {
                return j;
            }
        }
        throw zzic.zzit();
    }

    private final int zzhc() throws IOException {
        int i = this.pos;
        if (this.zzwp - i < 4) {
            zzy(4);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return (bArr[i] & Ev3Constants.Opcode.TST) | ((bArr[i + 1] & Ev3Constants.Opcode.TST) << 8) | ((bArr[i + 2] & Ev3Constants.Opcode.TST) << 16) | ((bArr[i + 3] & Ev3Constants.Opcode.TST) << 24);
    }

    private final long zzhd() throws IOException {
        int i = this.pos;
        if (this.zzwp - i < 8) {
            zzy(8);
            i = this.pos;
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
        int i3 = i2 + this.zzwq + this.pos;
        int i4 = this.zzwn;
        if (i3 > i4) {
            throw zzic.zzir();
        }
        this.zzwn = i3;
        zzhe();
        return i4;
    }

    private final void zzhe() {
        this.zzwp += this.zzwk;
        int i = this.zzwq + this.zzwp;
        int i2 = i;
        if (i > this.zzwn) {
            this.zzwk = i2 - this.zzwn;
            this.zzwp -= this.zzwk;
            return;
        }
        this.zzwk = 0;
    }

    public final void zzv(int i) {
        this.zzwn = i;
        zzhe();
    }

    public final boolean zzgy() throws IOException {
        return this.pos == this.zzwp && !zzz(1);
    }

    public final int zzgz() {
        return this.zzwq + this.pos;
    }

    private final void zzy(int i) throws IOException {
        int i2 = i;
        if (zzz(i2)) {
            return;
        }
        if (i2 > (this.zzwg - this.zzwq) - this.pos) {
            throw zzic.zzix();
        }
        throw zzic.zzir();
    }

    private final boolean zzz(int i) throws IOException {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        StringBuilder sb2;
        int i2 = i;
        while (this.pos + i2 > this.zzwp) {
            if (i2 > (this.zzwg - this.zzwq) - this.pos) {
                return false;
            }
            if (this.zzwq + this.pos + i2 > this.zzwn) {
                return false;
            }
            int i3 = this.pos;
            int i4 = i3;
            if (i3 > 0) {
                if (this.zzwp > i4) {
                    System.arraycopy(this.buffer, i4, this.buffer, 0, this.zzwp - i4);
                }
                this.zzwq += i4;
                this.zzwp -= i4;
                this.pos = 0;
            }
            int read = this.zzwo.read(this.buffer, this.zzwp, Math.min(this.buffer.length - this.zzwp, (this.zzwg - this.zzwq) - this.zzwp));
            int i5 = read;
            if (read == 0 || i5 < -1 || i5 > this.buffer.length) {
                Throwable th3 = th2;
                String valueOf = String.valueOf(this.zzwo.getClass());
                new StringBuilder(91 + String.valueOf(valueOf).length());
                new IllegalStateException(sb2.append(valueOf).append("#read(byte[]) returned invalid result: ").append(i5).append("\nThe InputStream implementation is buggy.").toString());
                throw th3;
            } else if (i5 <= 0) {
                return false;
            } else {
                this.zzwp += i5;
                zzhe();
                if (this.zzwp >= i2) {
                    return true;
                }
            }
        }
        Throwable th4 = th;
        new StringBuilder(77);
        new IllegalStateException(sb.append("refillBuffer() called when ").append(i2).append(" bytes were already available in buffer").toString());
        throw th4;
    }

    private final byte zzhf() throws IOException {
        if (this.pos == this.zzwp) {
            zzy(1);
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        int i2 = i + 1;
        this.pos = i2;
        return bArr[i];
    }

    private final byte[] zzb(int i, boolean z) throws IOException {
        int i2 = i;
        boolean z2 = z;
        byte[] zzaa = zzaa(i2);
        byte[] bArr = zzaa;
        if (zzaa != null) {
            return bArr;
        }
        int i3 = this.pos;
        int i4 = this.zzwp - this.pos;
        this.zzwq += this.zzwp;
        this.pos = 0;
        this.zzwp = 0;
        List<byte[]> zzab = zzab(i2 - i4);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(this.buffer, i3, bArr2, 0, i4);
        int i5 = i4;
        for (byte[] next : zzab) {
            byte[] bArr3 = next;
            System.arraycopy(next, 0, bArr2, i5, bArr3.length);
            i5 += bArr3.length;
        }
        return bArr2;
    }

    private final byte[] zzaa(int i) throws IOException {
        int i2 = i;
        if (i2 == 0) {
            return zzht.EMPTY_BYTE_ARRAY;
        }
        if (i2 < 0) {
            throw zzic.zzis();
        }
        int i3 = this.zzwq + this.pos + i2;
        int i4 = i3;
        if (i3 - this.zzwg > 0) {
            throw zzic.zzix();
        } else if (i4 > this.zzwn) {
            zzx((this.zzwn - this.zzwq) - this.pos);
            throw zzic.zzir();
        } else {
            int i5 = this.zzwp - this.pos;
            int i6 = i2 - i5;
            int i7 = i6;
            if (i6 >= 4096 && i7 > this.zzwo.available()) {
                return null;
            }
            byte[] bArr = new byte[i2];
            System.arraycopy(this.buffer, this.pos, bArr, 0, i5);
            this.zzwq += this.zzwp;
            this.pos = 0;
            this.zzwp = 0;
            int i8 = i5;
            while (true) {
                int i9 = i8;
                if (i9 >= bArr.length) {
                    return bArr;
                }
                int read = this.zzwo.read(bArr, i9, i2 - i9);
                int i10 = read;
                if (read == -1) {
                    throw zzic.zzir();
                }
                this.zzwq += i10;
                i8 = i9 + i10;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        r1 = r1 - r3.length;
        r6 = r2.add(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<byte[]> zzab(int r13) throws java.io.IOException {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            java.util.ArrayList r6 = new java.util.ArrayList
            r11 = r6
            r6 = r11
            r7 = r11
            r7.<init>()
            r2 = r6
        L_0x000b:
            r6 = r1
            if (r6 <= 0) goto L_0x0053
            r6 = r1
            r7 = 4096(0x1000, float:5.74E-42)
            int r6 = java.lang.Math.min(r6, r7)
            byte[] r6 = new byte[r6]
            r3 = r6
            r6 = 0
            r4 = r6
        L_0x001a:
            r6 = r4
            r7 = r3
            int r7 = r7.length
            if (r6 >= r7) goto L_0x0047
            r6 = r0
            java.io.InputStream r6 = r6.zzwo
            r7 = r3
            r8 = r4
            r9 = r3
            int r9 = r9.length
            r10 = r4
            int r9 = r9 - r10
            int r6 = r6.read(r7, r8, r9)
            r11 = r6
            r6 = r11
            r7 = r11
            r5 = r7
            r7 = -1
            if (r6 != r7) goto L_0x0038
            com.google.android.gms.internal.firebase_auth.zzic r6 = com.google.android.gms.internal.firebase_auth.zzic.zzir()
            throw r6
        L_0x0038:
            r6 = r0
            r11 = r6
            r6 = r11
            r7 = r11
            int r7 = r7.zzwq
            r8 = r5
            int r7 = r7 + r8
            r6.zzwq = r7
            r6 = r4
            r7 = r5
            int r6 = r6 + r7
            r4 = r6
            goto L_0x001a
        L_0x0047:
            r6 = r1
            r7 = r3
            int r7 = r7.length
            int r6 = r6 - r7
            r1 = r6
            r6 = r2
            r7 = r3
            boolean r6 = r6.add(r7)
            goto L_0x000b
        L_0x0053:
            r6 = r2
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzgw.zzab(int):java.util.List");
    }

    private final void zzx(int i) throws IOException {
        Throwable th;
        StringBuilder sb;
        int i2 = i;
        if (i2 > this.zzwp - this.pos || i2 < 0) {
            int i3 = i2;
            if (i3 < 0) {
                throw zzic.zzis();
            } else if (this.zzwq + this.pos + i3 > this.zzwn) {
                zzx((this.zzwn - this.zzwq) - this.pos);
                throw zzic.zzir();
            } else {
                this.zzwq += this.pos;
                int i4 = this.zzwp - this.pos;
                this.zzwp = 0;
                this.pos = 0;
                while (i4 < i3) {
                    int i5 = i3 - i4;
                    try {
                        long skip = this.zzwo.skip((long) i5);
                        long j = skip;
                        if (skip >= 0 && j <= ((long) i5)) {
                            if (j == 0) {
                                break;
                            }
                            i4 += (int) j;
                        } else {
                            Throwable th2 = th;
                            String valueOf = String.valueOf(this.zzwo.getClass());
                            new StringBuilder(92 + String.valueOf(valueOf).length());
                            new IllegalStateException(sb.append(valueOf).append("#skip returned invalid result: ").append(j).append("\nThe InputStream implementation is buggy.").toString());
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        this.zzwq += i4;
                        zzhe();
                        throw th4;
                    }
                }
                this.zzwq += i4;
                zzhe();
                if (i4 < i3) {
                    int i6 = this.zzwp - this.pos;
                    this.pos = this.zzwp;
                    zzy(1);
                    while (i3 - i6 > this.zzwp) {
                        i6 += this.zzwp;
                        this.pos = this.zzwp;
                        zzy(1);
                    }
                    this.pos = i3 - i6;
                }
            }
        } else {
            this.pos += i2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzgw(InputStream inputStream, int i, zzgu zzgu) {
        this(inputStream, 4096);
        int i2 = i;
        zzgu zzgu2 = zzgu;
    }
}
