package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.internal.C0335zack;

/* renamed from: com.google.android.gms.common.api.ResultTransform */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0234ResultTransform<R extends C0231Result, S extends C0231Result> {
    public C0234ResultTransform() {
    }

    @NonNull
    public final C0225PendingResult<S> createFailedResult(@RecentlyNonNull C0236Status status) {
        C0225PendingResult<S> pendingResult;
        new C0335zack(status);
        return pendingResult;
    }

    @NonNull
    public C0236Status onFailure(@RecentlyNonNull C0236Status status) {
        return status;
    }

    @WorkerThread
    @RecentlyNullable
    public abstract C0225PendingResult<S> onSuccess(@RecentlyNonNull R r);
}
