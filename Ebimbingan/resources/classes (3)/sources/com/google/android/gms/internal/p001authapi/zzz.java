package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SaveRequestCreator")
@SafeParcelable.Reserved({1000})
/* renamed from: com.google.android.gms.internal.auth-api.zzz  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR;
    @SafeParcelable.Field(getter = "getCredential", id = 1)
    private final Credential zzam;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param(id = 1) Credential credential) {
        this.zzam = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, this.zzam, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzz> creator;
        new zzy();
        CREATOR = creator;
    }
}
