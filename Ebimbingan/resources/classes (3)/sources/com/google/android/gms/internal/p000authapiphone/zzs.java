package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzs  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final class zzs extends IStatusCallback.Stub {
    private final /* synthetic */ TaskCompletionSource zza;

    zzs(zzl zzl, TaskCompletionSource taskCompletionSource) {
        zzl zzl2 = zzl;
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status status) {
        Status status2 = status;
        if (status2.getStatusCode() == 6) {
            boolean trySetException = this.zza.trySetException(ApiExceptionUtil.fromStatus(status2));
        } else {
            TaskUtil.setResultOrApiException(status2, this.zza);
        }
    }
}
