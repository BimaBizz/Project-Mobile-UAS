package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzdk implements C0262RemoteCall {
    private final zzdl zzop;

    zzdk(zzdl zzdl) {
        this.zzop = zzdl;
    }

    public final void accept(Object obj, Object obj2) {
        this.zzop.zzag((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
