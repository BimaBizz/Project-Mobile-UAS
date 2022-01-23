package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.api.internal.C0269UnregisterListenerMethod;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzo extends C0269UnregisterListenerMethod<zzaz, LocationCallback> {
    private final /* synthetic */ FusedLocationProviderClient zzaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzo(FusedLocationProviderClient fusedLocationProviderClient, C0254ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.zzaa = fusedLocationProviderClient;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void unregisterListener(C0211Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
        try {
            ((zzaz) anyClient).zzb(getListenerKey(), this.zzaa.zza(taskCompletionSource2));
        } catch (RuntimeException e) {
            boolean trySetException = taskCompletionSource2.trySetException(e);
        }
    }
}
