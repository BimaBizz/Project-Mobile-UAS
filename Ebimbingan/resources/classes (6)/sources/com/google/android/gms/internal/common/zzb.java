package com.google.android.gms.internal.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class zzb extends Binder implements IInterface {
    protected zzb(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        int i3 = i;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i4 = i2;
        if (i3 <= 16777215) {
            parcel3.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i3, parcel3, parcel4, i4)) {
            return true;
        }
        return zza(i3, parcel3, parcel4, i4);
    }

    /* access modifiers changed from: protected */
    public boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        int i3 = i;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i4 = i2;
        return false;
    }
}
