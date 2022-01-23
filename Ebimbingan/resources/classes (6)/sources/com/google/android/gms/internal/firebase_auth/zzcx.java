package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SetFirebaseUiVersionAidlRequestCreator")
public final class zzcx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcx> CREATOR;
    @SafeParcelable.Field(getter = "getFirebaseUiVersion", id = 1)
    private final String zzkm;

    @SafeParcelable.Constructor
    public zzcx(@SafeParcelable.Param(id = 1) String str) {
        this.zzkm = str;
    }

    public final String zzdl() {
        return this.zzkm;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzkm, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcx> creator;
        new zzcw();
        CREATOR = creator;
    }
}
