package com.google.android.gms.internal.p001authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0250IStatusCallback;
import com.google.android.gms.common.api.internal.C0268TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzau  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0745zzau extends C0250IStatusCallback.Stub {
    private final /* synthetic */ TaskCompletionSource zzbq;

    C0745zzau(C0739zzao zzao, TaskCompletionSource taskCompletionSource) {
        C0739zzao zzao2 = zzao;
        this.zzbq = taskCompletionSource;
    }

    public final void onResult(C0236Status status) throws RemoteException {
        C0268TaskUtil.setResultOrApiException(status, this.zzbq);
    }
}
