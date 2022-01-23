package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.C0032AuthProxy;
import com.google.android.gms.auth.api.C0033AuthProxyOptions;
import com.google.android.gms.auth.api.proxy.C0116ProxyClient;
import com.google.android.gms.auth.api.proxy.C0117ProxyRequest;
import com.google.android.gms.auth.api.proxy.C0118ProxyResponse;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth.zzbp */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0819zzbp extends C0220GoogleApi<C0033AuthProxyOptions> implements C0116ProxyClient {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0819zzbp(@NonNull Context context, @Nullable C0033AuthProxyOptions authProxyOptions) {
        super(context, C0032AuthProxy.API, authProxyOptions, C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0819zzbp(@NonNull Activity activity, @Nullable C0033AuthProxyOptions authProxyOptions) {
        super(activity, C0032AuthProxy.API, authProxyOptions, C0220GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<C0118ProxyResponse> performProxyRequest(@NonNull C0117ProxyRequest proxyRequest) {
        C0262RemoteCall remoteCall;
        new C0818zzbo(this, proxyRequest);
        return doWrite(C0267TaskApiCall.builder().run(remoteCall).build());
    }

    public final Task<String> getSpatulaHeader() {
        C0262RemoteCall remoteCall;
        new C0821zzbr(this);
        return doRead(C0267TaskApiCall.builder().run(remoteCall).build());
    }
}
