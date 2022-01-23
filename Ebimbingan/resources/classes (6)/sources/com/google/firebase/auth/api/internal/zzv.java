package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth.zzeb;
import com.google.android.gms.internal.firebase_auth.zzfo;
import com.google.firebase.auth.internal.zzt;

final class zzv implements zzez<zzfo> {
    private final /* synthetic */ zzdm zzla;
    private final /* synthetic */ zzb zzle;

    zzv(zzb zzb, zzdm zzdm) {
        this.zzle = zzb;
        this.zzla = zzdm;
    }

    public final void zzbv(@Nullable String str) {
        Status zzdc = zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzeb zzeb;
        zzfo zzfo = (zzfo) obj;
        if (!zzfo.zzfd()) {
            this.zzle.zza(zzfo, this.zzla, (zzew) this);
        } else if (this.zzle.zzlc.zzed().booleanValue()) {
            new zzeb(zzfo.zzbb(), zzfo.zzbc(), zzfo.zzdo());
            this.zzla.zza(zzeb);
        } else {
            zzbv("REQUIRES_SECOND_FACTOR_AUTH");
        }
    }
}
