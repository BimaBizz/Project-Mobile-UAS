package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.api.internal.C0255ListenerHolders;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

final class zzw extends zzab {
    private final /* synthetic */ LocationRequest zzck;
    private final /* synthetic */ LocationListener zzcl;
    private final /* synthetic */ Looper zzcp;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzw(zzq zzq, C0222GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        super(googleApiClient);
        zzq zzq2 = zzq;
        this.zzck = locationRequest;
        this.zzcl = locationListener;
        this.zzcp = looper;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        zzaj zzaj;
        new zzac(this);
        ((zzaz) anyClient).zza(this.zzck, (C0254ListenerHolder<LocationListener>) C0255ListenerHolders.createListenerHolder(this.zzcl, zzbm.zza(this.zzcp), LocationListener.class.getSimpleName()), zzaj);
    }
}
