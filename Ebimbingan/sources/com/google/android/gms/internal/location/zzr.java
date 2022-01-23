package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.api.internal.C0255ListenerHolders;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

final class zzr extends zzab {
    private final /* synthetic */ LocationRequest zzck;
    private final /* synthetic */ LocationListener zzcl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzr(zzq zzq, C0222GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        super(googleApiClient);
        zzq zzq2 = zzq;
        this.zzck = locationRequest;
        this.zzcl = locationListener;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        zzaj zzaj;
        new zzac(this);
        ((zzaz) anyClient).zza(this.zzck, (C0254ListenerHolder<LocationListener>) C0255ListenerHolders.createListenerHolder(this.zzcl, zzbm.zzc(), LocationListener.class.getSimpleName()), zzaj);
    }
}
