package com.onesignal;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistrator;

public class PushRegistratorADM implements PushRegistrator {
    /* access modifiers changed from: private */
    public static boolean callbackSuccessful = false;
    private static PushRegistrator.RegisteredHandler registeredCallback;

    public PushRegistratorADM() {
    }

    public void registerForPush(Context context, String str, PushRegistrator.RegisteredHandler registeredHandler) {
        Thread thread;
        Runnable runnable;
        String str2 = str;
        PushRegistrator.RegisteredHandler callback = registeredHandler;
        registeredCallback = callback;
        final Context context2 = context;
        final PushRegistrator.RegisteredHandler registeredHandler2 = callback;
        new Runnable(this) {
            final /* synthetic */ PushRegistratorADM this$0;

            {
                this.this$0 = this$0;
            }

            public void run() {
                ADM adm;
                StringBuilder sb;
                new ADM(context2);
                ADM adm2 = adm;
                String registrationId = adm2.getRegistrationId();
                if (registrationId == null) {
                    adm2.startRegister();
                } else {
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                    new StringBuilder();
                    OneSignal.Log(log_level, sb.append("ADM Already registered with ID:").append(registrationId).toString());
                    registeredHandler2.complete(registrationId, 1);
                }
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    InterruptedException interruptedException = e;
                }
                if (!PushRegistratorADM.callbackSuccessful) {
                    OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
                    PushRegistratorADM.fireCallback((String) null);
                }
            }
        };
        new Thread(runnable);
        thread.start();
    }

    public static void fireCallback(String str) {
        String id = str;
        if (registeredCallback != null) {
            callbackSuccessful = true;
            registeredCallback.complete(id, 1);
        }
    }
}
