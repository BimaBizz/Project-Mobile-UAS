package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0236Status;

final class zzt extends zzab {
    private final /* synthetic */ boolean zzcn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzt(zzq zzq, C0222GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient);
        zzq zzq2 = zzq;
        this.zzcn = z;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zza(this.zzcn);
        setResult(C0236Status.RESULT_SUCCESS);
    }
}
