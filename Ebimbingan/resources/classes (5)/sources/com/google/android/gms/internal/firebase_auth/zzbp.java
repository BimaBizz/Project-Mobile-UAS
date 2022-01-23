package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ChangeEmailAidlRequestCreator")
public final class zzbp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbp> CREATOR;
    @SafeParcelable.Field(getter = "getEmail", id = 2)
    private final String zzif;
    @SafeParcelable.Field(getter = "getCachedState", id = 1)
    private final String zzii;

    @SafeParcelable.Constructor
    public zzbp(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
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
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzii, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzif, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzbp> creator;
        new zzbo();
        CREATOR = creator;
    }
}
