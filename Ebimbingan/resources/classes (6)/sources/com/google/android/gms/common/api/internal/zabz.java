package com.google.android.gms.common.api.internal;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class zabz implements Runnable {
    private final NonGmsServiceBrokerClient zaa;
    private final IBinder zab;

    zabz(NonGmsServiceBrokerClient nonGmsServiceBrokerClient, IBinder iBinder) {
        this.zaa = nonGmsServiceBrokerClient;
        this.zab = iBinder;
    }

    public final void run() {
        this.zaa.zac(this.zab);
    }
}
