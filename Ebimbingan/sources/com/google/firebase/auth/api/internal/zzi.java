package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.internal.firebase_auth.zzec;
import com.google.firebase.auth.internal.zzt;

final class zzi implements zzez<zzec> {
    private final /* synthetic */ zzdm zzla;

    zzi(zzb zzb, zzdm zzdm) {
        zzb zzb2 = zzb;
        this.zzla = zzdm;
    }

    public final void zzbv(@Nullable String str) {
        C0236Status zzdc = zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.zzla.zza((zzec) obj);
    }
}
