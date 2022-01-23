package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzfg;
import com.google.firebase.auth.internal.zzt;

final class zzac implements zzez<zzes> {
    private final /* synthetic */ zzdm zzla;
    private final /* synthetic */ zzb zzle;
    private final /* synthetic */ String zzlq;

    zzac(zzb zzb, String str, zzdm zzdm) {
        this.zzle = zzb;
        this.zzlq = str;
        this.zzla = zzdm;
    }

    public final void zzbv(@Nullable String str) {
        C0236Status zzdc = zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzfg zzfg;
        zzes zzes = (zzes) obj;
        new zzfg();
        zzfg zzfg2 = zzfg;
        zzfg zzcr = zzfg2.zzcq(zzes.getAccessToken()).zzcr(this.zzlq);
        this.zzle.zza(this.zzla, zzes, zzfg2, (zzew) this);
    }
}
