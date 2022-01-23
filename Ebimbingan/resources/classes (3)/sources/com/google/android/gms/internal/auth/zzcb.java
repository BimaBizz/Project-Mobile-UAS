package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "ClearTokenRequestCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzcb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcb> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    private final int zza;
    @SafeParcelable.Field(id = 2)
    private String zzb;

    public zzcb() {
        this.zza = 1;
    }

    @SafeParcelable.Constructor
    zzcb(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str) {
        this.zza = i;
        this.zzb = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        SafeParcelWriter.writeString(parcel2, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final zzcb zza(String str) {
        this.zzb = str;
        return this;
    }

    static {
        Parcelable.Creator<zzcb> creator;
        new zzca();
        CREATOR = creator;
    }
}
