package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0224OptionalPendingResult;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInApi */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public interface C0123GoogleSignInApi {
    public static final String EXTRA_SIGN_IN_ACCOUNT = "signInAccount";

    Intent getSignInIntent(C0222GoogleApiClient googleApiClient);

    @Nullable
    C0127GoogleSignInResult getSignInResultFromIntent(Intent intent);

    C0225PendingResult<C0236Status> revokeAccess(C0222GoogleApiClient googleApiClient);

    C0225PendingResult<C0236Status> signOut(C0222GoogleApiClient googleApiClient);

    C0224OptionalPendingResult<C0127GoogleSignInResult> silentSignIn(C0222GoogleApiClient googleApiClient);
}
