package com.google.android.gms.common.api;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zag<R extends Result> extends BasePendingResult<R> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zag(@Nullable GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    public final R createFailedResult(Status status) {
        Throwable th;
        Status status2 = status;
        new UnsupportedOperationException("Creating failed results is not supported");
        throw th;
    }
}
