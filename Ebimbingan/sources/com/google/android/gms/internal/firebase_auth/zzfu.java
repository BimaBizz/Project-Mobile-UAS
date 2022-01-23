package com.google.android.gms.internal.firebase_auth;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.C0615Strings;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzdv;
import java.util.ArrayList;
import java.util.List;

public final class zzfu implements zzdv<zzfu, zzp.zzu> {
    private String zzib;
    private String zzif;
    private String zzjv;
    private String zzkc;
    private String zzkh;
    private String zzkx;
    private List<zzeu> zzky;
    private String zzrf;
    private long zzrh;

    public zzfu() {
    }

    @NonNull
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

    public final List<zzeu> zzbc() {
        return this.zzky;
    }

    public final String zzbb() {
        return this.zzkx;
    }

    public final boolean zzfd() {
        return !TextUtils.isEmpty(this.zzkx);
    }

    public final zzjm<zzp.zzu> zzee() {
        return zzp.zzu.zzm();
    }

    public final /* synthetic */ zzdv zza(zzjc zzjc) {
        List<zzeu> list;
        Throwable th;
        zzjc zzjc2 = zzjc;
        if (!(zzjc2 instanceof zzp.zzu)) {
            Throwable th2 = th;
            new IllegalArgumentException("The passed proto must be an instance of VerifyPasswordResponse.");
            throw th2;
        }
        zzp.zzu zzu = (zzp.zzu) zzjc2;
        this.zzrf = C0615Strings.emptyToNull(zzu.getLocalId());
        this.zzif = C0615Strings.emptyToNull(zzu.getEmail());
        this.zzjv = C0615Strings.emptyToNull(zzu.getDisplayName());
        this.zzib = C0615Strings.emptyToNull(zzu.getIdToken());
        this.zzkc = C0615Strings.emptyToNull(zzu.zzam());
        this.zzkh = C0615Strings.emptyToNull(zzu.zzs());
        this.zzrh = zzu.zzt();
        new ArrayList();
        this.zzky = list;
        for (zzr zza : zzu.zzbc()) {
            boolean add = this.zzky.add(zzeu.zza(zza));
        }
        this.zzkx = zzu.zzbb();
        return this;
    }
}
