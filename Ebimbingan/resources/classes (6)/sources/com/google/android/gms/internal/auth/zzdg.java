package com.google.android.gms.internal.auth;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class zzdg implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final zzdh zza;

    zzdg(zzdh zzdh) {
        this.zza = zzdh;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.zza.zza(sharedPreferences, str);
    }
}
