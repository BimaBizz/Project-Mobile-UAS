package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzfq;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.zzf;

final class zzn implements zzez<zzfq> {
    private final /* synthetic */ zzdm zzla;
    private final /* synthetic */ zzb zzle;

    zzn(zzb zzb, zzdm zzdm) {
        this.zzle = zzb;
        this.zzla = zzdm;
    }

    public final void zzbv(@Nullable String str) {
        Status zzdc = zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzes zzes;
        zzfq zzfq = (zzfq) obj;
        new zzes(zzfq.zzs(), zzfq.getIdToken(), Long.valueOf(zzfq.zzt()), "Bearer");
        zzb.zza(this.zzle, zzes, (String) null, (String) null, Boolean.valueOf(zzfq.isNewUser()), (zzf) null, this.zzla, this);
    }
}
