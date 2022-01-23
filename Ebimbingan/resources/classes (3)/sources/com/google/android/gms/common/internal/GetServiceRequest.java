package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class GetServiceRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zza;
    @SafeParcelable.Field(id = 2)
    final int zzb;
    @SafeParcelable.Field(id = 3)
    int zzc;
    @SafeParcelable.Field(id = 4)
    String zzd;
    @SafeParcelable.Field(id = 5)
    IBinder zze;
    @SafeParcelable.Field(id = 6)
    Scope[] zzf;
    @SafeParcelable.Field(id = 7)
    Bundle zzg;
    @SafeParcelable.Field(id = 8)
    @Nullable
    Account zzh;
    @SafeParcelable.Field(id = 10)
    Feature[] zzi;
    @SafeParcelable.Field(id = 11)
    Feature[] zzj;
    @SafeParcelable.Field(id = 12)
    boolean zzk;
    @SafeParcelable.Field(defaultValue = "0", id = 13)
    int zzl;
    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", id = 14)
    boolean zzm;
    @SafeParcelable.Field(getter = "getAttributionTag", id = 15)
    @Nullable
    private final String zzn;

    static {
        Parcelable.Creator<GetServiceRequest> creator;
        new zzl();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    GetServiceRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z, @SafeParcelable.Param(id = 13) int i4, @SafeParcelable.Param(id = 14) boolean z2, @SafeParcelable.Param(id = 15) @Nullable String str2) {
        int i5 = i;
        String str3 = str;
        IBinder iBinder2 = iBinder;
        Scope[] scopeArr2 = scopeArr;
        Bundle bundle2 = bundle;
        Account account2 = account;
        Feature[] featureArr3 = featureArr;
        Feature[] featureArr4 = featureArr2;
        boolean z3 = z;
        int i6 = i4;
        boolean z4 = z2;
        String str4 = str2;
        this.zza = i5;
        this.zzb = i2;
        this.zzc = i3;
        if ("com.google.android.gms".equals(str3)) {
            this.zzd = "com.google.android.gms";
        } else {
            this.zzd = str3;
        }
        if (i5 < 2) {
            this.zzh = iBinder2 != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder2)) : null;
        } else {
            this.zze = iBinder2;
            this.zzh = account2;
        }
        this.zzf = scopeArr2;
        this.zzg = bundle2;
        this.zzi = featureArr3;
        this.zzj = featureArr4;
        this.zzk = z3;
        this.zzl = i6;
        this.zzm = z4;
        this.zzn = str4;
    }

    @RecentlyNonNull
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.zzg;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        zzl.zza(this, parcel, i);
    }

    @RecentlyNullable
    public final String zza() {
        return this.zzn;
    }

    public GetServiceRequest(int i, @Nullable String str) {
        this.zza = 6;
        this.zzc = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.zzb = i;
        this.zzk = true;
        this.zzn = str;
    }
}
