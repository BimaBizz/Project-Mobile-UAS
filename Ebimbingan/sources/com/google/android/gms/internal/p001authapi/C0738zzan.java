package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.C0088SavePasswordRequest;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzan  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final /* synthetic */ class C0738zzan implements C0262RemoteCall {
    private final C0735zzak zzbo;
    private final C0088SavePasswordRequest zzbp;

    C0738zzan(C0735zzak zzak, C0088SavePasswordRequest savePasswordRequest) {
        this.zzbo = zzak;
        this.zzbp = savePasswordRequest;
    }

    public final void accept(Object obj, Object obj2) {
        C0731zzag zzag;
        C0735zzak zzak = this.zzbo;
        C0088SavePasswordRequest savePasswordRequest = this.zzbp;
        new C0740zzap(zzak, (TaskCompletionSource) obj2);
        C0731zzag zzag2 = zzag;
        ((C0727zzac) ((C0726zzab) obj).getService()).zzc(zzag2, (C0088SavePasswordRequest) C0446Preconditions.checkNotNull(savePasswordRequest));
    }
}
