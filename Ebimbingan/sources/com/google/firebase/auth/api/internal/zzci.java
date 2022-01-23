package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzci implements C0262RemoteCall {
    private final zzcj zzny;

    zzci(zzcj zzcj) {
        this.zzny = zzcj;
    }

    public final void accept(Object obj, Object obj2) {
        this.zzny.zzt((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
