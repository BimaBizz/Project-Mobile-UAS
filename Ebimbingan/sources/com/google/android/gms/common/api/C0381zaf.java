package com.google.android.gms.common.api;

import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.internal.C0244BasePendingResult;

/* renamed from: com.google.android.gms.common.api.zaf */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0381zaf<R extends C0231Result> extends C0244BasePendingResult<R> {
    private final R zae;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0381zaf(C0222GoogleApiClient googleApiClient, R r) {
        super(googleApiClient);
        this.zae = r;
    }

    /* access modifiers changed from: protected */
    public final R createFailedResult(C0236Status status) {
        C0236Status status2 = status;
        return this.zae;
    }
}
