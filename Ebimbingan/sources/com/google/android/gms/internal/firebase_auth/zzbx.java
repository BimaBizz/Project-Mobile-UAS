package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "CreateUserWithEmailAndPasswordAidlRequestCreator")
public final class zzbx extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR;
    @C0463SafeParcelable.Field(getter = "getTenantId", id = 3)
    @Nullable
    private final String zzhy;
    @C0463SafeParcelable.Field(getter = "getEmail", id = 1)
    private final String zzif;
    @C0463SafeParcelable.Field(getter = "getPassword", id = 2)
    private final String zzig;

    @C0463SafeParcelable.Constructor
    public zzbx(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) String str2, @C0463SafeParcelable.Param(id = 3) @Nullable String str3) {
        this.zzif = str;
        this.zzig = str2;
        this.zzhy = str3;
    }

    public final String getEmail() {
        return this.zzif;
    }

    public final String getPassword() {
        return this.zzig;
    }

    @Nullable
    public final String zzba() {
        return this.zzhy;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzif, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzig, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzhy, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzbx> creator;
        new zzbw();
        CREATOR = creator;
    }
}
