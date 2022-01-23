package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzd;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zze extends zzb implements zzd {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    public final void zza(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, z);
        zzb(1, zza);
    }

    public final void zza(zzb zzb, String str) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (IInterface) zzb);
        parcel.writeString(str);
        zzb(2, parcel);
    }

    public final void zza(zzb zzb, Account account) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (IInterface) zzb);
        zzd.zza(parcel, (Parcelable) account);
        zzb(3, parcel);
    }
}
