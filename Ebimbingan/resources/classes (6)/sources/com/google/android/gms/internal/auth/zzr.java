package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public interface zzr extends IInterface {
    void zza(IStatusCallback iStatusCallback, zzcb zzcb) throws RemoteException;

    void zza(zzl zzl, Account account) throws RemoteException;

    void zza(zzl zzl, String str) throws RemoteException;

    void zza(zzn zzn, AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException;

    void zza(zzp zzp, Account account, String str, Bundle bundle) throws RemoteException;
}
