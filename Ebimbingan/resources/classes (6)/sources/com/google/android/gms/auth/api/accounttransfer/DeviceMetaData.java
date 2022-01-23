package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeviceMetaDataCreator")
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "isLockScreenSolved", id = 2)
    private boolean zzb;
    @SafeParcelable.Field(getter = "getMinAgeOfLockScreen", id = 3)
    private long zzc;
    @SafeParcelable.Field(getter = "isChallengeAllowed", id = 4)
    private final boolean zzd;

    public boolean isLockScreenSolved() {
        return this.zzb;
    }

    public long getMinAgeOfLockScreen() {
        return this.zzc;
    }

    public boolean isChallengeAllowed() {
        return this.zzd;
    }

    @SafeParcelable.Constructor
    DeviceMetaData(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) boolean z2) {
        this.zza = i;
        this.zzb = z;
        this.zzc = j;
        this.zzd = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel2, 2, isLockScreenSolved());
        SafeParcelWriter.writeLong(parcel2, 3, getMinAgeOfLockScreen());
        SafeParcelWriter.writeBoolean(parcel2, 4, isChallengeAllowed());
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<DeviceMetaData> creator;
        new zzv();
        CREATOR = creator;
    }
}
