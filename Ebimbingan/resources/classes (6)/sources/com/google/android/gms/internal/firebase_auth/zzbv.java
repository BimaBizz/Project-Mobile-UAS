package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConfirmPasswordResetAidlRequestCreator")
public final class zzbv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbv> CREATOR;
    @SafeParcelable.Field(getter = "getCode", id = 1)
    private final String zzhu;
    @SafeParcelable.Field(getter = "getTenantId", id = 3)
    @Nullable
    private final String zzhy;
    @SafeParcelable.Field(getter = "getNewPassword", id = 2)
    private final String zzkd;

    @SafeParcelable.Constructor
    public zzbv(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) @Nullable String str3) {
        this.zzhu = str;
        this.zzkd = str2;
        this.zzhy = str3;
    }

    public final String zzcn() {
        return this.zzhu;
    }

    public final String zzdg() {
        return this.zzkd;
    }

    @Nullable
    public final String zzba() {
        return this.zzhy;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzhu, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzkd, false);
        SafeParcelWriter.writeString(parcel2, 3, this.zzhy, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzbv> creator;
        new zzbu();
        CREATOR = creator;
    }
}
