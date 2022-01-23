package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.C0039DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.C0051zzl;
import com.google.android.gms.auth.api.accounttransfer.C0059zzt;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth.zzav */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public interface C0798zzav extends IInterface {
    void zza() throws RemoteException;

    void zza(C0039DeviceMetaData deviceMetaData) throws RemoteException;

    void zza(C0236Status status) throws RemoteException;

    void zza(C0236Status status, C0051zzl zzl) throws RemoteException;

    void zza(C0236Status status, C0059zzt zzt) throws RemoteException;

    void zza(byte[] bArr) throws RemoteException;

    void zzb(C0236Status status) throws RemoteException;
}
