package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0212ApiException;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.zaaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0271zaaa {
    /* access modifiers changed from: private */
    public final Map<C0244BasePendingResult<?>, Boolean> zaa;
    /* access modifiers changed from: private */
    public final Map<TaskCompletionSource<?>, Boolean> zab;

    public C0271zaaa() {
        Map map;
        Map map2;
        new WeakHashMap();
        this.zaa = Collections.synchronizedMap(map);
        new WeakHashMap();
        this.zab = Collections.synchronizedMap(map2);
    }

    /* JADX INFO: finally extract failed */
    private final void zah(boolean z, C0236Status status) {
        Map map;
        Map map2;
        Exception exc;
        boolean z2 = z;
        C0236Status status2 = status;
        Map<C0244BasePendingResult<?>, Boolean> map3 = this.zaa;
        synchronized (map3) {
            try {
                new HashMap(this.zaa);
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Map<C0244BasePendingResult<?>, Boolean> map4 = map3;
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
                ((C0244BasePendingResult) entry.getKey()).forceFailureUnlessReady(status2);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z2 || ((Boolean) entry2.getValue()).booleanValue()) {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) entry2.getKey();
                new C0212ApiException(status2);
                boolean trySetException = taskCompletionSource.trySetException(exc);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zaa(C0244BasePendingResult<? extends C0231Result> basePendingResult, boolean z) {
        C0225PendingResult.StatusListener statusListener;
        C0244BasePendingResult<? extends C0231Result> basePendingResult2 = basePendingResult;
        Boolean put = this.zaa.put(basePendingResult2, Boolean.valueOf(z));
        new C0370zay(this, basePendingResult2);
        basePendingResult2.addStatusListener(statusListener);
    }

    /* access modifiers changed from: package-private */
    public final <TResult> void zab(TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        OnCompleteListener onCompleteListener;
        TaskCompletionSource<TResult> taskCompletionSource2 = taskCompletionSource;
        Boolean put = this.zab.put(taskCompletionSource2, Boolean.valueOf(z));
        Task<TResult> task = taskCompletionSource2.getTask();
        new C0371zaz(this, taskCompletionSource2);
        Task<TResult> addOnCompleteListener = task.addOnCompleteListener(onCompleteListener);
    }

    /* access modifiers changed from: package-private */
    public final boolean zac() {
        return !this.zaa.isEmpty() || !this.zab.isEmpty();
    }

    public final void zad() {
        zah(false, C0248GoogleApiManager.zaa);
    }

    /* access modifiers changed from: package-private */
    public final void zae(int i, @Nullable String str) {
        StringBuilder sb;
        C0236Status status;
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
        new C0236Status(20, sb.toString());
        zah(true, status);
    }
}
