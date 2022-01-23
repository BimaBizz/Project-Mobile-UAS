package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

@SafeParcelable.Class(creator = "FinalizeMfaSignInAidlRequestCreator")
public final class zzcd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcd> CREATOR;
    @SafeParcelable.Field(getter = "getPhoneAuthCredential", id = 1)
    private final PhoneAuthCredential zzke;
    @SafeParcelable.Field(getter = "getPendingCredential", id = 2)
    private final String zzkg;

    @SafeParcelable.Constructor
    public zzcd(@SafeParcelable.Param(id = 1) PhoneAuthCredential phoneAuthCredential, @SafeParcelable.Param(id = 2) String str) {
        this.zzke = phoneAuthCredential;
        this.zzkg = str;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.os.Parcelable, com.google.firebase.auth.PhoneAuthCredential] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, this.zzke, i, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzkg, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcd> creator;
        new zzcc();
        CREATOR = creator;
    }
}
