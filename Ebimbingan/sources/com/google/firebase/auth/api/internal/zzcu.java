package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzcu implements C0262RemoteCall {
    private final zzcv zzoh;

    zzcu(zzcv zzcv) {
        this.zzoh = zzcv;
    }

    public final void accept(Object obj, Object obj2) {
        this.zzoh.zzz((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
