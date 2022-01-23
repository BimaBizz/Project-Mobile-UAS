package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzgu */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0959zzgu {
    private int zza;
    private int zzb;
    private boolean zzc;

    static C0959zzgu zza(byte[] bArr, int i, int i2, boolean z) {
        C0959zzgu zzgu;
        Throwable th;
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        new C0961zzgw(bArr, 0, i4, false, (C0958zzgt) null);
        C0959zzgu zzgu2 = zzgu;
        try {
            int zza2 = zzgu2.zza(i4);
            return zzgu2;
        } catch (C0984zzhs e) {
            C0984zzhs zzhs = e;
            Throwable th2 = th;
            new IllegalArgumentException(zzhs);
            throw th2;
        }
    }

    public abstract int zza();

    public abstract int zza(int i) throws C0984zzhs;

    private C0959zzgu() {
        this.zza = 100;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = false;
    }

    public static int zzb(int i) {
        int i2 = i;
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    public static long zza(long j) {
        long j2 = j;
        return (j2 >>> 1) ^ (-(j2 & 1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C0959zzgu(C0958zzgt zzgt) {
        this();
        C0958zzgt zzgt2 = zzgt;
    }
}
