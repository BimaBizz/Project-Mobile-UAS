package com.google.android.gms.auth.api.accounttransfer;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.auth.zzaq;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzd extends Api.AbstractClientBuilder<zzaq, zzm> {
    zzd() {
    }

    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Api.Client client;
        GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        zzm zzm = (zzm) obj;
        ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new zzaq(context2, looper, clientSettings2, zzm, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
