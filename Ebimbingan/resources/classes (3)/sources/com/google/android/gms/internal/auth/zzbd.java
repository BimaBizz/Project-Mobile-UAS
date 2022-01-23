package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SendDataRequestCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    private final int zza;
    @SafeParcelable.Field(id = 2)
    private final String zzb;
    @SafeParcelable.Field(id = 3)
    private final byte[] zzc;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzbd(String str, byte[] bArr) {
        this(1, str, bArr);
    }

    @SafeParcelable.Constructor
    zzbd(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr) {
        int i2 = i;
        this.zza = 1;
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        SafeParcelWriter.writeString(parcel2, 2, this.zzb, false);
        SafeParcelWriter.writeByteArray(parcel2, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzbd> creator;
        new zzbc();
        CREATOR = creator;
    }
}
