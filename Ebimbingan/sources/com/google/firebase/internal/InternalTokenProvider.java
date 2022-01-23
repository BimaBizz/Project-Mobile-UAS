package com.google.firebase.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.GetTokenResult;

@C0206KeepForSdk
public interface InternalTokenProvider {
    @C0206KeepForSdk
    Task<GetTokenResult> getAccessToken(boolean z);

    @C0206KeepForSdk
    @Nullable
    String getUid();
}
