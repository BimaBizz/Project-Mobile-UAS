package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

@SafeParcelable.Class(creator = "LinkPhoneAuthCredentialAidlRequestCreator")
public final class zzcn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcn> CREATOR;
    @SafeParcelable.Field(getter = "getCachedState", id = 1)
    private final String zzii;
    @SafeParcelable.Field(getter = "getCredential", id = 2)
    private final PhoneAuthCredential zzkj;

    @SafeParcelable.Constructor
    public zzcn(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) PhoneAuthCredential phoneAuthCredential) {
        this.zzii = str;
        this.zzkj = phoneAuthCredential;
    }

    public final String zzcp() {
        return this.zzii;
    }

    public final PhoneAuthCredential zzdi() {
        return this.zzkj;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [android.os.Parcelable, com.google.firebase.auth.PhoneAuthCredential] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzii, false);
        SafeParcelWriter.writeParcelable(parcel2, 2, this.zzkj, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcn> creator;
        new zzcm();
        CREATOR = creator;
    }
}
