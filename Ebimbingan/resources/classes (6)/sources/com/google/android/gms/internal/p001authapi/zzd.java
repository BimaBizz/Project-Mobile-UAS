package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth-api.zzd  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class zzd implements IInterface {
    private final IBinder zzd;
    private final String zze;

    protected zzd(IBinder iBinder, String str) {
        this.zzd = iBinder;
        this.zze = str;
    }

    public IBinder asBinder() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Parcel zzc() {
        Parcel obtain = Parcel.obtain();
        Parcel parcel = obtain;
        obtain.writeInterfaceToken(this.zze);
        return parcel;
    }

    /* access modifiers changed from: protected */
    public final void zzc(int i, Parcel parcel) throws RemoteException {
        int i2 = i;
        Parcel parcel2 = parcel;
        Parcel obtain = Parcel.obtain();
        try {
            boolean transact = this.zzd.transact(i2, parcel2, obtain, 0);
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
