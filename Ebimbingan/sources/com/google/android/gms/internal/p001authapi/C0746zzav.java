package com.google.android.gms.internal.p001authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.C0084BeginSignInResult;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0268TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzav  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0746zzav extends C0728zzad {
    private final /* synthetic */ TaskCompletionSource zzbq;

    C0746zzav(C0739zzao zzao, TaskCompletionSource taskCompletionSource) {
        C0739zzao zzao2 = zzao;
        this.zzbq = taskCompletionSource;
    }

    public final void zzc(C0236Status status, C0084BeginSignInResult beginSignInResult) throws RemoteException {
        C0268TaskUtil.setResultOrApiException(status, beginSignInResult, this.zzbq);
    }
}
