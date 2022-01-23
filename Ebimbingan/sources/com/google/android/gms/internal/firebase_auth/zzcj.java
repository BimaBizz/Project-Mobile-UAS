package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "LinkEmailAuthCredentialAidlRequestCreator")
public final class zzcj extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcj> CREATOR;
    @C0463SafeParcelable.Field(getter = "getEmail", id = 1)
    private final String zzif;
    @C0463SafeParcelable.Field(getter = "getPassword", id = 2)
    private final String zzig;
    @C0463SafeParcelable.Field(getter = "getCachedState", id = 3)
    private final String zzii;

    @C0463SafeParcelable.Constructor
    public zzcj(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) String str2, @C0463SafeParcelable.Param(id = 3) String str3) {
        this.zzif = str;
        this.zzig = str2;
        this.zzii = str3;
    }

    public final String getEmail() {
        return this.zzif;
    }

    public final String getPassword() {
        return this.zzig;
    }

    public final String zzcp() {
        return this.zzii;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzif, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzig, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzii, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcj> creator;
        new zzci();
        CREATOR = creator;
    }
}
