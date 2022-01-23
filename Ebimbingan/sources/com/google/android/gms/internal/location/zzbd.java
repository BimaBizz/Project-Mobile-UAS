package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0426ClientIdentity;
import com.google.android.gms.common.internal.C0444Objects;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

@C0463SafeParcelable.Class(creator = "LocationRequestInternalCreator")
@C0463SafeParcelable.Reserved({1000, 2, 3, 4})
public final class zzbd extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR;
    static final List<C0426ClientIdentity> zzcd = Collections.emptyList();
    @C0463SafeParcelable.Field(defaultValueUnchecked = "null", id = 10)
    @Nullable
    private String moduleId;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "null", id = 6)
    @Nullable
    private String tag;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "null", id = 1)
    private LocationRequest zzdg;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_HIDE_FROM_APP_OPS", id = 7)
    private boolean zzdh;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_FORCE_COARSE_LOCATION", id = 8)
    private boolean zzdi;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_EXEMPT_FROM_THROTTLE", id = 9)
    private boolean zzdj;
    private boolean zzdk = true;
    @C0463SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_CLIENTS", id = 5)
    private List<C0426ClientIdentity> zzm;

    static {
        Parcelable.Creator<zzbd> creator;
        new zzbe();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    zzbd(@C0463SafeParcelable.Param(id = 1) LocationRequest locationRequest, @C0463SafeParcelable.Param(id = 5) List<C0426ClientIdentity> list, @C0463SafeParcelable.Param(id = 6) @Nullable String str, @C0463SafeParcelable.Param(id = 7) boolean z, @C0463SafeParcelable.Param(id = 8) boolean z2, @C0463SafeParcelable.Param(id = 9) boolean z3, @C0463SafeParcelable.Param(id = 10) String str2) {
        this.zzdg = locationRequest;
        this.zzm = list;
        this.tag = str;
        this.zzdh = z;
        this.zzdi = z2;
        this.zzdj = z3;
        this.moduleId = str2;
    }

    @Deprecated
    public static zzbd zza(LocationRequest locationRequest) {
        zzbd zzbd;
        new zzbd(locationRequest, zzcd, (String) null, false, false, false, (String) null);
        return zzbd;
    }

    public final boolean equals(Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj2;
        return C0444Objects.equal(this.zzdg, zzbd.zzdg) && C0444Objects.equal(this.zzm, zzbd.zzm) && C0444Objects.equal(this.tag, zzbd.tag) && this.zzdh == zzbd.zzdh && this.zzdi == zzbd.zzdi && this.zzdj == zzbd.zzdj && C0444Objects.equal(this.moduleId, zzbd.moduleId);
    }

    public final int hashCode() {
        return this.zzdg.hashCode();
    }

    public final String toString() {
        StringBuilder sb;
        new StringBuilder();
        StringBuilder sb2 = sb;
        StringBuilder sb3 = sb2;
        StringBuilder append = sb2.append(this.zzdg);
        if (this.tag != null) {
            StringBuilder append2 = sb3.append(" tag=").append(this.tag);
        }
        if (this.moduleId != null) {
            StringBuilder append3 = sb3.append(" moduleId=").append(this.moduleId);
        }
        StringBuilder append4 = sb3.append(" hideAppOps=").append(this.zzdh);
        StringBuilder append5 = sb3.append(" clients=").append(this.zzm);
        StringBuilder append6 = sb3.append(" forceCoarseLocation=").append(this.zzdi);
        if (this.zzdj) {
            StringBuilder append7 = sb3.append(" exemptFromBackgroundThrottle");
        }
        return sb3.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, this.zzdg, i, false);
        C0462SafeParcelWriter.writeTypedList(parcel2, 5, this.zzm, false);
        C0462SafeParcelWriter.writeString(parcel2, 6, this.tag, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 7, this.zzdh);
        C0462SafeParcelWriter.writeBoolean(parcel2, 8, this.zzdi);
        C0462SafeParcelWriter.writeBoolean(parcel2, 9, this.zzdj);
        C0462SafeParcelWriter.writeString(parcel2, 10, this.moduleId, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
