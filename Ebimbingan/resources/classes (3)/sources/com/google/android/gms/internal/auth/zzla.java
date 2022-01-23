package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzkw;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzla implements zzlb {
    private static final zzcx<Double> zza;
    private static final zzcx<Boolean> zzb;
    private static final zzcx<Long> zzc;
    private static final zzcx<Boolean> zzd;
    private static final zzcx<zzkw.zza> zze;
    private static final zzcx<Boolean> zzf;
    private static final zzcx<Long> zzg;
    private static final zzcx<Long> zzh;
    private static final zzcx<Boolean> zzi;
    private static final zzcx<Boolean> zzj;
    private static final zzcx<Long> zzk;
    private static final zzcx<Boolean> zzl;
    private static final zzcx<Double> zzm;

    public zzla() {
    }

    public final zzkw.zza zza() {
        return zze.zzc();
    }

    public final boolean zzb() {
        return zzi.zzc().booleanValue();
    }

    public final boolean zzc() {
        return zzj.zzc().booleanValue();
    }

    static {
        zzdf zzdf;
        Throwable th;
        new zzdf(zzcu.zza("com.google.android.gms.auth_account"));
        zzdf zza2 = zzdf.zza();
        zzdf zzdf2 = zza2;
        zza = zza2.zza("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        zzb = zzdf2.zza("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        zzc = zzdf2.zza("getTokenRefactor__android_id_shift", 0);
        zzd = zzdf2.zza("getTokenRefactor__authenticator_logic_improved", false);
        try {
            zze = zzdf2.zza("getTokenRefactor__blocked_packages", zzkw.zza.zza(new byte[]{10, 19, 99, 111, 109, 46, 97, 110, 100, 114, 111, 105, 100, 46, 118, 101, 110, 100, 105, 110, 103}), zzlc.zza);
            zzf = zzdf2.zza("getTokenRefactor__chimera_get_token_evolved", true);
            zzg = zzdf2.zza("getTokenRefactor__clear_token_timeout_seconds", 20);
            zzh = zzdf2.zza("getTokenRefactor__default_task_timeout_seconds", 20);
            zzi = zzdf2.zza("getTokenRefactor__gaul_accounts_api_evolved", false);
            zzj = zzdf2.zza("getTokenRefactor__gaul_token_api_evolved", false);
            zzk = zzdf2.zza("getTokenRefactor__get_token_timeout_seconds", 120);
            zzl = zzdf2.zza("getTokenRefactor__gms_account_authenticator_evolved", true);
            zzm = zzdf2.zza("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (zzhs e) {
            zzhs zzhs = e;
            Throwable th2 = th;
            new AssertionError("Could not parse proto flag \"getTokenRefactor__blocked_packages\"", zzhs);
            throw th2;
        }
    }
}
