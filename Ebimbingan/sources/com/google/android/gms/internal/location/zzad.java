package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "FusedLocationProviderResultCreator")
@C0463SafeParcelable.Reserved({1000})
public final class zzad extends C0460AbstractSafeParcelable implements C0231Result {
    public static final Parcelable.Creator<zzad> CREATOR;
    private static final zzad zzcr;
    @C0463SafeParcelable.Field(getter = "getStatus", id = 1)
    private final C0236Status zzbl;

    static {
        zzad zzad;
        Parcelable.Creator<zzad> creator;
        new zzad(C0236Status.RESULT_SUCCESS);
        zzcr = zzad;
        new zzae();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    public zzad(@C0463SafeParcelable.Param(id = 1) C0236Status status) {
        this.zzbl = status;
    }

    public final C0236Status getStatus() {
        return this.zzbl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, getStatus(), i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
