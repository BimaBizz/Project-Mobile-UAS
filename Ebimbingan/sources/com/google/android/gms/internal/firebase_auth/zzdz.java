package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.zzf;

@C0463SafeParcelable.Class(creator = "OnFailedIdpSignInAidlResponseCreator")
public final class zzdz extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdz> CREATOR;
    @C0463SafeParcelable.Field(getter = "getTenantId", id = 4)
    private final String zzhy;
    @C0463SafeParcelable.Field(getter = "getEmail", id = 3)
    private final String zzif;
    @C0463SafeParcelable.Field(getter = "getStatus", id = 1)
    private final C0236Status zzkv;
    @C0463SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 2)
    private final zzf zzkw;

    @C0463SafeParcelable.Constructor
    public zzdz(@C0463SafeParcelable.Param(id = 1) C0236Status status, @C0463SafeParcelable.Param(id = 2) zzf zzf, @C0463SafeParcelable.Param(id = 3) String str, @C0463SafeParcelable.Param(id = 4) @Nullable String str2) {
        this.zzkv = status;
        this.zzkw = zzf;
        this.zzif = str;
        this.zzhy = str2;
    }

    public final C0236Status getStatus() {
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

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, this.zzkv, i2, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, this.zzkw, i2, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzif, false);
        C0462SafeParcelWriter.writeString(parcel2, 4, this.zzhy, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzdz> creator;
        new zzdy();
        CREATOR = creator;
    }
}
