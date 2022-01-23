package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class PendingResultUtil {
    private static final zas zaa;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
    public interface ResultConverter<R extends Result, T> {
        @KeepForSdk
        @RecentlyNullable
        T convert(@RecentlyNonNull R r);
    }

    static {
        zas zas;
        new zao();
        zaa = zas;
    }

    public PendingResultUtil() {
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <R extends Result, T extends Response<R>> Task<T> toResponseTask(@RecentlyNonNull PendingResult<R> pendingResult, @RecentlyNonNull T t) {
        ResultConverter resultConverter;
        new zaq(t);
        return toTask(pendingResult, resultConverter);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <R extends Result, T> Task<T> toTask(@RecentlyNonNull PendingResult<R> pendingResult, @RecentlyNonNull ResultConverter<R, T> resultConverter) {
        TaskCompletionSource taskCompletionSource;
        PendingResult.StatusListener statusListener;
        PendingResult<R> pendingResult2 = pendingResult;
        zas zas = zaa;
        new TaskCompletionSource();
        new zap(pendingResult2, taskCompletionSource, resultConverter, zas);
        pendingResult2.addStatusListener(statusListener);
        return taskCompletionSource.getTask();
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <R extends Result> Task<Void> toVoidTask(@RecentlyNonNull PendingResult<R> pendingResult) {
        ResultConverter resultConverter;
        new zar();
        return toTask(pendingResult, resultConverter);
    }
}
