package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzm */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0147zzm extends C0137zzc {
    private final /* synthetic */ C0144zzj zzco;

    C0147zzm(C0144zzj zzj) {
        this.zzco = zzj;
    }

    public final void zze(C0236Status status) throws RemoteException {
        this.zzco.setResult(status);
    }
}
