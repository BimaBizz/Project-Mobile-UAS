package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "ConnectionInfoCreator")
/* renamed from: com.google.android.gms.common.internal.zzi */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0529zzi extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0529zzi> CREATOR;
    @C0463SafeParcelable.Field(id = 1)
    Bundle zza;
    @C0463SafeParcelable.Field(id = 2)
    C0186Feature[] zzb;
    @C0463SafeParcelable.Field(defaultValue = "0", id = 3)
    int zzc;
    @C0463SafeParcelable.Field(id = 4)
    @Nullable
    C0428ConnectionTelemetryConfiguration zzd;

    static {
        Parcelable.Creator<C0529zzi> creator;
        new C0530zzj();
        CREATOR = creator;
    }

    public C0529zzi() {
    }

    @C0463SafeParcelable.Constructor
    C0529zzi(@C0463SafeParcelable.Param(id = 1) Bundle bundle, @C0463SafeParcelable.Param(id = 2) C0186Feature[] featureArr, @C0463SafeParcelable.Param(id = 3) int i, @C0463SafeParcelable.Param(id = 4) @Nullable C0428ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.zza = bundle;
        this.zzb = featureArr;
        this.zzc = i;
        this.zzd = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeBundle(parcel2, 1, this.zza, false);
        C0462SafeParcelWriter.writeTypedArray(parcel2, 2, this.zzb, i2, false);
        C0462SafeParcelWriter.writeInt(parcel2, 3, this.zzc);
        C0462SafeParcelWriter.writeParcelable(parcel2, 4, this.zzd, i2, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
