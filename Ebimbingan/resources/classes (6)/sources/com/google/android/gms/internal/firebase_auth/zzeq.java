package com.google.android.gms.internal.firebase_auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.api.internal.zzfd;

public final class zzeq implements zzfd<zzp.zzh> {
    @Nullable
    private String zzhy;
    private String zzib;
    private String zzif;
    private ActionCodeSettings zzkk;
    private String zzku;
    private String zzru;

    public zzeq(zzfw zzfw) {
        this.zzru = zzc(zzfw);
    }

    private zzeq(zzfw zzfw, ActionCodeSettings actionCodeSettings, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        String str5 = str;
        String str6 = str4;
        this.zzru = zzc((zzfw) Preconditions.checkNotNull(zzfw));
        this.zzkk = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        this.zzif = null;
        this.zzku = str2;
        this.zzib = str3;
        this.zzhy = null;
    }

    public static zzeq zza(ActionCodeSettings actionCodeSettings, String str, String str2) {
        zzeq zzeq;
        ActionCodeSettings actionCodeSettings2 = actionCodeSettings;
        String str3 = str;
        String str4 = str2;
        String checkNotEmpty = Preconditions.checkNotEmpty(str3);
        String checkNotEmpty2 = Preconditions.checkNotEmpty(str4);
        Object checkNotNull = Preconditions.checkNotNull(actionCodeSettings2);
        new zzeq(zzfw.zzvk, actionCodeSettings2, (String) null, str4, str3, (String) null);
        return zzeq;
    }

    public final zzeq zzcj(String str) {
        this.zzif = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzeq zzck(String str) {
        this.zzib = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzeq zza(ActionCodeSettings actionCodeSettings) {
        this.zzkk = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        return this;
    }

    public final zzeq zzcl(@Nullable String str) {
        this.zzhy = str;
        return this;
    }

    public final ActionCodeSettings zzdj() {
        return this.zzkk;
    }

    private static String zzc(zzfw zzfw) {
        switch (zzfw) {
            case zzve:
                return "PASSWORD_RESET";
            case zzvh:
                return "VERIFY_EMAIL";
            case zzvj:
                return "EMAIL_SIGNIN";
            case zzvk:
                return "VERIFY_BEFORE_UPDATE_EMAIL";
            default:
                return "REQUEST_TYPE_UNSET_ENUM_VALUE";
        }
    }

    public final /* synthetic */ zzjc zzeq() {
        zzfw zzfw;
        zzp.zzh.zza zzaa = zzp.zzh.zzaa();
        String str = this.zzru;
        boolean z = true;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    z = false;
                    break;
                }
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    z = true;
                    break;
                }
                break;
            case -1288726400:
                if (str.equals("VERIFY_BEFORE_UPDATE_EMAIL")) {
                    z = true;
                    break;
                }
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                zzfw = zzfw.zzve;
                break;
            case true:
                zzfw = zzfw.zzvh;
                break;
            case true:
                zzfw = zzfw.zzvj;
                break;
            case true:
                zzfw = zzfw.zzvk;
                break;
            default:
                zzfw = zzfw.zzvd;
                break;
        }
        zzp.zzh.zza zza = zzaa.zza(zzfw);
        if (this.zzif != null) {
            zzp.zzh.zza zzp = zza.zzp(this.zzif);
        }
        if (this.zzku != null) {
            zzp.zzh.zza zzq = zza.zzq(this.zzku);
        }
        if (this.zzib != null) {
            zzp.zzh.zza zzr = zza.zzr(this.zzib);
        }
        if (this.zzkk != null) {
            zzp.zzh.zza zzb = zza.zza(this.zzkk.getAndroidInstallApp()).zzb(this.zzkk.canHandleCodeInApp());
            if (this.zzkk.getUrl() != null) {
                zzp.zzh.zza zzs = zza.zzs(this.zzkk.getUrl());
            }
            if (this.zzkk.getIOSBundle() != null) {
                zzp.zzh.zza zzt = zza.zzt(this.zzkk.getIOSBundle());
            }
            if (this.zzkk.zzck() != null) {
                zzp.zzh.zza zzu = zza.zzu(this.zzkk.zzck());
            }
            if (this.zzkk.getAndroidPackageName() != null) {
                zzp.zzh.zza zzv = zza.zzv(this.zzkk.getAndroidPackageName());
            }
            if (this.zzkk.getAndroidMinimumVersion() != null) {
                zzp.zzh.zza zzw = zza.zzw(this.zzkk.getAndroidMinimumVersion());
            }
            if (this.zzkk.zzcm() != null) {
                zzp.zzh.zza zzy = zza.zzy(this.zzkk.zzcm());
            }
        }
        if (this.zzhy != null) {
            zzp.zzh.zza zzx = zza.zzx(this.zzhy);
        }
        return (zzp.zzh) ((zzhs) zza.zzih());
    }
}
