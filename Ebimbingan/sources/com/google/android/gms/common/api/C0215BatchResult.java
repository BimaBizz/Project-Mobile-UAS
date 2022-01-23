package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C0446Preconditions;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.BatchResult */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0215BatchResult implements C0231Result {
    private final C0236Status zaa;
    private final C0225PendingResult<?>[] zab;

    C0215BatchResult(C0236Status status, C0225PendingResult<?>[] pendingResultArr) {
        this.zaa = status;
        this.zab = pendingResultArr;
    }

    @RecentlyNonNull
    public C0236Status getStatus() {
        return this.zaa;
    }

    @RecentlyNonNull
    public <R extends C0231Result> R take(@RecentlyNonNull C0216BatchResultToken<R> batchResultToken) {
        boolean z;
        C0216BatchResultToken<R> batchResultToken2 = batchResultToken;
        if (batchResultToken2.mId < this.zab.length) {
            z = true;
        } else {
            z = false;
        }
        C0446Preconditions.checkArgument(z, "The result token does not belong to this batch");
        return this.zab[batchResultToken2.mId].await(0, TimeUnit.MILLISECONDS);
    }
}
