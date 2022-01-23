package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gcm.zzd;
import com.google.android.gms.internal.gcm.zze;

public final class zzm extends zzd implements zzl {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    public final void send(Message message) throws RemoteException {
        Parcel zzd = zzd();
        zze.zzd(zzd, message);
        zze(1, zzd);
    }
}
