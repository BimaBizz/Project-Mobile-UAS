package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzcs implements C0262RemoteCall {
    private final zzct zzog;

    zzcs(zzct zzct) {
        this.zzog = zzct;
    }

    public final void accept(Object obj, Object obj2) {
        this.zzog.zzy((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
