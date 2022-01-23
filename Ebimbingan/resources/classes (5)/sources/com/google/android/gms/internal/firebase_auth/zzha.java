package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzha extends zzgg {
    private static final Logger logger = Logger.getLogger(zzha.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzww = zzkq.zzkr();
    zzhc zzwx;

    public static zzha zzc(byte[] bArr) {
        zzha zzha;
        byte[] bArr2 = bArr;
        new zzb(bArr2, 0, bArr2.length);
        return zzha;
    }

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzgf zzgf) throws IOException;

    public abstract void zza(int i, zzjc zzjc) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zza(int i, zzjc zzjc, zzjs zzjs) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(zzgf zzgf) throws IOException;

    public abstract void zzag(int i) throws IOException;

    public abstract void zzah(int i) throws IOException;

    public abstract void zzaj(int i) throws IOException;

    public abstract void zzb(int i, zzgf zzgf) throws IOException;

    public abstract void zzb(long j) throws IOException;

    public abstract void zzc(byte b) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzc(int i, boolean z) throws IOException;

    public abstract void zzc(zzjc zzjc) throws IOException;

    public abstract void zzd(long j) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zzd(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzdi(String str) throws IOException;

    public abstract void zze(int i, int i2) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public abstract void zzg(int i, int i2) throws IOException;

    public abstract int zzhi();

    public abstract void zzi(int i, int i2) throws IOException;

    public static class zza extends IOException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zza(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zza(java.lang.String r10, java.lang.Throwable r11) {
            /*
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r0
                java.lang.String r4 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r5 = r1
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r7 = r5
                r5 = r7
                r6 = r7
                int r6 = r6.length()
                if (r6 == 0) goto L_0x0022
                java.lang.String r4 = r4.concat(r5)
            L_0x001d:
                r5 = r2
                r3.<init>(r4, r5)
                return
            L_0x0022:
                java.lang.String r5 = new java.lang.String
                r7 = r4
                r8 = r5
                r4 = r8
                r5 = r7
                r6 = r8
                r7 = r5
                r8 = r6
                r5 = r8
                r6 = r7
                r5.<init>(r6)
                goto L_0x001d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzha.zza.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zzha() {
    }

    public final void zzh(int i, int i2) throws IOException {
        zzg(i, zzar(i2));
    }

    public final void zzb(int i, long j) throws IOException {
        zza(i, zzj(j));
    }

    public final void zza(int i, float f) throws IOException {
        zzi(i, Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    static class zzb extends zzha {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zzb(byte[] bArr, int i, int i2) {
            super((zzgz) null);
            Throwable th;
            Throwable th2;
            byte[] bArr2 = bArr;
            int i3 = i;
            int i4 = i2;
            if (bArr2 == null) {
                Throwable th3 = th2;
                new NullPointerException("buffer");
                throw th3;
            } else if ((0 | i4 | (bArr2.length - (i4 + 0))) < 0) {
                Throwable th4 = th;
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(bArr2.length);
                Object[] objArr2 = objArr;
                objArr2[1] = 0;
                Object[] objArr3 = objArr2;
                objArr3[2] = Integer.valueOf(i4);
                new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", objArr3));
                throw th4;
            } else {
                this.buffer = bArr2;
                this.offset = 0;
                this.position = 0;
                this.limit = i4 + 0;
            }
        }

        public final void zze(int i, int i2) throws IOException {
            zzah((i << 3) | i2);
        }

        public final void zzf(int i, int i2) throws IOException {
            zze(i, 0);
            zzag(i2);
        }

        public final void zzg(int i, int i2) throws IOException {
            zze(i, 0);
            zzah(i2);
        }

        public final void zzi(int i, int i2) throws IOException {
            zze(i, 5);
            zzaj(i2);
        }

        public final void zza(int i, long j) throws IOException {
            zze(i, 0);
            zzb(j);
        }

        public final void zzc(int i, long j) throws IOException {
            zze(i, 1);
            zzd(j);
        }

        public final void zzc(int i, boolean z) throws IOException {
            zze(i, 0);
            zzc((byte) (z ? 1 : 0));
        }

        public final void zza(int i, String str) throws IOException {
            zze(i, 2);
            zzdi(str);
        }

        public final void zza(int i, zzgf zzgf) throws IOException {
            zze(i, 2);
            zza(zzgf);
        }

        public final void zza(zzgf zzgf) throws IOException {
            zzgf zzgf2 = zzgf;
            zzah(zzgf2.size());
            zzgf2.zza((zzgg) this);
        }

        public final void zzd(byte[] bArr, int i, int i2) throws IOException {
            int i3 = i;
            int i4 = i2;
            zzah(i4);
            write(bArr, 0, i4);
        }

        /* access modifiers changed from: package-private */
        public final void zza(int i, zzjc zzjc, zzjs zzjs) throws IOException {
            zzjc zzjc2 = zzjc;
            zzjs zzjs2 = zzjs;
            zze(i, 2);
            zzjs zzjs3 = zzjs2;
            zzfx zzfx = (zzfx) zzjc2;
            zzfx zzfx2 = zzfx;
            int zzfu = zzfx.zzfu();
            int i2 = zzfu;
            if (zzfu == -1) {
                i2 = zzjs3.zzq(zzfx2);
                zzfx2.zzl(i2);
            }
            zzah(i2);
            zzjs2.zza(zzjc2, this.zzwx);
        }

        public final void zza(int i, zzjc zzjc) throws IOException {
            zze(1, 3);
            zzg(2, i);
            zze(3, 2);
            zzc(zzjc);
            zze(1, 4);
        }

        public final void zzb(int i, zzgf zzgf) throws IOException {
            zze(1, 3);
            zzg(2, i);
            zza(3, zzgf);
            zze(1, 4);
        }

        public final void zzc(zzjc zzjc) throws IOException {
            zzjc zzjc2 = zzjc;
            zzah(zzjc2.zzik());
            zzjc2.zzb(this);
        }

        public final void zzc(byte b) throws IOException {
            Throwable th;
            byte b2 = b;
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                this.position = i2;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e) {
                IndexOutOfBoundsException indexOutOfBoundsException = e;
                Throwable th2 = th;
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(this.position);
                Object[] objArr2 = objArr;
                objArr2[1] = Integer.valueOf(this.limit);
                Object[] objArr3 = objArr2;
                objArr3[2] = 1;
                new zza(String.format("Pos: %d, limit: %d, len: %d", objArr3), indexOutOfBoundsException);
                throw th2;
            }
        }

        public final void zzag(int i) throws IOException {
            int i2 = i;
            if (i2 >= 0) {
                zzah(i2);
            } else {
                zzb((long) i2);
            }
        }

        public final void zzah(int i) throws IOException {
            Throwable th;
            int i2 = i;
            if (!zzha.zzww || zzge.zzga() || zzhi() < 5) {
                while ((i2 & -128) != 0) {
                    try {
                        byte[] bArr = this.buffer;
                        int i3 = this.position;
                        int i4 = i3 + 1;
                        this.position = i4;
                        bArr[i3] = (byte) ((i2 & 127) | 128);
                        i2 >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        IndexOutOfBoundsException indexOutOfBoundsException = e;
                        Throwable th2 = th;
                        Object[] objArr = new Object[3];
                        objArr[0] = Integer.valueOf(this.position);
                        Object[] objArr2 = objArr;
                        objArr2[1] = Integer.valueOf(this.limit);
                        Object[] objArr3 = objArr2;
                        objArr3[2] = 1;
                        new zza(String.format("Pos: %d, limit: %d, len: %d", objArr3), indexOutOfBoundsException);
                        throw th2;
                    }
                }
                byte[] bArr2 = this.buffer;
                int i5 = this.position;
                int i6 = i5 + 1;
                this.position = i6;
                bArr2[i5] = (byte) i2;
            } else if ((i2 & -128) == 0) {
                byte[] bArr3 = this.buffer;
                int i7 = this.position;
                int i8 = i7 + 1;
                this.position = i8;
                zzkq.zza(bArr3, (long) i7, (byte) i2);
            } else {
                byte[] bArr4 = this.buffer;
                int i9 = this.position;
                int i10 = i9 + 1;
                this.position = i10;
                zzkq.zza(bArr4, (long) i9, (byte) (i2 | 128));
                int i11 = i2 >>> 7;
                int i12 = i11;
                if ((i11 & -128) == 0) {
                    byte[] bArr5 = this.buffer;
                    int i13 = this.position;
                    int i14 = i13 + 1;
                    this.position = i14;
                    zzkq.zza(bArr5, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr6 = this.buffer;
                int i15 = this.position;
                int i16 = i15 + 1;
                this.position = i16;
                zzkq.zza(bArr6, (long) i15, (byte) (i12 | 128));
                int i17 = i12 >>> 7;
                int i18 = i17;
                if ((i17 & -128) == 0) {
                    byte[] bArr7 = this.buffer;
                    int i19 = this.position;
                    int i20 = i19 + 1;
                    this.position = i20;
                    zzkq.zza(bArr7, (long) i19, (byte) i18);
                    return;
                }
                byte[] bArr8 = this.buffer;
                int i21 = this.position;
                int i22 = i21 + 1;
                this.position = i22;
                zzkq.zza(bArr8, (long) i21, (byte) (i18 | 128));
                int i23 = i18 >>> 7;
                int i24 = i23;
                if ((i23 & -128) == 0) {
                    byte[] bArr9 = this.buffer;
                    int i25 = this.position;
                    int i26 = i25 + 1;
                    this.position = i26;
                    zzkq.zza(bArr9, (long) i25, (byte) i24);
                    return;
                }
                byte[] bArr10 = this.buffer;
                int i27 = this.position;
                int i28 = i27 + 1;
                this.position = i28;
                zzkq.zza(bArr10, (long) i27, (byte) (i24 | 128));
                byte[] bArr11 = this.buffer;
                int i29 = this.position;
                int i30 = i29 + 1;
                this.position = i30;
                zzkq.zza(bArr11, (long) i29, (byte) (i24 >>> 7));
            }
        }

        public final void zzaj(int i) throws IOException {
            Throwable th;
            int i2 = i;
            try {
                byte[] bArr = this.buffer;
                int i3 = this.position;
                int i4 = i3 + 1;
                this.position = i4;
                bArr[i3] = (byte) i2;
                byte[] bArr2 = this.buffer;
                int i5 = this.position;
                int i6 = i5 + 1;
                this.position = i6;
                bArr2[i5] = (byte) (i2 >> 8);
                byte[] bArr3 = this.buffer;
                int i7 = this.position;
                int i8 = i7 + 1;
                this.position = i8;
                bArr3[i7] = (byte) (i2 >> 16);
                byte[] bArr4 = this.buffer;
                int i9 = this.position;
                int i10 = i9 + 1;
                this.position = i10;
                bArr4[i9] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e) {
                IndexOutOfBoundsException indexOutOfBoundsException = e;
                Throwable th2 = th;
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(this.position);
                Object[] objArr2 = objArr;
                objArr2[1] = Integer.valueOf(this.limit);
                Object[] objArr3 = objArr2;
                objArr3[2] = 1;
                new zza(String.format("Pos: %d, limit: %d, len: %d", objArr3), indexOutOfBoundsException);
                throw th2;
            }
        }

        public final void zzb(long j) throws IOException {
            Throwable th;
            long j2 = j;
            if (!zzha.zzww || zzhi() < 10) {
                while ((j2 & -128) != 0) {
                    try {
                        byte[] bArr = this.buffer;
                        int i = this.position;
                        int i2 = i + 1;
                        this.position = i2;
                        bArr[i] = (byte) ((((int) j2) & 127) | 128);
                        j2 >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        IndexOutOfBoundsException indexOutOfBoundsException = e;
                        Throwable th2 = th;
                        Object[] objArr = new Object[3];
                        objArr[0] = Integer.valueOf(this.position);
                        Object[] objArr2 = objArr;
                        objArr2[1] = Integer.valueOf(this.limit);
                        Object[] objArr3 = objArr2;
                        objArr3[2] = 1;
                        new zza(String.format("Pos: %d, limit: %d, len: %d", objArr3), indexOutOfBoundsException);
                        throw th2;
                    }
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                int i4 = i3 + 1;
                this.position = i4;
                bArr2[i3] = (byte) ((int) j2);
                return;
            }
            while ((j2 & -128) != 0) {
                byte[] bArr3 = this.buffer;
                int i5 = this.position;
                int i6 = i5 + 1;
                this.position = i6;
                zzkq.zza(bArr3, (long) i5, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i7 = this.position;
            int i8 = i7 + 1;
            this.position = i8;
            zzkq.zza(bArr4, (long) i7, (byte) ((int) j2));
        }

        public final void zzd(long j) throws IOException {
            Throwable th;
            long j2 = j;
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                this.position = i2;
                bArr[i] = (byte) ((int) j2);
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                int i4 = i3 + 1;
                this.position = i4;
                bArr2[i3] = (byte) ((int) (j2 >> 8));
                byte[] bArr3 = this.buffer;
                int i5 = this.position;
                int i6 = i5 + 1;
                this.position = i6;
                bArr3[i5] = (byte) ((int) (j2 >> 16));
                byte[] bArr4 = this.buffer;
                int i7 = this.position;
                int i8 = i7 + 1;
                this.position = i8;
                bArr4[i7] = (byte) ((int) (j2 >> 24));
                byte[] bArr5 = this.buffer;
                int i9 = this.position;
                int i10 = i9 + 1;
                this.position = i10;
                bArr5[i9] = (byte) ((int) (j2 >> 32));
                byte[] bArr6 = this.buffer;
                int i11 = this.position;
                int i12 = i11 + 1;
                this.position = i12;
                bArr6[i11] = (byte) ((int) (j2 >> 40));
                byte[] bArr7 = this.buffer;
                int i13 = this.position;
                int i14 = i13 + 1;
                this.position = i14;
                bArr7[i13] = (byte) ((int) (j2 >> 48));
                byte[] bArr8 = this.buffer;
                int i15 = this.position;
                int i16 = i15 + 1;
                this.position = i16;
                bArr8[i15] = (byte) ((int) (j2 >> 56));
            } catch (IndexOutOfBoundsException e) {
                IndexOutOfBoundsException indexOutOfBoundsException = e;
                Throwable th2 = th;
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(this.position);
                Object[] objArr2 = objArr;
                objArr2[1] = Integer.valueOf(this.limit);
                Object[] objArr3 = objArr2;
                objArr3[2] = 1;
                new zza(String.format("Pos: %d, limit: %d, len: %d", objArr3), indexOutOfBoundsException);
                throw th2;
            }
        }

        private final void write(byte[] bArr, int i, int i2) throws IOException {
            Throwable th;
            int i3 = i2;
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i3);
                this.position += i3;
            } catch (IndexOutOfBoundsException e) {
                IndexOutOfBoundsException indexOutOfBoundsException = e;
                Throwable th2 = th;
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(this.position);
                Object[] objArr2 = objArr;
                objArr2[1] = Integer.valueOf(this.limit);
                Object[] objArr3 = objArr2;
                objArr3[2] = Integer.valueOf(i3);
                new zza(String.format("Pos: %d, limit: %d, len: %d", objArr3), indexOutOfBoundsException);
                throw th2;
            }
        }

        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        public final void zzdi(String str) throws IOException {
            Throwable th;
            String str2 = str;
            int i = this.position;
            try {
                int zzam = zzam(str2.length() * 3);
                int zzam2 = zzam(str2.length());
                int i2 = zzam2;
                if (zzam2 == zzam) {
                    this.position = i + i2;
                    int zza = zzkt.zza(str2, this.buffer, this.position, zzhi());
                    this.position = i;
                    zzah((zza - i) - i2);
                    this.position = zza;
                    return;
                }
                zzah(zzkt.zzb(str2));
                this.position = zzkt.zza(str2, this.buffer, this.position, zzhi());
            } catch (zzkw e) {
                this.position = i;
                zza(str2, e);
            } catch (IndexOutOfBoundsException e2) {
                IndexOutOfBoundsException indexOutOfBoundsException = e2;
                Throwable th2 = th;
                new zza(indexOutOfBoundsException);
                throw th2;
            }
        }

        public final int zzhi() {
            return this.limit - this.position;
        }
    }

    public final void zzai(int i) throws IOException {
        zzah(zzar(i));
    }

    public final void zzc(long j) throws IOException {
        zzb(zzj(j));
    }

    public final void zza(float f) throws IOException {
        zzaj(Float.floatToRawIntBits(f));
    }

    public final void zza(double d) throws IOException {
        zzd(Double.doubleToRawLongBits(d));
    }

    public final void zzt(boolean z) throws IOException {
        zzc((byte) (z ? 1 : 0));
    }

    public static int zzj(int i, int i2) {
        return zzak(i) + zzal(i2);
    }

    public static int zzk(int i, int i2) {
        return zzak(i) + zzam(i2);
    }

    public static int zzl(int i, int i2) {
        return zzak(i) + zzam(zzar(i2));
    }

    public static int zzm(int i, int i2) {
        int i3 = i2;
        return zzak(i) + 4;
    }

    public static int zzn(int i, int i2) {
        int i3 = i2;
        return zzak(i) + 4;
    }

    public static int zzd(int i, long j) {
        return zzak(i) + zzf(j);
    }

    public static int zze(int i, long j) {
        return zzak(i) + zzf(j);
    }

    public static int zzf(int i, long j) {
        return zzak(i) + zzf(zzj(j));
    }

    public static int zzg(int i, long j) {
        long j2 = j;
        return zzak(i) + 8;
    }

    public static int zzh(int i, long j) {
        long j2 = j;
        return zzak(i) + 8;
    }

    public static int zzb(int i, float f) {
        float f2 = f;
        return zzak(i) + 4;
    }

    public static int zzb(int i, double d) {
        double d2 = d;
        return zzak(i) + 8;
    }

    public static int zzd(int i, boolean z) {
        boolean z2 = z;
        return zzak(i) + 1;
    }

    public static int zzo(int i, int i2) {
        return zzak(i) + zzal(i2);
    }

    public static int zzb(int i, String str) {
        return zzak(i) + zzdj(str);
    }

    public static int zzc(int i, zzgf zzgf) {
        int zzak = zzak(i);
        int size = zzgf.size();
        return zzak + zzam(size) + size;
    }

    public static int zza(int i, zzih zzih) {
        int zzak = zzak(i);
        int zzik = zzih.zzik();
        return zzak + zzam(zzik) + zzik;
    }

    static int zzb(int i, zzjc zzjc, zzjs zzjs) {
        return zzak(i) + zza(zzjc, zzjs);
    }

    public static int zzb(int i, zzjc zzjc) {
        return (zzak(1) << 1) + zzk(2, i) + zzak(3) + zzd(zzjc);
    }

    public static int zzd(int i, zzgf zzgf) {
        return (zzak(1) << 1) + zzk(2, i) + zzc(3, zzgf);
    }

    public static int zzb(int i, zzih zzih) {
        return (zzak(1) << 1) + zzk(2, i) + zza(3, zzih);
    }

    public static int zzak(int i) {
        return zzam(i << 3);
    }

    public static int zzal(int i) {
        int i2 = i;
        if (i2 >= 0) {
            return zzam(i2);
        }
        return 10;
    }

    public static int zzam(int i) {
        int i2 = i;
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((i2 & -2097152) == 0) {
            return 3;
        }
        if ((i2 & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    public static int zzan(int i) {
        return zzam(zzar(i));
    }

    public static int zzao(int i) {
        int i2 = i;
        return 4;
    }

    public static int zzap(int i) {
        int i2 = i;
        return 4;
    }

    public static int zze(long j) {
        return zzf(j);
    }

    public static int zzf(long j) {
        long j2 = j;
        if ((j2 & -128) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        int i = 2;
        if ((j2 & -34359738368L) != 0) {
            i = 2 + 4;
            j2 >>>= 28;
        }
        if ((j2 & -2097152) != 0) {
            i += 2;
            j2 >>>= 14;
        }
        if ((j2 & -16384) != 0) {
            i++;
        }
        return i;
    }

    public static int zzg(long j) {
        return zzf(zzj(j));
    }

    public static int zzh(long j) {
        long j2 = j;
        return 8;
    }

    public static int zzi(long j) {
        long j2 = j;
        return 8;
    }

    public static int zzb(float f) {
        float f2 = f;
        return 4;
    }

    public static int zzb(double d) {
        double d2 = d;
        return 8;
    }

    public static int zzu(boolean z) {
        boolean z2 = z;
        return 1;
    }

    public static int zzaq(int i) {
        return zzal(i);
    }

    public static int zzdj(String str) {
        int length;
        String str2 = str;
        try {
            length = zzkt.zzb(str2);
        } catch (zzkw e) {
            length = str2.getBytes(zzht.UTF_8).length;
        }
        int i = length;
        return zzam(i) + i;
    }

    public static int zza(zzih zzih) {
        int zzik = zzih.zzik();
        return zzam(zzik) + zzik;
    }

    public static int zzb(zzgf zzgf) {
        int size = zzgf.size();
        return zzam(size) + size;
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        return zzam(length) + length;
    }

    public static int zzd(zzjc zzjc) {
        int zzik = zzjc.zzik();
        return zzam(zzik) + zzik;
    }

    static int zza(zzjc zzjc, zzjs zzjs) {
        zzjs zzjs2 = zzjs;
        zzfx zzfx = (zzfx) zzjc;
        zzfx zzfx2 = zzfx;
        int zzfu = zzfx.zzfu();
        int i = zzfu;
        if (zzfu == -1) {
            i = zzjs2.zzq(zzfx2);
            zzfx2.zzl(i);
        }
        int i2 = i;
        return zzam(i2) + i2;
    }

    private static int zzar(int i) {
        int i2 = i;
        return (i2 << 1) ^ (i2 >> 31);
    }

    private static long zzj(long j) {
        long j2 = j;
        return (j2 << 1) ^ (j2 >> 63);
    }

    public final void zzhj() {
        Throwable th;
        if (zzhi() != 0) {
            Throwable th2 = th;
            new IllegalStateException("Did not write as much data as expected.");
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzkw zzkw) throws IOException {
        Throwable th;
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzkw);
        byte[] bytes = str.getBytes(zzht.UTF_8);
        try {
            zzah(bytes.length);
            zzb(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            IndexOutOfBoundsException indexOutOfBoundsException = e;
            Throwable th2 = th;
            new zza(indexOutOfBoundsException);
            throw th2;
        } catch (zza e2) {
            throw e2;
        }
    }

    @Deprecated
    static int zzc(int i, zzjc zzjc, zzjs zzjs) {
        int zzak = zzak(i) << 1;
        zzjs zzjs2 = zzjs;
        zzfx zzfx = (zzfx) zzjc;
        zzfx zzfx2 = zzfx;
        int zzfu = zzfx.zzfu();
        int i2 = zzfu;
        if (zzfu == -1) {
            i2 = zzjs2.zzq(zzfx2);
            zzfx2.zzl(i2);
        }
        return zzak + i2;
    }

    @Deprecated
    public static int zze(zzjc zzjc) {
        return zzjc.zzik();
    }

    @Deprecated
    public static int zzas(int i) {
        return zzam(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzha(zzgz zzgz) {
        this();
        zzgz zzgz2 = zzgz;
    }
}
