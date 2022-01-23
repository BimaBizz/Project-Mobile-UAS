package com.google.android.gms.location;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzl extends C0267TaskApiCall<zzaz, Location> {
    zzl(FusedLocationProviderClient fusedLocationProviderClient) {
        FusedLocationProviderClient fusedLocationProviderClient2 = fusedLocationProviderClient;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(((zzaz) anyClient).getLastLocation());
    }
}
