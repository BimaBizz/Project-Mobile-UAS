package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.internal.firebase_auth.zzek;
import com.google.android.gms.internal.firebase_auth.zzem;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzfg;
import com.google.firebase.auth.internal.zzt;
import java.util.List;

final class zzs implements zzez<zzek> {
    private final /* synthetic */ zzez zzls;
    private final /* synthetic */ zzes zzlu;
    private final /* synthetic */ zzt zzlv;

    zzs(zzt zzt, zzez zzez, zzes zzes) {
        this.zzlv = zzt;
        this.zzls = zzez;
        this.zzlu = zzes;
    }

    public final void zzbv(@Nullable String str) {
        C0236Status zzdc = zzt.zzdc(str);
        this.zzlv.zzla.onFailure(zzdc);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzfg zzfg;
        List<zzem> zzer = ((zzek) obj).zzer();
        List<zzem> list = zzer;
        if (zzer == null || list.isEmpty()) {
            this.zzls.zzbv("No users.");
            return;
        }
        zzem zzem = list.get(0);
        new zzfg();
        zzfg zzfg2 = zzfg;
        zzfg zzcv = zzfg2.zzcq(this.zzlu.getAccessToken()).zzcv(this.zzlv.zzlw);
        this.zzlv.zzle.zza(this.zzlv.zzla, this.zzlu, zzem, zzfg2, (zzew) this.zzls);
    }
}
