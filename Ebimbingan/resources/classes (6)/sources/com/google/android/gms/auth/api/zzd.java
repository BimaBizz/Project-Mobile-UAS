package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzf;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzd extends Api.AbstractClientBuilder<zzf, GoogleSignInOptions> {
    zzd() {
    }

    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, @Nullable Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Api.Client client;
        GoogleApiClient.ConnectionCallbacks connectionCallbacks2 = connectionCallbacks;
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        ClientSettings clientSettings2 = clientSettings;
        Context context2 = context;
        new zzf(context2, looper, clientSettings2, googleSignInOptions, connectionCallbacks2, onConnectionFailedListener);
        return client;
    }

    public final /* synthetic */ List getImpliedScopes(@Nullable Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions2.getScopes();
    }
}
