package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class zzx extends zzb implements zzy {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzx() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static zzy zzg(IBinder iBinder) {
        zzy zzy;
        IBinder iBinder2 = iBinder;
        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof zzy) {
            return (zzy) queryLocalInterface;
        }
        new zzw(iBinder2);
        return zzy;
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 1:
                IObjectWrapper zzd = zzd();
                parcel4.writeNoException();
                zzc.zzf(parcel4, zzd);
                break;
            case 2:
                int zze = zze();
                parcel4.writeNoException();
                parcel4.writeInt(zze);
                break;
            default:
                return false;
        }
        return true;
    }
}
