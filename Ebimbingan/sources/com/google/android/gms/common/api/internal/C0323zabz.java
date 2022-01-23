package com.google.android.gms.common.api.internal;

import android.os.IBinder;

/* renamed from: com.google.android.gms.common.api.internal.zabz */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class C0323zabz implements Runnable {
    private final C0256NonGmsServiceBrokerClient zaa;
    private final IBinder zab;

    C0323zabz(C0256NonGmsServiceBrokerClient nonGmsServiceBrokerClient, IBinder iBinder) {
        this.zaa = nonGmsServiceBrokerClient;
        this.zab = iBinder;
    }

    public final void run() {
        this.zaa.zac(this.zab);
    }
}
