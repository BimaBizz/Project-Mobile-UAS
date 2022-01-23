package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.dynamic.C0661IObjectWrapper;
import com.google.android.gms.dynamic.C0663ObjectWrapper;

@C0463SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
/* renamed from: com.google.android.gms.common.zzn */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0645zzn extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0645zzn> CREATOR;
    @C0463SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    private final String zza;
    @C0463SafeParcelable.Field(getter = "getAllowTestKeys", id = 2)
    private final boolean zzb;
    @C0463SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 3)
    private final boolean zzc;
    @C0463SafeParcelable.Field(getter = "getCallingContextBinder", id = 4, type = "android.os.IBinder")
    private final Context zzd;
    @C0463SafeParcelable.Field(getter = "getIsChimeraPackage", id = 5)
    private final boolean zze;

    static {
        Parcelable.Creator<C0645zzn> creator;
        new C0646zzo();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0645zzn(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) boolean z, @C0463SafeParcelable.Param(id = 3) boolean z2, @C0463SafeParcelable.Param(id = 4) IBinder iBinder, @C0463SafeParcelable.Param(id = 5) boolean z3) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (Context) C0663ObjectWrapper.unwrap(C0661IObjectWrapper.Stub.asInterface(iBinder));
        this.zze = z3;
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zza, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 2, this.zzb);
        C0462SafeParcelWriter.writeBoolean(parcel2, 3, this.zzc);
        C0462SafeParcelWriter.writeIBinder(parcel2, 4, C0663ObjectWrapper.wrap(this.zzd), false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 5, this.zze);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
