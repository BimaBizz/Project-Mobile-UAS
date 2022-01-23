package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.C0039DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.C0051zzl;
import com.google.android.gms.auth.api.accounttransfer.C0059zzt;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth.zzau */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0797zzau extends C0776zza implements C0798zzav {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0797zzau() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 1:
                zzb((C0236Status) C0857zzd.zza(parcel3, C0236Status.CREATOR));
                break;
            case 2:
                zza((C0236Status) C0857zzd.zza(parcel3, C0236Status.CREATOR), (C0059zzt) C0857zzd.zza(parcel3, C0059zzt.CREATOR));
                break;
            case 3:
                zza((C0236Status) C0857zzd.zza(parcel3, C0236Status.CREATOR), (C0051zzl) C0857zzd.zza(parcel3, C0051zzl.CREATOR));
                break;
            case 4:
                zza();
                break;
            case 5:
                zza((C0236Status) C0857zzd.zza(parcel3, C0236Status.CREATOR));
                break;
            case 6:
                zza(parcel3.createByteArray());
                break;
            case 7:
                zza((C0039DeviceMetaData) C0857zzd.zza(parcel3, C0039DeviceMetaData.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
