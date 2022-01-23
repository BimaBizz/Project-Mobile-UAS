package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzce implements C0262RemoteCall {
    private final zzcf zznt;

    zzce(zzcf zzcf) {
        this.zznt = zzcf;
    }

    public final void accept(Object obj, Object obj2) {
        this.zznt.zzr((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
