package com.google.android.gms.internal.firebase_auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzfd;

public final class zzfi implements zzfd<zzp.zzn> {
    @Nullable
    private String zzhy;
    private String zzif;
    private String zzig;
    @Nullable
    private String zzjv;

    public zzfi(@Nullable String str) {
        this.zzhy = str;
    }

    public zzfi(String str, String str2, @Nullable String str3, @Nullable String str4) {
        String str5 = str3;
        this.zzif = C0446Preconditions.checkNotEmpty(str);
        this.zzig = C0446Preconditions.checkNotEmpty(str2);
        this.zzjv = null;
        this.zzhy = str4;
    }

    public final /* synthetic */ zzjc zzeq() {
        zzp.zzn.zza zzaq = zzp.zzn.zzaq();
        if (this.zzif != null) {
            zzp.zzn.zza zzaw = zzaq.zzaw(this.zzif);
        }
        if (this.zzig != null) {
            zzp.zzn.zza zzax = zzaq.zzax(this.zzig);
        }
        if (this.zzhy != null) {
            zzp.zzn.zza zzay = zzaq.zzay(this.zzhy);
        }
        return (zzp.zzn) ((zzhs) zzaq.zzih());
    }
}
