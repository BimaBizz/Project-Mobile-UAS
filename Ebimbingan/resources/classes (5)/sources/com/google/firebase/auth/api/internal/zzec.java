package com.google.firebase.auth.api.internal;

import android.content.Context;
import com.google.android.gms.common.api.Api;

public final class zzec {
    private static final Api.ClientKey<zzdp> CLIENT_KEY;
    private static final Api.AbstractClientBuilder<zzdp, zzee> zzoy;
    public static final Api<zzee> zzoz;

    public static zzap zza(Context context, zzee zzee) {
        zzap zzap;
        new zzap(context, zzee);
        return zzap;
    }

    static {
        Api.ClientKey<zzdp> clientKey;
        Api.AbstractClientBuilder<zzdp, zzee> abstractClientBuilder;
        Api<zzee> api;
        new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        new zzeb();
        zzoy = abstractClientBuilder;
        new Api<>("InternalFirebaseAuth.FIREBASE_AUTH_API", zzoy, CLIENT_KEY);
        zzoz = api;
    }
}
