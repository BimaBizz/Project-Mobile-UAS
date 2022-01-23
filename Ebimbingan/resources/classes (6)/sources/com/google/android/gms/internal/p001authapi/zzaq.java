package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.zzl;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzaq  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final /* synthetic */ class zzaq implements RemoteCall {
    private final zzao zzbr;

    zzaq(zzao zzao) {
        this.zzbr = zzao;
    }

    public final void accept(Object obj, Object obj2) {
        IStatusCallback iStatusCallback;
        zzao zzao = this.zzbr;
        new zzau(zzao, (TaskCompletionSource) obj2);
        IStatusCallback iStatusCallback2 = iStatusCallback;
        ((zzai) ((zzaw) obj).getService()).zzc(iStatusCallback2, ((zzl) zzao.getApiOptions()).zzh());
    }
}
