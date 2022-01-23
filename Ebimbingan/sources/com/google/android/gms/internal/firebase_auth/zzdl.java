package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "StartMfaPhoneNumberEnrollmentAidlRequestCreator")
public final class zzdl extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdl> CREATOR;
    @C0463SafeParcelable.Field(getter = "getLocaleHeader", id = 3)
    @Nullable
    private final String zzhq;
    @C0463SafeParcelable.Field(getter = "getIdToken", id = 1)
    private final String zzib;
    @C0463SafeParcelable.Field(getter = "getPhoneNumber", id = 2)
    private final String zzjo;
    @C0463SafeParcelable.Field(getter = "getTimeoutInSeconds", id = 4)
    private final long zzko;
    @C0463SafeParcelable.Field(getter = "getForceNewSmsVerificationSession", id = 5)
    private final boolean zzkp;
    @C0463SafeParcelable.Field(getter = "getRequireSmsVerification", id = 6)
    private final boolean zzkq;

    @C0463SafeParcelable.Constructor
    public zzdl(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) String str2, @C0463SafeParcelable.Param(id = 3) @Nullable String str3, @C0463SafeParcelable.Param(id = 4) long j, @C0463SafeParcelable.Param(id = 5) boolean z, @C0463SafeParcelable.Param(id = 6) boolean z2) {
        this.zzib = str;
        this.zzjo = str2;
        this.zzhq = str3;
        this.zzko = j;
        this.zzkp = z;
        this.zzkq = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzib, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzjo, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzhq, false);
        C0462SafeParcelWriter.writeLong(parcel2, 4, this.zzko);
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, this.zzkp);
        C0462SafeParcelWriter.writeBoolean(parcel2, 6, this.zzkq);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdl> creator;
        new zzdk();
        CREATOR = creator;
    }
}
