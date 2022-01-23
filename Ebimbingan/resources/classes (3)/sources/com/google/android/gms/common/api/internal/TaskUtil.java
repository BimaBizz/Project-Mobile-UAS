package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class TaskUtil {
    public TaskUtil() {
    }

    @KeepForSdk
    public static void setResultOrApiException(@RecentlyNonNull Status status, @RecentlyNonNull TaskCompletionSource<Void> taskCompletionSource) {
        setResultOrApiException(status, (Object) null, taskCompletionSource);
    }

    @RecentlyNonNull
    @KeepForSdk
    @Deprecated
    public static Task<Void> toVoidTaskThatFailsOnFalse(@RecentlyNonNull Task<Boolean> task) {
        Continuation continuation;
        new zacs();
        return task.continueWith(continuation);
    }

    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(@RecentlyNonNull Status status, @Nullable ResultT resultt, @RecentlyNonNull TaskCompletionSource<ResultT> taskCompletionSource) {
        Exception exc;
        Status status2 = status;
        ResultT resultt2 = resultt;
        TaskCompletionSource<ResultT> taskCompletionSource2 = taskCompletionSource;
        if (status2.isSuccess()) {
            return taskCompletionSource2.trySetResult(resultt2);
        }
        new ApiException(status2);
        return taskCompletionSource2.trySetException(exc);
    }

    @KeepForSdk
    public static <TResult> void setResultOrApiException(@RecentlyNonNull Status status, @Nullable TResult tresult, @RecentlyNonNull TaskCompletionSource<TResult> taskCompletionSource) {
        Exception exc;
        Status status2 = status;
        TResult tresult2 = tresult;
        TaskCompletionSource<TResult> taskCompletionSource2 = taskCompletionSource;
        if (status2.isSuccess()) {
            taskCompletionSource2.setResult(tresult2);
            return;
        }
        new ApiException(status2);
        taskCompletionSource2.setException(exc);
    }
}
