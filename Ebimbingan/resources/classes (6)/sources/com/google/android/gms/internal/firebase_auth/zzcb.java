package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

@SafeParcelable.Class(creator = "FinalizeMfaEnrollmentAidlRequestCreator")
public final class zzcb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcb> CREATOR;
    @SafeParcelable.Field(getter = "getDisplayName", id = 3)
    private final String zzjv;
    @SafeParcelable.Field(getter = "getPhoneAuthCredential", id = 1)
    private final PhoneAuthCredential zzke;
    @SafeParcelable.Field(getter = "getCachedTokenState", id = 2)
    private final String zzkf;

    @SafeParcelable.Constructor
    public zzcb(@SafeParcelable.Param(id = 1) PhoneAuthCredential phoneAuthCredential, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.zzke = phoneAuthCredential;
        this.zzkf = str;
        this.zzjv = str2;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.os.Parcelable, com.google.firebase.auth.PhoneAuthCredential] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, this.zzke, i, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzkf, false);
        SafeParcelWriter.writeString(parcel2, 3, this.zzjv, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcb> creator;
        new zzca();
        CREATOR = creator;
    }
}
