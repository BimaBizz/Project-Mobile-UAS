package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth.zzek;
import com.google.android.gms.internal.firebase_auth.zzel;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.firebase.auth.internal.zzt;

final class zzu implements zzez<zzes> {
    final /* synthetic */ zzdm zzla;
    private final /* synthetic */ zzb zzle;

    zzu(zzb zzb, zzdm zzdm) {
        this.zzle = zzb;
        this.zzla = zzdm;
    }

    public final void zzbv(@Nullable String str) {
        Status zzdc = zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzel zzel;
        zzez zzez;
        zzes zzes = (zzes) obj;
        new zzel(zzes.getAccessToken());
        new zzx(this, this, zzes);
        this.zzle.zzlb.zza(zzel, (zzez<zzek>) zzez);
    }
}
