package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzfm;

@SafeParcelable.Class(creator = "DefaultOAuthCredentialCreator")
public class zzf extends OAuthCredential {
    public static final Parcelable.Creator<zzf> CREATOR;
    @SafeParcelable.Field(getter = "getProvider", id = 1)
    @Nullable
    private final String zzia;
    @SafeParcelable.Field(getter = "getIdToken", id = 2)
    @Nullable
    private final String zzib;
    @SafeParcelable.Field(getter = "getAccessToken", id = 3)
    @Nullable
    private final String zzic;
    @SafeParcelable.Field(getter = "getWebSignInCredential", id = 4)
    @Nullable
    private final zzfm zzid;
    @SafeParcelable.Field(getter = "getPendingToken", id = 5)
    @Nullable
    private final String zzie;

    @SafeParcelable.Constructor
    zzf(@SafeParcelable.Param(id = 1) @NonNull String str, @SafeParcelable.Param(id = 2) @Nullable String str2, @SafeParcelable.Param(id = 3) @Nullable String str3, @SafeParcelable.Param(id = 4) @Nullable zzfm zzfm, @SafeParcelable.Param(id = 5) @Nullable String str4) {
        this.zzia = str;
        this.zzib = str2;
        this.zzic = str3;
        this.zzid = zzfm;
        this.zzie = str4;
    }

    public static zzf zza(String str, String str2, String str3) {
        return zzb(str, str2, str3, (String) null);
    }

    public static zzf zza(String str, String str2, String str3, String str4) {
        return zzb(str, str2, str3, str4);
    }

    private static zzf zzb(String str, String str2, String str3, @Nullable String str4) {
        zzf zzf;
        Throwable th;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        String checkNotEmpty = Preconditions.checkNotEmpty(str5, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str7)) {
            new zzf(str5, str6, str7, (zzfm) null, str8);
            return zzf;
        }
        Throwable th2 = th;
        new IllegalArgumentException("Must specify an idToken or an accessToken.");
        throw th2;
    }

    public static zzf zza(@NonNull zzfm zzfm) {
        zzf zzf;
        zzfm zzfm2 = zzfm;
        Object checkNotNull = Preconditions.checkNotNull(zzfm2, "Must specify a non-null webSignInCredential");
        new zzf((String) null, (String) null, (String) null, zzfm2, (String) null);
        return zzf;
    }

    public String getProvider() {
        return this.zzia;
    }

    public String getSignInMethod() {
        return this.zzia;
    }

    @Nullable
    public String getIdToken() {
        return this.zzib;
    }

    @Nullable
    public String getAccessToken() {
        return this.zzic;
    }

    public static zzfm zza(@NonNull zzf zzf, @Nullable String str) {
        zzfm zzfm;
        zzf zzf2 = zzf;
        String str2 = str;
        Object checkNotNull = Preconditions.checkNotNull(zzf2);
        if (zzf2.zzid != null) {
            return zzf2.zzid;
        }
        new zzfm(zzf2.getIdToken(), zzf2.getAccessToken(), zzf2.getProvider(), (String) null, (String) null, (String) null, str2, zzf2.zzie);
        return zzfm;
    }

    /* JADX WARNING: type inference failed for: r8v7, types: [android.os.Parcelable, com.google.android.gms.internal.firebase_auth.zzfm] */
    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, getProvider(), false);
        SafeParcelWriter.writeString(parcel2, 2, getIdToken(), false);
        SafeParcelWriter.writeString(parcel2, 3, getAccessToken(), false);
        SafeParcelWriter.writeParcelable(parcel2, 4, this.zzid, i, false);
        SafeParcelWriter.writeString(parcel2, 5, this.zzie, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzf> creator;
        new zze();
        CREATOR = creator;
    }
}
