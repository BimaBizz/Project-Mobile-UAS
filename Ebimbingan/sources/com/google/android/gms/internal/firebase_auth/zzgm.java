package com.google.android.gms.internal.firebase_auth;

final class zzgm extends zzgp {
    private final int zzwa;
    private final int zzwb;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzgm(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r0
            r5 = r1
            r4.<init>(r5)
            r4 = r2
            r5 = r2
            r6 = r3
            int r5 = r5 + r6
            r6 = r1
            int r6 = r6.length
            int r4 = zzc(r4, r5, r6)
            r4 = r0
            r5 = r2
            r4.zzwa = r5
            r4 = r0
            r5 = r3
            r4.zzwb = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzgm.<init>(byte[], int, int):void");
    }

    public final byte zzp(int i) {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        StringBuilder sb2;
        int i2 = i;
        int size = size();
        int i3 = i2;
        int i4 = i3;
        if ((i3 | (size - (i4 + 1))) >= 0) {
            return this.zzwd[this.zzwa + i2];
        }
        if (i4 < 0) {
            Throwable th3 = th2;
            new StringBuilder(22);
            new ArrayIndexOutOfBoundsException(sb2.append("Index < 0: ").append(i4).toString());
            throw th3;
        }
        Throwable th4 = th;
        new StringBuilder(40);
        new ArrayIndexOutOfBoundsException(sb.append("Index > length: ").append(i4).append(", ").append(size).toString());
        throw th4;
    }

    /* access modifiers changed from: package-private */
    public final byte zzq(int i) {
        return this.zzwd[this.zzwa + i];
    }

    public final int size() {
        return this.zzwb;
    }

    /* access modifiers changed from: protected */
    public final int zzgf() {
        return this.zzwa;
    }
}
