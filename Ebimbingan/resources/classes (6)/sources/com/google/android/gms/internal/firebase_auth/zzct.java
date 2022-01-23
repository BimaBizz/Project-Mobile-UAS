package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

@SafeParcelable.Class(creator = "SendGetOobConfirmationCodeEmailAidlRequestCreator")
public final class zzct extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzct> CREATOR;
    @SafeParcelable.Field(getter = "getTenantId", id = 3)
    @Nullable
    private final String zzhy;
    @SafeParcelable.Field(getter = "getEmail", id = 1)
    private final String zzif;
    @SafeParcelable.Field(getter = "getActionCodeSettings", id = 2)
    private final ActionCodeSettings zzkk;

    @SafeParcelable.Constructor
    public zzct(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) ActionCodeSettings actionCodeSettings, @SafeParcelable.Param(id = 3) @Nullable String str2) {
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

    /* JADX WARNING: type inference failed for: r8v3, types: [com.google.firebase.auth.ActionCodeSettings, android.os.Parcelable] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzif, false);
        SafeParcelWriter.writeParcelable(parcel2, 2, this.zzkk, i, false);
        SafeParcelWriter.writeString(parcel2, 3, this.zzhy, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzct> creator;
        new zzcs();
        CREATOR = creator;
    }
}
