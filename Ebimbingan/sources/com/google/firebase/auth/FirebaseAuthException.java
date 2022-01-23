package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.firebase.C1155FirebaseException;
import com.google.firebase.annotations.PublicApi;

@PublicApi
public class FirebaseAuthException extends C1155FirebaseException {
    private final String zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @PublicApi
    public FirebaseAuthException(@NonNull String str, @NonNull String str2) {
        super(str2);
        this.zzc = C0446Preconditions.checkNotEmpty(str);
    }

    @PublicApi
    @NonNull
    public String getErrorCode() {
        return this.zzc;
    }
}
