package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UnenrollMfaAidlRequestCreator")
public final class zzdp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdp> CREATOR;
    @SafeParcelable.Field(getter = "getUid", id = 2)
    private final String zzju;
    @SafeParcelable.Field(getter = "getCachedTokenState", id = 1)
    private final String zzkf;

    @SafeParcelable.Constructor
    public zzdp(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.zzkf = str;
        this.zzju = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzkf, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzju, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdp> creator;
        new zzdo();
        CREATOR = creator;
    }
}
