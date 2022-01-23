package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;

final class zzac extends zzak {
    private final C0243BaseImplementation.ResultHolder<C0236Status> zzcq;

    public zzac(C0243BaseImplementation.ResultHolder<C0236Status> resultHolder) {
        this.zzcq = resultHolder;
    }

    public final void zza(zzad zzad) {
        this.zzcq.setResult(zzad.getStatus());
    }
}
