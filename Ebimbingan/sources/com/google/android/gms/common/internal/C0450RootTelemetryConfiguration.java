package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "RootTelemetryConfigurationCreator")
/* renamed from: com.google.android.gms.common.internal.RootTelemetryConfiguration */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0450RootTelemetryConfiguration extends C0460AbstractSafeParcelable {
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final Parcelable.Creator<C0450RootTelemetryConfiguration> CREATOR;
    @C0463SafeParcelable.Field(getter = "getVersion", id = 1)
    private final int zza;
    @C0463SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean zzb;
    @C0463SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean zzc;
    @C0463SafeParcelable.Field(getter = "getBatchPeriodMillis", id = 4)
    private final int zzd;
    @C0463SafeParcelable.Field(getter = "getMaxMethodInvocationsInBatch", id = 5)
    private final int zze;

    static {
        Parcelable.Creator<C0450RootTelemetryConfiguration> creator;
        new C0519zzah();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    public C0450RootTelemetryConfiguration(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) boolean z, @C0463SafeParcelable.Param(id = 3) boolean z2, @C0463SafeParcelable.Param(id = 4) int i2, @C0463SafeParcelable.Param(id = 5) int i3) {
        this.zza = i;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i2;
        this.zze = i3;
    }

    @C0206KeepForSdk
    public int getBatchPeriodMillis() {
        return this.zzd;
    }

    @C0206KeepForSdk
    public int getMaxMethodInvocationsInBatch() {
        return this.zze;
    }

    @C0206KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.zzb;
    }

    @C0206KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.zzc;
    }

    @C0206KeepForSdk
    public int getVersion() {
        return this.zza;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, getVersion());
        C0462SafeParcelWriter.writeBoolean(parcel2, 2, getMethodInvocationTelemetryEnabled());
        C0462SafeParcelWriter.writeBoolean(parcel2, 3, getMethodTimingTelemetryEnabled());
        C0462SafeParcelWriter.writeInt(parcel2, 4, getBatchPeriodMillis());
        C0462SafeParcelWriter.writeInt(parcel2, 5, getMaxMethodInvocationsInBatch());
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
