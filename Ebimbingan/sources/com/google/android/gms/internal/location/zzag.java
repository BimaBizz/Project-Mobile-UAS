package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.location.GeofencingRequest;

final class zzag extends zzai {
    private final /* synthetic */ PendingIntent zzbz;
    private final /* synthetic */ GeofencingRequest zzcs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzag(zzaf zzaf, C0222GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        zzaf zzaf2 = zzaf;
        this.zzcs = geofencingRequest;
        this.zzbz = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zza(this.zzcs, this.zzbz, (C0243BaseImplementation.ResultHolder<C0236Status>) this);
    }
}
