package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth.zzek;
import com.google.android.gms.internal.firebase_auth.zzel;
import com.google.android.gms.internal.firebase_auth.zzes;

final class zzt implements zzez<zzes> {
    final /* synthetic */ zzdm zzla;
    final /* synthetic */ zzb zzle;
    final /* synthetic */ String zzlw;

    zzt(zzb zzb, String str, zzdm zzdm) {
        this.zzle = zzb;
        this.zzlw = str;
        this.zzla = zzdm;
    }

    public final void zzbv(@Nullable String str) {
        Status zzdc = com.google.firebase.auth.internal.zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzel zzel;
        zzez zzez;
        zzes zzes = (zzes) obj;
        new zzel(zzes.getAccessToken());
        new zzs(this, this, zzes);
        this.zzle.zzlb.zza(zzel, (zzez<zzek>) zzez);
    }
}
