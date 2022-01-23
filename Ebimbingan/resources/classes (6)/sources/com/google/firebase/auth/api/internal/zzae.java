package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth.zzfj;
import com.google.firebase.auth.internal.zzt;

final class zzae implements zzez<zzfj> {
    private final /* synthetic */ zzdm zzla;

    zzae(zzb zzb, zzdm zzdm) {
        zzb zzb2 = zzb;
        this.zzla = zzdm;
    }

    public final void zzbv(@Nullable String str) {
        Status zzdc = zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.zzla.zzby(((zzfj) obj).getEmail());
    }
}
