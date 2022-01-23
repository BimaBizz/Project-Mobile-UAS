package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.internal.C0244BasePendingResult;

/* renamed from: com.google.android.gms.common.api.zae */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0380zae<R extends C0231Result> extends C0244BasePendingResult<R> {
    private final R zae;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0380zae(R r) {
        super(Looper.getMainLooper());
        this.zae = r;
    }

    /* access modifiers changed from: protected */
    public final R createFailedResult(C0236Status status) {
        Throwable th;
        if (status.getStatusCode() == this.zae.getStatus().getStatusCode()) {
            return this.zae;
        }
        new UnsupportedOperationException("Creating failed results is not supported");
        throw th;
    }
}
