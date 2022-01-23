package com.google.android.gms.internal.firebase_auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzdv;

public final class zzeg implements zzdv<zzeg, zzp.zze> {
    private String zzib;
    private String zzif;
    private String zzkh;
    private String zzrf;
    private boolean zzrg;
    private long zzrh;

    public zzeg() {
    }

    @NonNull
    public final String getIdToken() {
        return this.zzib;
    }

    @NonNull
    public final String zzs() {
        return this.zzkh;
    }

    public final boolean isNewUser() {
        return this.zzrg;
    }

    public final long zzt() {
        return this.zzrh;
    }

    public final zzjm<zzp.zze> zzee() {
        return zzp.zze.zzm();
    }

    public final /* synthetic */ zzdv zza(zzjc zzjc) {
        Throwable th;
        zzjc zzjc2 = zzjc;
        if (!(zzjc2 instanceof zzp.zze)) {
            Throwable th2 = th;
            new IllegalArgumentException("The passed proto must be an instance of EmailLinkSigninResponse.");
            throw th2;
        }
        zzp.zze zze = (zzp.zze) zzjc2;
        this.zzrf = Strings.emptyToNull(zze.getLocalId());
        this.zzif = Strings.emptyToNull(zze.getEmail());
        this.zzib = Strings.emptyToNull(zze.getIdToken());
        this.zzkh = Strings.emptyToNull(zze.zzs());
        this.zzrg = zze.zzu();
        this.zzrh = zze.zzt();
        return this;
    }
}
