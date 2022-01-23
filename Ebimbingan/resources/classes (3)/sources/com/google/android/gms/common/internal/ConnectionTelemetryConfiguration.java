package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "ConnectionTelemetryConfigurationCreator")
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @RecentlyNonNull
    @KeepForSdk
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR;
    @SafeParcelable.Field(getter = "getRootTelemetryConfiguration", id = 1)
    private final RootTelemetryConfiguration zza;
    @SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean zzb;
    @SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(getter = "getMethodInvocationMethodKeyAllowlist", id = 4)
    @Nullable
    private final int[] zzd;
    @SafeParcelable.Field(getter = "getMaxMethodInvocationsLogged", id = 5)
    private final int zze;
    @SafeParcelable.Field(getter = "getMethodInvocationMethodKeyDisallowlist", id = 6)
    @Nullable
    private final int[] zzf;

    static {
        Parcelable.Creator<ConnectionTelemetryConfiguration> creator;
        new zzk();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    public ConnectionTelemetryConfiguration(@RecentlyNonNull @SafeParcelable.Param(id = 1) RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) @Nullable int[] iArr, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) @Nullable int[] iArr2) {
        this.zza = rootTelemetryConfiguration;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = iArr2;
    }

    @KeepForSdk
    public int getMaxMethodInvocationsLogged() {
        return this.zze;
    }

    @KeepForSdk
    @RecentlyNullable
    public int[] getMethodInvocationMethodKeyAllowlist() {
        return this.zzd;
    }

    @KeepForSdk
    @RecentlyNullable
    public int[] getMethodInvocationMethodKeyDisallowlist() {
        return this.zzf;
    }

    @KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.zzb;
    }

    @KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.zzc;
    }

    @RecentlyNonNull
    @KeepForSdk
    public RootTelemetryConfiguration getRootTelemetryConfiguration() {
        return this.zza;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeParcelable(parcel2, 1, getRootTelemetryConfiguration(), i, false);
        SafeParcelWriter.writeBoolean(parcel2, 2, getMethodInvocationTelemetryEnabled());
        SafeParcelWriter.writeBoolean(parcel2, 3, getMethodTimingTelemetryEnabled());
        SafeParcelWriter.writeIntArray(parcel2, 4, getMethodInvocationMethodKeyAllowlist(), false);
        SafeParcelWriter.writeInt(parcel2, 5, getMaxMethodInvocationsLogged());
        SafeParcelWriter.writeIntArray(parcel2, 6, getMethodInvocationMethodKeyDisallowlist(), false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
