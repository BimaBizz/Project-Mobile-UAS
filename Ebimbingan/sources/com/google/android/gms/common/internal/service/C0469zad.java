package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;

/* renamed from: com.google.android.gms.common.internal.service.zad */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0469zad extends C0466zaa {
    private final C0243BaseImplementation.ResultHolder<C0236Status> zaa;

    public C0469zad(C0243BaseImplementation.ResultHolder<C0236Status> resultHolder) {
        this.zaa = resultHolder;
    }

    public final void zab(int i) throws RemoteException {
        Object obj;
        C0243BaseImplementation.ResultHolder<C0236Status> resultHolder = this.zaa;
        new C0236Status(i);
        resultHolder.setResult(obj);
    }
}
