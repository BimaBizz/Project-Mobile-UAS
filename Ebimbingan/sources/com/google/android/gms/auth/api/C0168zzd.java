package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C0140zzf;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.internal.C0427ClientSettings;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.zzd */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0168zzd extends C0211Api.AbstractClientBuilder<C0140zzf, C0125GoogleSignInOptions> {
    C0168zzd() {
    }

    public final /* synthetic */ C0211Api.Client buildClient(Context context, Looper looper, C0427ClientSettings clientSettings, @Nullable Object obj, C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks, C0222GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        C0211Api.Client client;
        C0222GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        C0125GoogleSignInOptions googleSignInOptions = (C0125GoogleSignInOptions) obj;
        C0427ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new C0140zzf(context2, looper, clientSettings2, googleSignInOptions, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }

    public final /* synthetic */ List getImpliedScopes(@Nullable Object obj) {
        C0125GoogleSignInOptions googleSignInOptions = (C0125GoogleSignInOptions) obj;
        C0125GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions2.getScopes();
    }
}
