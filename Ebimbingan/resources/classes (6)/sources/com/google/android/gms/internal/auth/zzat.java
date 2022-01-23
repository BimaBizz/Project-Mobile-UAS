package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeviceMetaDataRequestCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzat> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    private final int zza;
    @SafeParcelable.Field(id = 2)
    private final String zzb;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzat(String str) {
        this(1, str);
    }

    @SafeParcelable.Constructor
    zzat(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str) {
        int i2 = i;
        this.zza = 1;
        this.zzb = (String) Preconditions.checkNotNull(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        SafeParcelWriter.writeString(parcel2, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzat> creator;
        new zzas();
        CREATOR = creator;
    }
}
