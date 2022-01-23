package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.zack;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class ResultTransform<R extends Result, S extends Result> {
    public ResultTransform() {
    }

    @NonNull
    public final PendingResult<S> createFailedResult(@RecentlyNonNull Status status) {
        PendingResult<S> pendingResult;
        new zack(status);
        return pendingResult;
    }

    @NonNull
    public Status onFailure(@RecentlyNonNull Status status) {
        return status;
    }

    @WorkerThread
    @RecentlyNullable
    public abstract PendingResult<S> onSuccess(@RecentlyNonNull R r);
}
