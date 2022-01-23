package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzz;

final class zzn implements zza, zzz {
    private final /* synthetic */ FirebaseAuth zziy;

    zzn(FirebaseAuth firebaseAuth) {
        this.zziy = firebaseAuth;
    }

    public final void zza(@NonNull zzes zzes, @NonNull FirebaseUser firebaseUser) {
        this.zziy.zza(firebaseUser, zzes, true);
    }

    public final void zza(C0236Status status) {
        int statusCode = status.getStatusCode();
        int i = statusCode;
        if (statusCode == 17011 || i == 17021 || i == 17005) {
            this.zziy.signOut();
        }
    }
}
