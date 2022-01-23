package com.google.android.gms.internal.p001authapi;

import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.C0062Credential;
import com.google.android.gms.auth.api.credentials.C0066CredentialRequestResult;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzg  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0756zzg implements C0066CredentialRequestResult {
    private final C0236Status mStatus;
    @Nullable
    private final C0062Credential zzam;

    public C0756zzg(C0236Status status, @Nullable C0062Credential credential) {
        this.mStatus = status;
        this.zzam = credential;
    }

    public final C0236Status getStatus() {
        return this.mStatus;
    }

    @Nullable
    public final C0062Credential getCredential() {
        return this.zzam;
    }

    public static C0756zzg zzc(C0236Status status) {
        C0756zzg zzg;
        new C0756zzg(status, (C0062Credential) null);
        return zzg;
    }
}
