package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaaa {
    /* access modifiers changed from: private */
    public final Map<BasePendingResult<?>, Boolean> zaa;
    /* access modifiers changed from: private */
    public final Map<TaskCompletionSource<?>, Boolean> zab;

    public zaaa() {
        Map map;
        Map map2;
        new WeakHashMap();
        this.zaa = Collections.synchronizedMap(map);
        new WeakHashMap();
        this.zab = Collections.synchronizedMap(map2);
    }

    /* JADX INFO: finally extract failed */
    private final void zah(boolean z, Status status) {
        Map map;
        Map map2;
        Exception exc;
        boolean z2 = z;
        Status status2 = status;
        Map<BasePendingResult<?>, Boolean> map3 = this.zaa;
        synchronized (map3) {
            try {
                new HashMap(this.zaa);
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Map<BasePendingResult<?>, Boolean> map4 = map3;
                    throw th2;
                }
            }
        }
        Map<TaskCompletionSource<?>, Boolean> map5 = this.zab;
        synchronized (map5) {
            try {
                new HashMap(this.zab);
            } catch (Throwable th3) {
                while (true) {
                    Throwable th4 = th3;
                    Map<TaskCompletionSource<?>, Boolean> map6 = map5;
                    throw th4;
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z2 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status2);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z2 || ((Boolean) entry2.getValue()).booleanValue()) {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) entry2.getKey();
                new ApiException(status2);
                boolean trySetException = taskCompletionSource.trySetException(exc);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zaa(BasePendingResult<? extends Result> basePendingResult, boolean z) {
        PendingResult.StatusListener statusListener;
        BasePendingResult<? extends Result> basePendingResult2 = basePendingResult;
        Boolean put = this.zaa.put(basePendingResult2, Boolean.valueOf(z));
        new zay(this, basePendingResult2);
        basePendingResult2.addStatusListener(statusListener);
    }

    /* access modifiers changed from: package-private */
    public final <TResult> void zab(TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        OnCompleteListener onCompleteListener;
        TaskCompletionSource<TResult> taskCompletionSource2 = taskCompletionSource;
        Boolean put = this.zab.put(taskCompletionSource2, Boolean.valueOf(z));
        Task<TResult> task = taskCompletionSource2.getTask();
        new zaz(this, taskCompletionSource2);
        Task<TResult> addOnCompleteListener = task.addOnCompleteListener(onCompleteListener);
    }

    /* access modifiers changed from: package-private */
    public final boolean zac() {
        return !this.zaa.isEmpty() || !this.zab.isEmpty();
    }

    public final void zad() {
        zah(false, GoogleApiManager.zaa);
    }

    /* access modifiers changed from: package-private */
    public final void zae(int i, @Nullable String str) {
        StringBuilder sb;
        Status status;
        int i2 = i;
        String str2 = str;
        new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            StringBuilder append = sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            StringBuilder append2 = sb.append(" due to dead object exception.");
        }
        if (str2 != null) {
            StringBuilder append3 = sb.append(" Last reason for disconnect: ");
            StringBuilder append4 = sb.append(str2);
        }
        new Status(20, sb.toString());
        zah(true, status);
    }
}
