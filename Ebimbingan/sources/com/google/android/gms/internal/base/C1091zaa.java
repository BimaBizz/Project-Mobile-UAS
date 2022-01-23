package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.base.zaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C1091zaa implements IInterface {
    private final IBinder zaa;
    private final String zab;

    protected C1091zaa(IBinder iBinder, String str) {
        this.zaa = iBinder;
        this.zab = str;
    }

    public final IBinder asBinder() {
        return this.zaa;
    }

    /* access modifiers changed from: protected */
    public final Parcel zaa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zab);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel zab(int i, Parcel parcel) throws RemoteException {
        int i2 = i;
        Parcel parcel2 = parcel;
        Parcel obtain = Parcel.obtain();
        try {
            boolean transact = this.zaa.transact(2, parcel2, obtain, 0);
            obtain.readException();
            parcel2.recycle();
            return obtain;
        } catch (RuntimeException e) {
            RuntimeException runtimeException = e;
            obtain.recycle();
            throw runtimeException;
        } catch (Throwable th) {
            Throwable th2 = th;
            parcel2.recycle();
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public final void zac(int i, Parcel parcel) throws RemoteException {
        int i2 = i;
        Parcel parcel2 = parcel;
        Parcel obtain = Parcel.obtain();
        try {
            boolean transact = this.zaa.transact(i2, parcel2, obtain, 0);
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
    public final void zad(int i, Parcel parcel) throws RemoteException {
        int i2 = i;
        Parcel parcel2 = parcel;
        try {
            boolean transact = this.zaa.transact(1, parcel2, (Parcel) null, 1);
            parcel2.recycle();
        } catch (Throwable th) {
            Throwable th2 = th;
            parcel2.recycle();
            throw th2;
        }
    }
}
