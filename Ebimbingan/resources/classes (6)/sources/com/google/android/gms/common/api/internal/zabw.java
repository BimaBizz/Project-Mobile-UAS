package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zabw extends zap {
    private TaskCompletionSource<Void> zad;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zabw(com.google.android.gms.common.api.internal.LifecycleFragment r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r0
            r3 = r1
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r2.<init>(r3, r4)
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zad = r3
            r2 = r0
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = r2.mLifecycleFragment
            java.lang.String r3 = "GmsAvailabilityHelper"
            r4 = r0
            r2.addCallback(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabw.<init>(com.google.android.gms.common.api.internal.LifecycleFragment):void");
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.common.api.internal.zabw zaa(@androidx.annotation.NonNull android.app.Activity r5) {
        /*
            r0 = r5
            r2 = r0
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = getFragment((android.app.Activity) r2)
            r0 = r2
            r2 = r0
            java.lang.String r3 = "GmsAvailabilityHelper"
            java.lang.Class<com.google.android.gms.common.api.internal.zabw> r4 = com.google.android.gms.common.api.internal.zabw.class
            com.google.android.gms.common.api.internal.LifecycleCallback r2 = r2.getCallbackOrNull(r3, r4)
            com.google.android.gms.common.api.internal.zabw r2 = (com.google.android.gms.common.api.internal.zabw) r2
            r1 = r2
            r2 = r1
            if (r2 == 0) goto L_0x0032
            r2 = r1
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r2 = r2.zad
            com.google.android.gms.tasks.Task r2 = r2.getTask()
            boolean r2 = r2.isComplete()
            if (r2 == 0) goto L_0x002f
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r0 = r2
            r2 = r0
            r2.<init>()
            r2 = r1
            r3 = r0
            r2.zad = r3
        L_0x002f:
            r2 = r1
            r0 = r2
        L_0x0031:
            return r0
        L_0x0032:
            com.google.android.gms.common.api.internal.zabw r2 = new com.google.android.gms.common.api.internal.zabw
            r1 = r2
            r2 = r1
            r3 = r0
            r2.<init>(r3)
            r2 = r1
            r0 = r2
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabw.zaa(android.app.Activity):com.google.android.gms.common.api.internal.zabw");
    }

    public final void onDestroy() {
        Exception exc;
        super.onDestroy();
        TaskCompletionSource<Void> taskCompletionSource = this.zad;
        new CancellationException("Host activity was destroyed before Google Play services could be made available.");
        boolean trySetException = taskCompletionSource.trySetException(exc);
    }

    public final Task<Void> zab() {
        return this.zad.getTask();
    }

    /* access modifiers changed from: protected */
    public final void zad(ConnectionResult connectionResult, int i) {
        Exception exc;
        Status status;
        ConnectionResult connectionResult2 = connectionResult;
        int i2 = i;
        String errorMessage = connectionResult2.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "Error connecting to Google Play services";
        }
        TaskCompletionSource<Void> taskCompletionSource = this.zad;
        new Status(connectionResult2, errorMessage, connectionResult2.getErrorCode());
        new ApiException(status);
        taskCompletionSource.setException(exc);
    }

    /* access modifiers changed from: protected */
    public final void zae() {
        ConnectionResult connectionResult;
        Exception exc;
        Status status;
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        if (lifecycleActivity == null) {
            TaskCompletionSource<Void> taskCompletionSource = this.zad;
            new Status(8);
            new ApiException(status);
            boolean trySetException = taskCompletionSource.trySetException(exc);
            return;
        }
        int isGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(lifecycleActivity);
        if (isGooglePlayServicesAvailable == 0) {
            boolean trySetResult = this.zad.trySetResult((Object) null);
        } else if (!this.zad.getTask().isComplete()) {
            new ConnectionResult(isGooglePlayServicesAvailable, (PendingIntent) null);
            zaf(connectionResult, 0);
        }
    }
}
