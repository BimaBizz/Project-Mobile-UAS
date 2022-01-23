package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.auth.api.proxy.ProxyClient;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzbp extends GoogleApi<AuthProxyOptions> implements ProxyClient {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbp(@NonNull Context context, @Nullable AuthProxyOptions authProxyOptions) {
        super(context, AuthProxy.API, authProxyOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbp(@NonNull Activity activity, @Nullable AuthProxyOptions authProxyOptions) {
        super(activity, AuthProxy.API, authProxyOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<ProxyResponse> performProxyRequest(@NonNull ProxyRequest proxyRequest) {
        RemoteCall remoteCall;
        new zzbo(this, proxyRequest);
        return doWrite(TaskApiCall.builder().run(remoteCall).build());
    }

    public final Task<String> getSpatulaHeader() {
        RemoteCall remoteCall;
        new zzbr(this);
        return doRead(TaskApiCall.builder().run(remoteCall).build());
    }
}
