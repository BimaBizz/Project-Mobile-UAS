package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzcg implements C0262RemoteCall {
    private final zzch zznv;

    zzcg(zzch zzch) {
        this.zznv = zzch;
    }

    public final void accept(Object obj, Object obj2) {
        this.zznv.zzs((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
