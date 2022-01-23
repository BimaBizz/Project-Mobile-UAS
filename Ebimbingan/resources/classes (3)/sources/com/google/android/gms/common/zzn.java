package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR;
    @SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getAllowTestKeys", id = 2)
    private final boolean zzb;
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(getter = "getCallingContextBinder", id = 4, type = "android.os.IBinder")
    private final Context zzd;
    @SafeParcelable.Field(getter = "getIsChimeraPackage", id = 5)
    private final boolean zze;

    static {
        Parcelable.Creator<zzn> creator;
        new zzo();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    zzn(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) IBinder iBinder, @SafeParcelable.Param(id = 5) boolean z3) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (Context) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zze = z3;
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zza, false);
        SafeParcelWriter.writeBoolean(parcel2, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel2, 3, this.zzc);
        SafeParcelWriter.writeIBinder(parcel2, 4, ObjectWrapper.wrap(this.zzd), false);
        SafeParcelWriter.writeBoolean(parcel2, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
