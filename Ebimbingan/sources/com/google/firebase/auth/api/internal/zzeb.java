package com.google.firebase.auth.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0427ClientSettings;

final class zzeb extends C0211Api.AbstractClientBuilder<zzdp, zzee> {
    zzeb() {
    }

    public final /* synthetic */ C0211Api.Client buildClient(Context context, Looper looper, C0427ClientSettings clientSettings, Object obj, C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        C0211Api.Client client;
        C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        zzee zzee = (zzee) obj;
        C0427ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new zzdo(context2, looper, clientSettings2, zzee, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
