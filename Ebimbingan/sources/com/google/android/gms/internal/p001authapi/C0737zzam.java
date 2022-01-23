package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.C0096zzf;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0245ConnectionCallbacks;
import com.google.android.gms.common.api.internal.C0257OnConnectionFailedListener;
import com.google.android.gms.common.internal.C0427ClientSettings;

/* renamed from: com.google.android.gms.internal.auth-api.zzam  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0737zzam extends C0211Api.AbstractClientBuilder<C0726zzab, C0096zzf> {
    C0737zzam() {
    }

    public final /* synthetic */ C0211Api.Client buildClient(Context context, Looper looper, C0427ClientSettings clientSettings, Object obj, C0245ConnectionCallbacks connectionCallbacks, C0257OnConnectionFailedListener onConnectionFailedListener) {
        C0211Api.Client client;
        C0245ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        C0096zzf zzf = (C0096zzf) obj;
        C0427ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new C0726zzab(context2, looper, zzf, clientSettings2, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
