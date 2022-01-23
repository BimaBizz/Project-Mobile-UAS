package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzr */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public interface C0152zzr extends IInterface {
    void zzc(C0122GoogleSignInAccount googleSignInAccount, C0236Status status) throws RemoteException;

    void zze(C0236Status status) throws RemoteException;

    void zzf(C0236Status status) throws RemoteException;
}
