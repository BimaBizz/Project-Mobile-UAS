package com.google.android.gms.internal.p001authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.C0083BeginSignInRequest;
import com.google.android.gms.auth.api.identity.C0086GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.C0250IStatusCallback;

/* renamed from: com.google.android.gms.internal.auth-api.zzai  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public interface C0733zzai extends IInterface {
    void zzc(C0250IStatusCallback iStatusCallback, String str) throws RemoteException;

    void zzc(C0725zzaa zzaa, C0083BeginSignInRequest beginSignInRequest) throws RemoteException;

    void zzc(C0729zzae zzae, C0086GetSignInIntentRequest getSignInIntentRequest) throws RemoteException;
}
