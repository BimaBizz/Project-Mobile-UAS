package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0232ResultCallback;
import com.google.android.gms.common.api.C0234ResultTransform;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.C0237TransformedResult;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.zack */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0335zack<R extends C0231Result> extends C0225PendingResult<R> {
    private final C0236Status zaa;

    public C0335zack(C0236Status status) {
        C0236Status status2 = status;
        Object checkNotNull = C0446Preconditions.checkNotNull(status2, "Status must not be null");
        C0446Preconditions.checkArgument(!status2.isSuccess(), "Status must not be success");
        this.zaa = status2;
    }

    public final void addStatusListener(@NonNull C0225PendingResult.StatusListener statusListener) {
        Throwable th;
        C0225PendingResult.StatusListener statusListener2 = statusListener;
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

    public final void setResultCallback(@NonNull C0232ResultCallback<? super R> resultCallback) {
        Throwable th;
        C0232ResultCallback<? super R> resultCallback2 = resultCallback;
        new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
        throw th;
    }

    @C0452ShowFirstParty
    @NonNull
    public final <S extends C0231Result> C0237TransformedResult<S> then(@NonNull C0234ResultTransform<? super R, ? extends S> resultTransform) {
        Throwable th;
        C0234ResultTransform<? super R, ? extends S> resultTransform2 = resultTransform;
        new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
        throw th;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final C0236Status zaa() {
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

    public final void setResultCallback(@NonNull C0232ResultCallback<? super R> resultCallback, long j, @NonNull TimeUnit timeUnit) {
        Throwable th;
        C0232ResultCallback<? super R> resultCallback2 = resultCallback;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
        throw th;
    }
}
