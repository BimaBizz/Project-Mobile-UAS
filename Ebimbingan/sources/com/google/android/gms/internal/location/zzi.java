package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;

final class zzi extends zzj {
    private final /* synthetic */ PendingIntent zzbz;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzi(zze zze, C0222GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        zze zze2 = zze;
        this.zzbz = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zza(this.zzbz, (C0243BaseImplementation.ResultHolder<C0236Status>) this);
    }
}
