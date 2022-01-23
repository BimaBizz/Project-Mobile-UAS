package com.google.firebase.auth.api.internal;

import android.content.Context;
import com.google.android.gms.common.api.C0211Api;

public final class zzec {
    private static final C0211Api.ClientKey<zzdp> CLIENT_KEY;
    private static final C0211Api.AbstractClientBuilder<zzdp, zzee> zzoy;
    public static final C0211Api<zzee> zzoz;

    public static zzap zza(Context context, zzee zzee) {
        zzap zzap;
        new zzap(context, zzee);
        return zzap;
    }

    static {
        C0211Api.ClientKey<zzdp> clientKey;
        C0211Api.AbstractClientBuilder<zzdp, zzee> abstractClientBuilder;
        C0211Api<zzee> api;
        new C0211Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        new zzeb();
        zzoy = abstractClientBuilder;
        new C0211Api<>("InternalFirebaseAuth.FIREBASE_AUTH_API", zzoy, CLIENT_KEY);
        zzoz = api;
    }
}
