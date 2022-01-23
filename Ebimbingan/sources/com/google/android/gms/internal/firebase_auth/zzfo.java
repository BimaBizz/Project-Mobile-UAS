package com.google.android.gms.internal.firebase_auth;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.C0615Strings;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzdv;
import com.google.firebase.auth.zzf;
import java.util.ArrayList;
import java.util.List;

public final class zzfo implements zzdv<zzfo, zzp.zzq> {
    private String zzhy;
    private String zzia;
    private String zzib;
    private String zzie;
    private String zzif;
    private String zzjv;
    private String zzkc;
    private String zzkh;
    private String zzkx;
    private List<zzeu> zzky;
    private String zzrf;
    private boolean zzrg;
    private long zzrh;
    private String zzsd;
    private boolean zzsv;
    private boolean zzsw;
    private String zzsx;
    private String zzsy;
    private String zzsz;

    public zzfo() {
    }

    public final boolean zzfb() {
        return this.zzsv;
    }

    public final String getIdToken() {
        return this.zzib;
    }

    public final String getEmail() {
        return this.zzif;
    }

    public final String getProviderId() {
        return this.zzia;
    }

    public final String getRawUserInfo() {
        return this.zzsd;
    }

    @Nullable
    public final String zzs() {
        return this.zzkh;
    }

    public final long zzt() {
        return this.zzrh;
    }

    public final boolean isNewUser() {
        return this.zzrg;
    }

    public final String getErrorMessage() {
        return this.zzsz;
    }

    public final boolean zzfc() {
        return this.zzsv || !TextUtils.isEmpty(this.zzsz);
    }

    @Nullable
    public final String zzba() {
        return this.zzhy;
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

    @Nullable
    public final zzf zzdo() {
        if (TextUtils.isEmpty(this.zzsx) && TextUtils.isEmpty(this.zzsy)) {
            return null;
        }
        if (this.zzie != null) {
            return zzf.zza(this.zzia, this.zzsy, this.zzsx, this.zzie);
        }
        return zzf.zza(this.zzia, this.zzsy, this.zzsx);
    }

    public final zzjm<zzp.zzq> zzee() {
        return zzp.zzq.zzm();
    }

    public final /* synthetic */ zzdv zza(zzjc zzjc) {
        List<zzeu> list;
        Throwable th;
        zzjc zzjc2 = zzjc;
        if (!(zzjc2 instanceof zzp.zzq)) {
            Throwable th2 = th;
            new IllegalArgumentException("The passed proto must be an instance of VerifyAssertionResponse.");
            throw th2;
        }
        zzp.zzq zzq = (zzp.zzq) zzjc2;
        this.zzsv = zzq.zzav();
        this.zzsw = zzq.zzax();
        this.zzib = C0615Strings.emptyToNull(zzq.getIdToken());
        this.zzkh = C0615Strings.emptyToNull(zzq.zzs());
        this.zzrh = zzq.zzt();
        this.zzrf = C0615Strings.emptyToNull(zzq.getLocalId());
        this.zzif = C0615Strings.emptyToNull(zzq.getEmail());
        this.zzjv = C0615Strings.emptyToNull(zzq.getDisplayName());
        this.zzkc = C0615Strings.emptyToNull(zzq.zzam());
        this.zzia = C0615Strings.emptyToNull(zzq.getProviderId());
        this.zzsd = C0615Strings.emptyToNull(zzq.getRawUserInfo());
        this.zzrg = zzq.zzu();
        this.zzsx = zzq.zzaw();
        this.zzsy = zzq.zzay();
        this.zzsz = C0615Strings.emptyToNull(zzq.getErrorMessage());
        this.zzie = C0615Strings.emptyToNull(zzq.zzaz());
        this.zzhy = C0615Strings.emptyToNull(zzq.zzba());
        new ArrayList();
        this.zzky = list;
        for (zzr zza : zzq.zzbc()) {
            boolean add = this.zzky.add(zzeu.zza(zza));
        }
        this.zzkx = C0615Strings.emptyToNull(zzq.zzbb());
        return this;
    }
}
