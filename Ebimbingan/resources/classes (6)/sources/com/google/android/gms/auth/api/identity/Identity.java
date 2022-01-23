package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p001authapi.zzak;
import com.google.android.gms.internal.p001authapi.zzao;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class Identity {
    private Identity() {
    }

    public static SignInClient getSignInClient(@NonNull Activity activity) {
        SignInClient signInClient;
        new zzao((Activity) Preconditions.checkNotNull(activity), zzl.zzj().zzk());
        return signInClient;
    }

    public static SignInClient getSignInClient(@NonNull Context context) {
        SignInClient signInClient;
        new zzao((Context) Preconditions.checkNotNull(context), zzl.zzj().zzk());
        return signInClient;
    }

    public static CredentialSavingClient getCredentialSavingClient(@NonNull Activity activity) {
        CredentialSavingClient credentialSavingClient;
        new zzak((Activity) Preconditions.checkNotNull(activity), zzf.zzg().zzi());
        return credentialSavingClient;
    }

    public static CredentialSavingClient getCredentialSavingClient(@NonNull Context context) {
        CredentialSavingClient credentialSavingClient;
        new zzak((Context) Preconditions.checkNotNull(context), zzf.zzg().zzi());
        return credentialSavingClient;
    }
}
