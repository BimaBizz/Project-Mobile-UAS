package com.google.firebase.internal.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.firebase.C1155FirebaseException;

@C0206KeepForSdk
public class FirebaseNoSignedInUserException extends C1155FirebaseException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C0206KeepForSdk
    public FirebaseNoSignedInUserException(@NonNull String str) {
        super(str);
    }
}
