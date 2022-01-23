package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzg implements GoogleSignInApi {
    public zzg() {
    }

    public final Intent getSignInIntent(GoogleApiClient googleApiClient) {
        GoogleApiClient googleApiClient2 = googleApiClient;
        return zzi.zzc(googleApiClient2.getContext(), zzc(googleApiClient2));
    }

    public final OptionalPendingResult<GoogleSignInResult> silentSignIn(GoogleApiClient googleApiClient) {
        GoogleApiClient googleApiClient2 = googleApiClient;
        return zzi.zzc(googleApiClient2, googleApiClient2.getContext(), zzc(googleApiClient2), false);
    }

    public final PendingResult<Status> signOut(GoogleApiClient googleApiClient) {
        GoogleApiClient googleApiClient2 = googleApiClient;
        return zzi.zzc(googleApiClient2, googleApiClient2.getContext(), false);
    }

    public final PendingResult<Status> revokeAccess(GoogleApiClient googleApiClient) {
        GoogleApiClient googleApiClient2 = googleApiClient;
        return zzi.zzd(googleApiClient2, googleApiClient2.getContext(), false);
    }

    @Nullable
    public final GoogleSignInResult getSignInResultFromIntent(Intent intent) {
        return zzi.getSignInResultFromIntent(intent);
    }

    private static GoogleSignInOptions zzc(GoogleApiClient googleApiClient) {
        return ((zzf) googleApiClient.getClient(Auth.zzh)).zzo();
    }
}
