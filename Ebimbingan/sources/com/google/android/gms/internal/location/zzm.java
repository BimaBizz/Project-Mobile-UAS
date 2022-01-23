package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0426ClientIdentity;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;

@C0463SafeParcelable.Class(creator = "DeviceOrientationRequestInternalCreator")
public final class zzm extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR;
    @C0617VisibleForTesting
    static final List<C0426ClientIdentity> zzcd = Collections.emptyList();
    static final zzj zzce;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "null", id = 3)
    @Nullable
    private String tag;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_DEVICE_ORIENTATION_REQUEST", id = 1)
    private zzj zzcf;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_CLIENTS", id = 2)
    private List<C0426ClientIdentity> zzm;

    static {
        zzj zzj;
        Parcelable.Creator<zzm> creator;
        new zzj();
        zzce = zzj;
        new zzn();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    zzm(@C0463SafeParcelable.Param(id = 1) zzj zzj, @C0463SafeParcelable.Param(id = 2) List<C0426ClientIdentity> list, @C0463SafeParcelable.Param(id = 3) String str) {
        this.zzcf = zzj;
        this.zzm = list;
        this.tag = str;
    }

    public final boolean equals(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof zzm)) {
            return false;
        }
        zzm zzm2 = (zzm) obj2;
        return C0444Objects.equal(this.zzcf, zzm2.zzcf) && C0444Objects.equal(this.zzm, zzm2.zzm) && C0444Objects.equal(this.tag, zzm2.tag);
    }

    public final int hashCode() {
        return this.zzcf.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, this.zzcf, i, false);
        C0462SafeParcelWriter.writeTypedList(parcel2, 2, this.zzm, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.tag, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
