package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzbe implements C0262RemoteCall {
    private final zzbf zznb;

    zzbe(zzbf zzbf) {
        this.zznb = zzbf;
    }

    public final void accept(Object obj, Object obj2) {
        this.zznb.zzf((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
