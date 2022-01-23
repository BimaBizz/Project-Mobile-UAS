package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

@C0463SafeParcelable.Class(creator = "VerifyBeforeUpdateEmailAidlRequestCreator")
public final class zzdx extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdx> CREATOR;
    @C0463SafeParcelable.Field(getter = "getIdToken", id = 1)
    private final String zzib;
    @C0463SafeParcelable.Field(getter = "getActionCodeSettings", id = 3)
    private final ActionCodeSettings zzkk;
    @C0463SafeParcelable.Field(getter = "getNewEmail", id = 2)
    private final String zzku;

    @C0463SafeParcelable.Constructor
    public zzdx(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) String str2, @C0463SafeParcelable.Param(id = 3) ActionCodeSettings actionCodeSettings) {
        this.zzib = str;
        this.zzku = str2;
        this.zzkk = actionCodeSettings;
    }

    public final String getIdToken() {
        return this.zzib;
    }

    public final String zzae() {
        return this.zzku;
    }

    public final ActionCodeSettings zzdj() {
        return this.zzkk;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzib, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzku, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 3, this.zzkk, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdx> creator;
        new zzdw();
        CREATOR = creator;
    }
}
