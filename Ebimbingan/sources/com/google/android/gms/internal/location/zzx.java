package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.api.internal.C0255ListenerHolders;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;

final class zzx extends zzab {
    private final /* synthetic */ LocationRequest zzck;
    private final /* synthetic */ LocationCallback zzcm;
    private final /* synthetic */ Looper zzcp;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzx(zzq zzq, C0222GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        super(googleApiClient);
        zzq zzq2 = zzq;
        this.zzck = locationRequest;
        this.zzcm = locationCallback;
        this.zzcp = looper;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        zzaj zzaj;
        new zzac(this);
        ((zzaz) anyClient).zza(zzbd.zza(this.zzck), (C0254ListenerHolder<LocationCallback>) C0255ListenerHolders.createListenerHolder(this.zzcm, zzbm.zza(this.zzcp), LocationCallback.class.getSimpleName()), zzaj);
    }
}
