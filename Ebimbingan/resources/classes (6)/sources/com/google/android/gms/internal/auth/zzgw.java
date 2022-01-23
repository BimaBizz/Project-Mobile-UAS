package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzgw extends zzgu {
    private final byte[] zza;
    private final boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzgw(byte[] bArr, int i, int i2, boolean z) {
        super((zzgt) null);
        int i3 = i;
        this.zzg = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zza = bArr;
        this.zzc = i3 + i2;
        this.zze = i3;
        this.zzf = this.zze;
        this.zzb = z;
    }

    public final int zza(int i) throws zzhs {
        int i2 = i;
        if (i2 < 0) {
            throw zzhs.zzb();
        }
        int zza2 = i2 + zza();
        int i3 = this.zzg;
        if (zza2 > i3) {
            throw zzhs.zza();
        }
        this.zzg = zza2;
        this.zzc += this.zzd;
        int i4 = this.zzc - this.zzf;
        int i5 = i4;
        if (i4 > this.zzg) {
            this.zzd = i5 - this.zzg;
            this.zzc -= this.zzd;
        } else {
            this.zzd = 0;
        }
        return i3;
    }

    public final int zza() {
        return this.zze - this.zzf;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzgw(byte[] bArr, int i, int i2, boolean z, zzgt zzgt) {
        this(bArr, 0, i2, false);
        int i3 = i;
        boolean z2 = z;
        zzgt zzgt2 = zzgt;
    }
}
