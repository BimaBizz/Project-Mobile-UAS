package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.EmailAuthCredential;

@SafeParcelable.Class(creator = "SignInWithEmailLinkAidlRequestCreator")
public final class zzdh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdh> CREATOR;
    @SafeParcelable.Field(getter = "getCredential", id = 1)
    private final EmailAuthCredential zzkn;

    @SafeParcelable.Constructor
    public zzdh(@SafeParcelable.Param(id = 1) EmailAuthCredential emailAuthCredential) {
        this.zzkn = emailAuthCredential;
    }

    public final EmailAuthCredential zzdm() {
        return this.zzkn;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [com.google.firebase.auth.EmailAuthCredential, android.os.Parcelable] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, this.zzkn, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdh> creator;
        new zzdg();
        CREATOR = creator;
    }
}
