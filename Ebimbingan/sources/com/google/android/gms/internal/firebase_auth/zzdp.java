package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "UnenrollMfaAidlRequestCreator")
public final class zzdp extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdp> CREATOR;
    @C0463SafeParcelable.Field(getter = "getUid", id = 2)
    private final String zzju;
    @C0463SafeParcelable.Field(getter = "getCachedTokenState", id = 1)
    private final String zzkf;

    @C0463SafeParcelable.Constructor
    public zzdp(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) String str2) {
        this.zzkf = str;
        this.zzju = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzkf, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzju, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdp> creator;
        new zzdo();
        CREATOR = creator;
    }
}
