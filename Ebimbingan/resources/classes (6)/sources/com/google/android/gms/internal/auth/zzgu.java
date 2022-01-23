package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class zzgu {
    private int zza;
    private int zzb;
    private boolean zzc;

    static zzgu zza(byte[] bArr, int i, int i2, boolean z) {
        zzgu zzgu;
        Throwable th;
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        new zzgw(bArr, 0, i4, false, (zzgt) null);
        zzgu zzgu2 = zzgu;
        try {
            int zza2 = zzgu2.zza(i4);
            return zzgu2;
        } catch (zzhs e) {
            zzhs zzhs = e;
            Throwable th2 = th;
            new IllegalArgumentException(zzhs);
            throw th2;
        }
    }

    public abstract int zza();

    public abstract int zza(int i) throws zzhs;

    private zzgu() {
        this.zza = 100;
        this.zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
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
    /* synthetic */ zzgu(zzgt zzgt) {
        this();
        zzgt zzgt2 = zzgt;
    }
}
