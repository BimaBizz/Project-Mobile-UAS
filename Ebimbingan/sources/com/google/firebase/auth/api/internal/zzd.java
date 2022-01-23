package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzfl;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.zzf;

final class zzd implements zzez<zzfl> {
    private final /* synthetic */ zzdm zzla;
    private final /* synthetic */ zzb zzle;

    zzd(zzb zzb, zzdm zzdm) {
        this.zzle = zzb;
        this.zzla = zzdm;
    }

    public final void zzbv(@Nullable String str) {
        C0236Status zzdc = zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzes zzes;
        zzfl zzfl = (zzfl) obj;
        new zzes(zzfl.zzs(), zzfl.getIdToken(), Long.valueOf(zzfl.zzt()), "Bearer");
        zzb.zza(this.zzle, zzes, (String) null, (String) null, true, (zzf) null, this.zzla, this);
    }
}
