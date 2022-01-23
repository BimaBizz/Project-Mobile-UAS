package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0245ConnectionCallbacks;
import com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener;
import com.google.android.gms.common.internal.C0427ClientSettings;

/* renamed from: com.google.android.gms.internal.auth.zzz */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1090zzz extends C0211Api.AbstractClientBuilder<C0992zzi, C0211Api.ApiOptions.NoOptions> {
    C1090zzz() {
    }

    public final /* synthetic */ C0211Api.Client buildClient(Context context, Looper looper, C0427ClientSettings clientSettings, Object obj, C0245ConnectionCallbacks connectionCallbacks, C0257OnConnectionFailedListener onConnectionFailedListener) {
        C0211Api.Client client;
        C0211Api.ApiOptions.NoOptions noOptions = (C0211Api.ApiOptions.NoOptions) obj;
        C0245ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        C0427ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new C0992zzi(context2, looper, clientSettings2, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
