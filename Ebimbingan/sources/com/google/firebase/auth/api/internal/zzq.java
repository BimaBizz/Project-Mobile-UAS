package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzfg;
import com.google.firebase.auth.internal.zzt;

final class zzq implements zzez<zzes> {
    private final /* synthetic */ zzdm zzla;
    private final /* synthetic */ zzb zzle;

    zzq(zzb zzb, zzdm zzdm) {
        this.zzle = zzb;
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
        zzfg zzcs = zzfg2.zzcq(zzes.getAccessToken()).zzcr((String) null).zzcs((String) null);
        this.zzle.zza(this.zzla, zzes, zzfg2, (zzew) this);
    }
}
