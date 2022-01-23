package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0427ClientSettings;

/* renamed from: com.google.android.gms.common.internal.service.zab */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0467zab extends C0211Api.AbstractClientBuilder<C0473zah, C0211Api.ApiOptions.NoOptions> {
    C0467zab() {
    }

    public final /* bridge */ /* synthetic */ C0211Api.Client buildClient(Context context, Looper looper, C0427ClientSettings clientSettings, Object obj, C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        C0211Api.Client client;
        C0211Api.ApiOptions.NoOptions noOptions = (C0211Api.ApiOptions.NoOptions) obj;
        new C0473zah(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
        return client;
    }
}
