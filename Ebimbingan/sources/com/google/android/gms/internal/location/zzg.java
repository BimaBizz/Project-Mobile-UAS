package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0236Status;

final class zzg extends zzj {
    private final /* synthetic */ PendingIntent zzbx;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzg(zze zze, C0222GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        zze zze2 = zze;
        this.zzbx = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zzb(this.zzbx);
        setResult(C0236Status.RESULT_SUCCESS);
    }
}
