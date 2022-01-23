package com.google.android.gms.gcm;

import android.os.Bundle;
import com.google.android.gms.common.internal.C0452ShowFirstParty;

@C0452ShowFirstParty
public final class zzl {
    public static final zzl zzaq;
    private static final zzl zzar;
    private final int zzas;
    private final int zzat = 30;
    private final int zzau = 3600;

    private zzl(int i, int i2, int i3) {
        int i4 = i2;
        int i5 = i3;
        this.zzas = i;
    }

    public final int zzi() {
        return this.zzas;
    }

    public final int zzj() {
        return this.zzat;
    }

    public final int zzk() {
        return this.zzau;
    }

    public final Bundle zzf(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("retry_policy", this.zzas);
        bundle2.putInt("initial_backoff_seconds", this.zzat);
        bundle2.putInt("maximum_backoff_seconds", this.zzau);
        return bundle2;
    }

    public final String toString() {
        StringBuilder sb;
        int i = this.zzas;
        int i2 = this.zzat;
        int i3 = this.zzau;
        new StringBuilder(74);
        return sb.append("policy=").append(i).append(" initial_backoff=").append(i2).append(" maximum_backoff=").append(i3).toString();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r3 = r1
            r4 = r0
            if (r3 != r4) goto L_0x0009
            r3 = 1
            r0 = r3
        L_0x0008:
            return r0
        L_0x0009:
            r3 = r1
            boolean r3 = r3 instanceof com.google.android.gms.gcm.zzl
            if (r3 != 0) goto L_0x0011
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x0011:
            r3 = r1
            com.google.android.gms.gcm.zzl r3 = (com.google.android.gms.gcm.zzl) r3
            r5 = r3
            r3 = r5
            r4 = r5
            r2 = r4
            int r3 = r3.zzas
            r4 = r0
            int r4 = r4.zzas
            if (r3 != r4) goto L_0x0032
            r3 = r2
            int r3 = r3.zzat
            r4 = r0
            int r4 = r4.zzat
            if (r3 != r4) goto L_0x0032
            r3 = r2
            int r3 = r3.zzau
            r4 = r0
            int r4 = r4.zzau
            if (r3 != r4) goto L_0x0032
            r3 = 1
            r0 = r3
            goto L_0x0008
        L_0x0032:
            r3 = 0
            r0 = r3
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.zzl.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((((1000003 ^ (this.zzas + 1)) * 1000003) ^ this.zzat) * 1000003) ^ this.zzau;
    }

    static {
        zzl zzl;
        zzl zzl2;
        new zzl(0, 30, 3600);
        zzaq = zzl;
        new zzl(1, 30, 3600);
        zzar = zzl2;
    }
}
