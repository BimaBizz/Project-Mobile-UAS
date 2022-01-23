package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class zzm extends zza implements zzn {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzm() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        if (i != 2) {
            return false;
        }
        zza((Status) zzd.zza(parcel3, Status.CREATOR), (AccountChangeEventsResponse) zzd.zza(parcel3, AccountChangeEventsResponse.CREATOR));
        return true;
    }
}
