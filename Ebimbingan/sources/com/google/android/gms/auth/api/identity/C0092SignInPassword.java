package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "SignInPasswordCreator")
/* renamed from: com.google.android.gms.auth.api.identity.SignInPassword */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0092SignInPassword extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0092SignInPassword> CREATOR;
    @C0463SafeParcelable.Field(getter = "getId", id = 1)
    private final String zzbf;
    @C0463SafeParcelable.Field(getter = "getPassword", id = 2)
    private final String zzbk;

    @C0463SafeParcelable.Constructor
    public C0092SignInPassword(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) String str2) {
        this.zzbf = C0446Preconditions.checkNotEmpty(((String) C0446Preconditions.checkNotNull(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.zzbk = C0446Preconditions.checkNotEmpty(str2);
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
        return C0444Objects.hashCode(objArr2);
    }

    public boolean equals(@Nullable Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof C0092SignInPassword)) {
            return false;
        }
        C0092SignInPassword signInPassword = (C0092SignInPassword) obj2;
        return C0444Objects.equal(this.zzbf, signInPassword.zzbf) && C0444Objects.equal(this.zzbk, signInPassword.zzbk);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, getId(), false);
        C0462SafeParcelWriter.writeString(parcel2, 2, getPassword(), false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0092SignInPassword> creator;
        new C0105zzo();
        CREATOR = creator;
    }
}
