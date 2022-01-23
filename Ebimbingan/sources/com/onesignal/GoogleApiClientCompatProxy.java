package com.onesignal;

import com.google.android.gms.common.api.C0222GoogleApiClient;

class GoogleApiClientCompatProxy {
    private final C0222GoogleApiClient googleApiClient;
    private final Class googleApiClientListenerClass;

    GoogleApiClientCompatProxy(C0222GoogleApiClient googleApiClient2) {
        C0222GoogleApiClient googleApiClient3 = googleApiClient2;
        this.googleApiClient = googleApiClient3;
        this.googleApiClientListenerClass = googleApiClient3.getClass();
    }

    /* access modifiers changed from: package-private */
    public void connect() {
        try {
            Object invoke = this.googleApiClientListenerClass.getMethod("connect", new Class[0]).invoke(this.googleApiClient, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void disconnect() {
        try {
            Object invoke = this.googleApiClientListenerClass.getMethod("disconnect", new Class[0]).invoke(this.googleApiClient, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public C0222GoogleApiClient realInstance() {
        return this.googleApiClient;
    }
}
