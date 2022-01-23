package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzas implements C0262RemoteCall {
    private final zzat zzmq;

    zzas(zzat zzat) {
        this.zzmq = zzat;
    }

    public final void accept(Object obj, Object obj2) {
        this.zzmq.zzb((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
