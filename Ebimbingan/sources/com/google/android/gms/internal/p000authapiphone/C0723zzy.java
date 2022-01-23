package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0250IStatusCallback;
import com.google.android.gms.common.api.internal.C0268TaskUtil;
import com.google.android.gms.common.internal.C0422ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzy  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final class C0723zzy extends C0250IStatusCallback.Stub {
    private final /* synthetic */ TaskCompletionSource zza;

    C0723zzy(C0718zzt zzt, TaskCompletionSource taskCompletionSource) {
        C0718zzt zzt2 = zzt;
        this.zza = taskCompletionSource;
    }

    public final void onResult(C0236Status status) {
        C0236Status status2 = status;
        if (status2.getStatusCode() == 6) {
            boolean trySetException = this.zza.trySetException(C0422ApiExceptionUtil.fromStatus(status2));
        } else {
            C0268TaskUtil.setResultOrApiException(status2, this.zza);
        }
    }
}
