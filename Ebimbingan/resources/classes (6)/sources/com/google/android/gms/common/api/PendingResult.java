package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class PendingResult<R extends Result> {

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface StatusListener {
        @KeepForSdk
        void onComplete(@RecentlyNonNull Status status);
    }

    public PendingResult() {
    }

    @KeepForSdk
    public void addStatusListener(@RecentlyNonNull StatusListener statusListener) {
        Throwable th;
        StatusListener statusListener2 = statusListener;
        new UnsupportedOperationException();
        throw th;
    }

    @NonNull
    public abstract R await();

    @NonNull
    public abstract R await(long j, @RecentlyNonNull TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(@RecentlyNonNull ResultCallback<? super R> resultCallback);

    public abstract void setResultCallback(@RecentlyNonNull ResultCallback<? super R> resultCallback, long j, @RecentlyNonNull TimeUnit timeUnit);

    @NonNull
    public <S extends Result> TransformedResult<S> then(@RecentlyNonNull ResultTransform<? super R, ? extends S> resultTransform) {
        Throwable th;
        ResultTransform<? super R, ? extends S> resultTransform2 = resultTransform;
        new UnsupportedOperationException();
        throw th;
    }
}
