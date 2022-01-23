package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.C0445PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.internal.zap */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0500zap implements C0225PendingResult.StatusListener {
    final /* synthetic */ C0225PendingResult zaa;
    final /* synthetic */ TaskCompletionSource zab;
    final /* synthetic */ C0445PendingResultUtil.ResultConverter zac;
    final /* synthetic */ C0503zas zad;

    C0500zap(C0225PendingResult pendingResult, TaskCompletionSource taskCompletionSource, C0445PendingResultUtil.ResultConverter resultConverter, C0503zas zas) {
        this.zaa = pendingResult;
        this.zab = taskCompletionSource;
        this.zac = resultConverter;
        this.zad = zas;
    }

    public final void onComplete(C0236Status status) {
        C0236Status status2 = status;
        if (status2.isSuccess()) {
            this.zab.setResult(this.zac.convert(this.zaa.await(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.zab.setException(C0422ApiExceptionUtil.fromStatus(status2));
    }
}
