package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.zzab */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0513zzab implements C0440IGmsServiceBroker {
    private final IBinder zza;

    C0513zzab(IBinder iBinder) {
        this.zza = iBinder;
    }

    public final IBinder asBinder() {
        return this.zza;
    }

    public final void getService(C0439IGmsCallbacks iGmsCallbacks, @Nullable C0432GetServiceRequest getServiceRequest) throws RemoteException {
        IBinder iBinder;
        C0439IGmsCallbacks iGmsCallbacks2 = iGmsCallbacks;
        C0432GetServiceRequest getServiceRequest2 = getServiceRequest;
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
                C0532zzl.zza(getServiceRequest2, obtain, 0);
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
