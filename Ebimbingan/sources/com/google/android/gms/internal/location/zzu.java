package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0236Status;

final class zzu extends zzab {
    private final /* synthetic */ Location zzco;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzu(zzq zzq, C0222GoogleApiClient googleApiClient, Location location) {
        super(googleApiClient);
        zzq zzq2 = zzq;
        this.zzco = location;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zza(this.zzco);
        setResult(C0236Status.RESULT_SUCCESS);
    }
}
