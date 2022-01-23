package com.google.android.gms.internal.firebase_auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzfd;

public final class zzfa implements zzfd<zzp.zzi> {
    private final String zzhu;
    @Nullable
    private final String zzhy;
    @Nullable
    private final String zzkd;

    public zzfa(String str, @Nullable String str2, @Nullable String str3) {
        this.zzhu = C0446Preconditions.checkNotEmpty(str);
        this.zzkd = str2;
        this.zzhy = str3;
    }

    public final /* synthetic */ zzjc zzeq() {
        zzp.zzi.zza zzag = zzp.zzi.zzac().zzag(this.zzhu);
        if (this.zzkd != null) {
            zzp.zzi.zza zzah = zzag.zzah(this.zzkd);
        }
        if (this.zzhy != null) {
            zzp.zzi.zza zzai = zzag.zzai(this.zzhy);
        }
        return (zzp.zzi) ((zzhs) zzag.zzih());
    }
}
