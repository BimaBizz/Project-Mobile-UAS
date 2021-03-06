package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zack<R extends Result> extends PendingResult<R> {
    private final Status zaa;

    public zack(Status status) {
        Status status2 = status;
        Object checkNotNull = Preconditions.checkNotNull(status2, "Status must not be null");
        Preconditions.checkArgument(!status2.isSuccess(), "Status must not be success");
        this.zaa = status2;
    }

    public final void addStatusListener(@NonNull PendingResult.StatusListener statusListener) {
        Throwable th;
        PendingResult.StatusListener statusListener2 = statusListener;
        new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
        throw th;
    }

    @NonNull
    public final R await() {
        Throwable th;
        new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
        throw th;
    }

    public final void cancel() {
        Throwable th;
        new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
        throw th;
    }

    public final boolean isCanceled() {
        Throwable th;
        new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
        throw th;
    }

    public final void setResultCallback(@NonNull ResultCallback<? super R> resultCallback) {
        Throwable th;
        ResultCallback<? super R> resultCallback2 = resultCallback;
        new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
        throw th;
    }

    @ShowFirstParty
    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        Throwable th;
        ResultTransform<? super R, ? extends S> resultTransform2 = resultTransform;
        new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
        throw th;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final Status zaa() {
        return this.zaa;
    }

    @NonNull
    public final R await(long j, @NonNull TimeUnit timeUnit) {
        Throwable th;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
        throw th;
    }

    public final void setResultCallback(@NonNull ResultCallback<? super R> resultCallback, long j, @NonNull TimeUnit timeUnit) {
        Throwable th;
        ResultCallback<? super R> resultCallback2 = resultCallback;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
        throw th;
    }
}
