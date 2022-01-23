package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0245ConnectionCallbacks;
import com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.internal.auth.C0810zzbg;

/* renamed from: com.google.android.gms.auth.api.zza */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0166zza extends C0211Api.AbstractClientBuilder<C0810zzbg, C0033AuthProxyOptions> {
    C0166zza() {
    }

    public final /* synthetic */ C0211Api.Client buildClient(Context context, Looper looper, C0427ClientSettings clientSettings, Object obj, C0245ConnectionCallbacks connectionCallbacks, C0257OnConnectionFailedListener onConnectionFailedListener) {
        C0211Api.Client client;
        C0245ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        C0033AuthProxyOptions authProxyOptions = (C0033AuthProxyOptions) obj;
        C0427ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new C0810zzbg(context2, looper, clientSettings2, authProxyOptions, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
