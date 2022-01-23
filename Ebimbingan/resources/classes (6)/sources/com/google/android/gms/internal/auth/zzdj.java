package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzdj {
    private final boolean zza;

    public zzdj(zzdi zzdi) {
        zzdi zzdi2 = zzdi;
        Object zza2 = zzdq.zza(zzdi2, (Object) "BuildInfo must be non-null");
        this.zza = !zzdi2.zza();
    }

    public final boolean zza(String str) {
        String str2 = str;
        Object zza2 = zzdq.zza(str2, (Object) "flagName must not be null");
        if (!this.zza) {
            return true;
        }
        return zzdl.zza.zza().zza(str2);
    }
}
