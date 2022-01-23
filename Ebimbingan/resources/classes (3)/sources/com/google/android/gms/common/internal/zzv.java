package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzv extends zza implements ICancelToken {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    public final void cancel() throws RemoteException {
        zzC(2, zza());
    }
}
