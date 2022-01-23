package com.google.android.gms.internal.firebase_auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzdv;

public final class zzfl implements zzdv<zzfl, zzp.zzo> {
    private String zzib;
    private String zzif;
    private String zzjv;
    private String zzkh;
    private long zzrh;

    public zzfl() {
    }

    public final String getIdToken() {
        return this.zzib;
    }

    @NonNull
    public final String zzs() {
        return this.zzkh;
    }

    public final long zzt() {
        return this.zzrh;
    }

    public final zzjm<zzp.zzo> zzee() {
        return zzp.zzo.zzm();
    }

    public final /* synthetic */ zzdv zza(zzjc zzjc) {
        Throwable th;
        zzjc zzjc2 = zzjc;
        if (!(zzjc2 instanceof zzp.zzo)) {
            Throwable th2 = th;
            new IllegalArgumentException("The passed proto must be an instance of SignUpNewUserResponse.");
            throw th2;
        }
        zzp.zzo zzo = (zzp.zzo) zzjc2;
        this.zzib = Strings.emptyToNull(zzo.getIdToken());
        this.zzjv = Strings.emptyToNull(zzo.getDisplayName());
        this.zzif = Strings.emptyToNull(zzo.getEmail());
        this.zzkh = Strings.emptyToNull(zzo.zzs());
        this.zzrh = zzo.zzt();
        return this;
    }
}
