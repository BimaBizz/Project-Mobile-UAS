package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInAnonymouslyAidlRequestCreator")
public final class zzcz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcz> CREATOR;
    @SafeParcelable.Field(getter = "getTenantId", id = 1)
    @Nullable
    private final String zzhy;

    @SafeParcelable.Constructor
    public zzcz(@SafeParcelable.Param(id = 1) @Nullable String str) {
        this.zzhy = str;
    }

    @Nullable
    public final String zzba() {
        return this.zzhy;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzhy, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcz> creator;
        new zzcy();
        CREATOR = creator;
    }
}
