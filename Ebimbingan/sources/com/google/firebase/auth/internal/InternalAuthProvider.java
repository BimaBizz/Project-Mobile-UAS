package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.internal.InternalTokenProvider;

@C0206KeepForSdk
public interface InternalAuthProvider extends InternalTokenProvider {
    @C0206KeepForSdk
    void addIdTokenListener(@NonNull IdTokenListener idTokenListener);

    @C0206KeepForSdk
    Task<GetTokenResult> getAccessToken(boolean z);

    @Nullable
    String getUid();

    @C0206KeepForSdk
    void removeIdTokenListener(@NonNull IdTokenListener idTokenListener);
}
