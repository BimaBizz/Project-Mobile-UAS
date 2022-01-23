package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.C0086GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzat  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final /* synthetic */ class C0744zzat implements C0262RemoteCall {
    private final C0739zzao zzbr;
    private final C0086GetSignInIntentRequest zzbt;

    C0744zzat(C0739zzao zzao, C0086GetSignInIntentRequest getSignInIntentRequest) {
        this.zzbr = zzao;
        this.zzbt = getSignInIntentRequest;
    }

    public final void accept(Object obj, Object obj2) {
        C0729zzae zzae;
        C0739zzao zzao = this.zzbr;
        C0086GetSignInIntentRequest getSignInIntentRequest = this.zzbt;
        new C0748zzax(zzao, (TaskCompletionSource) obj2);
        C0729zzae zzae2 = zzae;
        ((C0733zzai) ((C0747zzaw) obj).getService()).zzc(zzae2, (C0086GetSignInIntentRequest) C0446Preconditions.checkNotNull(getSignInIntentRequest));
    }
}
