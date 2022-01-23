package com.google.android.gms.auth.api.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInResult */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0127GoogleSignInResult implements C0231Result {
    private C0236Status mStatus;
    @Nullable
    private C0122GoogleSignInAccount zzcc;

    public C0127GoogleSignInResult(@Nullable C0122GoogleSignInAccount googleSignInAccount, @NonNull C0236Status status) {
        this.zzcc = googleSignInAccount;
        this.mStatus = status;
    }

    @Nullable
    public C0122GoogleSignInAccount getSignInAccount() {
        return this.zzcc;
    }

    @NonNull
    public C0236Status getStatus() {
        return this.mStatus;
    }

    public boolean isSuccess() {
        return this.mStatus.isSuccess();
    }
}
