package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzhm;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzjj implements zziq {
    private final zzis zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzjj(zzis zzis, String str, Object[] objArr) {
        String str2 = str;
        this.zza = zzis;
        this.zzb = str2;
        this.zzc = objArr;
        int i = 0 + 1;
        char charAt = str2.charAt(0);
        char c = charAt;
        if (charAt < 55296) {
            this.zzd = c;
            return;
        }
        char c2 = c & 8191;
        int i2 = 13;
        while (true) {
            int i3 = i;
            i++;
            char charAt2 = str2.charAt(i3);
            char c3 = charAt2;
            if (charAt2 >= 55296) {
                c2 |= (c3 & 8191) << i2;
                i2 += 13;
            } else {
                this.zzd = c2 | (c3 << i2);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }

    public final zzis zzc() {
        return this.zza;
    }

    public final int zza() {
        return (this.zzd & 1) == 1 ? zzhm.zze.zzh : zzhm.zze.zzi;
    }

    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }
}
