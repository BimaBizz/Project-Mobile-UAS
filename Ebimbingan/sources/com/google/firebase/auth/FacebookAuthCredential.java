package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzfm;

@C0463SafeParcelable.Class(creator = "FacebookAuthCredentialCreator")
public class FacebookAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR;
    @C0463SafeParcelable.Field(getter = "getAccessToken", id = 1)
    private final String zzic;

    @C0463SafeParcelable.Constructor
    FacebookAuthCredential(@C0463SafeParcelable.Param(id = 1) @NonNull String str) {
        this.zzic = C0446Preconditions.checkNotEmpty(str);
    }

    public String getProvider() {
        return "facebook.com";
    }

    public String getSignInMethod() {
        return "facebook.com";
    }

    public static zzfm zza(@NonNull FacebookAuthCredential facebookAuthCredential, @Nullable String str) {
        zzfm zzfm;
        FacebookAuthCredential facebookAuthCredential2 = facebookAuthCredential;
        Object checkNotNull = C0446Preconditions.checkNotNull(facebookAuthCredential2);
        new zzfm((String) null, facebookAuthCredential2.zzic, facebookAuthCredential2.getProvider(), (String) null, (String) null, (String) null, str, (String) null);
        return zzfm;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzic, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<FacebookAuthCredential> creator;
        new zzh();
        CREATOR = creator;
    }
}
