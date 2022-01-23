package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

@C0463SafeParcelable.Class(creator = "SendGetOobConfirmationCodeEmailAidlRequestCreator")
public final class zzct extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzct> CREATOR;
    @C0463SafeParcelable.Field(getter = "getTenantId", id = 3)
    @Nullable
    private final String zzhy;
    @C0463SafeParcelable.Field(getter = "getEmail", id = 1)
    private final String zzif;
    @C0463SafeParcelable.Field(getter = "getActionCodeSettings", id = 2)
    private final ActionCodeSettings zzkk;

    @C0463SafeParcelable.Constructor
    public zzct(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) ActionCodeSettings actionCodeSettings, @C0463SafeParcelable.Param(id = 3) @Nullable String str2) {
        this.zzif = str;
        this.zzkk = actionCodeSettings;
        this.zzhy = str2;
    }

    public final String getEmail() {
        return this.zzif;
    }

    public final ActionCodeSettings zzdj() {
        return this.zzkk;
    }

    public final String zzba() {
        return this.zzhy;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzif, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, this.zzkk, i, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzhy, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzct> creator;
        new zzcs();
        CREATOR = creator;
    }
}
