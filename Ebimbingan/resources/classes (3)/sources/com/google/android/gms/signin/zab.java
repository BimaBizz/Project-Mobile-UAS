package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zab extends Api.AbstractClientBuilder<SignInClientImpl, zac> {
    zab() {
    }

    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Context context2 = context;
        Looper looper2 = looper;
        ClientSettings clientSettings2 = clientSettings;
        GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener2 = onConnectionFailedListener;
        zac zac = (zac) obj;
        int i = SignInClientImpl.zaa;
        throw null;
    }
}
