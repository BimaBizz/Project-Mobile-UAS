package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.C0236Status;
import com.google.firebase.auth.internal.zzt;

final class zzab implements zzez<Object> {
    private final /* synthetic */ zzdm zzla;

    zzab(zzb zzb, zzdm zzdm) {
        zzb zzb2 = zzb;
        this.zzla = zzdm;
    }

    public final void zzbv(String str) {
        C0236Status zzdc = zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        Object obj2 = obj;
        this.zzla.zzdz();
    }
}
