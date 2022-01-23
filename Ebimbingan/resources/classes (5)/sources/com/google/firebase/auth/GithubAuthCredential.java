package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzfm;

@SafeParcelable.Class(creator = "GithubAuthCredentialCreator")
public class GithubAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GithubAuthCredential> CREATOR;
    @SafeParcelable.Field(getter = "getToken", id = 1)
    private String zzji;

    @SafeParcelable.Constructor
    GithubAuthCredential(@SafeParcelable.Param(id = 1) @NonNull String str) {
        this.zzji = Preconditions.checkNotEmpty(str);
    }

    public String getProvider() {
        return "github.com";
    }

    public String getSignInMethod() {
        return "github.com";
    }

    public static zzfm zza(@NonNull GithubAuthCredential githubAuthCredential, @Nullable String str) {
        zzfm zzfm;
        GithubAuthCredential githubAuthCredential2 = githubAuthCredential;
        Object checkNotNull = Preconditions.checkNotNull(githubAuthCredential2);
        new zzfm((String) null, githubAuthCredential2.zzji, githubAuthCredential2.getProvider(), (String) null, (String) null, (String) null, str, (String) null);
        return zzfm;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzji, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<GithubAuthCredential> creator;
        new zzs();
        CREATOR = creator;
    }
}
