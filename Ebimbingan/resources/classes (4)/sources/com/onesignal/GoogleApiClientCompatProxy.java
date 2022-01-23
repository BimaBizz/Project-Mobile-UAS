package com.onesignal;

import com.google.android.gms.common.api.GoogleApiClient;

class GoogleApiClientCompatProxy {
    private final GoogleApiClient googleApiClient;
    private final Class googleApiClientListenerClass;

    GoogleApiClientCompatProxy(GoogleApiClient googleApiClient2) {
        GoogleApiClient googleApiClient3 = googleApiClient2;
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
    public GoogleApiClient realInstance() {
        return this.googleApiClient;
    }
}
