package com.onesignal;

import android.content.Context;
import com.onesignal.OneSignal;

class DelayedConsentInitializationParameters {
    public String appId;
    public Context context;
    public String googleProjectNumber;
    public OneSignal.NotificationOpenedHandler openedHandler;
    public OneSignal.NotificationReceivedHandler receivedHandler;

    DelayedConsentInitializationParameters(Context delayContext, String delayGoogleProjectNumber, String delayAppId, OneSignal.NotificationOpenedHandler delayOpenedHandler, OneSignal.NotificationReceivedHandler delayReceivedHandler) {
        this.context = delayContext;
        this.googleProjectNumber = delayGoogleProjectNumber;
        this.appId = delayAppId;
        this.openedHandler = delayOpenedHandler;
        this.receivedHandler = delayReceivedHandler;
    }
}
