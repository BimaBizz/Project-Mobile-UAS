package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInPasswordCreator")
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR;
    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String zzbf;
    @SafeParcelable.Field(getter = "getPassword", id = 2)
    private final String zzbk;

    @SafeParcelable.Constructor
    public SignInPassword(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.zzbf = Preconditions.checkNotEmpty(((String) Preconditions.checkNotNull(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.zzbk = Preconditions.checkNotEmpty(str2);
    }

    public String getId() {
        return this.zzbf;
    }

    public String getPassword() {
        return this.zzbk;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zzbf;
        Object[] objArr2 = objArr;
        objArr2[1] = this.zzbk;
        return Objects.hashCode(objArr2);
    }

    public boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj2;
        return Objects.equal(this.zzbf, signInPassword.zzbf) && Objects.equal(this.zzbk, signInPassword.zzbk);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, getId(), false);
        SafeParcelWriter.writeString(parcel2, 2, getPassword(), false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<SignInPassword> creator;
        new zzo();
        CREATOR = creator;
    }
}
