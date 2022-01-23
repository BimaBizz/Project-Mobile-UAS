package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "ValidateAccountRequestCreator")
@Deprecated
/* renamed from: com.google.android.gms.common.internal.zzai */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0520zzai extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0520zzai> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zza;

    static {
        Parcelable.Creator<C0520zzai> creator;
        new C0521zzaj();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0520zzai(@C0463SafeParcelable.Param(id = 1) int i) {
        this.zza = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
