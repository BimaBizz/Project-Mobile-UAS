package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzdg implements C0262RemoteCall {
    private final zzdh zzon;

    zzdg(zzdh zzdh) {
        this.zzon = zzdh;
    }

    public final void accept(Object obj, Object obj2) {
        this.zzon.zzae((zzdp) obj, (TaskCompletionSource) obj2);
    }
}
