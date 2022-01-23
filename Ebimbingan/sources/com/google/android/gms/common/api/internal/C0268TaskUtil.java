package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0212ApiException;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.TaskUtil */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C0268TaskUtil {
    public C0268TaskUtil() {
    }

    @C0206KeepForSdk
    public static void setResultOrApiException(@RecentlyNonNull C0236Status status, @RecentlyNonNull TaskCompletionSource<Void> taskCompletionSource) {
        setResultOrApiException(status, (Object) null, taskCompletionSource);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    @Deprecated
    public static Task<Void> toVoidTaskThatFailsOnFalse(@RecentlyNonNull Task<Boolean> task) {
        Continuation continuation;
        new C0343zacs();
        return task.continueWith(continuation);
    }

    @C0206KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(@RecentlyNonNull C0236Status status, @Nullable ResultT resultt, @RecentlyNonNull TaskCompletionSource<ResultT> taskCompletionSource) {
        Exception exc;
        C0236Status status2 = status;
        ResultT resultt2 = resultt;
        TaskCompletionSource<ResultT> taskCompletionSource2 = taskCompletionSource;
        if (status2.isSuccess()) {
            return taskCompletionSource2.trySetResult(resultt2);
        }
        new C0212ApiException(status2);
        return taskCompletionSource2.trySetException(exc);
    }

    @C0206KeepForSdk
    public static <TResult> void setResultOrApiException(@RecentlyNonNull C0236Status status, @Nullable TResult tresult, @RecentlyNonNull TaskCompletionSource<TResult> taskCompletionSource) {
        Exception exc;
        C0236Status status2 = status;
        TResult tresult2 = tresult;
        TaskCompletionSource<TResult> taskCompletionSource2 = taskCompletionSource;
        if (status2.isSuccess()) {
            taskCompletionSource2.setResult(tresult2);
            return;
        }
        new C0212ApiException(status2);
        taskCompletionSource2.setException(exc);
    }
}
