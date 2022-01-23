package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzg extends zzb implements zzf {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    public final Bundle zza(String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzd.zza(parcel, (Parcelable) bundle);
        Parcel zza2 = zza(2, parcel);
        Bundle bundle2 = (Bundle) zzd.zza(zza2, Bundle.CREATOR);
        zza2.recycle();
        return bundle2;
    }

    public final AccountChangeEventsResponse zza(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, (Parcelable) accountChangeEventsRequest);
        Parcel zza2 = zza(3, zza);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) zzd.zza(zza2, AccountChangeEventsResponse.CREATOR);
        zza2.recycle();
        return accountChangeEventsResponse;
    }

    public final Bundle zza(Account account, String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zzd.zza(zza, (Parcelable) account);
        parcel.writeString(str);
        zzd.zza(parcel, (Parcelable) bundle);
        Parcel zza2 = zza(5, parcel);
        Bundle bundle2 = (Bundle) zzd.zza(zza2, Bundle.CREATOR);
        zza2.recycle();
        return bundle2;
    }

    public final Bundle zza(Account account) throws RemoteException {
        Parcel zza = zza();
        zzd.zza(zza, (Parcelable) account);
        Parcel zza2 = zza(7, zza);
        Bundle bundle = (Bundle) zzd.zza(zza2, Bundle.CREATOR);
        zza2.recycle();
        return bundle;
    }

    public final Bundle zza(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zza2 = zza(8, zza);
        Bundle bundle = (Bundle) zzd.zza(zza2, Bundle.CREATOR);
        zza2.recycle();
        return bundle;
    }
}
