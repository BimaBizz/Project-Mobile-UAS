package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.zzac;

@C0463SafeParcelable.Class(creator = "StartMfaPhoneNumberSignInAidlRequestCreator")
public final class zzdn extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdn> CREATOR;
    @C0463SafeParcelable.Field(getter = "getLocaleHeader", id = 3)
    @Nullable
    private final String zzhq;
    @C0463SafeParcelable.Field(getter = "getPendingCredential", id = 2)
    private final String zzkg;
    @C0463SafeParcelable.Field(getter = "getTimeoutInSeconds", id = 4)
    private final long zzko;
    @C0463SafeParcelable.Field(getter = "getForceNewSmsVerificationSession", id = 5)
    private final boolean zzkp;
    @C0463SafeParcelable.Field(getter = "getRequireSmsVerification", id = 6)
    private final boolean zzkq;
    @C0463SafeParcelable.Field(getter = "getPhoneMultiFactorInfo", id = 1)
    private zzac zzkr;

    @C0463SafeParcelable.Constructor
    public zzdn(@C0463SafeParcelable.Param(id = 1) zzac zzac, @C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) @Nullable String str2, @C0463SafeParcelable.Param(id = 4) long j, @C0463SafeParcelable.Param(id = 5) boolean z, @C0463SafeParcelable.Param(id = 6) boolean z2) {
        this.zzkr = zzac;
        this.zzkg = str;
        this.zzhq = str2;
        this.zzko = j;
        this.zzkp = z;
        this.zzkq = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, this.zzkr, i, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzkg, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzhq, false);
        C0462SafeParcelWriter.writeLong(parcel2, 4, this.zzko);
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, this.zzkp);
        C0462SafeParcelWriter.writeBoolean(parcel2, 6, this.zzkq);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdn> creator;
        new zzdm();
        CREATOR = creator;
    }
}
