package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class TransformedResult<R extends Result> {
    public TransformedResult() {
    }

    public abstract void andFinally(@RecentlyNonNull ResultCallbacks<? super R> resultCallbacks);

    @NonNull
    public abstract <S extends Result> TransformedResult<S> then(@RecentlyNonNull ResultTransform<? super R, ? extends S> resultTransform);
}
