package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;

final class zzaa extends zzab {
    private final /* synthetic */ PendingIntent zzbx;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaa(zzq zzq, C0222GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        zzq zzq2 = zzq;
        this.zzbx = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        zzaj zzaj;
        new zzac(this);
        ((zzaz) anyClient).zza(this.zzbx, zzaj);
    }
}
