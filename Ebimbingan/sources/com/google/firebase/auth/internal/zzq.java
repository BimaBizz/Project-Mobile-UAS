package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.firebase.auth.zzv;
import com.google.firebase.auth.zzx;
import java.util.List;

public final class zzq extends zzv {
    private final zzm zztu;

    public zzq(zzm zzm) {
        zzm zzm2 = zzm;
        Object checkNotNull = C0446Preconditions.checkNotNull(zzm2);
        this.zztu = zzm2;
    }

    public final List<zzx> zzdc() {
        return this.zztu.zzdc();
    }
}
