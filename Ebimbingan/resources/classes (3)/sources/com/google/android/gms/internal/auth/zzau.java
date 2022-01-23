package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class zzau extends zza implements zzav {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzau() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 1:
                zzb((Status) zzd.zza(parcel3, Status.CREATOR));
                break;
            case 2:
                zza((Status) zzd.zza(parcel3, Status.CREATOR), (zzt) zzd.zza(parcel3, zzt.CREATOR));
                break;
            case 3:
                zza((Status) zzd.zza(parcel3, Status.CREATOR), (zzl) zzd.zza(parcel3, zzl.CREATOR));
                break;
            case 4:
                zza();
                break;
            case 5:
                zza((Status) zzd.zza(parcel3, Status.CREATOR));
                break;
            case 6:
                zza(parcel3.createByteArray());
                break;
            case 7:
                zza((DeviceMetaData) zzd.zza(parcel3, DeviceMetaData.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
