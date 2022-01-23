package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetAccessTokenAidlRequestCreator")
public final class zzcf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcf> CREATOR;
    @SafeParcelable.Field(getter = "getRefreshToken", id = 1)
    private final String zzkh;

    @SafeParcelable.Constructor
    public zzcf(@SafeParcelable.Param(id = 1) String str) {
        this.zzkh = str;
    }

    public final String zzs() {
        return this.zzkh;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzkh, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcf> creator;
        new zzce();
        CREATOR = creator;
    }
}
