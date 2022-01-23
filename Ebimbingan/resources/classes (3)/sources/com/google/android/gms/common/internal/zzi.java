package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConnectionInfoCreator")
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR;
    @SafeParcelable.Field(id = 1)
    Bundle zza;
    @SafeParcelable.Field(id = 2)
    Feature[] zzb;
    @SafeParcelable.Field(defaultValue = "0", id = 3)
    int zzc;
    @SafeParcelable.Field(id = 4)
    @Nullable
    ConnectionTelemetryConfiguration zzd;

    static {
        Parcelable.Creator<zzi> creator;
        new zzj();
        CREATOR = creator;
    }

    public zzi() {
    }

    @SafeParcelable.Constructor
    zzi(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) Feature[] featureArr, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) @Nullable ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.zza = bundle;
        this.zzb = featureArr;
        this.zzc = i;
        this.zzd = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeBundle(parcel2, 1, this.zza, false);
        SafeParcelWriter.writeTypedArray(parcel2, 2, this.zzb, i2, false);
        SafeParcelWriter.writeInt(parcel2, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel2, 4, this.zzd, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
