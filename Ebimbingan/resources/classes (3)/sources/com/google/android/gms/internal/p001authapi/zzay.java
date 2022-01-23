package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.internal.auth-api.zzay  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzay {
    public static final Feature zzdc;
    public static final Feature zzdd;
    private static final Feature zzde;
    private static final Feature zzdf;
    public static final Feature zzdg;
    public static final Feature zzdh;
    private static final Feature zzdi;
    public static final Feature[] zzdj;

    static {
        Feature feature;
        Feature feature2;
        Feature feature3;
        Feature feature4;
        Feature feature5;
        Feature feature6;
        Feature feature7;
        new Feature("auth_api_credentials_begin_sign_in", 4);
        zzdc = feature;
        new Feature("auth_api_credentials_sign_out", 2);
        zzdd = feature2;
        new Feature("auth_api_credentials_authorize", 1);
        zzde = feature3;
        new Feature("auth_api_credentials_revoke_access", 1);
        zzdf = feature4;
        new Feature("auth_api_credentials_save_password", 3);
        zzdg = feature5;
        new Feature("auth_api_credentials_get_sign_in_intent", 3);
        zzdh = feature6;
        new Feature("auth_api_credentials_save_account_linking_token", 2);
        zzdi = feature7;
        Feature[] featureArr = new Feature[7];
        featureArr[0] = zzdc;
        Feature[] featureArr2 = featureArr;
        featureArr2[1] = zzdd;
        Feature[] featureArr3 = featureArr2;
        featureArr3[2] = zzde;
        Feature[] featureArr4 = featureArr3;
        featureArr4[3] = zzdf;
        Feature[] featureArr5 = featureArr4;
        featureArr5[4] = zzdg;
        Feature[] featureArr6 = featureArr5;
        featureArr6[5] = zzdh;
        Feature[] featureArr7 = featureArr6;
        featureArr7[6] = zzdi;
        zzdj = featureArr7;
    }
}
