package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzcy implements C0262RemoteCall {
    private final zzcz zzoj;

    zzcy(zzcz zzcz) {
        this.zzoj = zzcz;
    }

    public final void accept(Object obj, Object obj2) {
        this.zzoj.zzaa((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
