package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

@SafeParcelable.Class(creator = "SignInWithPhoneNumberAidlRequestCreator")
public final class zzdj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdj> CREATOR;
    @SafeParcelable.Field(getter = "getTenantId", id = 2)
    @Nullable
    private final String zzhy;
    @SafeParcelable.Field(getter = "getCredential", id = 1)
    private final PhoneAuthCredential zzkj;

    @SafeParcelable.Constructor
    public zzdj(@SafeParcelable.Param(id = 1) PhoneAuthCredential phoneAuthCredential, @SafeParcelable.Param(id = 2) @Nullable String str) {
        this.zzkj = phoneAuthCredential;
        this.zzhy = str;
    }

    public final PhoneAuthCredential zzdi() {
        return this.zzkj;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.os.Parcelable, com.google.firebase.auth.PhoneAuthCredential] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, this.zzkj, i, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzhy, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdj> creator;
        new zzdi();
        CREATOR = creator;
    }
}
