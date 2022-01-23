package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.C0102zzl;
import com.google.android.gms.common.api.internal.C0250IStatusCallback;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzaq  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final /* synthetic */ class C0741zzaq implements C0262RemoteCall {
    private final C0739zzao zzbr;

    C0741zzaq(C0739zzao zzao) {
        this.zzbr = zzao;
    }

    public final void accept(Object obj, Object obj2) {
        C0250IStatusCallback iStatusCallback;
        C0739zzao zzao = this.zzbr;
        new C0745zzau(zzao, (TaskCompletionSource) obj2);
        C0250IStatusCallback iStatusCallback2 = iStatusCallback;
        ((C0733zzai) ((C0747zzaw) obj).getService()).zzc(iStatusCallback2, ((C0102zzl) zzao.getApiOptions()).zzh());
    }
}
