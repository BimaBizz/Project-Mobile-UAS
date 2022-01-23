package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "SendVerificationCodeAidlRequestCreator")
public final class zzcv extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcv> CREATOR;
    @C0463SafeParcelable.Field(getter = "getSendVerificationCodeRequest", id = 1)
    private final zzfe zzkl;

    @C0463SafeParcelable.Constructor
    public zzcv(@C0463SafeParcelable.Param(id = 1) zzfe zzfe) {
        this.zzkl = zzfe;
    }

    public final zzfe zzdk() {
        return this.zzkl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, this.zzkl, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcv> creator;
        new zzcu();
        CREATOR = creator;
    }
}
