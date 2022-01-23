package com.google.firebase.auth.api.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_auth.zzdz;
import com.google.android.gms.internal.firebase_auth.zzec;
import com.google.android.gms.internal.firebase_auth.zzed;
import com.google.android.gms.internal.firebase_auth.zzeg;
import com.google.android.gms.internal.firebase_auth.zzeh;
import com.google.android.gms.internal.firebase_auth.zzei;
import com.google.android.gms.internal.firebase_auth.zzek;
import com.google.android.gms.internal.firebase_auth.zzel;
import com.google.android.gms.internal.firebase_auth.zzem;
import com.google.android.gms.internal.firebase_auth.zzeq;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.android.gms.internal.firebase_auth.zzfa;
import com.google.android.gms.internal.firebase_auth.zzfd;
import com.google.android.gms.internal.firebase_auth.zzfg;
import com.google.android.gms.internal.firebase_auth.zzfi;
import com.google.android.gms.internal.firebase_auth.zzfj;
import com.google.android.gms.internal.firebase_auth.zzfl;
import com.google.android.gms.internal.firebase_auth.zzfm;
import com.google.android.gms.internal.firebase_auth.zzfo;
import com.google.android.gms.internal.firebase_auth.zzfq;
import com.google.android.gms.internal.firebase_auth.zzfr;
import com.google.android.gms.internal.firebase_auth.zzfs;
import com.google.android.gms.internal.firebase_auth.zzfu;
import com.google.android.gms.internal.firebase_auth.zzfw;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.zzf;

public final class zzb {
    /* access modifiers changed from: private */
    public final zzex zzlb;
    /* access modifiers changed from: private */
    public final zzdt zzlc;
    /* access modifiers changed from: private */
    public final zzeg zzld;

    public zzb(zzex zzex, zzdt zzdt, zzeg zzeg) {
        this.zzlb = (zzex) Preconditions.checkNotNull(zzex);
        this.zzlc = (zzdt) Preconditions.checkNotNull(zzdt);
        this.zzld = (zzeg) Preconditions.checkNotNull(zzeg);
    }

    public final void zza(String str, zzdm zzdm) {
        zzei zzei;
        zzez zzez;
        String str2 = str;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzei(str2);
        new zza(this, zzdm2);
        this.zzlb.zza(zzei, (zzez<zzes>) zzez);
    }

    public final void zza(zzfr zzfr, zzdm zzdm) {
        zzez zzez;
        zzfr zzfr2 = zzfr;
        zzdm zzdm2 = zzdm;
        Object checkNotNull = Preconditions.checkNotNull(zzfr2);
        Object checkNotNull2 = Preconditions.checkNotNull(zzdm2);
        new zzn(this, zzdm2);
        this.zzlb.zza(zzfr2, (zzez<zzfq>) zzez);
    }

    public final void zza(zzfm zzfm, zzdm zzdm) {
        zzez zzez;
        zzfm zzfm2 = zzfm;
        zzdm zzdm2 = zzdm;
        Object checkNotNull = Preconditions.checkNotNull(zzfm2);
        Object checkNotNull2 = Preconditions.checkNotNull(zzdm2);
        if (this.zzlc.zzec().booleanValue() && this.zzld.zzej()) {
            zzfm zzr = zzfm2.zzr(this.zzlc.zzec().booleanValue());
        }
        new zzv(this, zzdm2);
        this.zzlb.zza(zzfm2, (zzez<zzfo>) zzez);
    }

    public final void zzb(@Nullable String str, zzdm zzdm) {
        zzfi zzfi;
        zzez zzez;
        zzdm zzdm2 = zzdm;
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzfi(str);
        new zzaa(this, zzdm2);
        this.zzlb.zza(zzfi, (zzez<zzfl>) zzez);
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzdm zzdm) {
        zzez zzez;
        String str2 = str;
        UserProfileChangeRequest userProfileChangeRequest2 = userProfileChangeRequest;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        Object checkNotNull = Preconditions.checkNotNull(userProfileChangeRequest2);
        Object checkNotNull2 = Preconditions.checkNotNull(zzdm2);
        new zzad(this, userProfileChangeRequest2, zzdm2);
        zza(str2, (zzez<zzes>) zzez);
    }

    public final void zza(String str, String str2, zzdm zzdm) {
        zzez zzez;
        String str3 = str;
        String str4 = str2;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str3);
        String checkNotEmpty2 = Preconditions.checkNotEmpty(str4);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzac(this, str4, zzdm2);
        zza(str3, (zzez<zzes>) zzez);
    }

    public final void zzb(String str, String str2, zzdm zzdm) {
        zzez zzez;
        String str3 = str;
        String str4 = str2;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str3);
        String checkNotEmpty2 = Preconditions.checkNotEmpty(str4);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzaf(this, str4, zzdm2);
        zza(str3, (zzez<zzes>) zzez);
    }

    public final void zzc(String str, @Nullable String str2, zzdm zzdm) {
        zzfg zzfg;
        zzez zzez;
        String str3 = str;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str3);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzfg();
        zzfg zzfg2 = zzfg;
        zzfg zzfg3 = zzfg2;
        zzfg zzcw = zzfg2.zzcw(str3);
        zzfg zzcx = zzfg3.zzcx(str2);
        new zzae(this, zzdm2);
        this.zzlb.zza(zzfg3, (zzez<zzfj>) zzez);
    }

    private final void zza(String str, zzez<zzes> zzez) {
        zzei zzei;
        zzez zzez2;
        String str2 = str;
        zzez<zzes> zzez3 = zzez;
        Object checkNotNull = Preconditions.checkNotNull(zzez3);
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        zzes zzcn = zzes.zzcn(str2);
        zzes zzes = zzcn;
        if (zzcn.isValid()) {
            zzez3.onSuccess(zzes);
            return;
        }
        new zzei(zzes.zzs());
        new zzah(this, zzez3);
        this.zzlb.zza(zzei, (zzez<zzes>) zzez2);
    }

    public final void zza(String str, String str2, @Nullable String str3, zzdm zzdm) {
        zzfi zzfi;
        zzez zzez;
        String str4 = str;
        String str5 = str2;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str4);
        String checkNotEmpty2 = Preconditions.checkNotEmpty(str5);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzfi(str4, str5, (String) null, str3);
        new zzd(this, zzdm2);
        this.zzlb.zza(zzfi, (zzez<zzfl>) zzez);
    }

    public final void zzb(String str, String str2, @Nullable String str3, zzdm zzdm) {
        zzfs zzfs;
        zzez zzez;
        String str4 = str;
        String str5 = str2;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str4);
        String checkNotEmpty2 = Preconditions.checkNotEmpty(str5);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzfs(str4, str5, str3);
        new zzc(this, zzdm2);
        this.zzlb.zza(zzfs, (zzez<zzfu>) zzez);
    }

    public final void zza(EmailAuthCredential emailAuthCredential, zzdm zzdm) {
        zzeh zzeh;
        zzez zzez;
        EmailAuthCredential emailAuthCredential2 = emailAuthCredential;
        zzdm zzdm2 = zzdm;
        Object checkNotNull = Preconditions.checkNotNull(emailAuthCredential2);
        Object checkNotNull2 = Preconditions.checkNotNull(zzdm2);
        if (emailAuthCredential2.zzcq()) {
            new zzf(this, emailAuthCredential2, zzdm2);
            zza(emailAuthCredential2.zzcp(), (zzez<zzes>) zzez);
            return;
        }
        new zzeh(emailAuthCredential2, (String) null);
        zza(zzeh, zzdm2);
    }

    /* access modifiers changed from: private */
    public final void zza(zzeh zzeh, zzdm zzdm) {
        zzez zzez;
        zzeh zzeh2 = zzeh;
        zzdm zzdm2 = zzdm;
        Object checkNotNull = Preconditions.checkNotNull(zzeh2);
        Object checkNotNull2 = Preconditions.checkNotNull(zzdm2);
        new zze(this, zzdm2);
        this.zzlb.zza(zzeh2, (zzez<zzeg>) zzez);
    }

    /* access modifiers changed from: private */
    public final void zza(zzdm zzdm, zzes zzes, zzfg zzfg, zzew zzew) {
        zzel zzel;
        zzez zzez;
        zzdm zzdm2 = zzdm;
        zzes zzes2 = zzes;
        zzfg zzfg2 = zzfg;
        zzew zzew2 = zzew;
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        Object checkNotNull2 = Preconditions.checkNotNull(zzes2);
        Object checkNotNull3 = Preconditions.checkNotNull(zzfg2);
        Object checkNotNull4 = Preconditions.checkNotNull(zzew2);
        new zzel(zzes2.getAccessToken());
        new zzh(this, zzew2, zzdm2, zzes2, zzfg2);
        this.zzlb.zza(zzel, (zzez<zzek>) zzez);
    }

    /* access modifiers changed from: private */
    public final void zza(zzdm zzdm, zzes zzes, zzem zzem, zzfg zzfg, zzew zzew) {
        zzez zzez;
        zzdm zzdm2 = zzdm;
        zzes zzes2 = zzes;
        zzem zzem2 = zzem;
        zzfg zzfg2 = zzfg;
        zzew zzew2 = zzew;
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        Object checkNotNull2 = Preconditions.checkNotNull(zzes2);
        Object checkNotNull3 = Preconditions.checkNotNull(zzem2);
        Object checkNotNull4 = Preconditions.checkNotNull(zzfg2);
        Object checkNotNull5 = Preconditions.checkNotNull(zzew2);
        new zzg(this, zzfg2, zzem2, zzdm2, zzes2, zzew2);
        this.zzlb.zza(zzfg2, (zzez<zzfj>) zzez);
    }

    private static zzes zza(zzes zzes, zzfj zzfj) {
        zzes zzes2;
        zzes zzes3 = zzes;
        zzfj zzfj2 = zzfj;
        Object checkNotNull = Preconditions.checkNotNull(zzes3);
        Object checkNotNull2 = Preconditions.checkNotNull(zzfj2);
        String idToken = zzfj2.getIdToken();
        String zzs = zzfj2.zzs();
        if (TextUtils.isEmpty(idToken) || TextUtils.isEmpty(zzs)) {
            return zzes3;
        }
        new zzes(zzs, idToken, Long.valueOf(zzfj2.zzt()), zzes3.zzeu());
        return zzes2;
    }

    private final void zza(zzes zzes, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable zzf zzf, zzdm zzdm, zzew zzew) {
        zzel zzel;
        zzez zzez;
        zzes zzes2 = zzes;
        zzdm zzdm2 = zzdm;
        zzew zzew2 = zzew;
        Object checkNotNull = Preconditions.checkNotNull(zzes2);
        Object checkNotNull2 = Preconditions.checkNotNull(zzew2);
        Object checkNotNull3 = Preconditions.checkNotNull(zzdm2);
        new zzel(zzes2.getAccessToken());
        new zzj(this, zzew2, str2, str, bool, zzf, zzdm2, zzes2);
        this.zzlb.zza(zzel, (zzez<zzek>) zzez);
    }

    public final void zzd(String str, @Nullable String str2, zzdm zzdm) {
        zzed zzed;
        zzez zzez;
        String str3 = str;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str3);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzed(str3, str2);
        new zzi(this, zzdm2);
        this.zzlb.zza(zzed, (zzez<zzec>) zzez);
    }

    public final void zza(String str, ActionCodeSettings actionCodeSettings, @Nullable String str2, zzdm zzdm) {
        zzeq zzeq;
        zzeq zzeq2;
        zzez zzez;
        zzeq zzeq3;
        String str3 = str;
        ActionCodeSettings actionCodeSettings2 = actionCodeSettings;
        String str4 = str2;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str3);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        zzfw zzk = zzfw.zzk(actionCodeSettings2.getRequestType());
        zzfw zzfw = zzk;
        if (zzk != null) {
            new zzeq(zzfw);
            zzeq2 = zzeq3;
        } else {
            new zzeq(zzfw.zzvd);
            zzeq2 = zzeq;
        }
        zzeq zzcj = zzeq2.zzcj(str3);
        zzeq zza = zzeq2.zza(actionCodeSettings2);
        zzeq zzcl = zzeq2.zzcl(str4);
        new zzl(this, zzdm2);
        this.zzlb.zza(zzeq2, (zzez<Object>) zzez);
    }

    public final void zza(String str, @Nullable ActionCodeSettings actionCodeSettings, zzdm zzdm) {
        zzeq zzeq;
        String str2 = str;
        ActionCodeSettings actionCodeSettings2 = actionCodeSettings;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzeq(zzfw.zzvh);
        zzeq zzeq2 = zzeq;
        zzeq zzeq3 = zzeq2;
        zzeq zzck = zzeq2.zzck(str2);
        if (actionCodeSettings2 != null) {
            zzeq zza = zzeq3.zza(actionCodeSettings2);
        }
        zzb(zzeq3, zzdm2);
    }

    public final void zze(String str, @Nullable String str2, zzdm zzdm) {
        zzfa zzfa;
        zzez zzez;
        String str3 = str;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str3);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzfa(str3, (String) null, str2);
        new zzk(this, zzdm2);
        this.zzlb.zza(zzfa, (zzez<zzfd>) zzez);
    }

    public final void zzc(String str, String str2, @Nullable String str3, zzdm zzdm) {
        zzfa zzfa;
        zzez zzez;
        String str4 = str;
        String str5 = str2;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str4);
        String checkNotEmpty2 = Preconditions.checkNotEmpty(str5);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzfa(str4, str5, str3);
        new zzm(this, zzdm2);
        this.zzlb.zza(zzfa, (zzez<zzfd>) zzez);
    }

    public final void zzd(String str, String str2, String str3, zzdm zzdm) {
        zzez zzez;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str4);
        String checkNotEmpty2 = Preconditions.checkNotEmpty(str5);
        String checkNotEmpty3 = Preconditions.checkNotEmpty(str6);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzp(this, str4, str5, zzdm2);
        zza(str6, (zzez<zzes>) zzez);
    }

    public final void zza(String str, zzfm zzfm, zzdm zzdm) {
        zzez zzez;
        String str2 = str;
        zzfm zzfm2 = zzfm;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        Object checkNotNull = Preconditions.checkNotNull(zzfm2);
        Object checkNotNull2 = Preconditions.checkNotNull(zzdm2);
        new zzo(this, zzfm2, zzdm2);
        zza(str2, (zzez<zzes>) zzez);
    }

    public final void zzc(String str, zzdm zzdm) {
        zzez zzez;
        String str2 = str;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzq(this, zzdm2);
        zza(str2, (zzez<zzes>) zzez);
    }

    public final void zzf(String str, String str2, zzdm zzdm) {
        zzez zzez;
        String str3 = str;
        String str4 = str2;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str3);
        String checkNotEmpty2 = Preconditions.checkNotEmpty(str4);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzt(this, str3, zzdm2);
        zza(str4, (zzez<zzes>) zzez);
    }

    public final void zza(zzeq zzeq, zzdm zzdm) {
        zzb(zzeq, zzdm);
    }

    public final void zzd(String str, zzdm zzdm) {
        zzez zzez;
        String str2 = str;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzu(this, zzdm2);
        zza(str2, (zzez<zzes>) zzez);
    }

    public final void zze(String str, zzdm zzdm) {
        zzez zzez;
        String str2 = str;
        zzdm zzdm2 = zzdm;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzw(this, zzdm2);
        zza(str2, (zzez<zzes>) zzez);
    }

    public final void zzf(@Nullable String str, zzdm zzdm) {
        zzez zzez;
        zzdm zzdm2 = zzdm;
        Object checkNotNull = Preconditions.checkNotNull(zzdm2);
        new zzy(this, zzdm2);
        this.zzlb.zzb(str, zzez);
    }

    private final void zzb(zzeq zzeq, zzdm zzdm) {
        zzez zzez;
        zzeq zzeq2 = zzeq;
        zzdm zzdm2 = zzdm;
        Object checkNotNull = Preconditions.checkNotNull(zzeq2);
        Object checkNotNull2 = Preconditions.checkNotNull(zzdm2);
        new zzab(this, zzdm2);
        this.zzlb.zza(zzeq2, (zzez<Object>) zzez);
    }

    /* access modifiers changed from: private */
    public final void zza(zzfo zzfo, zzdm zzdm, zzew zzew) {
        zzes zzes;
        Status zzdc;
        zzdz zzdz;
        Status status;
        zzfo zzfo2 = zzfo;
        zzdm zzdm2 = zzdm;
        zzew zzew2 = zzew;
        if (zzfo2.zzfc()) {
            zzf zzdo = zzfo2.zzdo();
            String email = zzfo2.getEmail();
            String zzba = zzfo2.zzba();
            if (zzfo2.zzfb()) {
                new Status(FirebaseError.ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL);
                zzdc = status;
            } else {
                zzdc = zzt.zzdc(zzfo2.getErrorMessage());
            }
            if (!this.zzlc.zzec().booleanValue() || !this.zzld.zzej()) {
                zzdm2.onFailure(zzdc);
                return;
            }
            new zzdz(zzdc, zzdo, email, zzba);
            zzdm2.zza(zzdz);
            return;
        }
        new zzes(zzfo2.zzs(), zzfo2.getIdToken(), Long.valueOf(zzfo2.zzt()), "Bearer");
        zza(zzes, zzfo2.getRawUserInfo(), zzfo2.getProviderId(), Boolean.valueOf(zzfo2.isNewUser()), zzfo2.zzdo(), zzdm2, zzew2);
    }

    static /* synthetic */ void zza(zzb zzb, zzes zzes, String str, String str2, Boolean bool, zzf zzf, zzdm zzdm, zzew zzew) {
        String str3 = str;
        String str4 = str2;
        zzf zzf2 = zzf;
        zzb.zza(zzes, (String) null, (String) null, bool, (zzf) null, zzdm, zzew);
    }

    static /* synthetic */ zzes zza(zzb zzb, zzes zzes, zzfj zzfj) {
        zzb zzb2 = zzb;
        return zza(zzes, zzfj);
    }
}
