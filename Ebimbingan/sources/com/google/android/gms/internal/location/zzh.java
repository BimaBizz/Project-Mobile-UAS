package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.location.ActivityTransitionRequest;

final class zzh extends zzj {
    private final /* synthetic */ ActivityTransitionRequest zzby;
    private final /* synthetic */ PendingIntent zzbz;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzh(zze zze, C0222GoogleApiClient googleApiClient, ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        zze zze2 = zze;
        this.zzby = activityTransitionRequest;
        this.zzbz = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zza(this.zzby, this.zzbz, (C0243BaseImplementation.ResultHolder<C0236Status>) this);
    }
}
