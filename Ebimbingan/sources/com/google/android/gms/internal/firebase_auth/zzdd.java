package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "SignInWithCustomTokenAidlRequestCreator")
public final class zzdd extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR;
    @C0463SafeParcelable.Field(getter = "getTenantId", id = 2)
    @Nullable
    private final String zzhy;
    @C0463SafeParcelable.Field(getter = "getToken", id = 1)
    private final String zzji;

    @C0463SafeParcelable.Constructor
    public zzdd(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) @Nullable String str2) {
        this.zzji = str;
        this.zzhy = str2;
    }

    public final String getToken() {
        return this.zzji;
    }

    @Nullable
    public final String zzba() {
        return this.zzhy;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzji, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzhy, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdd> creator;
        new zzdc();
        CREATOR = creator;
    }
}
