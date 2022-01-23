package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zzf;

@SafeParcelable.Class(creator = "OnFailedIdpSignInAidlResponseCreator")
public final class zzdz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdz> CREATOR;
    @SafeParcelable.Field(getter = "getTenantId", id = 4)
    private final String zzhy;
    @SafeParcelable.Field(getter = "getEmail", id = 3)
    private final String zzif;
    @SafeParcelable.Field(getter = "getStatus", id = 1)
    private final Status zzkv;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 2)
    private final zzf zzkw;

    @SafeParcelable.Constructor
    public zzdz(@SafeParcelable.Param(id = 1) Status status, @SafeParcelable.Param(id = 2) zzf zzf, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) @Nullable String str2) {
        this.zzkv = status;
        this.zzkw = zzf;
        this.zzif = str;
        this.zzhy = str2;
    }

    public final Status getStatus() {
        return this.zzkv;
    }

    public final zzf zzdo() {
        return this.zzkw;
    }

    public final String getEmail() {
        return this.zzif;
    }

    public final String zzba() {
        return this.zzhy;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [android.os.Parcelable, com.google.firebase.auth.zzf] */
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, this.zzkv, i2, false);
        SafeParcelWriter.writeParcelable(parcel2, 2, this.zzkw, i2, false);
        SafeParcelWriter.writeString(parcel2, 3, this.zzif, false);
        SafeParcelWriter.writeString(parcel2, 4, this.zzhy, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdz> creator;
        new zzdy();
        CREATOR = creator;
    }
}
