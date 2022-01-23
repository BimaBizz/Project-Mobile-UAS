package com.google.android.gms.internal.p000authapiphone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0245ConnectionCallbacks;
import com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener;
import com.google.android.gms.common.internal.C0427ClientSettings;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzv  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final class C0720zzv extends C0211Api.AbstractClientBuilder<C0722zzx, C0211Api.ApiOptions.NoOptions> {
    C0720zzv() {
    }

    public final /* synthetic */ C0211Api.Client buildClient(Context context, Looper looper, C0427ClientSettings clientSettings, Object obj, C0245ConnectionCallbacks connectionCallbacks, C0257OnConnectionFailedListener onConnectionFailedListener) {
        C0211Api.Client client;
        C0211Api.ApiOptions.NoOptions noOptions = (C0211Api.ApiOptions.NoOptions) obj;
        C0245ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        C0427ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new C0722zzx(context2, looper, clientSettings2, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
