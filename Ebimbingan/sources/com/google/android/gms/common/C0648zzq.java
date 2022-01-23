package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import javax.annotation.Nullable;

@C0463SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
/* renamed from: com.google.android.gms.common.zzq */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0648zzq extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0648zzq> CREATOR;
    @C0463SafeParcelable.Field(getter = "getResult", id = 1)
    private final boolean zza;
    @C0463SafeParcelable.Field(getter = "getErrorMessage", id = 2)
    @Nullable
    private final String zzb;
    @C0463SafeParcelable.Field(getter = "getStatusValue", id = 3)
    private final int zzc;

    static {
        Parcelable.Creator<C0648zzq> creator;
        new C0649zzr();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0648zzq(@C0463SafeParcelable.Param(id = 1) boolean z, @C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) int i) {
        this.zza = z;
        this.zzb = str;
        this.zzc = C0647zzp.zza(i) - 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeBoolean(parcel2, 1, this.zza);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzb, false);
        C0462SafeParcelWriter.writeInt(parcel2, 3, this.zzc);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final boolean zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return C0647zzp.zza(this.zzc);
    }
}
