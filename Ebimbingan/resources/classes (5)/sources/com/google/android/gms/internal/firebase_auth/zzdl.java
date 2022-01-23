package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StartMfaPhoneNumberEnrollmentAidlRequestCreator")
public final class zzdl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdl> CREATOR;
    @SafeParcelable.Field(getter = "getLocaleHeader", id = 3)
    @Nullable
    private final String zzhq;
    @SafeParcelable.Field(getter = "getIdToken", id = 1)
    private final String zzib;
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 2)
    private final String zzjo;
    @SafeParcelable.Field(getter = "getTimeoutInSeconds", id = 4)
    private final long zzko;
    @SafeParcelable.Field(getter = "getForceNewSmsVerificationSession", id = 5)
    private final boolean zzkp;
    @SafeParcelable.Field(getter = "getRequireSmsVerification", id = 6)
    private final boolean zzkq;

    @SafeParcelable.Constructor
    public zzdl(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) @Nullable String str3, @SafeParcelable.Param(id = 4) long j, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) boolean z2) {
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
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzib, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzjo, false);
        SafeParcelWriter.writeString(parcel2, 3, this.zzhq, false);
        SafeParcelWriter.writeLong(parcel2, 4, this.zzko);
        SafeParcelWriter.writeBoolean(parcel2, 5, this.zzkp);
        SafeParcelWriter.writeBoolean(parcel2, 6, this.zzkq);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdl> creator;
        new zzdk();
        CREATOR = creator;
    }
}
