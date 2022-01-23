package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.C0012AccountChangeEventsRequest;
import com.google.android.gms.common.api.internal.C0250IStatusCallback;

/* renamed from: com.google.android.gms.internal.auth.zzr */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public interface C1082zzr extends IInterface {
    void zza(C0250IStatusCallback iStatusCallback, C0832zzcb zzcb) throws RemoteException;

    void zza(C1073zzl zzl, Account account) throws RemoteException;

    void zza(C1073zzl zzl, String str) throws RemoteException;

    void zza(C1078zzn zzn, C0012AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException;

    void zza(C1080zzp zzp, Account account, String str, Bundle bundle) throws RemoteException;
}
