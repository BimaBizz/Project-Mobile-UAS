package com.google.android.gms.auth.api.accounttransfer;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import com.google.android.gms.internal.auth.C0793zzaq;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.zzd */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0043zzd extends C0211Api.AbstractClientBuilder<C0793zzaq, C0052zzm> {
    C0043zzd() {
    }

    public final /* synthetic */ C0211Api.Client buildClient(Context context, Looper looper, C0427ClientSettings clientSettings, Object obj, C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        C0211Api.Client client;
        C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        C0052zzm zzm = (C0052zzm) obj;
        C0427ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new C0793zzaq(context2, looper, clientSettings2, zzm, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }
}
