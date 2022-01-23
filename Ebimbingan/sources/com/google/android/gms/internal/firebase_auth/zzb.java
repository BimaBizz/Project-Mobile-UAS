package com.google.android.gms.internal.firebase_auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzb implements IInterface {
    private final IBinder zzb;
    private final String zzc;

    protected zzb(IBinder iBinder, String str) {
        this.zzb = iBinder;
        this.zzc = str;
    }

    public IBinder asBinder() {
        return this.zzb;
    }

    /* access modifiers changed from: protected */
    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        Parcel parcel = obtain;
        obtain.writeInterfaceToken(this.zzc);
        return parcel;
    }

    /* access modifiers changed from: protected */
    public final void zza(int i, Parcel parcel) throws RemoteException {
        int i2 = i;
        Parcel parcel2 = parcel;
        Parcel obtain = Parcel.obtain();
        try {
            boolean transact = this.zzb.transact(i2, parcel2, obtain, 0);
            obtain.readException();
            parcel2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            Throwable th2 = th;
            parcel2.recycle();
            obtain.recycle();
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzb(int i, Parcel parcel) throws RemoteException {
        Parcel parcel2 = parcel;
        try {
            boolean transact = this.zzb.transact(i, parcel2, (Parcel) null, 1);
            parcel2.recycle();
        } catch (Throwable th) {
            Throwable th2 = th;
            parcel2.recycle();
            throw th2;
        }
    }
}
