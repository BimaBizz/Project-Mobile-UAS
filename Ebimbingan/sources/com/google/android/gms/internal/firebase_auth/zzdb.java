package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "SignInWithCredentialAidlRequestCreator")
public final class zzdb extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR;
    @C0463SafeParcelable.Field(getter = "getVerifyAssertionRequest", id = 1)
    private final zzfm zzki;

    @C0463SafeParcelable.Constructor
    public zzdb(@C0463SafeParcelable.Param(id = 1) zzfm zzfm) {
        this.zzki = zzfm;
    }

    public final zzfm zzdh() {
        return this.zzki;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, this.zzki, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdb> creator;
        new zzda();
        CREATOR = creator;
    }
}
