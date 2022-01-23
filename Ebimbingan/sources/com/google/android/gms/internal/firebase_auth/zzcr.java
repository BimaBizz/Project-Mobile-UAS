package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

@C0463SafeParcelable.Class(creator = "SendEmailVerificationWithSettingsAidlRequestCreator")
public final class zzcr extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcr> CREATOR;
    @C0463SafeParcelable.Field(getter = "getToken", id = 1)
    private final String zzji;
    @C0463SafeParcelable.Field(getter = "getActionCodeSettings", id = 2)
    @Nullable
    private final ActionCodeSettings zzkk;

    @C0463SafeParcelable.Constructor
    public zzcr(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) @Nullable ActionCodeSettings actionCodeSettings) {
        this.zzji = str;
        this.zzkk = actionCodeSettings;
    }

    public final String getToken() {
        return this.zzji;
    }

    @Nullable
    public final ActionCodeSettings zzdj() {
        return this.zzkk;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzji, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, this.zzkk, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcr> creator;
        new zzcq();
        CREATOR = creator;
    }
}
