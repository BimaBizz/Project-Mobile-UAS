package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "DeviceMetaDataCreator")
/* renamed from: com.google.android.gms.auth.api.accounttransfer.DeviceMetaData */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0039DeviceMetaData extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0039DeviceMetaData> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    private final int zza;
    @C0463SafeParcelable.Field(getter = "isLockScreenSolved", id = 2)
    private boolean zzb;
    @C0463SafeParcelable.Field(getter = "getMinAgeOfLockScreen", id = 3)
    private long zzc;
    @C0463SafeParcelable.Field(getter = "isChallengeAllowed", id = 4)
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

    @C0463SafeParcelable.Constructor
    C0039DeviceMetaData(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) boolean z, @C0463SafeParcelable.Param(id = 3) long j, @C0463SafeParcelable.Param(id = 4) boolean z2) {
        this.zza = i;
        this.zzb = z;
        this.zzc = j;
        this.zzd = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zza);
        C0462SafeParcelWriter.writeBoolean(parcel2, 2, isLockScreenSolved());
        C0462SafeParcelWriter.writeLong(parcel2, 3, getMinAgeOfLockScreen());
        C0462SafeParcelWriter.writeBoolean(parcel2, 4, isChallengeAllowed());
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<C0039DeviceMetaData> creator;
        new C0061zzv();
        CREATOR = creator;
    }
}
