package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "SetFirebaseUiVersionAidlRequestCreator")
public final class zzcx extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcx> CREATOR;
    @C0463SafeParcelable.Field(getter = "getFirebaseUiVersion", id = 1)
    private final String zzkm;

    @C0463SafeParcelable.Constructor
    public zzcx(@C0463SafeParcelable.Param(id = 1) String str) {
        this.zzkm = str;
    }

    public final String zzdl() {
        return this.zzkm;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzkm, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcx> creator;
        new zzcw();
        CREATOR = creator;
    }
}
