package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
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
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <TResult> void zab(com.google.android.gms.tasks.TaskCompletionSource<TResult> r8, boolean r9) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r0
            java.util.Map<com.google.android.gms.tasks.TaskCompletionSource<?>, java.lang.Boolean> r4 = r4.zab
            r5 = r1
            r6 = r2
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.Object r4 = r4.put(r5, r6)
            r4 = r1
            com.google.android.gms.tasks.Task r4 = r4.getTask()
            r2 = r4
            com.google.android.gms.common.api.internal.zaz r4 = new com.google.android.gms.common.api.internal.zaz
            r3 = r4
            r4 = r3
            r5 = r0
            r6 = r1
            r4.<init>(r5, r6)
            r4 = r2
            r5 = r3
            com.google.android.gms.tasks.Task r4 = r4.addOnCompleteListener(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaaa.zab(com.google.android.gms.tasks.TaskCompletionSource, boolean):void");
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
