package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.zzl;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

/* renamed from: com.google.android.gms.internal.auth-api.zzas  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzas extends Api.AbstractClientBuilder<zzaw, zzl> {
    zzas() {
    }

    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        Api.Client client;
        ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        zzl zzl = (zzl) obj;
        ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new zzaw(context2, looper, zzl, clientSettings2, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
