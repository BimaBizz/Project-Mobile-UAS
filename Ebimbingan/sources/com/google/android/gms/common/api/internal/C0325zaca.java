package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.zaca */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class C0325zaca implements Runnable {
    private final C0256NonGmsServiceBrokerClient zaa;

    C0325zaca(C0256NonGmsServiceBrokerClient nonGmsServiceBrokerClient) {
        this.zaa = nonGmsServiceBrokerClient;
    }

    public final void run() {
        this.zaa.zab();
    }
}
