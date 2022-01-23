package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzan  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final /* synthetic */ class zzan implements RemoteCall {
    private final zzak zzbo;
    private final SavePasswordRequest zzbp;

    zzan(zzak zzak, SavePasswordRequest savePasswordRequest) {
        this.zzbo = zzak;
        this.zzbp = savePasswordRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zzag zzag;
        zzak zzak = this.zzbo;
        SavePasswordRequest savePasswordRequest = this.zzbp;
        new zzap(zzak, (TaskCompletionSource) obj2);
        zzag zzag2 = zzag;
        ((zzac) ((zzab) obj).getService()).zzc(zzag2, (SavePasswordRequest) Preconditions.checkNotNull(savePasswordRequest));
    }
}
