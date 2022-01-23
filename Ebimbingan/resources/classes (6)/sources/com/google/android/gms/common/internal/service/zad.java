package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zad extends zaa {
    private final BaseImplementation.ResultHolder<Status> zaa;

    public zad(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zaa = resultHolder;
    }

    public final void zab(int i) throws RemoteException {
        Object obj;
        BaseImplementation.ResultHolder<Status> resultHolder = this.zaa;
        new Status(i);
        resultHolder.setResult(obj);
    }
}
