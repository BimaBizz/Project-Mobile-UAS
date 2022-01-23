package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.internal.location.zzaz;

final class zzad extends C0211Api.AbstractClientBuilder<zzaz, C0211Api.ApiOptions.NoOptions> {
    zzad() {
    }

    public final /* synthetic */ C0211Api.Client buildClient(Context context, Looper looper, C0427ClientSettings clientSettings, Object obj, C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        C0211Api.Client client;
        Object obj2 = obj;
        C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        Context context2 = context;
        new zzaz(context2, looper, connectionCallbacks2, onConnectionFailedListener, "locationServices", clientSettings);
        return client;
    }
}
