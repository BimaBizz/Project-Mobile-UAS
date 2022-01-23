package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzfg;
import com.google.firebase.auth.internal.zzt;

final class zzaf implements zzez<zzes> {
    private final /* synthetic */ zzdm zzla;
    private final /* synthetic */ zzb zzle;
    private final /* synthetic */ String zzlr;

    zzaf(zzb zzb, String str, zzdm zzdm) {
        this.zzle = zzb;
        this.zzlr = str;
        this.zzla = zzdm;
    }

    public final void zzbv(@Nullable String str) {
        Status zzdc = zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzfg zzfg;
        zzes zzes = (zzes) obj;
        String accessToken = zzes.getAccessToken();
        new zzfg();
        zzfg zzfg2 = zzfg;
        zzfg zzcs = zzfg2.zzcq(accessToken).zzcs(this.zzlr);
        this.zzle.zza(this.zzla, zzes, zzfg2, (zzew) this);
    }
}
