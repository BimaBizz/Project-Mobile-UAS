package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0452ShowFirstParty
@C0463SafeParcelable.Class(creator = "ClearTokenRequestCreator")
/* renamed from: com.google.android.gms.internal.auth.zzcb */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0832zzcb extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0832zzcb> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    private final int zza;
    @C0463SafeParcelable.Field(id = 2)
    private String zzb;

    public C0832zzcb() {
        this.zza = 1;
    }

    @C0463SafeParcelable.Constructor
    C0832zzcb(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) String str) {
        this.zza = i;
        this.zzb = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzb, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final C0832zzcb zza(String str) {
        this.zzb = str;
        return this;
    }

    static {
        Parcelable.Creator<C0832zzcb> creator;
        new C0831zzca();
        CREATOR = creator;
    }
}
