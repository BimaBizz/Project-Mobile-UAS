package com.google.android.gms.internal.p001authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.C0089SavePasswordResult;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0268TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzap  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0740zzap extends C0734zzaj {
    private final /* synthetic */ TaskCompletionSource zzbq;

    C0740zzap(C0735zzak zzak, TaskCompletionSource taskCompletionSource) {
        C0735zzak zzak2 = zzak;
        this.zzbq = taskCompletionSource;
    }

    public final void zzc(C0236Status status, C0089SavePasswordResult savePasswordResult) throws RemoteException {
        C0268TaskUtil.setResultOrApiException(status, savePasswordResult, this.zzbq);
    }
}
