package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

final class zzy extends zzab {
    private final /* synthetic */ PendingIntent zzbx;
    private final /* synthetic */ LocationRequest zzck;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzy(zzq zzq, C0222GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        zzq zzq2 = zzq;
        this.zzck = locationRequest;
        this.zzbx = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        zzaj zzaj;
        new zzac(this);
        ((zzaz) anyClient).zza(this.zzck, this.zzbx, zzaj);
    }
}
