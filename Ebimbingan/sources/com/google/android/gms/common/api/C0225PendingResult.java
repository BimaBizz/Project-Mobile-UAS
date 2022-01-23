package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0231Result;
import java.util.concurrent.TimeUnit;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.PendingResult */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0225PendingResult<R extends C0231Result> {

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.api.PendingResult$StatusListener */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface StatusListener {
        @C0206KeepForSdk
        void onComplete(@RecentlyNonNull C0236Status status);
    }

    public C0225PendingResult() {
    }

    @C0206KeepForSdk
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

    public abstract void setResultCallback(@RecentlyNonNull C0232ResultCallback<? super R> resultCallback);

    public abstract void setResultCallback(@RecentlyNonNull C0232ResultCallback<? super R> resultCallback, long j, @RecentlyNonNull TimeUnit timeUnit);

    @NonNull
    public <S extends C0231Result> C0237TransformedResult<S> then(@RecentlyNonNull C0234ResultTransform<? super R, ? extends S> resultTransform) {
        Throwable th;
        C0234ResultTransform<? super R, ? extends S> resultTransform2 = resultTransform;
        new UnsupportedOperationException();
        throw th;
    }
}
