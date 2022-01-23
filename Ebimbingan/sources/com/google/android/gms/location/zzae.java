package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "LocationSettingsConfigurationCreator")
@C0463SafeParcelable.Reserved({3, 4, 1000})
public final class zzae extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR;
    @C0463SafeParcelable.Field(defaultValue = "", getter = "getJustificationText", id = 1)
    private final String zzbd;
    @C0463SafeParcelable.Field(defaultValue = "", getter = "getExperimentId", id = 2)
    private final String zzbe;
    @C0463SafeParcelable.Field(defaultValue = "", getter = "getTitleText", id = 5)
    private final String zzbf;

    static {
        Parcelable.Creator<zzae> creator;
        new zzaf();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    zzae(@C0463SafeParcelable.Param(id = 5) String str, @C0463SafeParcelable.Param(id = 1) String str2, @C0463SafeParcelable.Param(id = 2) String str3) {
        this.zzbf = str;
        this.zzbd = str2;
        this.zzbe = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzbd, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzbe, false);
        C0462SafeParcelWriter.writeString(parcel2, 5, this.zzbf, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
