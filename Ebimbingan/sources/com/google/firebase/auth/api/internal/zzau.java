package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzau implements C0262RemoteCall {
    private final zzav zzms;

    zzau(zzav zzav) {
        this.zzms = zzav;
    }

    public final void accept(Object obj, Object obj2) {
        this.zzms.zzc((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
