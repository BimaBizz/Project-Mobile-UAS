package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.auth.zzgv */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0960zzgv extends C0944zzgf {
    private static final Logger zzb = Logger.getLogger(C0960zzgv.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzc = C1053zzkg.zza();
    C0963zzgy zza;

    public static C0960zzgv zza(byte[] bArr) {
        C0960zzgv zzgv;
        byte[] bArr2 = bArr;
        new zza(bArr2, 0, bArr2.length);
        return zzgv;
    }

    public abstract int zza();

    public abstract void zza(byte b) throws IOException;

    public abstract void zza(int i) throws IOException;

    public abstract void zza(int i, int i2) throws IOException;

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, C0947zzgi zzgi) throws IOException;

    public abstract void zza(int i, C1011zzis zzis) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zza(int i, C1011zzis zzis, C1028zzji zzji) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(int i, boolean z) throws IOException;

    public abstract void zza(long j) throws IOException;

    public abstract void zza(C0947zzgi zzgi) throws IOException;

    public abstract void zza(C1011zzis zzis) throws IOException;

    public abstract void zza(String str) throws IOException;

    public abstract void zzb(int i) throws IOException;

    public abstract void zzb(int i, int i2) throws IOException;

    public abstract void zzb(int i, C0947zzgi zzgi) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zzb(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzc(int i, int i2) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzc(long j) throws IOException;

    public abstract void zzd(int i) throws IOException;

    public abstract void zze(int i, int i2) throws IOException;

    /* renamed from: com.google.android.gms.internal.auth.zzgv$zzb */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public static class zzb extends IOException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zzb(java.lang.String r10, java.lang.Throwable r11) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0960zzgv.zzb.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private C0960zzgv() {
    }

    public final void zzd(int i, int i2) throws IOException {
        zzc(i, zzm(i2));
    }

    public final void zzb(int i, long j) throws IOException {
        zza(i, zzi(j));
    }

    public final void zza(int i, float f) throws IOException {
        zze(i, Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: com.google.android.gms.internal.auth.zzgv$zza */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static class zza extends C0960zzgv {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        zza(byte[] bArr, int i, int i2) {
            super((C0962zzgx) null);
            Throwable th;
            Throwable th2;
            byte[] bArr2 = bArr;
            int i3 = i;
            int i4 = i2;
            if (bArr2 == null) {
                Throwable th3 = th2;
                new NullPointerException("buffer");
                throw th3;
            } else if ((0 | i4 | (bArr2.length - i4)) < 0) {
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
                this.zzb = bArr2;
                this.zzc = 0;
                this.zze = 0;
                this.zzd = i4;
            }
        }

        public final void zza(int i, int i2) throws IOException {
            zzb((i << 3) | i2);
        }

        public final void zzb(int i, int i2) throws IOException {
            zza(i, 0);
            zza(i2);
        }

        public final void zzc(int i, int i2) throws IOException {
            zza(i, 0);
            zzb(i2);
        }

        public final void zze(int i, int i2) throws IOException {
            zza(i, 5);
            zzd(i2);
        }

        public final void zza(int i, long j) throws IOException {
            zza(i, 0);
            zza(j);
        }

        public final void zzc(int i, long j) throws IOException {
            zza(i, 1);
            zzc(j);
        }

        public final void zza(int i, boolean z) throws IOException {
            zza(i, 0);
            zza((byte) (z ? 1 : 0));
        }

        public final void zza(int i, String str) throws IOException {
            zza(i, 2);
            zza(str);
        }

        public final void zza(int i, C0947zzgi zzgi) throws IOException {
            zza(i, 2);
            zza(zzgi);
        }

        public final void zza(C0947zzgi zzgi) throws IOException {
            C0947zzgi zzgi2 = zzgi;
            zzb(zzgi2.zza());
            zzgi2.zza((C0944zzgf) this);
        }

        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            int i3 = i;
            int i4 = i2;
            zzb(i4);
            zzc(bArr, 0, i4);
        }

        /* access modifiers changed from: package-private */
        public final void zza(int i, C1011zzis zzis, C1028zzji zzji) throws IOException {
            C1011zzis zzis2 = zzis;
            C1028zzji zzji2 = zzji;
            zza(i, 2);
            C1028zzji zzji3 = zzji2;
            C0936zzfy zzfy = (C0936zzfy) zzis2;
            C0936zzfy zzfy2 = zzfy;
            int zzb2 = zzfy.zzb();
            int i2 = zzb2;
            if (zzb2 == -1) {
                i2 = zzji3.zzb(zzfy2);
                zzfy2.zza(i2);
            }
            zzb(i2);
            zzji2.zza(zzis2, (C1070zzkx) this.zza);
        }

        public final void zza(int i, C1011zzis zzis) throws IOException {
            zza(1, 3);
            zzc(2, i);
            zza(3, 2);
            zza(zzis);
            zza(1, 4);
        }

        public final void zzb(int i, C0947zzgi zzgi) throws IOException {
            zza(1, 3);
            zzc(2, i);
            zza(3, zzgi);
            zza(1, 4);
        }

        public final void zza(C1011zzis zzis) throws IOException {
            C1011zzis zzis2 = zzis;
            zzb(zzis2.zzd());
            zzis2.zza(this);
        }

        public final void zza(byte b) throws IOException {
            Throwable th;
            byte b2 = b;
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                int i2 = i + 1;
                this.zze = i2;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e) {
                IndexOutOfBoundsException indexOutOfBoundsException = e;
                Throwable th2 = th;
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(this.zze);
                Object[] objArr2 = objArr;
                objArr2[1] = Integer.valueOf(this.zzd);
                Object[] objArr3 = objArr2;
                objArr3[2] = 1;
                new zzb(String.format("Pos: %d, limit: %d, len: %d", objArr3), indexOutOfBoundsException);
                throw th2;
            }
        }

        public final void zza(int i) throws IOException {
            int i2 = i;
            if (i2 >= 0) {
                zzb(i2);
            } else {
                zza((long) i2);
            }
        }

        public final void zzb(int i) throws IOException {
            Throwable th;
            int i2 = i;
            if (!C0960zzgv.zzc || C0940zzgb.zza() || zza() < 5) {
                while ((i2 & -128) != 0) {
                    try {
                        byte[] bArr = this.zzb;
                        int i3 = this.zze;
                        int i4 = i3 + 1;
                        this.zze = i4;
                        bArr[i3] = (byte) ((i2 & 127) | 128);
                        i2 >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        IndexOutOfBoundsException indexOutOfBoundsException = e;
                        Throwable th2 = th;
                        Object[] objArr = new Object[3];
                        objArr[0] = Integer.valueOf(this.zze);
                        Object[] objArr2 = objArr;
                        objArr2[1] = Integer.valueOf(this.zzd);
                        Object[] objArr3 = objArr2;
                        objArr3[2] = 1;
                        new zzb(String.format("Pos: %d, limit: %d, len: %d", objArr3), indexOutOfBoundsException);
                        throw th2;
                    }
                }
                byte[] bArr2 = this.zzb;
                int i5 = this.zze;
                int i6 = i5 + 1;
                this.zze = i6;
                bArr2[i5] = (byte) i2;
            } else if ((i2 & -128) == 0) {
                byte[] bArr3 = this.zzb;
                int i7 = this.zze;
                int i8 = i7 + 1;
                this.zze = i8;
                C1053zzkg.zza(bArr3, (long) i7, (byte) i2);
            } else {
                byte[] bArr4 = this.zzb;
                int i9 = this.zze;
                int i10 = i9 + 1;
                this.zze = i10;
                C1053zzkg.zza(bArr4, (long) i9, (byte) (i2 | 128));
                int i11 = i2 >>> 7;
                int i12 = i11;
                if ((i11 & -128) == 0) {
                    byte[] bArr5 = this.zzb;
                    int i13 = this.zze;
                    int i14 = i13 + 1;
                    this.zze = i14;
                    C1053zzkg.zza(bArr5, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr6 = this.zzb;
                int i15 = this.zze;
                int i16 = i15 + 1;
                this.zze = i16;
                C1053zzkg.zza(bArr6, (long) i15, (byte) (i12 | 128));
                int i17 = i12 >>> 7;
                int i18 = i17;
                if ((i17 & -128) == 0) {
                    byte[] bArr7 = this.zzb;
                    int i19 = this.zze;
                    int i20 = i19 + 1;
                    this.zze = i20;
                    C1053zzkg.zza(bArr7, (long) i19, (byte) i18);
                    return;
                }
                byte[] bArr8 = this.zzb;
                int i21 = this.zze;
                int i22 = i21 + 1;
                this.zze = i22;
                C1053zzkg.zza(bArr8, (long) i21, (byte) (i18 | 128));
                int i23 = i18 >>> 7;
                int i24 = i23;
                if ((i23 & -128) == 0) {
                    byte[] bArr9 = this.zzb;
                    int i25 = this.zze;
                    int i26 = i25 + 1;
                    this.zze = i26;
                    C1053zzkg.zza(bArr9, (long) i25, (byte) i24);
                    return;
                }
                byte[] bArr10 = this.zzb;
                int i27 = this.zze;
                int i28 = i27 + 1;
                this.zze = i28;
                C1053zzkg.zza(bArr10, (long) i27, (byte) (i24 | 128));
                byte[] bArr11 = this.zzb;
                int i29 = this.zze;
                int i30 = i29 + 1;
                this.zze = i30;
                C1053zzkg.zza(bArr11, (long) i29, (byte) (i24 >>> 7));
            }
        }

        public final void zzd(int i) throws IOException {
            Throwable th;
            int i2 = i;
            try {
                byte[] bArr = this.zzb;
                int i3 = this.zze;
                int i4 = i3 + 1;
                this.zze = i4;
                bArr[i3] = (byte) i2;
                byte[] bArr2 = this.zzb;
                int i5 = this.zze;
                int i6 = i5 + 1;
                this.zze = i6;
                bArr2[i5] = (byte) (i2 >> 8);
                byte[] bArr3 = this.zzb;
                int i7 = this.zze;
                int i8 = i7 + 1;
                this.zze = i8;
                bArr3[i7] = (byte) (i2 >> 16);
                byte[] bArr4 = this.zzb;
                int i9 = this.zze;
                int i10 = i9 + 1;
                this.zze = i10;
                bArr4[i9] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e) {
                IndexOutOfBoundsException indexOutOfBoundsException = e;
                Throwable th2 = th;
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(this.zze);
                Object[] objArr2 = objArr;
                objArr2[1] = Integer.valueOf(this.zzd);
                Object[] objArr3 = objArr2;
                objArr3[2] = 1;
                new zzb(String.format("Pos: %d, limit: %d, len: %d", objArr3), indexOutOfBoundsException);
                throw th2;
            }
        }

        public final void zza(long j) throws IOException {
            Throwable th;
            long j2 = j;
            if (!C0960zzgv.zzc || zza() < 10) {
                while ((j2 & -128) != 0) {
                    try {
                        byte[] bArr = this.zzb;
                        int i = this.zze;
                        int i2 = i + 1;
                        this.zze = i2;
                        bArr[i] = (byte) ((((int) j2) & 127) | 128);
                        j2 >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        IndexOutOfBoundsException indexOutOfBoundsException = e;
                        Throwable th2 = th;
                        Object[] objArr = new Object[3];
                        objArr[0] = Integer.valueOf(this.zze);
                        Object[] objArr2 = objArr;
                        objArr2[1] = Integer.valueOf(this.zzd);
                        Object[] objArr3 = objArr2;
                        objArr3[2] = 1;
                        new zzb(String.format("Pos: %d, limit: %d, len: %d", objArr3), indexOutOfBoundsException);
                        throw th2;
                    }
                }
                byte[] bArr2 = this.zzb;
                int i3 = this.zze;
                int i4 = i3 + 1;
                this.zze = i4;
                bArr2[i3] = (byte) ((int) j2);
                return;
            }
            while ((j2 & -128) != 0) {
                byte[] bArr3 = this.zzb;
                int i5 = this.zze;
                int i6 = i5 + 1;
                this.zze = i6;
                C1053zzkg.zza(bArr3, (long) i5, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i7 = this.zze;
            int i8 = i7 + 1;
            this.zze = i8;
            C1053zzkg.zza(bArr4, (long) i7, (byte) ((int) j2));
        }

        public final void zzc(long j) throws IOException {
            Throwable th;
            long j2 = j;
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                int i2 = i + 1;
                this.zze = i2;
                bArr[i] = (byte) ((int) j2);
                byte[] bArr2 = this.zzb;
                int i3 = this.zze;
                int i4 = i3 + 1;
                this.zze = i4;
                bArr2[i3] = (byte) ((int) (j2 >> 8));
                byte[] bArr3 = this.zzb;
                int i5 = this.zze;
                int i6 = i5 + 1;
                this.zze = i6;
                bArr3[i5] = (byte) ((int) (j2 >> 16));
                byte[] bArr4 = this.zzb;
                int i7 = this.zze;
                int i8 = i7 + 1;
                this.zze = i8;
                bArr4[i7] = (byte) ((int) (j2 >> 24));
                byte[] bArr5 = this.zzb;
                int i9 = this.zze;
                int i10 = i9 + 1;
                this.zze = i10;
                bArr5[i9] = (byte) ((int) (j2 >> 32));
                byte[] bArr6 = this.zzb;
                int i11 = this.zze;
                int i12 = i11 + 1;
                this.zze = i12;
                bArr6[i11] = (byte) ((int) (j2 >> 40));
                byte[] bArr7 = this.zzb;
                int i13 = this.zze;
                int i14 = i13 + 1;
                this.zze = i14;
                bArr7[i13] = (byte) ((int) (j2 >> 48));
                byte[] bArr8 = this.zzb;
                int i15 = this.zze;
                int i16 = i15 + 1;
                this.zze = i16;
                bArr8[i15] = (byte) ((int) (j2 >> 56));
            } catch (IndexOutOfBoundsException e) {
                IndexOutOfBoundsException indexOutOfBoundsException = e;
                Throwable th2 = th;
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(this.zze);
                Object[] objArr2 = objArr;
                objArr2[1] = Integer.valueOf(this.zzd);
                Object[] objArr3 = objArr2;
                objArr3[2] = 1;
                new zzb(String.format("Pos: %d, limit: %d, len: %d", objArr3), indexOutOfBoundsException);
                throw th2;
            }
        }

        private final void zzc(byte[] bArr, int i, int i2) throws IOException {
            Throwable th;
            int i3 = i2;
            try {
                System.arraycopy(bArr, i, this.zzb, this.zze, i3);
                this.zze += i3;
            } catch (IndexOutOfBoundsException e) {
                IndexOutOfBoundsException indexOutOfBoundsException = e;
                Throwable th2 = th;
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(this.zze);
                Object[] objArr2 = objArr;
                objArr2[1] = Integer.valueOf(this.zzd);
                Object[] objArr3 = objArr2;
                objArr3[2] = Integer.valueOf(i3);
                new zzb(String.format("Pos: %d, limit: %d, len: %d", objArr3), indexOutOfBoundsException);
                throw th2;
            }
        }

        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            zzc(bArr, i, i2);
        }

        public final void zza(String str) throws IOException {
            Throwable th;
            String str2 = str;
            int i = this.zze;
            try {
                int zzg = zzg(str2.length() * 3);
                int zzg2 = zzg(str2.length());
                int i2 = zzg2;
                if (zzg2 == zzg) {
                    this.zze = i + i2;
                    int zza = C1056zzkj.zza(str2, this.zzb, this.zze, zza());
                    this.zze = i;
                    zzb((zza - i) - i2);
                    this.zze = zza;
                    return;
                }
                zzb(C1056zzkj.zza((CharSequence) str2));
                this.zze = C1056zzkj.zza(str2, this.zzb, this.zze, zza());
            } catch (C1059zzkm e) {
                this.zze = i;
                zza(str2, e);
            } catch (IndexOutOfBoundsException e2) {
                IndexOutOfBoundsException indexOutOfBoundsException = e2;
                Throwable th2 = th;
                new zzb(indexOutOfBoundsException);
                throw th2;
            }
        }

        public final int zza() {
            return this.zzd - this.zze;
        }
    }

    public final void zzc(int i) throws IOException {
        zzb(zzm(i));
    }

    public final void zzb(long j) throws IOException {
        zza(zzi(j));
    }

    public final void zza(float f) throws IOException {
        zzd(Float.floatToRawIntBits(f));
    }

    public final void zza(double d) throws IOException {
        zzc(Double.doubleToRawLongBits(d));
    }

    public final void zza(boolean z) throws IOException {
        zza((byte) (z ? 1 : 0));
    }

    public static int zzf(int i, int i2) {
        int i3 = i;
        int i4 = i3;
        return zzg(i3 << 3) + zzf(i2);
    }

    public static int zzg(int i, int i2) {
        int i3 = i;
        int i4 = i3;
        return zzg(i3 << 3) + zzg(i2);
    }

    public static int zzh(int i, int i2) {
        int i3 = i;
        int i4 = i3;
        return zzg(i3 << 3) + zzg(zzm(i2));
    }

    public static int zzi(int i, int i2) {
        int i3 = i2;
        int i4 = i;
        int i5 = i4;
        return zzg(i4 << 3) + 4;
    }

    public static int zzj(int i, int i2) {
        int i3 = i2;
        int i4 = i;
        int i5 = i4;
        return zzg(i4 << 3) + 4;
    }

    public static int zzd(int i, long j) {
        int i2 = i;
        int i3 = i2;
        return zzg(i2 << 3) + zze(j);
    }

    public static int zze(int i, long j) {
        int i2 = i;
        int i3 = i2;
        return zzg(i2 << 3) + zze(j);
    }

    public static int zzf(int i, long j) {
        int i2 = i;
        int i3 = i2;
        return zzg(i2 << 3) + zze(zzi(j));
    }

    public static int zzg(int i, long j) {
        long j2 = j;
        int i2 = i;
        int i3 = i2;
        return zzg(i2 << 3) + 8;
    }

    public static int zzh(int i, long j) {
        long j2 = j;
        int i2 = i;
        int i3 = i2;
        return zzg(i2 << 3) + 8;
    }

    public static int zzb(int i, float f) {
        float f2 = f;
        int i2 = i;
        int i3 = i2;
        return zzg(i2 << 3) + 4;
    }

    public static int zzb(int i, double d) {
        double d2 = d;
        int i2 = i;
        int i3 = i2;
        return zzg(i2 << 3) + 8;
    }

    public static int zzb(int i, boolean z) {
        boolean z2 = z;
        int i2 = i;
        int i3 = i2;
        return zzg(i2 << 3) + 1;
    }

    public static int zzk(int i, int i2) {
        int i3 = i;
        int i4 = i3;
        return zzg(i3 << 3) + zzf(i2);
    }

    public static int zzb(int i, String str) {
        int i2 = i;
        int i3 = i2;
        return zzg(i2 << 3) + zzb(str);
    }

    public static int zzc(int i, C0947zzgi zzgi) {
        int i2 = i;
        int i3 = i2;
        int zzg = zzg(i2 << 3);
        int zza2 = zzgi.zza();
        return zzg + zzg(zza2) + zza2;
    }

    public static int zza(int i, C0994zzib zzib) {
        int i2 = i;
        int i3 = i2;
        int zzg = zzg(i2 << 3);
        int zzb2 = zzib.zzb();
        return zzg + zzg(zzb2) + zzb2;
    }

    static int zzb(int i, C1011zzis zzis, C1028zzji zzji) {
        int i2 = i;
        int i3 = i2;
        return zzg(i2 << 3) + zza(zzis, zzji);
    }

    public static int zzb(int i, C1011zzis zzis) {
        return (zzg(1 << 3) << 1) + zzg(2, i) + zzg(3 << 3) + zzb(zzis);
    }

    public static int zzd(int i, C0947zzgi zzgi) {
        return (zzg(1 << 3) << 1) + zzg(2, i) + zzc(3, zzgi);
    }

    public static int zzb(int i, C0994zzib zzib) {
        return (zzg(1 << 3) << 1) + zzg(2, i) + zza(3, zzib);
    }

    public static int zze(int i) {
        return zzg(i << 3);
    }

    public static int zzf(int i) {
        int i2 = i;
        if (i2 >= 0) {
            return zzg(i2);
        }
        return 10;
    }

    public static int zzg(int i) {
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

    public static int zzh(int i) {
        return zzg(zzm(i));
    }

    public static int zzi(int i) {
        int i2 = i;
        return 4;
    }

    public static int zzj(int i) {
        int i2 = i;
        return 4;
    }

    public static int zzd(long j) {
        return zze(j);
    }

    public static int zze(long j) {
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

    public static int zzf(long j) {
        return zze(zzi(j));
    }

    public static int zzg(long j) {
        long j2 = j;
        return 8;
    }

    public static int zzh(long j) {
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

    public static int zzb(boolean z) {
        boolean z2 = z;
        return 1;
    }

    public static int zzk(int i) {
        return zzf(i);
    }

    public static int zzb(String str) {
        int length;
        String str2 = str;
        try {
            length = C1056zzkj.zza((CharSequence) str2);
        } catch (C1059zzkm e) {
            length = str2.getBytes(C0980zzho.zza).length;
        }
        int i = length;
        return zzg(i) + i;
    }

    public static int zza(C0994zzib zzib) {
        int zzb2 = zzib.zzb();
        return zzg(zzb2) + zzb2;
    }

    public static int zzb(C0947zzgi zzgi) {
        int zza2 = zzgi.zza();
        return zzg(zza2) + zza2;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        return zzg(length) + length;
    }

    public static int zzb(C1011zzis zzis) {
        int zzd = zzis.zzd();
        return zzg(zzd) + zzd;
    }

    static int zza(C1011zzis zzis, C1028zzji zzji) {
        C1028zzji zzji2 = zzji;
        C0936zzfy zzfy = (C0936zzfy) zzis;
        C0936zzfy zzfy2 = zzfy;
        int zzb2 = zzfy.zzb();
        int i = zzb2;
        if (zzb2 == -1) {
            i = zzji2.zzb(zzfy2);
            zzfy2.zza(i);
        }
        int i2 = i;
        return zzg(i2) + i2;
    }

    private static int zzm(int i) {
        int i2 = i;
        return (i2 << 1) ^ (i2 >> 31);
    }

    private static long zzi(long j) {
        long j2 = j;
        return (j2 << 1) ^ (j2 >> 63);
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, C1059zzkm zzkm) throws IOException {
        Throwable th;
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzkm);
        byte[] bytes = str.getBytes(C0980zzho.zza);
        try {
            zzb(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            IndexOutOfBoundsException indexOutOfBoundsException = e;
            Throwable th2 = th;
            new zzb(indexOutOfBoundsException);
            throw th2;
        } catch (zzb e2) {
            throw e2;
        }
    }

    @Deprecated
    static int zzc(int i, C1011zzis zzis, C1028zzji zzji) {
        int i2 = i;
        int i3 = i2;
        int zzg = zzg(i2 << 3) << 1;
        C1028zzji zzji2 = zzji;
        C0936zzfy zzfy = (C0936zzfy) zzis;
        C0936zzfy zzfy2 = zzfy;
        int zzb2 = zzfy.zzb();
        int i4 = zzb2;
        if (zzb2 == -1) {
            i4 = zzji2.zzb(zzfy2);
            zzfy2.zza(i4);
        }
        return zzg + i4;
    }

    @Deprecated
    public static int zzc(C1011zzis zzis) {
        return zzis.zzd();
    }

    @Deprecated
    public static int zzl(int i) {
        return zzg(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C0960zzgv(C0962zzgx zzgx) {
        this();
        C0962zzgx zzgx2 = zzgx;
    }
}
