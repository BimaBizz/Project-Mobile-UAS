package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaa;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zabs extends zaa implements IStatusCallback {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zabs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
    }

    public final void onResult(Status status) throws RemoteException {
        Status status2 = status;
        throw null;
    }
}
