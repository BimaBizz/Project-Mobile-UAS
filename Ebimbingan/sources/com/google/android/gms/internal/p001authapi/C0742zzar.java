package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.C0083BeginSignInRequest;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzar  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final /* synthetic */ class C0742zzar implements C0262RemoteCall {
    private final C0739zzao zzbr;
    private final C0083BeginSignInRequest zzbs;

    C0742zzar(C0739zzao zzao, C0083BeginSignInRequest beginSignInRequest) {
        this.zzbr = zzao;
        this.zzbs = beginSignInRequest;
    }

    public final void accept(Object obj, Object obj2) {
        C0725zzaa zzaa;
        C0739zzao zzao = this.zzbr;
        C0083BeginSignInRequest beginSignInRequest = this.zzbs;
        new C0746zzav(zzao, (TaskCompletionSource) obj2);
        C0725zzaa zzaa2 = zzaa;
        ((C0733zzai) ((C0747zzaw) obj).getService()).zzc(zzaa2, (C0083BeginSignInRequest) C0446Preconditions.checkNotNull(beginSignInRequest));
    }
}
