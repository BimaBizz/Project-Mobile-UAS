package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

@SafeParcelable.Class(creator = "VerifyBeforeUpdateEmailAidlRequestCreator")
public final class zzdx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdx> CREATOR;
    @SafeParcelable.Field(getter = "getIdToken", id = 1)
    private final String zzib;
    @SafeParcelable.Field(getter = "getActionCodeSettings", id = 3)
    private final ActionCodeSettings zzkk;
    @SafeParcelable.Field(getter = "getNewEmail", id = 2)
    private final String zzku;

    @SafeParcelable.Constructor
    public zzdx(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) ActionCodeSettings actionCodeSettings) {
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

    /* JADX WARNING: type inference failed for: r8v5, types: [com.google.firebase.auth.ActionCodeSettings, android.os.Parcelable] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzib, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzku, false);
        SafeParcelWriter.writeParcelable(parcel2, 3, this.zzkk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdx> creator;
        new zzdw();
        CREATOR = creator;
    }
}
