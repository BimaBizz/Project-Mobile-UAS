package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LinkFederatedCredentialAidlRequestCreator")
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR;
    @SafeParcelable.Field(getter = "getCachedState", id = 1)
    private final String zzii;
    @SafeParcelable.Field(getter = "getVerifyAssertionRequest", id = 2)
    private final zzfm zzki;

    @SafeParcelable.Constructor
    public zzcl(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) zzfm zzfm) {
        this.zzii = str;
        this.zzki = zzfm;
    }

    public final String zzcp() {
        return this.zzii;
    }

    public final zzfm zzdh() {
        return this.zzki;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [android.os.Parcelable, com.google.android.gms.internal.firebase_auth.zzfm] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzii, false);
        SafeParcelWriter.writeParcelable(parcel2, 2, this.zzki, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcl> creator;
        new zzck();
        CREATOR = creator;
    }
}
