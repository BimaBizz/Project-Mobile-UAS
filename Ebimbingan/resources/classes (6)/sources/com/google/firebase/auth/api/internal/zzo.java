package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzfm;
import com.google.android.gms.internal.firebase_auth.zzfo;
import com.google.firebase.auth.internal.zzt;

final class zzo implements zzez<zzes> {
    final /* synthetic */ zzdm zzla;
    final /* synthetic */ zzb zzle;
    private final /* synthetic */ zzfm zzlp;

    zzo(zzb zzb, zzfm zzfm, zzdm zzdm) {
        this.zzle = zzb;
        this.zzlp = zzfm;
        this.zzla = zzdm;
    }

    public final void zzbv(@Nullable String str) {
        Status zzdc = zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzez zzez;
        zzes zzes = (zzes) obj;
        if (this.zzle.zzlc.zzec().booleanValue() && this.zzle.zzld.zzej()) {
            zzfm zzr = this.zzlp.zzr(this.zzle.zzlc.zzec().booleanValue());
        }
        zzfm zzcy = this.zzlp.zzcy(zzes.getAccessToken());
        new zzr(this, this);
        this.zzle.zzlb.zza(this.zzlp, (zzez<zzfo>) zzez);
    }
}
