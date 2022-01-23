package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.location.zzal;

final class zzah extends zzai {
    private final /* synthetic */ zzal zzct;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzah(zzaf zzaf, C0222GoogleApiClient googleApiClient, zzal zzal) {
        super(googleApiClient);
        zzaf zzaf2 = zzaf;
        this.zzct = zzal;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zza(this.zzct, (C0243BaseImplementation.ResultHolder<C0236Status>) this);
    }
}
