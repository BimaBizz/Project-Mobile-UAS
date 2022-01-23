package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "StringToIntConverterEntryCreator")
/* renamed from: com.google.android.gms.common.server.converter.zac */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0554zac extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0554zac> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    @C0463SafeParcelable.Field(id = 2)
    final String zab;
    @C0463SafeParcelable.Field(id = 3)
    final int zac;

    static {
        Parcelable.Creator<C0554zac> creator;
        new C0556zae();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0554zac(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) int i2) {
        this.zaa = i;
        this.zab = str;
        this.zac = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zab, false);
        C0462SafeParcelWriter.writeInt(parcel2, 3, this.zac);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    C0554zac(String str, int i) {
        this.zaa = 1;
        this.zab = str;
        this.zac = i;
    }
}
