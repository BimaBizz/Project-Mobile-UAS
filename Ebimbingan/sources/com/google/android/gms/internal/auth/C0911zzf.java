package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.C0012AccountChangeEventsRequest;
import com.google.android.gms.auth.C0013AccountChangeEventsResponse;

/* renamed from: com.google.android.gms.internal.auth.zzf */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public interface C0911zzf extends IInterface {
    Bundle zza(Account account) throws RemoteException;

    Bundle zza(Account account, String str, Bundle bundle) throws RemoteException;

    Bundle zza(String str) throws RemoteException;

    Bundle zza(String str, Bundle bundle) throws RemoteException;

    C0013AccountChangeEventsResponse zza(C0012AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException;
}
