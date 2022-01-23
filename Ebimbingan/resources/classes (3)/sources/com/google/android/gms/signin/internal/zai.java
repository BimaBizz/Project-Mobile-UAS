package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;

@SafeParcelable.Class(creator = "SignInRequestCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    @SafeParcelable.Field(getter = "getResolveAccountRequest", id = 2)
    final zat zab;

    static {
        Parcelable.Creator<zai> creator;
        new zaj();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    zai(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zat zat) {
        this.zaa = i;
        this.zab = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel2, 2, this.zab, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
