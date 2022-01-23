package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.location.LocationListener;

final class zzay implements C0254ListenerHolder.Notifier<LocationListener> {
    private final /* synthetic */ Location zzdd;

    zzay(zzax zzax, Location location) {
        zzax zzax2 = zzax;
        this.zzdd = location;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationListener) obj).onLocationChanged(this.zzdd);
    }

    public final void onNotifyListenerFailed() {
    }
}
