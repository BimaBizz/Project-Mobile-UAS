package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ValidateAccountRequestCreator")
@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zza;

    static {
        Parcelable.Creator<zzai> creator;
        new zzaj();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    zzai(@SafeParcelable.Param(id = 1) int i) {
        this.zza = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
