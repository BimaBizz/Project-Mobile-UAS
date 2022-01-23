package com.google.android.gms.auth.account;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.auth.zzao;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzf extends Api.AbstractClientBuilder<zzao, Api.ApiOptions.NoOptions> {
    zzf() {
    }

    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Api.Client client;
        Api.ApiOptions.NoOptions noOptions = (Api.ApiOptions.NoOptions) obj;
        GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new zzao(context2, looper, clientSettings2, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
