package com.google.android.gms.internal.firebase_auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzfd;

public final class zzed implements zzfd<zzp.zza> {
    @Nullable
    private final String zzhy;
    private String zzrd;
    private String zzre = "http://localhost";

    public zzed(String str, @Nullable String str2) {
        this.zzrd = C0446Preconditions.checkNotEmpty(str);
        this.zzhy = str2;
    }

    public final /* synthetic */ zzjc zzeq() {
        zzp.zza.C0004zza zzb = zzp.zza.zzd().zza(this.zzrd).zzb(this.zzre);
        if (this.zzhy != null) {
            zzp.zza.C0004zza zzc = zzb.zzc(this.zzhy);
        }
        return (zzp.zza) ((zzhs) zzb.zzih());
    }
}
