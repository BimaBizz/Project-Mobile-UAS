package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzo extends zzc {
    private final /* synthetic */ zzl zzcp;

    zzo(zzl zzl) {
        this.zzcp = zzl;
    }

    public final void zzf(Status status) throws RemoteException {
        this.zzcp.setResult(status);
    }
}
