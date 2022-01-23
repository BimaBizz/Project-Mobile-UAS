package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzhm;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzkd {
    private static final zzkd zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    public static zzkd zza() {
        return zza;
    }

    static zzkd zzb() {
        zzkd zzkd;
        zzkd zzkd2 = zzkd;
        new zzkd();
        return zzkd2;
    }

    static zzkd zza(zzkd zzkd, zzkd zzkd2) {
        zzkd zzkd3;
        zzkd zzkd4 = zzkd;
        zzkd zzkd5 = zzkd2;
        int i = zzkd4.zzb + zzkd5.zzb;
        int[] copyOf = Arrays.copyOf(zzkd4.zzc, i);
        System.arraycopy(zzkd5.zzc, 0, copyOf, zzkd4.zzb, zzkd5.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzkd4.zzd, i);
        System.arraycopy(zzkd5.zzd, 0, copyOf2, zzkd4.zzb, zzkd5.zzb);
        new zzkd(i, copyOf, copyOf2, true);
        return zzkd3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private zzkd() {
        this(0, new int[8], new Object[8], true);
    }

    private zzkd(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public final void zzc() {
        this.zzf = false;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzkx zzkx) throws IOException {
        zzkx zzkx2 = zzkx;
        if (zzkx2.zza() == zzhm.zze.zzk) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zzkx2.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzkx2.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzb(zzkx zzkx) throws IOException {
        zzkx zzkx2 = zzkx;
        if (this.zzb != 0) {
            if (zzkx2.zza() == zzhm.zze.zzj) {
                for (int i = 0; i < this.zzb; i++) {
                    zza(this.zzc[i], this.zzd[i], zzkx2);
                }
                return;
            }
            for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
                zza(this.zzc[i2], this.zzd[i2], zzkx2);
            }
        }
    }

    private static void zza(int i, Object obj, zzkx zzkx) throws IOException {
        Throwable th;
        int i2 = i;
        Object obj2 = obj;
        zzkx zzkx2 = zzkx;
        int i3 = i2 >>> 3;
        switch (i2 & 7) {
            case 0:
                zzkx2.zza(i3, ((Long) obj2).longValue());
                return;
            case 1:
                zzkx2.zzd(i3, ((Long) obj2).longValue());
                return;
            case 2:
                zzkx2.zza(i3, (zzgi) obj2);
                return;
            case 3:
                if (zzkx2.zza() == zzhm.zze.zzj) {
                    zzkx2.zza(i3);
                    ((zzkd) obj2).zzb(zzkx2);
                    zzkx2.zzb(i3);
                    return;
                }
                zzkx2.zzb(i3);
                ((zzkd) obj2).zzb(zzkx2);
                zzkx2.zza(i3);
                return;
            case 5:
                zzkx2.zzd(i3, ((Integer) obj2).intValue());
                return;
            default:
                Throwable th2 = th;
                new RuntimeException(zzhs.zzd());
                throw th2;
        }
    }

    public final int zzd() {
        int i = this.zze;
        int i2 = i;
        if (i != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            i3 += zzgv.zzd(this.zzc[i4] >>> 3, (zzgi) this.zzd[i4]);
        }
        this.zze = i3;
        return i3;
    }

    public final int zze() {
        Throwable th;
        int i;
        int zze2;
        int i2 = this.zze;
        int i3 = i2;
        if (i2 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            int i6 = this.zzc[i5];
            int i7 = i6 >>> 3;
            switch (i6 & 7) {
                case 0:
                    i = i4;
                    zze2 = zzgv.zze(i7, ((Long) this.zzd[i5]).longValue());
                    break;
                case 1:
                    i = i4;
                    zze2 = zzgv.zzg(i7, ((Long) this.zzd[i5]).longValue());
                    break;
                case 2:
                    i = i4;
                    zze2 = zzgv.zzc(i7, (zzgi) this.zzd[i5]);
                    break;
                case 3:
                    i = i4;
                    zze2 = (zzgv.zze(i7) << 1) + ((zzkd) this.zzd[i5]).zze();
                    break;
                case 5:
                    i = i4;
                    zze2 = zzgv.zzi(i7, ((Integer) this.zzd[i5]).intValue());
                    break;
                default:
                    Throwable th2 = th;
                    new IllegalStateException(zzhs.zzd());
                    throw th2;
            }
            i4 = i + zze2;
        }
        this.zze = i4;
        return i4;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r7 = r0
            r8 = r1
            if (r7 != r8) goto L_0x0009
            r7 = 1
            r0 = r7
        L_0x0008:
            return r0
        L_0x0009:
            r7 = r1
            if (r7 != 0) goto L_0x000f
            r7 = 0
            r0 = r7
            goto L_0x0008
        L_0x000f:
            r7 = r1
            boolean r7 = r7 instanceof com.google.android.gms.internal.auth.zzkd
            if (r7 != 0) goto L_0x0017
            r7 = 0
            r0 = r7
            goto L_0x0008
        L_0x0017:
            r7 = r1
            com.google.android.gms.internal.auth.zzkd r7 = (com.google.android.gms.internal.auth.zzkd) r7
            r2 = r7
            r7 = r0
            int r7 = r7.zzb
            r8 = r2
            int r8 = r8.zzb
            if (r7 != r8) goto L_0x0065
            r7 = r0
            int[] r7 = r7.zzc
            r8 = r2
            int[] r8 = r8.zzc
            r9 = r0
            int r9 = r9.zzb
            r5 = r9
            r4 = r8
            r3 = r7
            r7 = 0
            r6 = r7
        L_0x0031:
            r7 = r6
            r8 = r5
            if (r7 >= r8) goto L_0x006b
            r7 = r3
            r8 = r6
            r7 = r7[r8]
            r8 = r4
            r9 = r6
            r8 = r8[r9]
            if (r7 == r8) goto L_0x0068
            r7 = 0
        L_0x0040:
            if (r7 == 0) goto L_0x0065
            r7 = r0
            java.lang.Object[] r7 = r7.zzd
            r8 = r2
            java.lang.Object[] r8 = r8.zzd
            r9 = r0
            int r9 = r9.zzb
            r5 = r9
            r4 = r8
            r3 = r7
            r7 = 0
            r6 = r7
        L_0x0050:
            r7 = r6
            r8 = r5
            if (r7 >= r8) goto L_0x0070
            r7 = r3
            r8 = r6
            r7 = r7[r8]
            r8 = r4
            r9 = r6
            r8 = r8[r9]
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x006d
            r7 = 0
        L_0x0063:
            if (r7 != 0) goto L_0x0072
        L_0x0065:
            r7 = 0
            r0 = r7
            goto L_0x0008
        L_0x0068:
            int r6 = r6 + 1
            goto L_0x0031
        L_0x006b:
            r7 = 1
            goto L_0x0040
        L_0x006d:
            int r6 = r6 + 1
            goto L_0x0050
        L_0x0070:
            r7 = 1
            goto L_0x0063
        L_0x0072:
            r7 = 1
            r0 = r7
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzkd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (527 + this.zzb) * 31;
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        int[] iArr2 = iArr;
        int i3 = 17;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + iArr2[i4];
        }
        int i5 = (i + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        Object[] objArr2 = objArr;
        int i7 = 17;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 = (i7 * 31) + objArr2[i8].hashCode();
        }
        return i5 + i7;
    }

    /* access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        StringBuilder sb2 = sb;
        int i2 = i;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzix.zza(sb2, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i, Object obj) {
        Throwable th;
        int i2 = i;
        Object obj2 = obj;
        if (!this.zzf) {
            Throwable th2 = th;
            new UnsupportedOperationException();
            throw th2;
        }
        if (this.zzb == this.zzc.length) {
            int i3 = this.zzb + (this.zzb < 4 ? 8 : this.zzb >> 1);
            this.zzc = Arrays.copyOf(this.zzc, i3);
            this.zzd = Arrays.copyOf(this.zzd, i3);
        }
        this.zzc[this.zzb] = i2;
        this.zzd[this.zzb] = obj2;
        this.zzb++;
    }

    static {
        zzkd zzkd;
        new zzkd(0, new int[0], new Object[0], false);
        zza = zzkd;
    }
}
