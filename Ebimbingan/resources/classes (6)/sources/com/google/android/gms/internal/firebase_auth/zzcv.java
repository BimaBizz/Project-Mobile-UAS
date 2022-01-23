package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SendVerificationCodeAidlRequestCreator")
public final class zzcv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcv> CREATOR;
    @SafeParcelable.Field(getter = "getSendVerificationCodeRequest", id = 1)
    private final zzfe zzkl;

    @SafeParcelable.Constructor
    public zzcv(@SafeParcelable.Param(id = 1) zzfe zzfe) {
        this.zzkl = zzfe;
    }

    public final zzfe zzdk() {
        return this.zzkl;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.os.Parcelable, com.google.android.gms.internal.firebase_auth.zzfe] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, this.zzkl, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzcv> creator;
        new zzcu();
        CREATOR = creator;
    }
}
