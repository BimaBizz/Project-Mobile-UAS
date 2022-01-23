package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.common.zza */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C1107zza implements IInterface {
    private final IBinder zza;
    private final String zzb;

    protected C1107zza(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    public final IBinder asBinder() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final Parcel zzB(int i, Parcel parcel) throws RemoteException {
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
    public final void zzC(int i, Parcel parcel) throws RemoteException {
        int i2 = i;
        Parcel parcel2 = parcel;
        try {
            boolean transact = this.zza.transact(2, parcel2, (Parcel) null, 1);
            parcel2.recycle();
        } catch (Throwable th) {
            Throwable th2 = th;
            parcel2.recycle();
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzD(int i, Parcel parcel) throws RemoteException {
        int i2 = i;
        Parcel parcel2 = parcel;
        Parcel obtain = Parcel.obtain();
        try {
            boolean transact = this.zza.transact(1, parcel2, obtain, 0);
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
    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }
}
