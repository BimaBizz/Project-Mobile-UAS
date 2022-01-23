package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.C0012AccountChangeEventsRequest;
import com.google.android.gms.auth.C0013AccountChangeEventsResponse;

/* renamed from: com.google.android.gms.internal.auth.zzg */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0938zzg extends C0803zzb implements C0911zzf {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0938zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    public final Bundle zza(String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        C0857zzd.zza(parcel, (Parcelable) bundle);
        Parcel zza2 = zza(2, parcel);
        Bundle bundle2 = (Bundle) C0857zzd.zza(zza2, Bundle.CREATOR);
        zza2.recycle();
        return bundle2;
    }

    public final C0013AccountChangeEventsResponse zza(C0012AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
        Parcel zza = zza();
        C0857zzd.zza(zza, (Parcelable) accountChangeEventsRequest);
        Parcel zza2 = zza(3, zza);
        C0013AccountChangeEventsResponse accountChangeEventsResponse = (C0013AccountChangeEventsResponse) C0857zzd.zza(zza2, C0013AccountChangeEventsResponse.CREATOR);
        zza2.recycle();
        return accountChangeEventsResponse;
    }

    public final Bundle zza(Account account, String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        C0857zzd.zza(zza, (Parcelable) account);
        parcel.writeString(str);
        C0857zzd.zza(parcel, (Parcelable) bundle);
        Parcel zza2 = zza(5, parcel);
        Bundle bundle2 = (Bundle) C0857zzd.zza(zza2, Bundle.CREATOR);
        zza2.recycle();
        return bundle2;
    }

    public final Bundle zza(Account account) throws RemoteException {
        Parcel zza = zza();
        C0857zzd.zza(zza, (Parcelable) account);
        Parcel zza2 = zza(7, zza);
        Bundle bundle = (Bundle) C0857zzd.zza(zza2, Bundle.CREATOR);
        zza2.recycle();
        return bundle;
    }

    public final Bundle zza(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zza2 = zza(8, zza);
        Bundle bundle = (Bundle) C0857zzd.zza(zza2, Bundle.CREATOR);
        zza2.recycle();
        return bundle;
    }
}
