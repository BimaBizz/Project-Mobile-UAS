package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C1108zzb;
import com.google.android.gms.internal.common.C1109zzc;

/* renamed from: com.google.android.gms.common.internal.zzaa */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C0512zzaa extends C1108zzb implements C0439IGmsCallbacks {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0512zzaa() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 1:
                onPostInitComplete(parcel3.readInt(), parcel3.readStrongBinder(), (Bundle) C1109zzc.zzc(parcel3, Bundle.CREATOR));
                break;
            case 2:
                zzb(parcel3.readInt(), (Bundle) C1109zzc.zzc(parcel3, Bundle.CREATOR));
                break;
            case 3:
                zzc(parcel3.readInt(), parcel3.readStrongBinder(), (C0529zzi) C1109zzc.zzc(parcel3, C0529zzi.CREATOR));
                break;
            default:
                return false;
        }
        parcel4.writeNoException();
        return true;
    }
}
