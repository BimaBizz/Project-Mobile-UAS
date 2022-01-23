package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;
import java.io.IOException;
import java.util.Arrays;

public final class zzkn {
    private static final zzkn zzael;
    private int count;
    private int zzaak;
    private Object[] zzacy;
    private int[] zzaem;
    private boolean zzvo;

    public static zzkn zzko() {
        return zzael;
    }

    static zzkn zzkp() {
        zzkn zzkn;
        zzkn zzkn2 = zzkn;
        new zzkn();
        return zzkn2;
    }

    static zzkn zza(zzkn zzkn, zzkn zzkn2) {
        zzkn zzkn3;
        zzkn zzkn4 = zzkn;
        zzkn zzkn5 = zzkn2;
        int i = zzkn4.count + zzkn5.count;
        int[] copyOf = Arrays.copyOf(zzkn4.zzaem, i);
        System.arraycopy(zzkn5.zzaem, 0, copyOf, zzkn4.count, zzkn5.count);
        Object[] copyOf2 = Arrays.copyOf(zzkn4.zzacy, i);
        System.arraycopy(zzkn5.zzacy, 0, copyOf2, zzkn4.count, zzkn5.count);
        new zzkn(i, copyOf, copyOf2, true);
        return zzkn3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private zzkn() {
        this(0, new int[8], new Object[8], true);
    }

    private zzkn(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzaak = -1;
        this.count = i;
        this.zzaem = iArr;
        this.zzacy = objArr;
        this.zzvo = z;
    }

    public final void zzfy() {
        this.zzvo = false;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzlh zzlh) throws IOException {
        zzlh zzlh2 = zzlh;
        if (zzlh2.zzhl() == zzhs.zzd.zzaaz) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzlh2.zza(this.zzaem[i] >>> 3, this.zzacy[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzlh2.zza(this.zzaem[i2] >>> 3, this.zzacy[i2]);
        }
    }

    public final void zzb(zzlh zzlh) throws IOException {
        zzlh zzlh2 = zzlh;
        if (this.count != 0) {
            if (zzlh2.zzhl() == zzhs.zzd.zzaay) {
                for (int i = 0; i < this.count; i++) {
                    zzb(this.zzaem[i], this.zzacy[i], zzlh2);
                }
                return;
            }
            for (int i2 = this.count - 1; i2 >= 0; i2--) {
                zzb(this.zzaem[i2], this.zzacy[i2], zzlh2);
            }
        }
    }

    private static void zzb(int i, Object obj, zzlh zzlh) throws IOException {
        Throwable th;
        int i2 = i;
        Object obj2 = obj;
        zzlh zzlh2 = zzlh;
        int i3 = i2 >>> 3;
        switch (i2 & 7) {
            case 0:
                zzlh2.zzi(i3, ((Long) obj2).longValue());
                return;
            case 1:
                zzlh2.zzc(i3, ((Long) obj2).longValue());
                return;
            case 2:
                zzlh2.zza(i3, (zzgf) obj2);
                return;
            case 3:
                if (zzlh2.zzhl() == zzhs.zzd.zzaay) {
                    zzlh2.zzat(i3);
                    ((zzkn) obj2).zzb(zzlh2);
                    zzlh2.zzau(i3);
                    return;
                }
                zzlh2.zzau(i3);
                ((zzkn) obj2).zzb(zzlh2);
                zzlh2.zzat(i3);
                return;
            case 5:
                zzlh2.zzi(i3, ((Integer) obj2).intValue());
                return;
            default:
                Throwable th2 = th;
                new RuntimeException(zzic.zziw());
                throw th2;
        }
    }

    public final int zzkq() {
        int i = this.zzaak;
        int i2 = i;
        if (i != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.count; i4++) {
            i3 += zzha.zzd(this.zzaem[i4] >>> 3, (zzgf) this.zzacy[i4]);
        }
        this.zzaak = i3;
        return i3;
    }

    public final int zzik() {
        Throwable th;
        int i;
        int zzak;
        int i2 = this.zzaak;
        int i3 = i2;
        if (i2 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.count; i5++) {
            int i6 = this.zzaem[i5];
            int i7 = i6 >>> 3;
            switch (i6 & 7) {
                case 0:
                    i = i4;
                    zzak = zzha.zze(i7, ((Long) this.zzacy[i5]).longValue());
                    break;
                case 1:
                    i = i4;
                    zzak = zzha.zzg(i7, ((Long) this.zzacy[i5]).longValue());
                    break;
                case 2:
                    i = i4;
                    zzak = zzha.zzc(i7, (zzgf) this.zzacy[i5]);
                    break;
                case 3:
                    i = i4;
                    zzak = (zzha.zzak(i7) << 1) + ((zzkn) this.zzacy[i5]).zzik();
                    break;
                case 5:
                    i = i4;
                    zzak = zzha.zzm(i7, ((Integer) this.zzacy[i5]).intValue());
                    break;
                default:
                    Throwable th2 = th;
                    new IllegalStateException(zzic.zziw());
                    throw th2;
            }
            i4 = i + zzak;
        }
        this.zzaak = i4;
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
            boolean r7 = r7 instanceof com.google.android.gms.internal.firebase_auth.zzkn
            if (r7 != 0) goto L_0x0017
            r7 = 0
            r0 = r7
            goto L_0x0008
        L_0x0017:
            r7 = r1
            com.google.android.gms.internal.firebase_auth.zzkn r7 = (com.google.android.gms.internal.firebase_auth.zzkn) r7
            r2 = r7
            r7 = r0
            int r7 = r7.count
            r8 = r2
            int r8 = r8.count
            if (r7 != r8) goto L_0x0065
            r7 = r0
            int[] r7 = r7.zzaem
            r8 = r2
            int[] r8 = r8.zzaem
            r9 = r0
            int r9 = r9.count
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
            java.lang.Object[] r7 = r7.zzacy
            r8 = r2
            java.lang.Object[] r8 = r8.zzacy
            r9 = r0
            int r9 = r9.count
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzkn.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 527 + this.count;
        int i2 = i;
        int i3 = i * 31;
        int[] iArr = this.zzaem;
        int i4 = this.count;
        int[] iArr2 = iArr;
        int i5 = 17;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 = (i5 * 31) + iArr2[i6];
        }
        int i7 = i3 + i5;
        int i8 = i7;
        int i9 = i7 * 31;
        Object[] objArr = this.zzacy;
        int i10 = this.count;
        Object[] objArr2 = objArr;
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr2[i12].hashCode();
        }
        return i9 + i11;
    }

    /* access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        StringBuilder sb2 = sb;
        int i2 = i;
        for (int i3 = 0; i3 < this.count; i3++) {
            zzjd.zza(sb2, i2, String.valueOf(this.zzaem[i3] >>> 3), this.zzacy[i3]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(int i, Object obj) {
        Throwable th;
        int i2 = i;
        Object obj2 = obj;
        if (!this.zzvo) {
            Throwable th2 = th;
            new UnsupportedOperationException();
            throw th2;
        }
        if (this.count == this.zzaem.length) {
            int i3 = this.count + (this.count < 4 ? 8 : this.count >> 1);
            this.zzaem = Arrays.copyOf(this.zzaem, i3);
            this.zzacy = Arrays.copyOf(this.zzacy, i3);
        }
        this.zzaem[this.count] = i2;
        this.zzacy[this.count] = obj2;
        this.count++;
    }

    static {
        zzkn zzkn;
        new zzkn(0, new int[0], new Object[0], false);
        zzael = zzkn;
    }
}
