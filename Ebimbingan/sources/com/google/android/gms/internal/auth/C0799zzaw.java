package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth.zzaw */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0799zzaw extends C0803zzb implements C0800zzax {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0799zzaw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
    }

    public final void zza(C0798zzav zzav, C0807zzbd zzbd) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        C0857zzd.zza(zza, (IInterface) zzav);
        C0857zzd.zza(parcel, (Parcelable) zzbd);
        zzb(5, parcel);
    }

    public final void zza(C0798zzav zzav, C0805zzbb zzbb) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        C0857zzd.zza(zza, (IInterface) zzav);
        C0857zzd.zza(parcel, (Parcelable) zzbb);
        zzb(6, parcel);
    }

    public final void zza(C0798zzav zzav, C0796zzat zzat) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        C0857zzd.zza(zza, (IInterface) zzav);
        C0857zzd.zza(parcel, (Parcelable) zzat);
        zzb(7, parcel);
    }

    public final void zza(C0798zzav zzav, C0809zzbf zzbf) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        C0857zzd.zza(zza, (IInterface) zzav);
        C0857zzd.zza(parcel, (Parcelable) zzbf);
        zzb(8, parcel);
    }

    public final void zza(C0798zzav zzav, C0802zzaz zzaz) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        C0857zzd.zza(zza, (IInterface) zzav);
        C0857zzd.zza(parcel, (Parcelable) zzaz);
        zzb(9, parcel);
    }
}
