package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.auth.zzbg;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zza extends Api.AbstractClientBuilder<zzbg, AuthProxyOptions> {
    zza() {
    }

    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        Api.Client client;
        ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        AuthProxyOptions authProxyOptions = (AuthProxyOptions) obj;
        ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new zzbg(context2, looper, clientSettings2, authProxyOptions, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
