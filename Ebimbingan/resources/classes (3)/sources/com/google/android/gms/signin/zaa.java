package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaa extends Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> {
    zaa() {
    }

    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Api.Client client;
        ClientSettings clientSettings2 = clientSettings;
        SignInOptions signInOptions = (SignInOptions) obj;
        new SignInClientImpl(context, looper, true, clientSettings2, SignInClientImpl.createBundleFromClientSettings(clientSettings2), connectionCallbacks, onConnectionFailedListener);
        return client;
    }
}
