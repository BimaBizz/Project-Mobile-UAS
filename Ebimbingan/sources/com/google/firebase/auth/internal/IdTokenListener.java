package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.firebase.internal.InternalTokenResult;

@C0206KeepForSdk
public interface IdTokenListener {
    @C0206KeepForSdk
    void onIdTokenChanged(@NonNull InternalTokenResult internalTokenResult);
}
