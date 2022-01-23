package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzib */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0994zzib {
    private static final C0967zzhb zza = C0967zzhb.zza();
    private C0947zzgi zzb;
    private volatile C1011zzis zzc;
    private volatile C0947zzgi zzd;

    public C0994zzib() {
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
            boolean r5 = r5 instanceof com.google.android.gms.internal.auth.C0994zzib
            if (r5 != 0) goto L_0x0011
            r5 = 0
            r0 = r5
            goto L_0x0008
        L_0x0011:
            r5 = r1
            com.google.android.gms.internal.auth.zzib r5 = (com.google.android.gms.internal.auth.C0994zzib) r5
            r2 = r5
            r5 = r0
            com.google.android.gms.internal.auth.zzis r5 = r5.zzc
            r3 = r5
            r5 = r2
            com.google.android.gms.internal.auth.zzis r5 = r5.zzc
            r4 = r5
            r5 = r3
            if (r5 != 0) goto L_0x0033
            r5 = r4
            if (r5 != 0) goto L_0x0033
            r5 = r0
            com.google.android.gms.internal.auth.zzgi r5 = r5.zzc()
            r6 = r2
            com.google.android.gms.internal.auth.zzgi r6 = r6.zzc()
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
            com.google.android.gms.internal.auth.zzis r7 = r7.zzh()
            com.google.android.gms.internal.auth.zzis r6 = r6.zzb(r7)
            boolean r5 = r5.equals(r6)
            r0 = r5
            goto L_0x0008
        L_0x0055:
            r5 = r0
            r6 = r4
            com.google.android.gms.internal.auth.zzis r6 = r6.zzh()
            com.google.android.gms.internal.auth.zzis r5 = r5.zzb(r6)
            r6 = r4
            boolean r5 = r5.equals(r6)
            r0 = r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0994zzib.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return 1;
    }

    /* JADX INFO: finally extract failed */
    private final C1011zzis zzb(C1011zzis zzis) {
        C1011zzis zzis2 = zzis;
        if (this.zzc == null) {
            synchronized (this) {
                try {
                    if (this.zzc != null) {
                    } else {
                        this.zzc = zzis2;
                        this.zzd = C0947zzgi.zza;
                    }
                } catch (C0984zzhs e) {
                    this.zzc = zzis2;
                    this.zzd = C0947zzgi.zza;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
        return this.zzc;
    }

    public final C1011zzis zza(C1011zzis zzis) {
        C1011zzis zzis2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzis;
        return zzis2;
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zza();
        }
        if (this.zzc != null) {
            return this.zzc.zzd();
        }
        return 0;
    }

    /* JADX INFO: finally extract failed */
    public final C0947zzgi zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            try {
                if (this.zzd != null) {
                    C0947zzgi zzgi = this.zzd;
                    return zzgi;
                }
                if (this.zzc == null) {
                    this.zzd = C0947zzgi.zza;
                } else {
                    this.zzd = this.zzc.zza();
                }
                C0947zzgi zzgi2 = this.zzd;
                return zzgi2;
            } catch (Throwable th) {
                Throwable th2 = th;
                throw th2;
            }
        }
    }
}
