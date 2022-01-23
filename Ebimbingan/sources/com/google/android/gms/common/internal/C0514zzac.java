package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.C0645zzn;
import com.google.android.gms.common.C0648zzq;
import com.google.android.gms.common.C0650zzs;
import com.google.android.gms.dynamic.C0661IObjectWrapper;
import com.google.android.gms.internal.common.C1107zza;
import com.google.android.gms.internal.common.C1109zzc;

/* renamed from: com.google.android.gms.common.internal.zzac */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0514zzac extends C1107zza implements C0516zzae {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0514zzac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean zze(C0650zzs zzs, C0661IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C1109zzc.zzd(zza, zzs);
        C1109zzc.zzf(zza, iObjectWrapper);
        Parcel zzB = zzB(5, zza);
        boolean zza2 = C1109zzc.zza(zzB);
        zzB.recycle();
        return zza2;
    }

    public final C0648zzq zzf(C0645zzn zzn) throws RemoteException {
        Parcel zza = zza();
        C1109zzc.zzd(zza, zzn);
        Parcel zzB = zzB(6, zza);
        C0648zzq zzq = (C0648zzq) C1109zzc.zzc(zzB, C0648zzq.CREATOR);
        zzB.recycle();
        return zzq;
    }

    public final boolean zzg() throws RemoteException {
        Parcel zzB = zzB(7, zza());
        boolean zza = C1109zzc.zza(zzB);
        zzB.recycle();
        return zza;
    }
}
