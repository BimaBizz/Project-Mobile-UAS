package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class zzbi extends zza implements zzbj {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbi() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 1:
                zza((ProxyResponse) zzd.zza(parcel3, ProxyResponse.CREATOR));
                break;
            case 2:
                zza(parcel3.readString());
                break;
            default:
                return false;
        }
        parcel4.writeNoException();
        return true;
    }
}
