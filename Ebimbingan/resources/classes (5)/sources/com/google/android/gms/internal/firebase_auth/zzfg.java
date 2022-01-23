package com.google.android.gms.internal.firebase_auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzfd;
import java.util.Arrays;
import java.util.List;

public final class zzfg implements zzfd<zzp.zzl> {
    @Nullable
    private String zzhy;
    private String zzib;
    private String zzif;
    private String zzig;
    private String zzjv;
    private String zzkc;
    private zzfk zzsh;
    private zzfk zzsi;
    private boolean zzsj = true;
    private String zzsk;

    public zzfg() {
        zzfk zzfk;
        zzfk zzfk2;
        new zzfk();
        this.zzsi = zzfk;
        new zzfk();
        this.zzsh = zzfk2;
    }

    public final boolean zzcp(String str) {
        String str2 = str;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        return this.zzsi.zzez().contains(str2);
    }

    @Nullable
    public final String getEmail() {
        return this.zzif;
    }

    @Nullable
    public final String getPassword() {
        return this.zzig;
    }

    @Nullable
    public final String getDisplayName() {
        return this.zzjv;
    }

    @Nullable
    public final String zzam() {
        return this.zzkc;
    }

    @NonNull
    public final zzfg zzcq(String str) {
        this.zzib = Preconditions.checkNotEmpty(str);
        return this;
    }

    @NonNull
    public final zzfg zzcr(@Nullable String str) {
        String str2 = str;
        if (str2 == null) {
            boolean add = this.zzsi.zzez().add("EMAIL");
        } else {
            this.zzif = str2;
        }
        return this;
    }

    @NonNull
    public final zzfg zzcs(@Nullable String str) {
        String str2 = str;
        if (str2 == null) {
            boolean add = this.zzsi.zzez().add("PASSWORD");
        } else {
            this.zzig = str2;
        }
        return this;
    }

    @NonNull
    public final zzfg zzct(@Nullable String str) {
        String str2 = str;
        if (str2 == null) {
            boolean add = this.zzsi.zzez().add("DISPLAY_NAME");
        } else {
            this.zzjv = str2;
        }
        return this;
    }

    @NonNull
    public final zzfg zzcu(@Nullable String str) {
        String str2 = str;
        if (str2 == null) {
            boolean add = this.zzsi.zzez().add("PHOTO_URL");
        } else {
            this.zzkc = str2;
        }
        return this;
    }

    @NonNull
    public final zzfg zzcv(String str) {
        String str2 = str;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        boolean add = this.zzsh.zzez().add(str2);
        return this;
    }

    @NonNull
    public final zzfg zzcw(String str) {
        this.zzsk = Preconditions.checkNotEmpty(str);
        return this;
    }

    @NonNull
    public final zzfg zzcx(@Nullable String str) {
        this.zzhy = str;
        return this;
    }

    public final /* synthetic */ zzjc zzeq() {
        zzv zzv;
        zzp.zzl.zza zzd = zzp.zzl.zzaj().zzf(this.zzsj).zzd(this.zzsh.zzez());
        List<String> zzez = this.zzsi.zzez();
        List<String> list = zzez;
        zzv[] zzvArr = new zzv[zzez.size()];
        for (int i = 0; i < list.size(); i++) {
            zzv[] zzvArr2 = zzvArr;
            int i2 = i;
            String str = list.get(i);
            boolean z = true;
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        z = true;
                        break;
                    }
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        z = false;
                        break;
                    }
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        z = true;
                        break;
                    }
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
                        z = true;
                        break;
                    }
                    break;
            }
            switch (z) {
                case false:
                    zzv = zzv.zzfk;
                    break;
                case true:
                    zzv = zzv.zzfl;
                    break;
                case true:
                    zzv = zzv.zzfo;
                    break;
                case true:
                    zzv = zzv.zzfn;
                    break;
                default:
                    zzv = zzv.zzfj;
                    break;
            }
            zzvArr2[i2] = zzv;
        }
        zzp.zzl.zza zzc = zzd.zzc(Arrays.asList(zzvArr));
        if (this.zzib != null) {
            zzp.zzl.zza zzap = zzc.zzap(this.zzib);
        }
        if (this.zzif != null) {
            zzp.zzl.zza zzar = zzc.zzar(this.zzif);
        }
        if (this.zzig != null) {
            zzp.zzl.zza zzas = zzc.zzas(this.zzig);
        }
        if (this.zzjv != null) {
            zzp.zzl.zza zzaq = zzc.zzaq(this.zzjv);
        }
        if (this.zzkc != null) {
            zzp.zzl.zza zzau = zzc.zzau(this.zzkc);
        }
        if (this.zzsk != null) {
            zzp.zzl.zza zzat = zzc.zzat(this.zzsk);
        }
        if (this.zzhy != null) {
            zzp.zzl.zza zzav = zzc.zzav(this.zzhy);
        }
        return (zzp.zzl) ((zzhs) zzc.zzih());
    }
}
