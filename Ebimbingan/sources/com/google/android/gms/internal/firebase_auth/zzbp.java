package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "ChangeEmailAidlRequestCreator")
public final class zzbp extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbp> CREATOR;
    @C0463SafeParcelable.Field(getter = "getEmail", id = 2)
    private final String zzif;
    @C0463SafeParcelable.Field(getter = "getCachedState", id = 1)
    private final String zzii;

    @C0463SafeParcelable.Constructor
    public zzbp(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) String str2) {
        this.zzii = str;
        this.zzif = str2;
    }

    public final String zzcp() {
        return this.zzii;
    }

    public final String getEmail() {
        return this.zzif;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzii, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzif, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzbp> creator;
        new zzbo();
        CREATOR = creator;
    }
}
