package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.C0012AccountChangeEventsRequest;
import com.google.android.gms.common.api.internal.C0250IStatusCallback;

/* renamed from: com.google.android.gms.internal.auth.zzq */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C1081zzq extends C0803zzb implements C1082zzr {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1081zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void zza(C1080zzp zzp, Account account, String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        C0857zzd.zza(zza, (IInterface) zzp);
        C0857zzd.zza(parcel, (Parcelable) account);
        parcel.writeString(str);
        C0857zzd.zza(parcel, (Parcelable) bundle);
        zzb(1, parcel);
    }

    public final void zza(C0250IStatusCallback iStatusCallback, C0832zzcb zzcb) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        C0857zzd.zza(zza, (IInterface) iStatusCallback);
        C0857zzd.zza(parcel, (Parcelable) zzcb);
        zzb(2, parcel);
    }

    public final void zza(C1073zzl zzl, String str) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        C0857zzd.zza(zza, (IInterface) zzl);
        parcel.writeString(str);
        zzb(3, parcel);
    }

    public final void zza(C1078zzn zzn, C0012AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        C0857zzd.zza(zza, (IInterface) zzn);
        C0857zzd.zza(parcel, (Parcelable) accountChangeEventsRequest);
        zzb(4, parcel);
    }

    public final void zza(C1073zzl zzl, Account account) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        C0857zzd.zza(zza, (IInterface) zzl);
        C0857zzd.zza(parcel, (Parcelable) account);
        zzb(6, parcel);
    }
}
