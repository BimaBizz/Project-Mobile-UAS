package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import javax.annotation.Nullable;

@C0463SafeParcelable.Class(creator = "SignInAccountCreator")
@C0463SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.auth.api.signin.SignInAccount */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0130SignInAccount extends C0460AbstractSafeParcelable implements C0447ReflectedParcelable {
    public static final Parcelable.Creator<C0130SignInAccount> CREATOR;
    @C0463SafeParcelable.Field(defaultValue = "", id = 4)
    @Deprecated
    private String zzcd;
    @C0463SafeParcelable.Field(getter = "getGoogleSignInAccount", id = 7)
    private C0122GoogleSignInAccount zzce;
    @C0463SafeParcelable.Field(defaultValue = "", id = 8)
    @Deprecated
    private String zzcf;

    @C0463SafeParcelable.Constructor
    C0130SignInAccount(@C0463SafeParcelable.Param(id = 4) String str, @C0463SafeParcelable.Param(id = 7) C0122GoogleSignInAccount googleSignInAccount, @C0463SafeParcelable.Param(id = 8) String str2) {
        this.zzce = googleSignInAccount;
        this.zzcd = C0446Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.zzcf = C0446Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Nullable
    public final C0122GoogleSignInAccount getGoogleSignInAccount() {
        return this.zzce;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 4, this.zzcd, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 7, this.zzce, i, false);
        C0462SafeParcelWriter.writeString(parcel2, 8, this.zzcf, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0130SignInAccount> creator;
        new C0165zzd();
        CREATOR = creator;
    }
}
