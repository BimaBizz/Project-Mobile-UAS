package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public interface zzav extends IInterface {
    void zza() throws RemoteException;

    void zza(DeviceMetaData deviceMetaData) throws RemoteException;

    void zza(Status status) throws RemoteException;

    void zza(Status status, zzl zzl) throws RemoteException;

    void zza(Status status, zzt zzt) throws RemoteException;

    void zza(byte[] bArr) throws RemoteException;

    void zzb(Status status) throws RemoteException;
}
