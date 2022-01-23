package com.google.android.gms.internal.firebase_auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzfd;

public final class zzfs implements zzfd<zzp.zzt> {
    @Nullable
    private final String zzhy;
    private String zzif;
    private String zzig;
    private boolean zzsj = true;

    public zzfs(String str, String str2, @Nullable String str3) {
        this.zzif = C0446Preconditions.checkNotEmpty(str);
        this.zzig = C0446Preconditions.checkNotEmpty(str2);
        this.zzhy = str3;
    }

    public final /* synthetic */ zzjc zzeq() {
        zzp.zzt.zza zzm = zzp.zzt.zzbh().zzbm(this.zzif).zzbn(this.zzig).zzm(this.zzsj);
        if (this.zzhy != null) {
            zzp.zzt.zza zzbo = zzm.zzbo(this.zzhy);
        }
        return (zzp.zzt) ((zzhs) zzm.zzih());
    }
}
