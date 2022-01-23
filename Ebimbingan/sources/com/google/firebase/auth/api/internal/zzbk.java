package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzbk implements C0262RemoteCall {
    private final zzbl zznf;

    zzbk(zzbl zzbl) {
        this.zznf = zzbl;
    }

    public final void accept(Object obj, Object obj2) {
        this.zznf.zzi((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
