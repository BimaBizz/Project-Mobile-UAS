package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0464SafeParcelableSerializer;

@C0463SafeParcelable.Class(creator = "LocationSettingsStatesCreator")
@C0463SafeParcelable.Reserved({1000})
public final class LocationSettingsStates extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR;
    @C0463SafeParcelable.Field(getter = "isGpsUsable", id = 1)
    private final boolean zzbn;
    @C0463SafeParcelable.Field(getter = "isNetworkLocationUsable", id = 2)
    private final boolean zzbo;
    @C0463SafeParcelable.Field(getter = "isBleUsable", id = 3)
    private final boolean zzbp;
    @C0463SafeParcelable.Field(getter = "isGpsPresent", id = 4)
    private final boolean zzbq;
    @C0463SafeParcelable.Field(getter = "isNetworkLocationPresent", id = 5)
    private final boolean zzbr;
    @C0463SafeParcelable.Field(getter = "isBlePresent", id = 6)
    private final boolean zzbs;

    static {
        Parcelable.Creator<LocationSettingsStates> creator;
        new zzai();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    public LocationSettingsStates(@C0463SafeParcelable.Param(id = 1) boolean z, @C0463SafeParcelable.Param(id = 2) boolean z2, @C0463SafeParcelable.Param(id = 3) boolean z3, @C0463SafeParcelable.Param(id = 4) boolean z4, @C0463SafeParcelable.Param(id = 5) boolean z5, @C0463SafeParcelable.Param(id = 6) boolean z6) {
        this.zzbn = z;
        this.zzbo = z2;
        this.zzbp = z3;
        this.zzbq = z4;
        this.zzbr = z5;
        this.zzbs = z6;
    }

    public static LocationSettingsStates fromIntent(Intent intent) {
        return (LocationSettingsStates) C0464SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public final boolean isBlePresent() {
        return this.zzbs;
    }

    public final boolean isBleUsable() {
        return this.zzbp;
    }

    public final boolean isGpsPresent() {
        return this.zzbq;
    }

    public final boolean isGpsUsable() {
        return this.zzbn;
    }

    public final boolean isLocationPresent() {
        return this.zzbq || this.zzbr;
    }

    public final boolean isLocationUsable() {
        return this.zzbn || this.zzbo;
    }

    public final boolean isNetworkLocationPresent() {
        return this.zzbr;
    }

    public final boolean isNetworkLocationUsable() {
        return this.zzbo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeBoolean(parcel2, 1, isGpsUsable());
        C0462SafeParcelWriter.writeBoolean(parcel2, 2, isNetworkLocationUsable());
        C0462SafeParcelWriter.writeBoolean(parcel2, 3, isBleUsable());
        C0462SafeParcelWriter.writeBoolean(parcel2, 4, isGpsPresent());
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, isNetworkLocationPresent());
        C0462SafeParcelWriter.writeBoolean(parcel2, 6, isBlePresent());
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
