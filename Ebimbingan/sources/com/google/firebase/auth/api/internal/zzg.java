package com.google.firebase.auth.api.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.C0589Base64Utils;
import com.google.android.gms.internal.firebase_auth.zzem;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzew;
import com.google.android.gms.internal.firebase_auth.zzfg;
import com.google.android.gms.internal.firebase_auth.zzfj;
import java.util.ArrayList;
import java.util.List;

final class zzg implements zzez<zzfj> {
    private final /* synthetic */ zzdm zzla;
    private final /* synthetic */ zzb zzle;
    private final /* synthetic */ zzfg zzlg;
    private final /* synthetic */ zzem zzlh;
    private final /* synthetic */ zzes zzli;
    private final /* synthetic */ zzew zzlj;

    zzg(zzb zzb, zzfg zzfg, zzem zzem, zzdm zzdm, zzes zzes, zzew zzew) {
        this.zzle = zzb;
        this.zzlg = zzfg;
        this.zzlh = zzem;
        this.zzla = zzdm;
        this.zzli = zzes;
        this.zzlj = zzew;
    }

    public final void zzbv(@Nullable String str) {
        this.zzlj.zzbv(str);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        List<zzew> list;
        List<zzew> list2;
        zzfj zzfj = (zzfj) obj;
        if (this.zzlg.zzcp("EMAIL")) {
            zzem zzcf = this.zzlh.zzcf((String) null);
        } else if (this.zzlg.getEmail() != null) {
            zzem zzcf2 = this.zzlh.zzcf(this.zzlg.getEmail());
        }
        if (this.zzlg.zzcp("DISPLAY_NAME")) {
            zzem zzcg = this.zzlh.zzcg((String) null);
        } else if (this.zzlg.getDisplayName() != null) {
            zzem zzcg2 = this.zzlh.zzcg(this.zzlg.getDisplayName());
        }
        if (this.zzlg.zzcp("PHOTO_URL")) {
            zzem zzch = this.zzlh.zzch((String) null);
        } else if (this.zzlg.zzam() != null) {
            zzem zzch2 = this.zzlh.zzch(this.zzlg.zzam());
        }
        if (!TextUtils.isEmpty(this.zzlg.getPassword())) {
            zzem zzci = this.zzlh.zzci(C0589Base64Utils.encode("redacted".getBytes()));
        }
        List<zzew> zzes = zzfj.zzes();
        List<zzew> list3 = zzes;
        if (zzes != null) {
            list2 = list3;
        } else {
            list2 = list;
            new ArrayList();
        }
        zzem zzc = this.zzlh.zzc(list2);
        this.zzla.zza(zzb.zza(this.zzle, this.zzli, zzfj), this.zzlh);
    }
}
