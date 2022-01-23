package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.internal.p001authapi.C0735zzak;
import com.google.android.gms.internal.p001authapi.C0739zzao;

/* renamed from: com.google.android.gms.auth.api.identity.Identity */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0087Identity {
    private C0087Identity() {
    }

    public static C0090SignInClient getSignInClient(@NonNull Activity activity) {
        C0090SignInClient signInClient;
        new C0739zzao((Activity) C0446Preconditions.checkNotNull(activity), C0102zzl.zzj().zzk());
        return signInClient;
    }

    public static C0090SignInClient getSignInClient(@NonNull Context context) {
        C0090SignInClient signInClient;
        new C0739zzao((Context) C0446Preconditions.checkNotNull(context), C0102zzl.zzj().zzk());
        return signInClient;
    }

    public static C0085CredentialSavingClient getCredentialSavingClient(@NonNull Activity activity) {
        C0085CredentialSavingClient credentialSavingClient;
        new C0735zzak((Activity) C0446Preconditions.checkNotNull(activity), C0096zzf.zzg().zzi());
        return credentialSavingClient;
    }

    public static C0085CredentialSavingClient getCredentialSavingClient(@NonNull Context context) {
        C0085CredentialSavingClient credentialSavingClient;
        new C0735zzak((Context) C0446Preconditions.checkNotNull(context), C0096zzf.zzg().zzi());
        return credentialSavingClient;
    }
}
