package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth.zzee;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.firebase.auth.internal.zzt;

final class zzw implements zzez<zzes> {
    final /* synthetic */ zzdm zzla;
    private final /* synthetic */ zzb zzle;

    zzw(zzb zzb, zzdm zzdm) {
        this.zzle = zzb;
        this.zzla = zzdm;
    }

    public final void zzbv(@Nullable String str) {
        Status zzdc = zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzee zzee;
        zzez zzez;
        new zzee(((zzes) obj).getAccessToken());
        new zzz(this, this);
        this.zzle.zzlb.zza(zzee, (zzez<Void>) zzez);
    }
}
