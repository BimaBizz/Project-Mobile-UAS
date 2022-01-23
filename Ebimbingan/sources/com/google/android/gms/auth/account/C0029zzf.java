package com.google.android.gms.auth.account;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.internal.auth.C0791zzao;

/* renamed from: com.google.android.gms.auth.account.zzf */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0029zzf extends C0211Api.AbstractClientBuilder<C0791zzao, C0211Api.ApiOptions.NoOptions> {
    C0029zzf() {
    }

    public final /* synthetic */ C0211Api.Client buildClient(Context context, Looper looper, C0427ClientSettings clientSettings, Object obj, C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        C0211Api.Client client;
        C0211Api.ApiOptions.NoOptions noOptions = (C0211Api.ApiOptions.NoOptions) obj;
        C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        C0427ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new C0791zzao(context2, looper, clientSettings2, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
