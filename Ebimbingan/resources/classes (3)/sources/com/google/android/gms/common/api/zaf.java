package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaf<R extends Result> extends BasePendingResult<R> {
    private final R zae;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaf(GoogleApiClient googleApiClient, R r) {
        super(googleApiClient);
        this.zae = r;
    }

    /* access modifiers changed from: protected */
    public final R createFailedResult(Status status) {
        Status status2 = status;
        return this.zae;
    }
}
