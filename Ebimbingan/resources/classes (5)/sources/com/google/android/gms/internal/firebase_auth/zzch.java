package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetProvidersForEmailAidlRequestCreator")
public final class zzch extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzch> CREATOR;
    @SafeParcelable.Field(getter = "getTenantId", id = 2)
    @Nullable
    private final String zzhy;
    @SafeParcelable.Field(getter = "getEmail", id = 1)
    private final String zzif;

    @SafeParcelable.Constructor
    public zzch(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) @Nullable String str2) {
        this.zzif = str;
        this.zzhy = str2;
    }

    public final String getEmail() {
        return this.zzif;
    }

    @Nullable
    public final String zzba() {
        return this.zzhy;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzif, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzhy, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzch> creator;
        new zzcg();
        CREATOR = creator;
    }
}
