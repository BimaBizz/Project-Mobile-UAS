package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0661IObjectWrapper;
import com.google.android.gms.internal.common.C1108zzb;
import com.google.android.gms.internal.common.C1109zzc;

/* renamed from: com.google.android.gms.common.internal.zzx */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C0544zzx extends C1108zzb implements C0545zzy {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0544zzx() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static C0545zzy zzg(IBinder iBinder) {
        C0545zzy zzy;
        IBinder iBinder2 = iBinder;
        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof C0545zzy) {
            return (C0545zzy) queryLocalInterface;
        }
        new C0543zzw(iBinder2);
        return zzy;
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 1:
                C0661IObjectWrapper zzd = zzd();
                parcel4.writeNoException();
                C1109zzc.zzf(parcel4, zzd);
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
