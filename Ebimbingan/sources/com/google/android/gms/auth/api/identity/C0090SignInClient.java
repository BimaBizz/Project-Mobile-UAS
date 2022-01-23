package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0212ApiException;
import com.google.android.gms.common.api.C0223HasApiKey;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.auth.api.identity.SignInClient */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public interface C0090SignInClient extends C0223HasApiKey<C0102zzl> {
    Task<C0084BeginSignInResult> beginSignIn(@NonNull C0083BeginSignInRequest beginSignInRequest);

    C0091SignInCredential getSignInCredentialFromIntent(@Nullable Intent intent) throws C0212ApiException;

    Task<PendingIntent> getSignInIntent(@NonNull C0086GetSignInIntentRequest getSignInIntentRequest);

    Task<Void> signOut();
}
