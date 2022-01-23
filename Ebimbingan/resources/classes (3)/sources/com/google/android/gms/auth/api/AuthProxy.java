package com.google.android.gms.auth.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyClient;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.auth.zzbg;
import com.google.android.gms.internal.auth.zzbp;
import com.google.android.gms.internal.auth.zzbs;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class AuthProxy {
    @ShowFirstParty
    @KeepForSdk
    public static final Api<AuthProxyOptions> API;
    @ShowFirstParty
    @KeepForSdk
    public static final ProxyApi ProxyApi;
    private static final Api.ClientKey<zzbg> zza;
    private static final Api.AbstractClientBuilder<zzbg, AuthProxyOptions> zzb;

    public AuthProxy() {
    }

    @KeepForSdk
    public static ProxyClient getClient(@NonNull Context context, @Nullable AuthProxyOptions authProxyOptions) {
        ProxyClient proxyClient;
        new zzbp(context, authProxyOptions);
        return proxyClient;
    }

    @KeepForSdk
    public static ProxyClient getClient(@NonNull Activity activity, @Nullable AuthProxyOptions authProxyOptions) {
        ProxyClient proxyClient;
        new zzbp(activity, authProxyOptions);
        return proxyClient;
    }

    static {
        Api.ClientKey<zzbg> clientKey;
        Api.AbstractClientBuilder<zzbg, AuthProxyOptions> abstractClientBuilder;
        Api<AuthProxyOptions> api;
        ProxyApi proxyApi;
        new Api.ClientKey<>();
        zza = clientKey;
        new zza();
        zzb = abstractClientBuilder;
        new Api<>("Auth.PROXY_API", zzb, zza);
        API = api;
        new zzbs();
        ProxyApi = proxyApi;
    }
}
