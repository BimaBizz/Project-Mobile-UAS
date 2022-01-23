package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzfg;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzt;

final class zzad implements zzez<zzes> {
    private final /* synthetic */ zzdm zzla;
    private final /* synthetic */ zzb zzle;
    private final /* synthetic */ UserProfileChangeRequest zzlz;

    zzad(zzb zzb, UserProfileChangeRequest userProfileChangeRequest, zzdm zzdm) {
        this.zzle = zzb;
        this.zzlz = userProfileChangeRequest;
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
        zzfg zzfg3 = zzfg2;
        zzfg zzcq = zzfg2.zzcq(zzes.getAccessToken());
        if (this.zzlz.zzde() || this.zzlz.getDisplayName() != null) {
            zzfg zzct = zzfg3.zzct(this.zzlz.getDisplayName());
        }
        if (this.zzlz.zzdf() || this.zzlz.getPhotoUri() != null) {
            zzfg zzcu = zzfg3.zzcu(this.zzlz.zzam());
        }
        this.zzle.zza(this.zzla, zzes, zzfg3, (zzew) this);
    }
}
