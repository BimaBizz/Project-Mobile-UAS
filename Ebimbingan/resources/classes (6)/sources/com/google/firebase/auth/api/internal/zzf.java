package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth.zzeh;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzt;

final class zzf implements zzez<zzes> {
    private final /* synthetic */ zzdm zzla;
    private final /* synthetic */ zzb zzle;
    private final /* synthetic */ EmailAuthCredential zzlf;

    zzf(zzb zzb, EmailAuthCredential emailAuthCredential, zzdm zzdm) {
        this.zzle = zzb;
        this.zzlf = emailAuthCredential;
        this.zzla = zzdm;
    }

    public final void zzbv(@Nullable String str) {
        Status zzdc = zzt.zzdc(str);
        this.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzeh zzeh;
        new zzeh(this.zzlf, ((zzes) obj).getAccessToken());
        this.zzle.zza(zzeh, this.zzla);
    }
}
