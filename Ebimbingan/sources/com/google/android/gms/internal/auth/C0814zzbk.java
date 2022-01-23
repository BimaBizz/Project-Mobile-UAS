package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.C0117ProxyRequest;

/* renamed from: com.google.android.gms.internal.auth.zzbk */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0814zzbk extends C0803zzb implements C0815zzbl {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0814zzbk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zza(C0813zzbj zzbj, C0117ProxyRequest proxyRequest) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        C0857zzd.zza(zza, (IInterface) zzbj);
        C0857zzd.zza(parcel, (Parcelable) proxyRequest);
        zzb(1, parcel);
    }

    public final void zza(C0813zzbj zzbj) throws RemoteException {
        Parcel zza = zza();
        C0857zzd.zza(zza, (IInterface) zzbj);
        zzb(3, zza);
    }
}
