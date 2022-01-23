package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UnlinkFederatedCredentialAidlRequestCreator")
public final class zzdt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdt> CREATOR;
    @SafeParcelable.Field(getter = "getCachedState", id = 2)
    private final String zzii;
    @SafeParcelable.Field(getter = "getProvider", id = 1)
    private final String zzks;

    @SafeParcelable.Constructor
    public zzdt(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.zzks = str;
        this.zzii = str2;
    }

    public final String getProvider() {
        return this.zzks;
    }

    public final String zzcp() {
        return this.zzii;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzks, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzii, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdt> creator;
        new zzds();
        CREATOR = creator;
    }
}
