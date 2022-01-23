package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.EmailAuthCredential;

@C0463SafeParcelable.Class(creator = "SignInWithEmailLinkAidlRequestCreator")
public final class zzdh extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdh> CREATOR;
    @C0463SafeParcelable.Field(getter = "getCredential", id = 1)
    private final EmailAuthCredential zzkn;

    @C0463SafeParcelable.Constructor
    public zzdh(@C0463SafeParcelable.Param(id = 1) EmailAuthCredential emailAuthCredential) {
        this.zzkn = emailAuthCredential;
    }

    public final EmailAuthCredential zzdm() {
        return this.zzkn;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, this.zzkn, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdh> creator;
        new zzdg();
        CREATOR = creator;
    }
}
