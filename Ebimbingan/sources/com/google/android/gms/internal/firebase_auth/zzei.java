package com.google.android.gms.internal.firebase_auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.internal.firebase_auth.zzlg;
import com.google.firebase.auth.api.internal.zzfd;

public final class zzei implements zzfd<zzlg.zza> {
    private String zzri;
    private String zzrj;
    @Nullable
    private final String zzrk;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzei(String str) {
        this(str, (String) null);
    }

    private zzei(String str, @Nullable String str2) {
        String str3 = str2;
        this.zzri = zzej.zzrl.toString();
        this.zzrj = C0446Preconditions.checkNotEmpty(str);
        this.zzrk = null;
    }

    public final /* synthetic */ zzjc zzeq() {
        zzlg.zza.C0003zza zzdo = zzlg.zza.zzkz().zzdn(this.zzri).zzdo(this.zzrj);
        zzlg.zza.C0003zza zza = zzdo;
        return (zzlg.zza) ((zzhs) zzdo.zzih());
    }
}
