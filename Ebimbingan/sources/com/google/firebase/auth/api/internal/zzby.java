package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzby implements C0262RemoteCall {
    private final zzbz zznp;

    zzby(zzbz zzbz) {
        this.zznp = zzbz;
    }

    public final void accept(Object obj, Object obj2) {
        this.zznp.zzp((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
