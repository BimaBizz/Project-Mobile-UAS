package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.api.internal.C0260RegisterListenerMethod;
import com.google.android.gms.internal.location.zzaj;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzn extends C0260RegisterListenerMethod<zzaz, LocationCallback> {
    private final /* synthetic */ zzbd zzy;
    private final /* synthetic */ C0254ListenerHolder zzz;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzn(FusedLocationProviderClient fusedLocationProviderClient, C0254ListenerHolder listenerHolder, zzbd zzbd, C0254ListenerHolder listenerHolder2) {
        super(listenerHolder);
        FusedLocationProviderClient fusedLocationProviderClient2 = fusedLocationProviderClient;
        this.zzy = zzbd;
        this.zzz = listenerHolder2;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void registerListener(C0211Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzaj zzaj;
        new FusedLocationProviderClient.zza(taskCompletionSource);
        ((zzaz) anyClient).zza(this.zzy, (C0254ListenerHolder<LocationCallback>) this.zzz, zzaj);
    }
}
