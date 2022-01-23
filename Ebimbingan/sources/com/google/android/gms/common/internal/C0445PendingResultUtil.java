package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0230Response;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.PendingResultUtil */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0445PendingResultUtil {
    private static final C0503zas zaa;

    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.PendingResultUtil$ResultConverter */
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface ResultConverter<R extends C0231Result, T> {
        @C0206KeepForSdk
        @RecentlyNullable
        T convert(@RecentlyNonNull R r);
    }

    static {
        C0503zas zas;
        new C0499zao();
        zaa = zas;
    }

    public C0445PendingResultUtil() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static <R extends C0231Result, T extends C0230Response<R>> Task<T> toResponseTask(@RecentlyNonNull C0225PendingResult<R> pendingResult, @RecentlyNonNull T t) {
        ResultConverter resultConverter;
        new C0501zaq(t);
        return toTask(pendingResult, resultConverter);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static <R extends C0231Result, T> Task<T> toTask(@RecentlyNonNull C0225PendingResult<R> pendingResult, @RecentlyNonNull ResultConverter<R, T> resultConverter) {
        TaskCompletionSource taskCompletionSource;
        C0225PendingResult.StatusListener statusListener;
        C0225PendingResult<R> pendingResult2 = pendingResult;
        C0503zas zas = zaa;
        new TaskCompletionSource();
        new C0500zap(pendingResult2, taskCompletionSource, resultConverter, zas);
        pendingResult2.addStatusListener(statusListener);
        return taskCompletionSource.getTask();
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static <R extends C0231Result> Task<Void> toVoidTask(@RecentlyNonNull C0225PendingResult<R> pendingResult) {
        ResultConverter resultConverter;
        new C0502zar();
        return toTask(pendingResult, resultConverter);
    }
}
