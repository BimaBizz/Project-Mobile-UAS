package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StringToIntConverterEntryCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    @SafeParcelable.Field(id = 2)
    final String zab;
    @SafeParcelable.Field(id = 3)
    final int zac;

    static {
        Parcelable.Creator<zac> creator;
        new zae();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    zac(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2) {
        this.zaa = i;
        this.zab = str;
        this.zac = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        SafeParcelWriter.writeString(parcel2, 2, this.zab, false);
        SafeParcelWriter.writeInt(parcel2, 3, this.zac);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    zac(String str, int i) {
        this.zaa = 1;
        this.zab = str;
        this.zac = i;
    }
}
