package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzq extends zzb implements zzr {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void zza(zzp zzp, Account account, String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (IInterface) zzp);
        zzd.zza(parcel, (Parcelable) account);
        parcel.writeString(str);
        zzd.zza(parcel, (Parcelable) bundle);
        zzb(1, parcel);
    }

    public final void zza(IStatusCallback iStatusCallback, zzcb zzcb) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (IInterface) iStatusCallback);
        zzd.zza(parcel, (Parcelable) zzcb);
        zzb(2, parcel);
    }

    public final void zza(zzl zzl, String str) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (IInterface) zzl);
        parcel.writeString(str);
        zzb(3, parcel);
    }

    public final void zza(zzn zzn, AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (IInterface) zzn);
        zzd.zza(parcel, (Parcelable) accountChangeEventsRequest);
        zzb(4, parcel);
    }

    public final void zza(zzl zzl, Account account) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (IInterface) zzl);
        zzd.zza(parcel, (Parcelable) account);
        zzb(6, parcel);
    }
}
