package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.microsoft.appcenter.ingestion.models.CommonProperties;

/* renamed from: com.google.android.gms.common.internal.zzs */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0539zzs {
    private static final Uri zza = Uri.parse("https://plus.google.com/");
    private static final Uri zzb = zza.buildUpon().appendPath("circles").appendPath("find").build();

    public static Intent zza(String str) {
        Intent intent;
        String str2 = str;
        Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
        new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        Intent data = intent.setData(fromParts);
        return intent;
    }

    public static Intent zzb(String str, @Nullable String str2) {
        Intent intent;
        String str3 = str;
        String str4 = str2;
        new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(CommonProperties.ID, "com.google.android.gms");
        if (!TextUtils.isEmpty(str4)) {
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("pcampaignid", str4);
        }
        Intent data = intent.setData(appendQueryParameter.build());
        Intent intent2 = intent.setPackage("com.android.vending");
        Intent addFlags = intent.addFlags(524288);
        return intent;
    }

    public static Intent zzc() {
        Intent intent;
        new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        Intent intent2 = intent.setPackage("com.google.android.wearable.app");
        return intent;
    }
}
