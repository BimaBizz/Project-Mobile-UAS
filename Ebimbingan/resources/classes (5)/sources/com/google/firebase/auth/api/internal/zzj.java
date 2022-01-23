package com.google.firebase.auth.api.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.firebase_auth.zzek;
import com.google.android.gms.internal.firebase_auth.zzem;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzew;
import com.google.android.gms.internal.firebase_auth.zzey;
import com.google.firebase.auth.zzf;
import java.util.List;

final class zzj implements zzez<zzek> {
    private final /* synthetic */ zzdm zzla;
    private final /* synthetic */ zzew zzlj;
    private final /* synthetic */ String zzlk;
    private final /* synthetic */ String zzll;
    private final /* synthetic */ Boolean zzlm;
    private final /* synthetic */ zzf zzln;
    private final /* synthetic */ zzes zzlo;

    zzj(zzb zzb, zzew zzew, String str, String str2, Boolean bool, zzf zzf, zzdm zzdm, zzes zzes) {
        zzb zzb2 = zzb;
        this.zzlj = zzew;
        this.zzlk = str;
        this.zzll = str2;
        this.zzlm = bool;
        this.zzln = zzf;
        this.zzla = zzdm;
        this.zzlo = zzes;
    }

    public final void zzbv(@Nullable String str) {
        this.zzlj.zzbv(str);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        List<zzem> zzer = ((zzek) obj).zzer();
        List<zzem> list = zzer;
        if (zzer == null || list.isEmpty()) {
            this.zzlj.zzbv("No users.");
            return;
        }
        zzem zzem = list.get(0);
        zzem zzem2 = zzem;
        zzey zzet = zzem.zzet();
        List<zzew> zzes = zzet != null ? zzet.zzes() : null;
        List<zzew> list2 = zzes;
        if (zzes != null && !list2.isEmpty()) {
            if (!TextUtils.isEmpty(this.zzlk)) {
                int i = 0;
                while (true) {
                    if (i >= list2.size()) {
                        break;
                    } else if (list2.get(i).getProviderId().equals(this.zzlk)) {
                        list2.get(i).zzco(this.zzll);
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                list2.get(0).zzco(this.zzll);
            }
        }
        if (this.zzlm != null) {
            zzem zzo = zzem2.zzo(this.zzlm.booleanValue());
        } else {
            zzem zzo2 = zzem2.zzo(zzem2.getLastSignInTimestamp() - zzem2.getCreationTimestamp() < 1000);
        }
        zzem zza = zzem2.zza(this.zzln);
        this.zzla.zza(this.zzlo, zzem2);
    }
}
