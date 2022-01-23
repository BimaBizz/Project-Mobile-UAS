package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.C0190GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.internal.C0437IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0206KeepForSdk
@C0463SafeParcelable.Class(creator = "GetServiceRequestCreator")
@C0463SafeParcelable.Reserved({9})
/* renamed from: com.google.android.gms.common.internal.GetServiceRequest */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0432GetServiceRequest extends C0460AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0432GetServiceRequest> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zza;
    @C0463SafeParcelable.Field(id = 2)
    final int zzb;
    @C0463SafeParcelable.Field(id = 3)
    int zzc;
    @C0463SafeParcelable.Field(id = 4)
    String zzd;
    @C0463SafeParcelable.Field(id = 5)
    IBinder zze;
    @C0463SafeParcelable.Field(id = 6)
    C0235Scope[] zzf;
    @C0463SafeParcelable.Field(id = 7)
    Bundle zzg;
    @C0463SafeParcelable.Field(id = 8)
    @Nullable
    Account zzh;
    @C0463SafeParcelable.Field(id = 10)
    C0186Feature[] zzi;
    @C0463SafeParcelable.Field(id = 11)
    C0186Feature[] zzj;
    @C0463SafeParcelable.Field(id = 12)
    boolean zzk;
    @C0463SafeParcelable.Field(defaultValue = "0", id = 13)
    int zzl;
    @C0463SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", id = 14)
    boolean zzm;
    @C0463SafeParcelable.Field(getter = "getAttributionTag", id = 15)
    @Nullable
    private final String zzn;

    static {
        Parcelable.Creator<C0432GetServiceRequest> creator;
        new C0532zzl();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0432GetServiceRequest(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) int i2, @C0463SafeParcelable.Param(id = 3) int i3, @C0463SafeParcelable.Param(id = 4) String str, @C0463SafeParcelable.Param(id = 5) IBinder iBinder, @C0463SafeParcelable.Param(id = 6) C0235Scope[] scopeArr, @C0463SafeParcelable.Param(id = 7) Bundle bundle, @C0463SafeParcelable.Param(id = 8) Account account, @C0463SafeParcelable.Param(id = 10) C0186Feature[] featureArr, @C0463SafeParcelable.Param(id = 11) C0186Feature[] featureArr2, @C0463SafeParcelable.Param(id = 12) boolean z, @C0463SafeParcelable.Param(id = 13) int i4, @C0463SafeParcelable.Param(id = 14) boolean z2, @C0463SafeParcelable.Param(id = 15) @Nullable String str2) {
        int i5 = i;
        String str3 = str;
        IBinder iBinder2 = iBinder;
        C0235Scope[] scopeArr2 = scopeArr;
        Bundle bundle2 = bundle;
        Account account2 = account;
        C0186Feature[] featureArr3 = featureArr;
        C0186Feature[] featureArr4 = featureArr2;
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
            this.zzh = iBinder2 != null ? C0420AccountAccessor.getAccountBinderSafe(C0437IAccountAccessor.Stub.asInterface(iBinder2)) : null;
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
    @C0206KeepForSdk
    public Bundle getExtraArgs() {
        return this.zzg;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C0532zzl.zza(this, parcel, i);
    }

    @RecentlyNullable
    public final String zza() {
        return this.zzn;
    }

    public C0432GetServiceRequest(int i, @Nullable String str) {
        this.zza = 6;
        this.zzc = C0190GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.zzb = i;
        this.zzk = true;
        this.zzn = str;
    }
}
