package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.C0031Auth;
import com.google.android.gms.auth.api.signin.C0123GoogleSignInApi;
import com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.C0127GoogleSignInResult;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0224OptionalPendingResult;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzg */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0141zzg implements C0123GoogleSignInApi {
    public C0141zzg() {
    }

    public final Intent getSignInIntent(C0222GoogleApiClient googleApiClient) {
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        return C0143zzi.zzc(googleApiClient2.getContext(), zzc(googleApiClient2));
    }

    public final C0224OptionalPendingResult<C0127GoogleSignInResult> silentSignIn(C0222GoogleApiClient googleApiClient) {
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        return C0143zzi.zzc(googleApiClient2, googleApiClient2.getContext(), zzc(googleApiClient2), false);
    }

    public final C0225PendingResult<C0236Status> signOut(C0222GoogleApiClient googleApiClient) {
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        return C0143zzi.zzc(googleApiClient2, googleApiClient2.getContext(), false);
    }

    public final C0225PendingResult<C0236Status> revokeAccess(C0222GoogleApiClient googleApiClient) {
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        return C0143zzi.zzd(googleApiClient2, googleApiClient2.getContext(), false);
    }

    @Nullable
    public final C0127GoogleSignInResult getSignInResultFromIntent(Intent intent) {
        return C0143zzi.getSignInResultFromIntent(intent);
    }

    private static C0125GoogleSignInOptions zzc(C0222GoogleApiClient googleApiClient) {
        return ((C0140zzf) googleApiClient.getClient(C0031Auth.zzh)).zzo();
    }
}
