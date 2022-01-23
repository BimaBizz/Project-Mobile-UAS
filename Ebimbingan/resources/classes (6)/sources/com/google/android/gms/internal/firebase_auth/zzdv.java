package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.UserProfileChangeRequest;

@SafeParcelable.Class(creator = "UpdateProfileAidlRequestCreator")
public final class zzdv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdv> CREATOR;
    @SafeParcelable.Field(getter = "getCachedState", id = 2)
    private final String zzii;
    @SafeParcelable.Field(getter = "getUserProfileChangeRequest", id = 1)
    private final UserProfileChangeRequest zzkt;

    @SafeParcelable.Constructor
    public zzdv(@SafeParcelable.Param(id = 1) UserProfileChangeRequest userProfileChangeRequest, @SafeParcelable.Param(id = 2) String str) {
        this.zzkt = userProfileChangeRequest;
        this.zzii = str;
    }

    public final UserProfileChangeRequest zzdn() {
        return this.zzkt;
    }

    public final String zzcp() {
        return this.zzii;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [com.google.firebase.auth.UserProfileChangeRequest, android.os.Parcelable] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, this.zzkt, i, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzii, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdv> creator;
        new zzdu();
        CREATOR = creator;
    }
}
