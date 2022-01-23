package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.Nullable;

@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR;
    @SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    @Nullable
    private final zzi zzb;
    @SafeParcelable.Field(getter = "getAllowTestKeys", id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    private final boolean zzd;

    static {
        Parcelable.Creator<zzs> creator;
        new zzt();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    zzs(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) @Nullable IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) boolean z2) {
        zzi zzi;
        byte[] bArr;
        zzi zzi2;
        IBinder iBinder2 = iBinder;
        boolean z3 = z;
        boolean z4 = z2;
        this.zza = str;
        if (iBinder2 == null) {
            zzi = null;
        } else {
            try {
                IObjectWrapper zzd2 = zzx.zzg(iBinder2).zzd();
                if (zzd2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) ObjectWrapper.unwrap(zzd2);
                }
                if (bArr != null) {
                    new zzj(bArr);
                    zzi = zzi2;
                } else {
                    int e = Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                    zzi = null;
                }
            } catch (RemoteException e2) {
                int e3 = Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
                zzi = null;
            }
        }
        this.zzb = zzi;
        this.zzc = z3;
        this.zzd = z4;
    }

    zzs(String str, @Nullable zzi zzi, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zzi;
        this.zzc = z;
        this.zzd = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zza, false);
        zzi zzi = this.zzb;
        if (zzi == null) {
            int w = Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzi = null;
        }
        SafeParcelWriter.writeIBinder(parcel2, 2, zzi, false);
        SafeParcelWriter.writeBoolean(parcel2, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel2, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
