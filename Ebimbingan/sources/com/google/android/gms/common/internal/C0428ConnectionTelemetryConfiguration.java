package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "ConnectionTelemetryConfigurationCreator")
/* renamed from: com.google.android.gms.common.internal.ConnectionTelemetryConfiguration */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0428ConnectionTelemetryConfiguration extends C0460AbstractSafeParcelable {
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final Parcelable.Creator<C0428ConnectionTelemetryConfiguration> CREATOR;
    @C0463SafeParcelable.Field(getter = "getRootTelemetryConfiguration", id = 1)
    private final C0450RootTelemetryConfiguration zza;
    @C0463SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean zzb;
    @C0463SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean zzc;
    @C0463SafeParcelable.Field(getter = "getMethodInvocationMethodKeyAllowlist", id = 4)
    @Nullable
    private final int[] zzd;
    @C0463SafeParcelable.Field(getter = "getMaxMethodInvocationsLogged", id = 5)
    private final int zze;
    @C0463SafeParcelable.Field(getter = "getMethodInvocationMethodKeyDisallowlist", id = 6)
    @Nullable
    private final int[] zzf;

    static {
        Parcelable.Creator<C0428ConnectionTelemetryConfiguration> creator;
        new C0531zzk();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    public C0428ConnectionTelemetryConfiguration(@RecentlyNonNull @C0463SafeParcelable.Param(id = 1) C0450RootTelemetryConfiguration rootTelemetryConfiguration, @C0463SafeParcelable.Param(id = 2) boolean z, @C0463SafeParcelable.Param(id = 3) boolean z2, @C0463SafeParcelable.Param(id = 4) @Nullable int[] iArr, @C0463SafeParcelable.Param(id = 5) int i, @C0463SafeParcelable.Param(id = 6) @Nullable int[] iArr2) {
        this.zza = rootTelemetryConfiguration;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = iArr2;
    }

    @C0206KeepForSdk
    public int getMaxMethodInvocationsLogged() {
        return this.zze;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public int[] getMethodInvocationMethodKeyAllowlist() {
        return this.zzd;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public int[] getMethodInvocationMethodKeyDisallowlist() {
        return this.zzf;
    }

    @C0206KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.zzb;
    }

    @C0206KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.zzc;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public C0450RootTelemetryConfiguration getRootTelemetryConfiguration() {
        return this.zza;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeParcelable(parcel2, 1, getRootTelemetryConfiguration(), i, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 2, getMethodInvocationTelemetryEnabled());
        C0462SafeParcelWriter.writeBoolean(parcel2, 3, getMethodTimingTelemetryEnabled());
        C0462SafeParcelWriter.writeIntArray(parcel2, 4, getMethodInvocationMethodKeyAllowlist(), false);
        C0462SafeParcelWriter.writeInt(parcel2, 5, getMaxMethodInvocationsLogged());
        C0462SafeParcelWriter.writeIntArray(parcel2, 6, getMethodInvocationMethodKeyDisallowlist(), false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
