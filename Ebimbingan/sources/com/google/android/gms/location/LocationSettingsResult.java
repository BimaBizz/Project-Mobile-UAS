package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "LocationSettingsResultCreator")
@C0463SafeParcelable.Reserved({1000})
public final class LocationSettingsResult extends C0460AbstractSafeParcelable implements C0231Result {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR;
    @C0463SafeParcelable.Field(getter = "getStatus", id = 1)
    private final C0236Status zzbl;
    @C0463SafeParcelable.Field(getter = "getLocationSettingsStates", id = 2)
    private final LocationSettingsStates zzbm;

    static {
        Parcelable.Creator<LocationSettingsResult> creator;
        new zzah();
        CREATOR = creator;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LocationSettingsResult(C0236Status status) {
        this(status, (LocationSettingsStates) null);
    }

    @C0463SafeParcelable.Constructor
    public LocationSettingsResult(@C0463SafeParcelable.Param(id = 1) C0236Status status, @C0463SafeParcelable.Param(id = 2) LocationSettingsStates locationSettingsStates) {
        this.zzbl = status;
        this.zzbm = locationSettingsStates;
    }

    public final LocationSettingsStates getLocationSettingsStates() {
        return this.zzbm;
    }

    public final C0236Status getStatus() {
        return this.zzbl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, getStatus(), i2, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, getLocationSettingsStates(), i2, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
