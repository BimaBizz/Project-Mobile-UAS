package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.api.internal.C0255ListenerHolders;
import com.google.android.gms.location.LocationCallback;

final class zzs extends zzab {
    private final /* synthetic */ LocationCallback zzcm;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzs(zzq zzq, C0222GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        super(googleApiClient);
        zzq zzq2 = zzq;
        this.zzcm = locationCallback;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        zzaj zzaj;
        C0254ListenerHolder.ListenerKey createListenerKey = C0255ListenerHolders.createListenerKey(this.zzcm, LocationCallback.class.getSimpleName());
        new zzac(this);
        ((zzaz) anyClient).zzb(createListenerKey, zzaj);
    }
}
