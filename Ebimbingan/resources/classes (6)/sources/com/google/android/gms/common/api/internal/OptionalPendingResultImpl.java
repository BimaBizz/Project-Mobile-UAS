package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {
    private final BasePendingResult<R> zaa;

    public OptionalPendingResultImpl(@RecentlyNonNull PendingResult<R> pendingResult) {
        this.zaa = (BasePendingResult) pendingResult;
    }

    public final void addStatusListener(@RecentlyNonNull PendingResult.StatusListener statusListener) {
        this.zaa.addStatusListener(statusListener);
    }

    @RecentlyNonNull
    public final R await() {
        return this.zaa.await();
    }

    public final void cancel() {
        this.zaa.cancel();
    }

    @RecentlyNonNull
    public final R get() {
        Throwable th;
        if (!this.zaa.isReady()) {
            new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
            throw th;
        }
        return this.zaa.await(0, TimeUnit.MILLISECONDS);
    }

    public final boolean isCanceled() {
        return this.zaa.isCanceled();
    }

    public final boolean isDone() {
        return this.zaa.isReady();
    }

    public final void setResultCallback(@RecentlyNonNull ResultCallback<? super R> resultCallback) {
        this.zaa.setResultCallback(resultCallback);
    }

    @NonNull
    public final <S extends Result> TransformedResult<S> then(@RecentlyNonNull ResultTransform<? super R, ? extends S> resultTransform) {
        return this.zaa.then(resultTransform);
    }

    @RecentlyNonNull
    public final R await(long j, @RecentlyNonNull TimeUnit timeUnit) {
        return this.zaa.await(j, timeUnit);
    }

    public final void setResultCallback(@RecentlyNonNull ResultCallback<? super R> resultCallback, long j, @RecentlyNonNull TimeUnit timeUnit) {
        this.zaa.setResultCallback(resultCallback, j, timeUnit);
    }
}
