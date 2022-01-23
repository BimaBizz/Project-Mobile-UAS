package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzbk extends zzb implements zzbl {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zza(zzbj zzbj, ProxyRequest proxyRequest) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (IInterface) zzbj);
        zzd.zza(parcel, (Parcelable) proxyRequest);
        zzb(1, parcel);
    }

    public final void zza(zzbj zzbj) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, (IInterface) zzbj);
        zzb(3, zza);
    }
}
