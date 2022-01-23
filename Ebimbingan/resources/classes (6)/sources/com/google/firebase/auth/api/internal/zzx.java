package com.google.firebase.auth.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.firebase_auth.zzek;
import com.google.android.gms.internal.firebase_auth.zzem;
import com.google.android.gms.internal.firebase_auth.zzes;
import java.util.List;

final class zzx implements zzez<zzek> {
    private final /* synthetic */ zzez zzls;
    private final /* synthetic */ zzes zzlu;
    private final /* synthetic */ zzu zzlx;

    zzx(zzu zzu, zzez zzez, zzes zzes) {
        this.zzlx = zzu;
        this.zzls = zzez;
        this.zzlu = zzes;
    }

    public final void zzbv(@Nullable String str) {
        this.zzls.zzbv(str);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        List<zzem> zzer = ((zzek) obj).zzer();
        List<zzem> list = zzer;
        if (zzer == null || list.isEmpty()) {
            this.zzls.zzbv("No users");
        } else {
            this.zzlx.zzla.zza(this.zzlu, list.get(0));
        }
    }
}
