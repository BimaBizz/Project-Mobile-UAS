package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth.zzeg;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.zzf;

final class zze implements zzez<zzeg> {
    private final /* synthetic */ zzdm zzla;
    private final /* synthetic */ zzb zzle;

    zze(zzb zzb, zzdm zzdm) {
        this.zzle = zzb;
        this.zzla = zzdm;
    }

    public final void zzbv(@Nullable String str) {
        Status zzdc = zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzes zzes;
        zzeg zzeg = (zzeg) obj;
        new zzes(zzeg.zzs(), zzeg.getIdToken(), Long.valueOf(zzeg.zzt()), "Bearer");
        zzb.zza(this.zzle, zzes, (String) null, (String) null, Boolean.valueOf(zzeg.isNewUser()), (zzf) null, this.zzla, this);
    }
}
