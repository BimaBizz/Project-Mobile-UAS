package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.zzy;

final class zzax extends zzy {
    private final C0254ListenerHolder<LocationListener> zzda;

    zzax(C0254ListenerHolder<LocationListener> listenerHolder) {
        this.zzda = listenerHolder;
    }

    public final synchronized void onLocationChanged(Location location) {
        C0254ListenerHolder.Notifier notifier;
        Location location2 = location;
        synchronized (this) {
            new zzay(this, location2);
            this.zzda.notifyListener(notifier);
        }
    }

    public final synchronized void release() {
        synchronized (this) {
            this.zzda.clear();
        }
    }
}
