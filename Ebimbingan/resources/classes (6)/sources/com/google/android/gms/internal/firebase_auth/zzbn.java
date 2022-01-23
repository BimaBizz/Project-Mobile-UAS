package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ApplyActionCodeAidlRequestCreator")
public final class zzbn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbn> CREATOR;
    @SafeParcelable.Field(getter = "getCode", id = 1)
    private final String zzhu;
    @SafeParcelable.Field(getter = "getTenantId", id = 2)
    @Nullable
    private final String zzhy;

    @SafeParcelable.Constructor
    public zzbn(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) @Nullable String str2) {
        this.zzhu = str;
        this.zzhy = str2;
    }

    public final String zzcn() {
        return this.zzhu;
    }

    public final String zzba() {
        return this.zzhy;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzhu, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzhy, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzbn> creator;
        new zzbm();
        CREATOR = creator;
    }
}
