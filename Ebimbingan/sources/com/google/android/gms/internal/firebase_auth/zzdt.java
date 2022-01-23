package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "UnlinkFederatedCredentialAidlRequestCreator")
public final class zzdt extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdt> CREATOR;
    @C0463SafeParcelable.Field(getter = "getCachedState", id = 2)
    private final String zzii;
    @C0463SafeParcelable.Field(getter = "getProvider", id = 1)
    private final String zzks;

    @C0463SafeParcelable.Constructor
    public zzdt(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) String str2) {
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
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzks, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzii, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdt> creator;
        new zzds();
        CREATOR = creator;
    }
}
