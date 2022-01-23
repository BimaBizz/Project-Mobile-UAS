package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzfd;

public final class zzel implements zzfd<zzp.zzf> {
    private String zzib;

    public zzel(String str) {
        this.zzib = Preconditions.checkNotEmpty(str);
    }

    public final /* synthetic */ zzjc zzeq() {
        return (zzp.zzf) ((zzhs) zzp.zzf.zzw().zzo(this.zzib).zzih());
    }
}
