package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzac extends zza implements zzae {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean zze(zzs zzs, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, zzs);
        zzc.zzf(zza, iObjectWrapper);
        Parcel zzB = zzB(5, zza);
        boolean zza2 = zzc.zza(zzB);
        zzB.recycle();
        return zza2;
    }

    public final zzq zzf(zzn zzn) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, zzn);
        Parcel zzB = zzB(6, zza);
        zzq zzq = (zzq) zzc.zzc(zzB, zzq.CREATOR);
        zzB.recycle();
        return zzq;
    }

    public final boolean zzg() throws RemoteException {
        Parcel zzB = zzB(7, zza());
        boolean zza = zzc.zza(zzB);
        zzB.recycle();
        return zza;
    }
}
