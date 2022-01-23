package com.google.android.gms.internal.p001authapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth-api.zzc  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C0752zzc extends Binder implements IInterface {
    private static C0754zze zzc = null;

    protected C0752zzc(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        int i3 = i;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i4 = i2;
        Parcel parcel5 = parcel4;
        Parcel parcel6 = parcel3;
        if (i3 > 16777215) {
            z = super.onTransact(i3, parcel6, parcel5, i4);
        } else {
            parcel6.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return zzc(i3, parcel3, parcel4, i4);
    }

    /* access modifiers changed from: protected */
    public boolean zzc(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        int i3 = i;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i4 = i2;
        return false;
    }
}
