package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.C1069zzkw;
import com.google.appinventor.components.runtime.util.Ev3Constants;

/* renamed from: com.google.android.gms.internal.auth.zzla */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C1074zzla implements C1075zzlb {
    private static final C0854zzcx<Double> zza;
    private static final C0854zzcx<Boolean> zzb;
    private static final C0854zzcx<Long> zzc;
    private static final C0854zzcx<Boolean> zzd;
    private static final C0854zzcx<C1069zzkw.zza> zze;
    private static final C0854zzcx<Boolean> zzf;
    private static final C0854zzcx<Long> zzg;
    private static final C0854zzcx<Long> zzh;
    private static final C0854zzcx<Boolean> zzi;
    private static final C0854zzcx<Boolean> zzj;
    private static final C0854zzcx<Long> zzk;
    private static final C0854zzcx<Boolean> zzl;
    private static final C0854zzcx<Double> zzm;

    public C1074zzla() {
    }

    public final C1069zzkw.zza zza() {
        return zze.zzc();
    }

    public final boolean zzb() {
        return zzi.zzc().booleanValue();
    }

    public final boolean zzc() {
        return zzj.zzc().booleanValue();
    }

    static {
        C0863zzdf zzdf;
        Throwable th;
        new C0863zzdf(C0851zzcu.zza("com.google.android.gms.auth_account"));
        C0863zzdf zza2 = zzdf.zza();
        C0863zzdf zzdf2 = zza2;
        zza = zza2.zza("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        zzb = zzdf2.zza("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        zzc = zzdf2.zza("getTokenRefactor__android_id_shift", 0);
        zzd = zzdf2.zza("getTokenRefactor__authenticator_logic_improved", false);
        try {
            zze = zzdf2.zza("getTokenRefactor__blocked_packages", C1069zzkw.zza.zza(new byte[]{10, 19, Ev3Constants.Opcode.NOTE_TO_FREQ, Ev3Constants.Opcode.JR_EQF, Ev3Constants.Opcode.JR_EQ16, Ev3Constants.Opcode.RL32, Ev3Constants.Opcode.PORT_CNV_OUTPUT, Ev3Constants.Opcode.JR_EQ32, Ev3Constants.Opcode.JR_LT8, Ev3Constants.Opcode.JR_NEQ32, Ev3Constants.Opcode.JR_EQF, Ev3Constants.Opcode.JR_GT16, Ev3Constants.Opcode.JR_LT8, Ev3Constants.Opcode.RL32, Ev3Constants.Opcode.JR_LTEQ32, Ev3Constants.Opcode.JR_LT16, Ev3Constants.Opcode.JR_EQ32, Ev3Constants.Opcode.JR_LT8, Ev3Constants.Opcode.JR_GT16, Ev3Constants.Opcode.JR_EQ32, Ev3Constants.Opcode.JR_LTF}), C1076zzlc.zza);
            zzf = zzdf2.zza("getTokenRefactor__chimera_get_token_evolved", true);
            zzg = zzdf2.zza("getTokenRefactor__clear_token_timeout_seconds", 20);
            zzh = zzdf2.zza("getTokenRefactor__default_task_timeout_seconds", 20);
            zzi = zzdf2.zza("getTokenRefactor__gaul_accounts_api_evolved", false);
            zzj = zzdf2.zza("getTokenRefactor__gaul_token_api_evolved", false);
            zzk = zzdf2.zza("getTokenRefactor__get_token_timeout_seconds", 120);
            zzl = zzdf2.zza("getTokenRefactor__gms_account_authenticator_evolved", true);
            zzm = zzdf2.zza("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (C0984zzhs e) {
            C0984zzhs zzhs = e;
            Throwable th2 = th;
            new AssertionError("Could not parse proto flag \"getTokenRefactor__blocked_packages\"", zzhs);
            throw th2;
        }
    }
}
