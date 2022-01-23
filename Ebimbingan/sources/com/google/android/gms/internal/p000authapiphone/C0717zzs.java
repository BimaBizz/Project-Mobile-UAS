package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0250IStatusCallback;
import com.google.android.gms.common.api.internal.C0268TaskUtil;
import com.google.android.gms.common.internal.C0422ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzs  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final class C0717zzs extends C0250IStatusCallback.Stub {
    private final /* synthetic */ TaskCompletionSource zza;

    C0717zzs(C0710zzl zzl, TaskCompletionSource taskCompletionSource) {
        C0710zzl zzl2 = zzl;
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
