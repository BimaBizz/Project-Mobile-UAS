package com.google.android.gms.internal.firebase_auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.api.internal.zzfd;
import com.google.firebase.auth.zzb;

public final class zzeh implements zzfd<zzp.zzd> {
    private static final Logger zzjt;
    @Nullable
    private final String zzib;
    private final String zzif;
    private final String zzih;

    public zzeh(EmailAuthCredential emailAuthCredential, @Nullable String str) {
        EmailAuthCredential emailAuthCredential2 = emailAuthCredential;
        this.zzif = Preconditions.checkNotEmpty(emailAuthCredential2.getEmail());
        this.zzih = Preconditions.checkNotEmpty(emailAuthCredential2.zzco());
        this.zzib = str;
    }

    public final /* synthetic */ zzjc zzeq() {
        zzp.zzd.zza zzj = zzp.zzd.zzq().zzj(this.zzif);
        zzb zzbr = zzb.zzbr(this.zzih);
        zzb zzb = zzbr;
        String zzcn = zzbr != null ? zzb.zzcn() : null;
        String zzba = zzb != null ? zzb.zzba() : null;
        if (zzcn != null) {
            zzp.zzd.zza zzi = zzj.zzi(zzcn);
        }
        if (zzba != null) {
            zzp.zzd.zza zzl = zzj.zzl(zzba);
        }
        if (this.zzib != null) {
            zzp.zzd.zza zzk = zzj.zzk(this.zzib);
        }
        return (zzp.zzd) ((zzhs) zzj.zzih());
    }

    static {
        Logger logger;
        new Logger("EmailLinkSignInRequest", new String[0]);
        zzjt = logger;
    }
}
