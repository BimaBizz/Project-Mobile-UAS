package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzca implements C0262RemoteCall {
    private final zzcb zznr;

    zzca(zzcb zzcb) {
        this.zznr = zzcb;
    }

    public final void accept(Object obj, Object obj2) {
        this.zznr.zzq((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
