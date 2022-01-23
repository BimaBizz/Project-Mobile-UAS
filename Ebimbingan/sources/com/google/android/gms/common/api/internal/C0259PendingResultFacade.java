package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0232ResultCallback;
import com.google.android.gms.common.api.C0234ResultTransform;
import com.google.android.gms.common.api.C0237TransformedResult;
import java.util.concurrent.TimeUnit;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.PendingResultFacade */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0259PendingResultFacade<A extends C0231Result, B extends C0231Result> extends C0225PendingResult<B> {
    public final void addStatusListener(@RecentlyNonNull C0225PendingResult.StatusListener statusListener) {
        C0225PendingResult.StatusListener statusListener2 = statusListener;
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

    public final void setResultCallback(@RecentlyNonNull C0232ResultCallback<? super B> resultCallback) {
        C0232ResultCallback<? super B> resultCallback2 = resultCallback;
        throw null;
    }

    public final void setResultCallback(@RecentlyNonNull C0232ResultCallback<? super B> resultCallback, long j, @RecentlyNonNull TimeUnit timeUnit) {
        C0232ResultCallback<? super B> resultCallback2 = resultCallback;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        throw null;
    }

    @RecentlyNonNull
    public final <S extends C0231Result> C0237TransformedResult<S> then(@RecentlyNonNull C0234ResultTransform<? super B, ? extends S> resultTransform) {
        C0234ResultTransform<? super B, ? extends S> resultTransform2 = resultTransform;
        throw null;
    }
}
