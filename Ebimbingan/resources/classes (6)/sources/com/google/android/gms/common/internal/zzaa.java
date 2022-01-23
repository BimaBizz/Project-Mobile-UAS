package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class zzaa extends zzb implements IGmsCallbacks {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaa() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 1:
                onPostInitComplete(parcel3.readInt(), parcel3.readStrongBinder(), (Bundle) zzc.zzc(parcel3, Bundle.CREATOR));
                break;
            case 2:
                zzb(parcel3.readInt(), (Bundle) zzc.zzc(parcel3, Bundle.CREATOR));
                break;
            case 3:
                zzc(parcel3.readInt(), parcel3.readStrongBinder(), (zzi) zzc.zzc(parcel3, zzi.CREATOR));
                break;
            default:
                return false;
        }
        parcel4.writeNoException();
        return true;
    }
}
