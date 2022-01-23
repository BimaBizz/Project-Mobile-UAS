package com.google.android.gms.auth.api.phone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.p000authapiphone.zzx;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final class zza extends Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> {
    zza() {
    }

    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        Api.Client client;
        Api.ApiOptions.NoOptions noOptions = (Api.ApiOptions.NoOptions) obj;
        ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new zzx(context2, looper, clientSettings2, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
