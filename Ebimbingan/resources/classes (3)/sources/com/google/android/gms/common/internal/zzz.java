package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzz extends zza implements IGmsCallbacks {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        zzc.zzd(zza, bundle);
        zzD(1, zza);
    }

    public final void zzb(int i, Bundle bundle) throws RemoteException {
        int i2 = i;
        Bundle bundle2 = bundle;
        throw null;
    }

    public final void zzc(int i, IBinder iBinder, zzi zzi) throws RemoteException {
        int i2 = i;
        IBinder iBinder2 = iBinder;
        zzi zzi2 = zzi;
        throw null;
    }
}
