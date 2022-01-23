package com.google.android.gms.internal.firebase_auth;

public class zzih {
    private static final zzhf zzvq = zzhf.zzhq();
    private zzgf zzabv;
    private volatile zzjc zzabw;
    private volatile zzgf zzabx;

    public zzih() {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r5 = r0
            r6 = r1
            if (r5 != r6) goto L_0x0009
            r5 = 1
            r0 = r5
        L_0x0008:
            return r0
        L_0x0009:
            r5 = r1
            boolean r5 = r5 instanceof com.google.android.gms.internal.firebase_auth.zzih
            if (r5 != 0) goto L_0x0011
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x0011:
            r5 = r1
            com.google.android.gms.internal.firebase_auth.zzih r5 = (com.google.android.gms.internal.firebase_auth.zzih) r5
            r2 = r5
            r5 = r0
            com.google.android.gms.internal.firebase_auth.zzjc r5 = r5.zzabw
            r3 = r5
            r5 = r2
            com.google.android.gms.internal.firebase_auth.zzjc r5 = r5.zzabw
            r4 = r5
            r5 = r3
            if (r5 != 0) goto L_0x0033
            r5 = r4
            if (r5 != 0) goto L_0x0033
            r5 = r0
            com.google.android.gms.internal.firebase_auth.zzgf r5 = r5.zzft()
            r6 = r2
            com.google.android.gms.internal.firebase_auth.zzgf r6 = r6.zzft()
            boolean r5 = r5.equals(r6)
            r0 = r5
            goto L_0x0008
        L_0x0033:
            r5 = r3
            if (r5 == 0) goto L_0x0041
            r5 = r4
            if (r5 == 0) goto L_0x0041
            r5 = r3
            r6 = r4
            boolean r5 = r5.equals(r6)
            r0 = r5
            goto L_0x0008
        L_0x0041:
            r5 = r3
            if (r5 == 0) goto L_0x0055
            r5 = r3
            r6 = r2
            r7 = r3
            com.google.android.gms.internal.firebase_auth.zzjc r7 = r7.zzii()
            com.google.android.gms.internal.firebase_auth.zzjc r6 = r6.zzi(r7)
            boolean r5 = r5.equals(r6)
            r0 = r5
            goto L_0x0008
        L_0x0055:
            r5 = r0
            r6 = r4
            com.google.android.gms.internal.firebase_auth.zzjc r6 = r6.zzii()
            com.google.android.gms.internal.firebase_auth.zzjc r5 = r5.zzi(r6)
            r6 = r4
            boolean r5 = r5.equals(r6)
            r0 = r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzih.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return 1;
    }

    /* JADX INFO: finally extract failed */
    private final zzjc zzi(zzjc zzjc) {
        zzjc zzjc2 = zzjc;
        if (this.zzabw == null) {
            synchronized (this) {
                try {
                    if (this.zzabw != null) {
                    } else {
                        this.zzabw = zzjc2;
                        this.zzabx = zzgf.zzvv;
                    }
                } catch (zzic e) {
                    this.zzabw = zzjc2;
                    this.zzabx = zzgf.zzvv;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
        return this.zzabw;
    }

    public final zzjc zzj(zzjc zzjc) {
        zzjc zzjc2 = this.zzabw;
        this.zzabv = null;
        this.zzabx = null;
        this.zzabw = zzjc;
        return zzjc2;
    }

    public final int zzik() {
        if (this.zzabx != null) {
            return this.zzabx.size();
        }
        if (this.zzabw != null) {
            return this.zzabw.zzik();
        }
        return 0;
    }

    /* JADX INFO: finally extract failed */
    public final zzgf zzft() {
        if (this.zzabx != null) {
            return this.zzabx;
        }
        synchronized (this) {
            try {
                if (this.zzabx != null) {
                    zzgf zzgf = this.zzabx;
                    return zzgf;
                }
                if (this.zzabw == null) {
                    this.zzabx = zzgf.zzvv;
                } else {
                    this.zzabx = this.zzabw.zzft();
                }
                zzgf zzgf2 = this.zzabx;
                return zzgf2;
            } catch (Throwable th) {
                Throwable th2 = th;
                throw th2;
            }
        }
    }
}
