package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

@C0463SafeParcelable.Class(creator = "FinalizeMfaEnrollmentAidlRequestCreator")
public final class zzcb extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcb> CREATOR;
    @C0463SafeParcelable.Field(getter = "getDisplayName", id = 3)
    private final String zzjv;
    @C0463SafeParcelable.Field(getter = "getPhoneAuthCredential", id = 1)
    private final PhoneAuthCredential zzke;
    @C0463SafeParcelable.Field(getter = "getCachedTokenState", id = 2)
    private final String zzkf;

    @C0463SafeParcelable.Constructor
    public zzcb(@C0463SafeParcelable.Param(id = 1) PhoneAuthCredential phoneAuthCredential, @C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) String str2) {
        this.zzke = phoneAuthCredential;
        this.zzkf = str;
        this.zzjv = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, this.zzke, i, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzkf, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzjv, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcb> creator;
        new zzca();
        CREATOR = creator;
    }
}
