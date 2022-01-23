package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zzac;

@SafeParcelable.Class(creator = "StartMfaPhoneNumberSignInAidlRequestCreator")
public final class zzdn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdn> CREATOR;
    @SafeParcelable.Field(getter = "getLocaleHeader", id = 3)
    @Nullable
    private final String zzhq;
    @SafeParcelable.Field(getter = "getPendingCredential", id = 2)
    private final String zzkg;
    @SafeParcelable.Field(getter = "getTimeoutInSeconds", id = 4)
    private final long zzko;
    @SafeParcelable.Field(getter = "getForceNewSmsVerificationSession", id = 5)
    private final boolean zzkp;
    @SafeParcelable.Field(getter = "getRequireSmsVerification", id = 6)
    private final boolean zzkq;
    @SafeParcelable.Field(getter = "getPhoneMultiFactorInfo", id = 1)
    private zzac zzkr;

    @SafeParcelable.Constructor
    public zzdn(@SafeParcelable.Param(id = 1) zzac zzac, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) @Nullable String str2, @SafeParcelable.Param(id = 4) long j, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) boolean z2) {
        this.zzkr = zzac;
        this.zzkg = str;
        this.zzhq = str2;
        this.zzko = j;
        this.zzkp = z;
        this.zzkq = z2;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.os.Parcelable, com.google.firebase.auth.zzac] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, this.zzkr, i, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzkg, false);
        SafeParcelWriter.writeString(parcel2, 3, this.zzhq, false);
        SafeParcelWriter.writeLong(parcel2, 4, this.zzko);
        SafeParcelWriter.writeBoolean(parcel2, 5, this.zzkp);
        SafeParcelWriter.writeBoolean(parcel2, 6, this.zzkq);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdn> creator;
        new zzdm();
        CREATOR = creator;
    }
}
