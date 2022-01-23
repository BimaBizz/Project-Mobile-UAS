package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzad  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class zzad {
    public static final Feature zza;
    public static final Feature zzb;
    public static final Feature zzc;
    public static final Feature zzd;
    public static final Feature[] zze;

    static {
        Feature feature;
        Feature feature2;
        Feature feature3;
        Feature feature4;
        new Feature("sms_code_autofill", 2);
        zza = feature;
        new Feature("sms_code_browser", 2);
        zzb = feature2;
        new Feature("sms_retrieve", 1);
        zzc = feature3;
        new Feature("user_consent", 3);
        zzd = feature4;
        Feature[] featureArr = new Feature[4];
        featureArr[0] = zza;
        Feature[] featureArr2 = featureArr;
        featureArr2[1] = zzb;
        Feature[] featureArr3 = featureArr2;
        featureArr3[2] = zzc;
        Feature[] featureArr4 = featureArr3;
        featureArr4[3] = zzd;
        zze = featureArr4;
    }
}
