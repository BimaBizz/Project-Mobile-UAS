package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.signin.internal.C1135SignInClientImpl;

/* renamed from: com.google.android.gms.signin.zaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C1148zaa extends C0211Api.AbstractClientBuilder<C1135SignInClientImpl, C1134SignInOptions> {
    C1148zaa() {
    }

    public final /* bridge */ /* synthetic */ C0211Api.Client buildClient(Context context, Looper looper, C0427ClientSettings clientSettings, Object obj, C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        C0211Api.Client client;
        C0427ClientSettings clientSettings2 = clientSettings;
        C1134SignInOptions signInOptions = (C1134SignInOptions) obj;
        new C1135SignInClientImpl(context, looper, true, clientSettings2, C1135SignInClientImpl.createBundleFromClientSettings(clientSettings2), connectionCallbacks, onConnectionFailedListener);
        return client;
    }
}
