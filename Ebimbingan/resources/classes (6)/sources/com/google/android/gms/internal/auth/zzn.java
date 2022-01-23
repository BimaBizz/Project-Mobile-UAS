package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public interface zzn extends IInterface {
    void zza(Status status, AccountChangeEventsResponse accountChangeEventsResponse) throws RemoteException;
}
