package com.google.android.gms.internal.p000authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzk  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class zzk extends zzb implements zzh {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zza(zzj zzj) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, (IInterface) zzj);
        zza(1, zza);
    }

    public final void zza(String str, zzj zzj) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (IInterface) zzj);
        zza(2, parcel);
    }

    public final void zza(IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, (IInterface) iStatusCallback);
        zza(3, zza);
    }

    public final void zza(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, (IInterface) zze);
        zza(4, zza);
    }

    public final void zza(String str, zzf zzf) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (IInterface) zzf);
        zza(5, parcel);
    }

    public final void zzb(IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, (IInterface) iStatusCallback);
        zza(6, zza);
    }
}
