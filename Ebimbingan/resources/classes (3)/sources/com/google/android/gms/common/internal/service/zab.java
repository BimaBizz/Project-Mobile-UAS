package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zab extends Api.AbstractClientBuilder<zah, Api.ApiOptions.NoOptions> {
    zab() {
    }

    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Api.Client client;
        Api.ApiOptions.NoOptions noOptions = (Api.ApiOptions.NoOptions) obj;
        new zah(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
        return client;
    }
}
