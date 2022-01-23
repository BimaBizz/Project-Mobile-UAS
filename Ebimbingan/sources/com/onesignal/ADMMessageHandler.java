package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.amazon.device.messaging.ADMMessageReceiver;
import com.onesignal.OneSignal;

public class ADMMessageHandler extends ADMMessageHandlerBase {

    public static class Receiver extends ADMMessageReceiver {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Receiver() {
            super(ADMMessageHandler.class);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    /* access modifiers changed from: protected */
    public void onMessage(Intent intent) {
        NotificationGenerationJob notificationGenerationJob;
        Context context = getApplicationContext();
        Bundle bundle = intent.getExtras();
        if (!NotificationBundleProcessor.processBundleFromReceiver(context, bundle).processed()) {
            new NotificationGenerationJob(context);
            NotificationGenerationJob notifJob = notificationGenerationJob;
            notifJob.jsonPayload = NotificationBundleProcessor.bundleAsJSONObject(bundle);
            int ProcessJobForDisplay = NotificationBundleProcessor.ProcessJobForDisplay(notifJob);
        }
    }

    /* access modifiers changed from: protected */
    public void onRegistered(String str) {
        StringBuilder sb;
        String newRegistrationId = str;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("ADM registration ID: ").append(newRegistrationId).toString());
        PushRegistratorADM.fireCallback(newRegistrationId);
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(String str) {
        StringBuilder sb;
        String error = str;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("ADM:onRegistrationError: ").append(error).toString());
        if ("INVALID_SENDER".equals(error)) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        PushRegistratorADM.fireCallback((String) null);
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(String info) {
        StringBuilder sb;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("ADM:onUnregistered: ").append(info).toString());
    }
}
