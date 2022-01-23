package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserChallengeRequestCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    private final int zza;
    @SafeParcelable.Field(id = 2)
    private final String zzb;
    @SafeParcelable.Field(id = 3)
    private final PendingIntent zzc;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzbf(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }

    @SafeParcelable.Constructor
    zzbf(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent) {
        int i2 = i;
        this.zza = 1;
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zzc = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        SafeParcelWriter.writeString(parcel2, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel2, 3, this.zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzbf> creator;
        new zzbe();
        CREATOR = creator;
    }
}
