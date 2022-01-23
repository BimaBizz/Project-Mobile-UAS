package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

final class zzau implements C0254ListenerHolder.Notifier<LocationCallback> {
    private final /* synthetic */ LocationResult zzdb;

    zzau(zzat zzat, LocationResult locationResult) {
        zzat zzat2 = zzat;
        this.zzdb = locationResult;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationCallback) obj).onLocationResult(this.zzdb);
    }

    public final void onNotifyListenerFailed() {
    }
}
