package com.google.android.gms.auth.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.proxy.C0115ProxyApi;
import com.google.android.gms.auth.api.proxy.C0116ProxyClient;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.internal.auth.C0810zzbg;
import com.google.android.gms.internal.auth.C0819zzbp;
import com.google.android.gms.internal.auth.C0822zzbs;

@C0452ShowFirstParty
@C0206KeepForSdk
/* renamed from: com.google.android.gms.auth.api.AuthProxy */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0032AuthProxy {
    @C0452ShowFirstParty
    @C0206KeepForSdk
    public static final C0211Api<C0033AuthProxyOptions> API;
    @C0452ShowFirstParty
    @C0206KeepForSdk
    public static final C0115ProxyApi ProxyApi;
    private static final C0211Api.ClientKey<C0810zzbg> zza;
    private static final C0211Api.AbstractClientBuilder<C0810zzbg, C0033AuthProxyOptions> zzb;

    public C0032AuthProxy() {
    }

    @C0206KeepForSdk
    public static C0116ProxyClient getClient(@NonNull Context context, @Nullable C0033AuthProxyOptions authProxyOptions) {
        C0116ProxyClient proxyClient;
        new C0819zzbp(context, authProxyOptions);
        return proxyClient;
    }

    @C0206KeepForSdk
    public static C0116ProxyClient getClient(@NonNull Activity activity, @Nullable C0033AuthProxyOptions authProxyOptions) {
        C0116ProxyClient proxyClient;
        new C0819zzbp(activity, authProxyOptions);
        return proxyClient;
    }

    static {
        C0211Api.ClientKey<C0810zzbg> clientKey;
        C0211Api.AbstractClientBuilder<C0810zzbg, C0033AuthProxyOptions> abstractClientBuilder;
        C0211Api<C0033AuthProxyOptions> api;
        C0115ProxyApi proxyApi;
        new C0211Api.ClientKey<>();
        zza = clientKey;
        new C0166zza();
        zzb = abstractClientBuilder;
        new C0211Api<>("Auth.PROXY_API", zzb, zza);
        API = api;
        new C0822zzbs();
        ProxyApi = proxyApi;
    }
}
