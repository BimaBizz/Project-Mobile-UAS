package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzck implements C0262RemoteCall {
    private final zzcl zzoa;

    zzck(zzcl zzcl) {
        this.zzoa = zzcl;
    }

    public final void accept(Object obj, Object obj2) {
        this.zzoa.zzu((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
