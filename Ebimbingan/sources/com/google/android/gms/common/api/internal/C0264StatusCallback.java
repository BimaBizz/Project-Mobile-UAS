package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.common.api.internal.C0250IStatusCallback;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.StatusCallback */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0264StatusCallback extends C0250IStatusCallback.Stub {
    @C0206KeepForSdk
    private final C0243BaseImplementation.ResultHolder<C0236Status> mResultHolder;

    @C0206KeepForSdk
    public C0264StatusCallback(@RecentlyNonNull C0243BaseImplementation.ResultHolder<C0236Status> resultHolder) {
        this.mResultHolder = resultHolder;
    }

    @C0206KeepForSdk
    public void onResult(@RecentlyNonNull C0236Status status) {
        this.mResultHolder.setResult(status);
    }
}
