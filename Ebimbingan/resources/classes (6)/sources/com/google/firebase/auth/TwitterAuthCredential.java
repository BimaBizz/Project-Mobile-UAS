package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzfm;

@SafeParcelable.Class(creator = "TwitterAuthCredentialCreator")
public class TwitterAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR;
    @SafeParcelable.Field(getter = "getToken", id = 1)
    private String zzji;
    @SafeParcelable.Field(getter = "getSecret", id = 2)
    private String zzjy;

    @SafeParcelable.Constructor
    TwitterAuthCredential(@SafeParcelable.Param(id = 1) @NonNull String str, @SafeParcelable.Param(id = 2) @NonNull String str2) {
        this.zzji = Preconditions.checkNotEmpty(str);
        this.zzjy = Preconditions.checkNotEmpty(str2);
    }

    public String getProvider() {
        return "twitter.com";
    }

    public String getSignInMethod() {
        return "twitter.com";
    }

    public static zzfm zza(@NonNull TwitterAuthCredential twitterAuthCredential, @Nullable String str) {
        zzfm zzfm;
        TwitterAuthCredential twitterAuthCredential2 = twitterAuthCredential;
        Object checkNotNull = Preconditions.checkNotNull(twitterAuthCredential2);
        new zzfm((String) null, twitterAuthCredential2.zzji, twitterAuthCredential2.getProvider(), (String) null, twitterAuthCredential2.zzjy, (String) null, str, (String) null);
        return zzfm;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzji, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzjy, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<TwitterAuthCredential> creator;
        new zzae();
        CREATOR = creator;
    }
}
