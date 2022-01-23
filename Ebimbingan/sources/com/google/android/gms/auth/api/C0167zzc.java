package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.C0031Auth;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.internal.p001authapi.C0766zzq;

/* renamed from: com.google.android.gms.auth.api.zzc */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0167zzc extends C0211Api.AbstractClientBuilder<C0766zzq, C0031Auth.AuthCredentialsOptions> {
    C0167zzc() {
    }

    public final /* synthetic */ C0211Api.Client buildClient(Context context, Looper looper, C0427ClientSettings clientSettings, Object obj, C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        C0211Api.Client client;
        C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        C0031Auth.AuthCredentialsOptions authCredentialsOptions = (C0031Auth.AuthCredentialsOptions) obj;
        C0427ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new C0766zzq(context2, looper, clientSettings2, authCredentialsOptions, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
