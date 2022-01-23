package com.google.firebase.internal.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseException;

@KeepForSdk
public class FirebaseNoSignedInUserException extends FirebaseException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    public FirebaseNoSignedInUserException(@NonNull String str) {
        super(str);
    }
}
