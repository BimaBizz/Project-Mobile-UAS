package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "GetAccessTokenAidlRequestCreator")
public final class zzcf extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcf> CREATOR;
    @C0463SafeParcelable.Field(getter = "getRefreshToken", id = 1)
    private final String zzkh;

    @C0463SafeParcelable.Constructor
    public zzcf(@C0463SafeParcelable.Param(id = 1) String str) {
        this.zzkh = str;
    }

    public final String zzs() {
        return this.zzkh;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzkh, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcf> creator;
        new zzce();
        CREATOR = creator;
    }
}
