package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class zzab implements IGmsServiceBroker {
    private final IBinder zza;

    zzab(IBinder iBinder) {
        this.zza = iBinder;
    }

    public final IBinder asBinder() {
        return this.zza;
    }

    public final void getService(IGmsCallbacks iGmsCallbacks, @Nullable GetServiceRequest getServiceRequest) throws RemoteException {
        IBinder iBinder;
        IGmsCallbacks iGmsCallbacks2 = iGmsCallbacks;
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (iGmsCallbacks2 != null) {
                iBinder = iGmsCallbacks2.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (getServiceRequest2 != null) {
                obtain.writeInt(1);
                zzl.zza(getServiceRequest2, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            boolean transact = this.zza.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            Throwable th2 = th;
            obtain2.recycle();
            obtain.recycle();
            throw th2;
        }
    }
}
