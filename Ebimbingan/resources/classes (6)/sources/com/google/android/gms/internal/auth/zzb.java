package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class zzb implements IInterface {
    private final IBinder zza;
    private final String zzb;

    protected zzb(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    public IBinder asBinder() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        Parcel parcel = obtain;
        obtain.writeInterfaceToken(this.zzb);
        return parcel;
    }

    /* access modifiers changed from: protected */
    public final Parcel zza(int i, Parcel parcel) throws RemoteException {
        int i2 = i;
        Parcel parcel2 = parcel;
        Parcel obtain = Parcel.obtain();
        try {
            boolean transact = this.zza.transact(i2, parcel2, obtain, 0);
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
    public final void zzb(int i, Parcel parcel) throws RemoteException {
        int i2 = i;
        Parcel parcel2 = parcel;
        Parcel obtain = Parcel.obtain();
        try {
            boolean transact = this.zza.transact(i2, parcel2, obtain, 0);
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
}
