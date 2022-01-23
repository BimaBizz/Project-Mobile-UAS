package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C0544zzx;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.dynamic.C0661IObjectWrapper;
import com.google.android.gms.dynamic.C0663ObjectWrapper;
import javax.annotation.Nullable;

@C0463SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
/* renamed from: com.google.android.gms.common.zzs */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0650zzs extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0650zzs> CREATOR;
    @C0463SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    private final String zza;
    @C0463SafeParcelable.Field(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    @Nullable
    private final C0640zzi zzb;
    @C0463SafeParcelable.Field(getter = "getAllowTestKeys", id = 3)
    private final boolean zzc;
    @C0463SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 4)
    private final boolean zzd;

    static {
        Parcelable.Creator<C0650zzs> creator;
        new C0651zzt();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0650zzs(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) @Nullable IBinder iBinder, @C0463SafeParcelable.Param(id = 3) boolean z, @C0463SafeParcelable.Param(id = 4) boolean z2) {
        C0640zzi zzi;
        byte[] bArr;
        C0640zzi zzi2;
        IBinder iBinder2 = iBinder;
        boolean z3 = z;
        boolean z4 = z2;
        this.zza = str;
        if (iBinder2 == null) {
            zzi = null;
        } else {
            try {
                C0661IObjectWrapper zzd2 = C0544zzx.zzg(iBinder2).zzd();
                if (zzd2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C0663ObjectWrapper.unwrap(zzd2);
                }
                if (bArr != null) {
                    new C0641zzj(bArr);
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

    C0650zzs(String str, @Nullable C0640zzi zzi, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zzi;
        this.zzc = z;
        this.zzd = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zza, false);
        C0640zzi zzi = this.zzb;
        if (zzi == null) {
            int w = Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzi = null;
        }
        C0462SafeParcelWriter.writeIBinder(parcel2, 2, zzi, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 3, this.zzc);
        C0462SafeParcelWriter.writeBoolean(parcel2, 4, this.zzd);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
