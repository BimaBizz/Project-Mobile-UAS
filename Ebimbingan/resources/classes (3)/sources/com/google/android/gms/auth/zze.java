package com.google.android.gms.auth;

import com.google.android.gms.common.Feature;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zze {
    public static final Feature zza;
    public static final Feature zzb;
    public static final Feature zzc;
    private static final Feature zzd;
    private static final Feature zze;
    private static final Feature zzf;
    private static final Feature zzg;
    private static final Feature zzh;
    private static final Feature[] zzi;

    static {
        Feature feature;
        Feature feature2;
        Feature feature3;
        Feature feature4;
        Feature feature5;
        Feature feature6;
        Feature feature7;
        Feature feature8;
        new Feature("account_data_service", 6);
        zzd = feature;
        new Feature("account_data_service_legacy", 1);
        zze = feature2;
        new Feature("account_data_service_token", 2);
        zzf = feature3;
        new Feature("account_data_service_visibility", 1);
        zzg = feature4;
        new Feature("google_auth_service_token", 3);
        zza = feature5;
        new Feature("google_auth_service_accounts", 2);
        zzb = feature6;
        new Feature("work_account_client_is_whitelisted", 1);
        zzc = feature7;
        new Feature("config_sync", 1);
        zzh = feature8;
        Feature[] featureArr = new Feature[8];
        featureArr[0] = zzd;
        Feature[] featureArr2 = featureArr;
        featureArr2[1] = zze;
        Feature[] featureArr3 = featureArr2;
        featureArr3[2] = zzf;
        Feature[] featureArr4 = featureArr3;
        featureArr4[3] = zzg;
        Feature[] featureArr5 = featureArr4;
        featureArr5[4] = zza;
        Feature[] featureArr6 = featureArr5;
        featureArr6[5] = zzb;
        Feature[] featureArr7 = featureArr6;
        featureArr7[6] = zzc;
        Feature[] featureArr8 = featureArr7;
        featureArr8[7] = zzh;
        zzi = featureArr8;
    }
}
