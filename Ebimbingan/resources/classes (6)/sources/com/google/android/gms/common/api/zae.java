package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zae<R extends Result> extends BasePendingResult<R> {
    private final R zae;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zae(R r) {
        super(Looper.getMainLooper());
        this.zae = r;
    }

    /* access modifiers changed from: protected */
    public final R createFailedResult(Status status) {
        Throwable th;
        if (status.getStatusCode() == this.zae.getStatus().getStatusCode()) {
            return this.zae;
        }
        new UnsupportedOperationException("Creating failed results is not supported");
        throw th;
    }
}
