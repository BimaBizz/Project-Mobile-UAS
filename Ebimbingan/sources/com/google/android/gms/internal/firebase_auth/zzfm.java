package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.api.internal.zzfd;

@C0463SafeParcelable.Class(creator = "VerifyAssertionRequestCreator")
@C0463SafeParcelable.Reserved({1})
public final class zzfm extends C0460AbstractSafeParcelable implements zzfd<zzp.C0005zzp> {
    public static final Parcelable.Creator<zzfm> CREATOR;
    @C0463SafeParcelable.Field(getter = "getTenantId", id = 15)
    private String zzhy;
    @C0463SafeParcelable.Field(getter = "getProviderId", id = 6)
    private String zzia;
    @C0463SafeParcelable.Field(getter = "getIdToken", id = 4)
    private String zzib;
    @C0463SafeParcelable.Field(getter = "getAccessToken", id = 5)
    private String zzic;
    @C0463SafeParcelable.Field(getter = "getPendingToken", id = 17)
    @Nullable
    private String zzie;
    @C0463SafeParcelable.Field(getter = "getEmail", id = 7)
    @Nullable
    private String zzif;
    @C0463SafeParcelable.Field(getter = "getAutoCreate", id = 11)
    private boolean zzjp;
    @C0463SafeParcelable.Field(getter = "getReturnSecureToken", id = 10)
    private boolean zzsj;
    @C0463SafeParcelable.Field(getter = "getRequestUri", id = 2)
    private String zzsn;
    @C0463SafeParcelable.Field(getter = "getCurrentIdToken", id = 3)
    private String zzso;
    @C0463SafeParcelable.Field(getter = "getPostBody", id = 8)
    private String zzsp;
    @C0463SafeParcelable.Field(getter = "getOauthTokenSecret", id = 9)
    private String zzsq;
    @C0463SafeParcelable.Field(getter = "getAuthCode", id = 12)
    private String zzsr;
    @C0463SafeParcelable.Field(getter = "getSessionId", id = 13)
    private String zzss;
    @C0463SafeParcelable.Field(getter = "getIdpResponseUrl", id = 14)
    private String zzst;
    @C0463SafeParcelable.Field(getter = "getReturnIdpCredential", id = 16)
    private boolean zzsu;

    public zzfm() {
        this.zzsj = true;
        this.zzjp = true;
    }

    @C0463SafeParcelable.Constructor
    zzfm(@C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) String str2, @C0463SafeParcelable.Param(id = 4) String str3, @C0463SafeParcelable.Param(id = 5) String str4, @C0463SafeParcelable.Param(id = 6) String str5, @C0463SafeParcelable.Param(id = 7) String str6, @C0463SafeParcelable.Param(id = 8) String str7, @C0463SafeParcelable.Param(id = 9) String str8, @C0463SafeParcelable.Param(id = 10) boolean z, @C0463SafeParcelable.Param(id = 11) boolean z2, @C0463SafeParcelable.Param(id = 12) String str9, @C0463SafeParcelable.Param(id = 13) String str10, @C0463SafeParcelable.Param(id = 14) String str11, @C0463SafeParcelable.Param(id = 15) String str12, @C0463SafeParcelable.Param(id = 16) boolean z3, @C0463SafeParcelable.Param(id = 17) String str13) {
        this.zzsn = str;
        this.zzso = str2;
        this.zzib = str3;
        this.zzic = str4;
        this.zzia = str5;
        this.zzif = str6;
        this.zzsp = str7;
        this.zzsq = str8;
        this.zzsj = z;
        this.zzjp = z2;
        this.zzsr = str9;
        this.zzss = str10;
        this.zzst = str11;
        this.zzhy = str12;
        this.zzsu = z3;
        this.zzie = str13;
    }

    public zzfm(@Nullable String str, @Nullable String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        StringBuilder sb;
        Throwable th;
        String str9 = str3;
        String str10 = str4;
        this.zzsn = "http://localhost";
        this.zzib = str;
        this.zzic = str2;
        this.zzsq = str5;
        this.zzsr = str6;
        this.zzhy = str7;
        this.zzie = str8;
        this.zzsj = true;
        if (!TextUtils.isEmpty(this.zzib) || !TextUtils.isEmpty(this.zzic) || !TextUtils.isEmpty(this.zzsr)) {
            this.zzia = C0446Preconditions.checkNotEmpty(str9);
            this.zzif = null;
            new StringBuilder();
            StringBuilder sb2 = sb;
            if (!TextUtils.isEmpty(this.zzib)) {
                StringBuilder append = sb2.append("id_token=").append(this.zzib).append("&");
            }
            if (!TextUtils.isEmpty(this.zzic)) {
                StringBuilder append2 = sb2.append("access_token=").append(this.zzic).append("&");
            }
            if (!TextUtils.isEmpty(this.zzif)) {
                StringBuilder append3 = sb2.append("identifier=").append(this.zzif).append("&");
            }
            if (!TextUtils.isEmpty(this.zzsq)) {
                StringBuilder append4 = sb2.append("oauth_token_secret=").append(this.zzsq).append("&");
            }
            if (!TextUtils.isEmpty(this.zzsr)) {
                StringBuilder append5 = sb2.append("code=").append(this.zzsr).append("&");
            }
            StringBuilder append6 = sb2.append("providerId=").append(this.zzia);
            this.zzsp = sb2.toString();
            this.zzjp = true;
            return;
        }
        Throwable th2 = th;
        new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        throw th2;
    }

    public final zzfm zzcy(String str) {
        this.zzso = C0446Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzfm zzp(boolean z) {
        boolean z2 = z;
        this.zzjp = false;
        return this;
    }

    public final zzfm zzcz(@Nullable String str) {
        this.zzhy = str;
        return this;
    }

    public final zzfm zzq(boolean z) {
        boolean z2 = z;
        this.zzsj = true;
        return this;
    }

    public final zzfm zzr(boolean z) {
        this.zzsu = z;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzsn, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzso, false);
        C0462SafeParcelWriter.writeString(parcel2, 4, this.zzib, false);
        C0462SafeParcelWriter.writeString(parcel2, 5, this.zzic, false);
        C0462SafeParcelWriter.writeString(parcel2, 6, this.zzia, false);
        C0462SafeParcelWriter.writeString(parcel2, 7, this.zzif, false);
        C0462SafeParcelWriter.writeString(parcel2, 8, this.zzsp, false);
        C0462SafeParcelWriter.writeString(parcel2, 9, this.zzsq, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 10, this.zzsj);
        C0462SafeParcelWriter.writeBoolean(parcel2, 11, this.zzjp);
        C0462SafeParcelWriter.writeString(parcel2, 12, this.zzsr, false);
        C0462SafeParcelWriter.writeString(parcel2, 13, this.zzss, false);
        C0462SafeParcelWriter.writeString(parcel2, 14, this.zzst, false);
        C0462SafeParcelWriter.writeString(parcel2, 15, this.zzhy, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 16, this.zzsu);
        C0462SafeParcelWriter.writeString(parcel2, 17, this.zzie, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final /* synthetic */ zzjc zzeq() {
        zzp.C0005zzp.zza zzk = zzp.C0005zzp.zzat().zzi(this.zzsj).zzk(this.zzjp);
        if (this.zzso != null) {
            zzp.C0005zzp.zza zzbg = zzk.zzbg(this.zzso);
        }
        if (this.zzsn != null) {
            zzp.C0005zzp.zza zzbd = zzk.zzbd(this.zzsn);
        }
        if (this.zzsp != null) {
            zzp.C0005zzp.zza zzbe = zzk.zzbe(this.zzsp);
        }
        if (this.zzhy != null) {
            zzp.C0005zzp.zza zzbh = zzk.zzbh(this.zzhy);
        }
        if (this.zzie != null) {
            zzp.C0005zzp.zza zzbi = zzk.zzbi(this.zzie);
        }
        if (!TextUtils.isEmpty(this.zzss)) {
            zzp.C0005zzp.zza zzbf = zzk.zzbf(this.zzss);
        }
        if (!TextUtils.isEmpty(this.zzst)) {
            zzp.C0005zzp.zza zzbd2 = zzk.zzbd(this.zzst);
        }
        return (zzp.C0005zzp) ((zzhs) zzk.zzj(this.zzsu).zzih());
    }

    static {
        Parcelable.Creator<zzfm> creator;
        new zzfp();
        CREATOR = creator;
    }
}
