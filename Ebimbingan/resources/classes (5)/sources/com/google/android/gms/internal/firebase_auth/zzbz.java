package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeleteAidlRequestCreator")
public final class zzbz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbz> CREATOR;
    @SafeParcelable.Field(getter = "getCachedState", id = 1)
    private final String zzii;

    @SafeParcelable.Constructor
    public zzbz(@SafeParcelable.Param(id = 1) String str) {
        this.zzii = str;
    }

    public final String zzcp() {
        return this.zzii;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzii, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzbz> creator;
        new zzby();
        CREATOR = creator;
    }
}
