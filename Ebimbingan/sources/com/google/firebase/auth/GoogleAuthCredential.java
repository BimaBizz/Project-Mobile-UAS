package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzfm;

@C0463SafeParcelable.Class(creator = "GoogleAuthCredentialCreator")
public class GoogleAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR;
    @C0463SafeParcelable.Field(getter = "getIdToken", id = 1)
    private final String zzib;
    @C0463SafeParcelable.Field(getter = "getAccessToken", id = 2)
    private final String zzic;

    @C0463SafeParcelable.Constructor
    GoogleAuthCredential(@C0463SafeParcelable.Param(id = 1) @Nullable String str, @C0463SafeParcelable.Param(id = 2) @Nullable String str2) {
        Throwable th;
        String str3 = str;
        String str4 = str2;
        if (str3 == null && str4 == null) {
            Throwable th2 = th;
            new IllegalArgumentException("Must specify an idToken or an accessToken.");
            throw th2;
        }
        this.zzib = zzb(str3, "idToken");
        this.zzic = zzb(str4, "accessToken");
    }

    public String getProvider() {
        return "google.com";
    }

    public String getSignInMethod() {
        return "google.com";
    }

    public static zzfm zza(@NonNull GoogleAuthCredential googleAuthCredential, @Nullable String str) {
        zzfm zzfm;
        GoogleAuthCredential googleAuthCredential2 = googleAuthCredential;
        Object checkNotNull = C0446Preconditions.checkNotNull(googleAuthCredential2);
        new zzfm(googleAuthCredential2.zzib, googleAuthCredential2.zzic, googleAuthCredential2.getProvider(), (String) null, (String) null, (String) null, str, (String) null);
        return zzfm;
    }

    private static String zzb(String str, String str2) {
        Throwable th;
        String str3 = str;
        String str4 = str2;
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            return str3;
        }
        Throwable th2 = th;
        new IllegalArgumentException(String.valueOf(str4).concat(" must not be empty"));
        throw th2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzib, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzic, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<GoogleAuthCredential> creator;
        new zzt();
        CREATOR = creator;
    }
}
