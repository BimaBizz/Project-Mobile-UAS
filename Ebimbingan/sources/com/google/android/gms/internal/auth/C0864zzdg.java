package com.google.android.gms.internal.auth;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.auth.zzdg */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class C0864zzdg implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final C0865zzdh zza;

    C0864zzdg(C0865zzdh zzdh) {
        this.zza = zzdh;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.zza.zza(sharedPreferences, str);
    }
}
