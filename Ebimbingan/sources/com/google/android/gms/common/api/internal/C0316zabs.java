package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.internal.base.C1091zaa;

/* renamed from: com.google.android.gms.common.api.internal.zabs */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0316zabs extends C1091zaa implements C0250IStatusCallback {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0316zabs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
    }

    public final void onResult(C0236Status status) throws RemoteException {
        C0236Status status2 = status;
        throw null;
    }
}
