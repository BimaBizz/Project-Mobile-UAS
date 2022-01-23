package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

@SafeParcelable.Class(creator = "SignInAccountCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR;
    @SafeParcelable.Field(defaultValue = "", id = 4)
    @Deprecated
    private String zzcd;
    @SafeParcelable.Field(getter = "getGoogleSignInAccount", id = 7)
    private GoogleSignInAccount zzce;
    @SafeParcelable.Field(defaultValue = "", id = 8)
    @Deprecated
    private String zzcf;

    @SafeParcelable.Constructor
    SignInAccount(@SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 7) GoogleSignInAccount googleSignInAccount, @SafeParcelable.Param(id = 8) String str2) {
        this.zzce = googleSignInAccount;
        this.zzcd = Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.zzcf = Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Nullable
    public final GoogleSignInAccount getGoogleSignInAccount() {
        return this.zzce;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 4, this.zzcd, false);
        SafeParcelWriter.writeParcelable(parcel2, 7, this.zzce, i, false);
        SafeParcelWriter.writeString(parcel2, 8, this.zzcf, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<SignInAccount> creator;
        new zzd();
        CREATOR = creator;
    }
}
