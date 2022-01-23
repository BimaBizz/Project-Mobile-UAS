package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.zzf;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

/* renamed from: com.google.android.gms.internal.auth-api.zzam  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzam extends Api.AbstractClientBuilder<zzab, zzf> {
    zzam() {
    }

    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        Api.Client client;
        ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        zzf zzf = (zzf) obj;
        ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new zzab(context2, looper, zzf, clientSettings2, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
