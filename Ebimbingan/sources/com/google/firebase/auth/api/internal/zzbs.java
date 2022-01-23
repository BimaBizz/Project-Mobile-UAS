package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzbs implements C0262RemoteCall {
    private final zzbt zznl;

    zzbs(zzbt zzbt) {
        this.zznl = zzbt;
    }

    public final void accept(Object obj, Object obj2) {
        this.zznl.zzm((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
