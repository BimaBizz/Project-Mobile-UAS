package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInWithCredentialAidlRequestCreator")
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR;
    @SafeParcelable.Field(getter = "getVerifyAssertionRequest", id = 1)
    private final zzfm zzki;

    @SafeParcelable.Constructor
    public zzdb(@SafeParcelable.Param(id = 1) zzfm zzfm) {
        this.zzki = zzfm;
    }

    public final zzfm zzdh() {
        return this.zzki;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.os.Parcelable, com.google.android.gms.internal.firebase_auth.zzfm] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, this.zzki, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdb> creator;
        new zzda();
        CREATOR = creator;
    }
}
