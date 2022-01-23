package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR;
    @SafeParcelable.Field(getter = "getResult", id = 1)
    private final boolean zza;
    @SafeParcelable.Field(getter = "getErrorMessage", id = 2)
    @Nullable
    private final String zzb;
    @SafeParcelable.Field(getter = "getStatusValue", id = 3)
    private final int zzc;

    static {
        Parcelable.Creator<zzq> creator;
        new zzr();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    zzq(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i) {
        this.zza = z;
        this.zzb = str;
        this.zzc = zzp.zza(i) - 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeBoolean(parcel2, 1, this.zza);
        SafeParcelWriter.writeString(parcel2, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel2, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final boolean zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return zzp.zza(this.zzc);
    }
}
