package com.google.android.gms.internal.firebase_auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzfd;

public final class zzfr implements zzfd<zzp.zzr> {
    @Nullable
    private String zzhy;
    private String zzji;

    public zzfr(String str, @Nullable String str2) {
        this.zzji = Preconditions.checkNotEmpty(str);
        this.zzhy = str2;
    }

    public final /* synthetic */ zzjc zzeq() {
        zzp.zzr.zza zzl = zzp.zzr.zzbe().zzbk(this.zzji).zzl(true);
        if (this.zzhy != null) {
            zzp.zzr.zza zzbl = zzl.zzbl(this.zzhy);
        }
        return (zzp.zzr) ((zzhs) zzl.zzih());
    }
}
