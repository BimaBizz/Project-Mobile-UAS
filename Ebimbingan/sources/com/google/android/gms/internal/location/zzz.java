package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.api.internal.C0255ListenerHolders;
import com.google.android.gms.location.LocationListener;

final class zzz extends zzab {
    private final /* synthetic */ LocationListener zzcl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzz(zzq zzq, C0222GoogleApiClient googleApiClient, LocationListener locationListener) {
        super(googleApiClient);
        zzq zzq2 = zzq;
        this.zzcl = locationListener;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        zzaj zzaj;
        C0254ListenerHolder.ListenerKey createListenerKey = C0255ListenerHolders.createListenerKey(this.zzcl, LocationListener.class.getSimpleName());
        new zzac(this);
        ((zzaz) anyClient).zza((C0254ListenerHolder.ListenerKey<LocationListener>) createListenerKey, zzaj);
    }
}
