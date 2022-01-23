package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

@C0463SafeParcelable.Class(creator = "SignInWithPhoneNumberAidlRequestCreator")
public final class zzdj extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdj> CREATOR;
    @C0463SafeParcelable.Field(getter = "getTenantId", id = 2)
    @Nullable
    private final String zzhy;
    @C0463SafeParcelable.Field(getter = "getCredential", id = 1)
    private final PhoneAuthCredential zzkj;

    @C0463SafeParcelable.Constructor
    public zzdj(@C0463SafeParcelable.Param(id = 1) PhoneAuthCredential phoneAuthCredential, @C0463SafeParcelable.Param(id = 2) @Nullable String str) {
        this.zzkj = phoneAuthCredential;
        this.zzhy = str;
    }

    public final PhoneAuthCredential zzdi() {
        return this.zzkj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, this.zzkj, i, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzhy, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdj> creator;
        new zzdi();
        CREATOR = creator;
    }
}
