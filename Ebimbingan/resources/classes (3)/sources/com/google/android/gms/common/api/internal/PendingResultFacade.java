package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class PendingResultFacade<A extends Result, B extends Result> extends PendingResult<B> {
    public final void addStatusListener(@RecentlyNonNull PendingResult.StatusListener statusListener) {
        PendingResult.StatusListener statusListener2 = statusListener;
        throw null;
    }

    @RecentlyNonNull
    public final B await() {
        throw null;
    }

    @RecentlyNonNull
    public final B await(long j, @RecentlyNonNull TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        throw null;
    }

    public final void cancel() {
        throw null;
    }

    public final boolean isCanceled() {
        throw null;
    }

    public final void setResultCallback(@RecentlyNonNull ResultCallback<? super B> resultCallback) {
        ResultCallback<? super B> resultCallback2 = resultCallback;
        throw null;
    }

    public final void setResultCallback(@RecentlyNonNull ResultCallback<? super B> resultCallback, long j, @RecentlyNonNull TimeUnit timeUnit) {
        ResultCallback<? super B> resultCallback2 = resultCallback;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        throw null;
    }

    @RecentlyNonNull
    public final <S extends Result> TransformedResult<S> then(@RecentlyNonNull ResultTransform<? super B, ? extends S> resultTransform) {
        ResultTransform<? super B, ? extends S> resultTransform2 = resultTransform;
        throw null;
    }
}
