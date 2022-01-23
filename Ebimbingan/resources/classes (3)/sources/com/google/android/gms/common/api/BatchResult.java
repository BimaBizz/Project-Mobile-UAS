package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class BatchResult implements Result {
    private final Status zaa;
    private final PendingResult<?>[] zab;

    BatchResult(Status status, PendingResult<?>[] pendingResultArr) {
        this.zaa = status;
        this.zab = pendingResultArr;
    }

    @RecentlyNonNull
    public Status getStatus() {
        return this.zaa;
    }

    @RecentlyNonNull
    public <R extends Result> R take(@RecentlyNonNull BatchResultToken<R> batchResultToken) {
        boolean z;
        BatchResultToken<R> batchResultToken2 = batchResultToken;
        if (batchResultToken2.mId < this.zab.length) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "The result token does not belong to this batch");
        return this.zab[batchResultToken2.mId].await(0, TimeUnit.MILLISECONDS);
    }
}
