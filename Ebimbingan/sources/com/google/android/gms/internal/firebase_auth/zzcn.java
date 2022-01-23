package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

@C0463SafeParcelable.Class(creator = "LinkPhoneAuthCredentialAidlRequestCreator")
public final class zzcn extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcn> CREATOR;
    @C0463SafeParcelable.Field(getter = "getCachedState", id = 1)
    private final String zzii;
    @C0463SafeParcelable.Field(getter = "getCredential", id = 2)
    private final PhoneAuthCredential zzkj;

    @C0463SafeParcelable.Constructor
    public zzcn(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) PhoneAuthCredential phoneAuthCredential) {
        this.zzii = str;
        this.zzkj = phoneAuthCredential;
    }

    public final String zzcp() {
        return this.zzii;
    }

    public final PhoneAuthCredential zzdi() {
        return this.zzkj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzii, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, this.zzkj, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcn> creator;
        new zzcm();
        CREATOR = creator;
    }
}
