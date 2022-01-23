package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.nio.charset.Charset;

class zzgp extends zzgq {
    protected final byte[] zzwd;

    zzgp(byte[] bArr) {
        Throwable th;
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            Throwable th2 = th;
            new NullPointerException();
            throw th2;
        }
        this.zzwd = bArr2;
    }

    public byte zzp(int i) {
        return this.zzwd[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzq(int i) {
        return this.zzwd[i];
    }

    public int size() {
        return this.zzwd.length;
    }

    public final zzgf zzd(int i, int i2) {
        zzgf zzgf;
        int i3 = i;
        int zzc = zzc(0, i2, size());
        int i4 = zzc;
        if (zzc == 0) {
            return zzgf.zzvv;
        }
        new zzgm(this.zzwd, zzgf(), i4);
        return zzgf;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzgg zzgg) throws IOException {
        zzgg.zzb(this.zzwd, zzgf(), size());
    }

    /* access modifiers changed from: protected */
    public final String zza(Charset charset) {
        String str;
        new String(this.zzwd, zzgf(), size(), charset);
        return str;
    }

    public final boolean zzgd() {
        int zzgf = zzgf();
        return zzkt.zze(this.zzwd, zzgf, zzgf + size());
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
            boolean r5 = r5 instanceof com.google.android.gms.internal.firebase_auth.zzgf
            if (r5 != 0) goto L_0x0011
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x0011:
            r5 = r0
            int r5 = r5.size()
            r6 = r1
            com.google.android.gms.internal.firebase_auth.zzgf r6 = (com.google.android.gms.internal.firebase_auth.zzgf) r6
            int r6 = r6.size()
            if (r5 == r6) goto L_0x0022
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x0022:
            r5 = r0
            int r5 = r5.size()
            if (r5 != 0) goto L_0x002c
            r5 = 1
            r0 = r5
            goto L_0x0008
        L_0x002c:
            r5 = r1
            boolean r5 = r5 instanceof com.google.android.gms.internal.firebase_auth.zzgp
            if (r5 == 0) goto L_0x005e
            r5 = r1
            com.google.android.gms.internal.firebase_auth.zzgp r5 = (com.google.android.gms.internal.firebase_auth.zzgp) r5
            r2 = r5
            r5 = r0
            int r5 = r5.zzge()
            r3 = r5
            r5 = r2
            int r5 = r5.zzge()
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
            com.google.android.gms.internal.firebase_auth.zzgp r6 = (com.google.android.gms.internal.firebase_auth.zzgp) r6
            r7 = 0
            r8 = r0
            int r8 = r8.size()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzgp.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzgf zzgf, int i, int i2) {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        StringBuilder sb2;
        zzgf zzgf2 = zzgf;
        int i3 = i;
        int i4 = i2;
        if (i4 > zzgf2.size()) {
            Throwable th3 = th2;
            int size = size();
            new StringBuilder(40);
            new IllegalArgumentException(sb2.append("Length too large: ").append(i4).append(size).toString());
            throw th3;
        } else if (i4 > zzgf2.size()) {
            Throwable th4 = th;
            int size2 = zzgf2.size();
            new StringBuilder(59);
            new IllegalArgumentException(sb.append("Ran off end of other: 0, ").append(i4).append(", ").append(size2).toString());
            throw th4;
        } else if (!(zzgf2 instanceof zzgp)) {
            return zzgf2.zzd(0, i4).equals(zzd(0, i4));
        } else {
            zzgp zzgp = (zzgp) zzgf2;
            byte[] bArr = this.zzwd;
            byte[] bArr2 = zzgp.zzwd;
            int zzgf3 = zzgf() + i4;
            int zzgf4 = zzgf();
            int zzgf5 = zzgp.zzgf();
            while (zzgf4 < zzgf3) {
                if (bArr[zzgf4] != bArr2[zzgf5]) {
                    return false;
                }
                zzgf4++;
                zzgf5++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final int zzb(int i, int i2, int i3) {
        int i4 = i2;
        return zzht.zza(i, this.zzwd, zzgf(), i3);
    }

    /* access modifiers changed from: protected */
    public int zzgf() {
        return 0;
    }
}
