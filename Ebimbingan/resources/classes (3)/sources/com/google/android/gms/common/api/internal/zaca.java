package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class zaca implements Runnable {
    private final NonGmsServiceBrokerClient zaa;

    zaca(NonGmsServiceBrokerClient nonGmsServiceBrokerClient) {
        this.zaa = nonGmsServiceBrokerClient;
    }

    public final void run() {
        this.zaa.zab();
    }
}
