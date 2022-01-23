package com.google.android.gms.internal.p001authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.C0062Credential;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzv  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public interface C0771zzv extends IInterface {
    void zzc(C0236Status status, C0062Credential credential) throws RemoteException;

    void zzc(C0236Status status, String str) throws RemoteException;

    void zzd(C0236Status status) throws RemoteException;
}
