package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.UserProfileChangeRequest;

@C0463SafeParcelable.Class(creator = "UpdateProfileAidlRequestCreator")
public final class zzdv extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdv> CREATOR;
    @C0463SafeParcelable.Field(getter = "getCachedState", id = 2)
    private final String zzii;
    @C0463SafeParcelable.Field(getter = "getUserProfileChangeRequest", id = 1)
    private final UserProfileChangeRequest zzkt;

    @C0463SafeParcelable.Constructor
    public zzdv(@C0463SafeParcelable.Param(id = 1) UserProfileChangeRequest userProfileChangeRequest, @C0463SafeParcelable.Param(id = 2) String str) {
        this.zzkt = userProfileChangeRequest;
        this.zzii = str;
    }

    public final UserProfileChangeRequest zzdn() {
        return this.zzkt;
    }

    public final String zzcp() {
        return this.zzii;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, this.zzkt, i, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzii, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdv> creator;
        new zzdu();
        CREATOR = creator;
    }
}
