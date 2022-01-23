package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
class zzgs extends zzgp {
    protected final byte[] zzb;

    zzgs(byte[] bArr) {
        Throwable th;
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            Throwable th2 = th;
            new NullPointerException();
            throw th2;
        }
        this.zzb = bArr2;
    }

    public byte zza(int i) {
        return this.zzb[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i) {
        return this.zzb[i];
    }

    public int zza() {
        return this.zzb.length;
    }

    public final zzgi zza(int i, int i2) {
        zzgi zzgi;
        int i3 = i;
        int zzb2 = zzb(0, i2, zza());
        int i4 = zzb2;
        if (zzb2 == 0) {
            return zzgi.zza;
        }
        new zzgl(this.zzb, zze(), i4);
        return zzgi;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzgf zzgf) throws IOException {
        zzgf.zza(this.zzb, zze(), zza());
    }

    /* access modifiers changed from: protected */
    public final String zza(Charset charset) {
        String str;
        new String(this.zzb, zze(), zza(), charset);
        return str;
    }

    public final boolean zzc() {
        int zze = zze();
        return zzkj.zza(this.zzb, zze, zze + zza());
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r5 = r1
            r6 = r0
            if (r5 != r6) goto L_0x0009
            r5 = 1
            r0 = r5
        L_0x0008:
            return r0
        L_0x0009:
            r5 = r1
            boolean r5 = r5 instanceof com.google.android.gms.internal.auth.zzgi
            if (r5 != 0) goto L_0x0011
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x0011:
            r5 = r0
            int r5 = r5.zza()
            r6 = r1
            com.google.android.gms.internal.auth.zzgi r6 = (com.google.android.gms.internal.auth.zzgi) r6
            int r6 = r6.zza()
            if (r5 == r6) goto L_0x0022
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x0022:
            r5 = r0
            int r5 = r5.zza()
            if (r5 != 0) goto L_0x002c
            r5 = 1
            r0 = r5
            goto L_0x0008
        L_0x002c:
            r5 = r1
            boolean r5 = r5 instanceof com.google.android.gms.internal.auth.zzgs
            if (r5 == 0) goto L_0x005e
            r5 = r1
            com.google.android.gms.internal.auth.zzgs r5 = (com.google.android.gms.internal.auth.zzgs) r5
            r2 = r5
            r5 = r0
            int r5 = r5.zzd()
            r3 = r5
            r5 = r2
            int r5 = r5.zzd()
            r4 = r5
            r5 = r3
            if (r5 == 0) goto L_0x004e
            r5 = r4
            if (r5 == 0) goto L_0x004e
            r5 = r3
            r6 = r4
            if (r5 == r6) goto L_0x004e
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x004e:
            r5 = r0
            r6 = r1
            com.google.android.gms.internal.auth.zzgs r6 = (com.google.android.gms.internal.auth.zzgs) r6
            r7 = 0
            r8 = r0
            int r8 = r8.zza()
            boolean r5 = r5.zza(r6, r7, r8)
            r0 = r5
            goto L_0x0008
        L_0x005e:
            r5 = r1
            r6 = r0
            boolean r5 = r5.equals(r6)
            r0 = r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzgs.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzgi zzgi, int i, int i2) {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        StringBuilder sb2;
        zzgi zzgi2 = zzgi;
        int i3 = i;
        int i4 = i2;
        if (i4 > zzgi2.zza()) {
            Throwable th3 = th2;
            int zza = zza();
            new StringBuilder(40);
            new IllegalArgumentException(sb2.append("Length too large: ").append(i4).append(zza).toString());
            throw th3;
        } else if (i4 > zzgi2.zza()) {
            Throwable th4 = th;
            int zza2 = zzgi2.zza();
            new StringBuilder(59);
            new IllegalArgumentException(sb.append("Ran off end of other: 0, ").append(i4).append(", ").append(zza2).toString());
            throw th4;
        } else if (!(zzgi2 instanceof zzgs)) {
            return zzgi2.zza(0, i4).equals(zza(0, i4));
        } else {
            zzgs zzgs = (zzgs) zzgi2;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzgs.zzb;
            int zze = zze() + i4;
            int zze2 = zze();
            int zze3 = zzgs.zze();
            while (zze2 < zze) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final int zza(int i, int i2, int i3) {
        int i4 = i2;
        return zzho.zza(i, this.zzb, zze(), i3);
    }

    /* access modifiers changed from: protected */
    public int zze() {
        return 0;
    }
}
