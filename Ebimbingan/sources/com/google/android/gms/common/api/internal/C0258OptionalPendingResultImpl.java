package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0224OptionalPendingResult;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0232ResultCallback;
import com.google.android.gms.common.api.C0234ResultTransform;
import com.google.android.gms.common.api.C0237TransformedResult;
import java.util.concurrent.TimeUnit;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.OptionalPendingResultImpl */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0258OptionalPendingResultImpl<R extends C0231Result> extends C0224OptionalPendingResult<R> {
    private final C0244BasePendingResult<R> zaa;

    public C0258OptionalPendingResultImpl(@RecentlyNonNull C0225PendingResult<R> pendingResult) {
        this.zaa = (C0244BasePendingResult) pendingResult;
    }

    public final void addStatusListener(@RecentlyNonNull C0225PendingResult.StatusListener statusListener) {
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

    public final void setResultCallback(@RecentlyNonNull C0232ResultCallback<? super R> resultCallback) {
        this.zaa.setResultCallback(resultCallback);
    }

    @NonNull
    public final <S extends C0231Result> C0237TransformedResult<S> then(@RecentlyNonNull C0234ResultTransform<? super R, ? extends S> resultTransform) {
        return this.zaa.then(resultTransform);
    }

    @RecentlyNonNull
    public final R await(long j, @RecentlyNonNull TimeUnit timeUnit) {
        return this.zaa.await(j, timeUnit);
    }

    public final void setResultCallback(@RecentlyNonNull C0232ResultCallback<? super R> resultCallback, long j, @RecentlyNonNull TimeUnit timeUnit) {
        this.zaa.setResultCallback(resultCallback, j, timeUnit);
    }
}
