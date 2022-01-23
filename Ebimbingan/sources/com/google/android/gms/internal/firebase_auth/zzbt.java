package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "CheckActionCodeAidlRequestCreator")
public final class zzbt extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbt> CREATOR;
    @C0463SafeParcelable.Field(getter = "getCode", id = 1)
    private final String zzhu;
    @C0463SafeParcelable.Field(getter = "getTenantId", id = 2)
    @Nullable
    private final String zzhy;

    @C0463SafeParcelable.Constructor
    public zzbt(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) @Nullable String str2) {
        this.zzhu = str;
        this.zzhy = str2;
    }

    public final String zzcn() {
        return this.zzhu;
    }

    @Nullable
    public final String zzba() {
        return this.zzhy;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzhu, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzhy, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzbt> creator;
        new zzbs();
        CREATOR = creator;
    }
}
