package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@C0463SafeParcelable.Class(creator = "LocationSettingsRequestCreator")
@C0463SafeParcelable.Reserved({1000})
public final class LocationSettingsRequest extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR;
    @C0463SafeParcelable.Field(getter = "getLocationRequests", id = 1)
    private final List<LocationRequest> zzbg;
    @C0463SafeParcelable.Field(defaultValue = "false", getter = "alwaysShow", id = 2)
    private final boolean zzbh;
    @C0463SafeParcelable.Field(getter = "needBle", id = 3)
    private final boolean zzbi;
    @C0463SafeParcelable.Field(getter = "getConfiguration", id = 5)
    private zzae zzbj;

    public static final class Builder {
        private boolean zzbh = false;
        private boolean zzbi = false;
        private zzae zzbj = null;
        private final ArrayList<LocationRequest> zzbk;

        public Builder() {
            ArrayList<LocationRequest> arrayList;
            new ArrayList<>();
            this.zzbk = arrayList;
        }

        public final Builder addAllLocationRequests(Collection<LocationRequest> collection) {
            for (LocationRequest next : collection) {
                LocationRequest locationRequest = next;
                if (next != null) {
                    boolean add = this.zzbk.add(locationRequest);
                }
            }
            return this;
        }

        public final Builder addLocationRequest(@NonNull LocationRequest locationRequest) {
            LocationRequest locationRequest2 = locationRequest;
            if (locationRequest2 != null) {
                boolean add = this.zzbk.add(locationRequest2);
            }
            return this;
        }

        public final LocationSettingsRequest build() {
            LocationSettingsRequest locationSettingsRequest;
            new LocationSettingsRequest(this.zzbk, this.zzbh, this.zzbi, (zzae) null);
            return locationSettingsRequest;
        }

        public final Builder setAlwaysShow(boolean z) {
            this.zzbh = z;
            return this;
        }

        public final Builder setNeedBle(boolean z) {
            this.zzbi = z;
            return this;
        }
    }

    static {
        Parcelable.Creator<LocationSettingsRequest> creator;
        new zzag();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    LocationSettingsRequest(@C0463SafeParcelable.Param(id = 1) List<LocationRequest> list, @C0463SafeParcelable.Param(id = 2) boolean z, @C0463SafeParcelable.Param(id = 3) boolean z2, @C0463SafeParcelable.Param(id = 5) zzae zzae) {
        this.zzbg = list;
        this.zzbh = z;
        this.zzbi = z2;
        this.zzbj = zzae;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeTypedList(parcel2, 1, Collections.unmodifiableList(this.zzbg), false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 2, this.zzbh);
        C0462SafeParcelWriter.writeBoolean(parcel2, 3, this.zzbi);
        C0462SafeParcelWriter.writeParcelable(parcel2, 5, this.zzbj, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
