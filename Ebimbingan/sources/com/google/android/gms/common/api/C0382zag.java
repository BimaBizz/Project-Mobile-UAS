package com.google.android.gms.common.api;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.internal.C0244BasePendingResult;

/* renamed from: com.google.android.gms.common.api.zag */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0382zag<R extends C0231Result> extends C0244BasePendingResult<R> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0382zag(@Nullable C0222GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    public final R createFailedResult(C0236Status status) {
        Throwable th;
        C0236Status status2 = status;
        new UnsupportedOperationException("Creating failed results is not supported");
        throw th;
    }
}
