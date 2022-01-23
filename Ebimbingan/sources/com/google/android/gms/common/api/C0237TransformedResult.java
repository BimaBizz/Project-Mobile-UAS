package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C0231Result;

/* renamed from: com.google.android.gms.common.api.TransformedResult */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0237TransformedResult<R extends C0231Result> {
    public C0237TransformedResult() {
    }

    public abstract void andFinally(@RecentlyNonNull C0233ResultCallbacks<? super R> resultCallbacks);

    @NonNull
    public abstract <S extends C0231Result> C0237TransformedResult<S> then(@RecentlyNonNull C0234ResultTransform<? super R, ? extends S> resultTransform);
}
