package com.onesignal;

import com.google.android.gms.gcm.GoogleCloudMessaging;

class PushRegistratorGCM extends PushRegistratorAbstractGoogle {
    PushRegistratorGCM() {
    }

    /* access modifiers changed from: package-private */
    public String getProviderName() {
        return "GCM";
    }

    /* access modifiers changed from: package-private */
    public String getToken(String senderId) throws Throwable {
        return GoogleCloudMessaging.getInstance(OneSignal.appContext).register(senderId);
    }
}
