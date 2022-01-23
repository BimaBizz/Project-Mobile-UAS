package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzo */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0149zzo extends C0137zzc {
    private final /* synthetic */ C0146zzl zzcp;

    C0149zzo(C0146zzl zzl) {
        this.zzcp = zzl;
    }

    public final void zzf(C0236Status status) throws RemoteException {
        this.zzcp.setResult(status);
    }
}
