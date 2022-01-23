package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

@SafeParcelable.Class(creator = "SendEmailVerificationWithSettingsAidlRequestCreator")
public final class zzcr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcr> CREATOR;
    @SafeParcelable.Field(getter = "getToken", id = 1)
    private final String zzji;
    @SafeParcelable.Field(getter = "getActionCodeSettings", id = 2)
    @Nullable
    private final ActionCodeSettings zzkk;

    @SafeParcelable.Constructor
    public zzcr(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) @Nullable ActionCodeSettings actionCodeSettings) {
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

    /* JADX WARNING: type inference failed for: r8v3, types: [com.google.firebase.auth.ActionCodeSettings, android.os.Parcelable] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzji, false);
        SafeParcelWriter.writeParcelable(parcel2, 2, this.zzkk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcr> creator;
        new zzcq();
        CREATOR = creator;
    }
}
