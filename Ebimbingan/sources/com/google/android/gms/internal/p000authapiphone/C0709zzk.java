package com.google.android.gms.internal.p000authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C0250IStatusCallback;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzk  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
public final class C0709zzk extends C0700zzb implements C0706zzh {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0709zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zza(C0708zzj zzj) throws RemoteException {
        Parcel zza = zza();
        C0702zzd.zza(zza, (IInterface) zzj);
        zza(1, zza);
    }

    public final void zza(String str, C0708zzj zzj) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        C0702zzd.zza(parcel, (IInterface) zzj);
        zza(2, parcel);
    }

    public final void zza(C0250IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        C0702zzd.zza(zza, (IInterface) iStatusCallback);
        zza(3, zza);
    }

    public final void zza(C0703zze zze) throws RemoteException {
        Parcel zza = zza();
        C0702zzd.zza(zza, (IInterface) zze);
        zza(4, zza);
    }

    public final void zza(String str, C0704zzf zzf) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        C0702zzd.zza(parcel, (IInterface) zzf);
        zza(5, parcel);
    }

    public final void zzb(C0250IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        C0702zzd.zza(zza, (IInterface) iStatusCallback);
        zza(6, zza);
    }
}
