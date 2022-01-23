package com.onesignal;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistrator;

class PushRegistratorHMS implements PushRegistrator {
    static final String HMS_CLIENT_APP_ID = "client/app_id";
    private static final int NEW_TOKEN_TIMEOUT_MS = 30000;
    private static boolean callbackSuccessful;
    @Nullable
    private static PushRegistrator.RegisteredHandler registeredHandler;

    PushRegistratorHMS() {
    }

    static void fireCallback(String str) {
        String token = str;
        if (registeredHandler != null) {
            callbackSuccessful = true;
            registeredHandler.complete(token, 1);
        }
    }

    public void registerForPush(@NonNull Context context, String str, @NonNull PushRegistrator.RegisteredHandler registeredHandler2) {
        Thread thread;
        Runnable runnable;
        String str2 = str;
        PushRegistrator.RegisteredHandler callback = registeredHandler2;
        registeredHandler = callback;
        final Context context2 = context;
        final PushRegistrator.RegisteredHandler registeredHandler3 = callback;
        new Runnable(this) {
            final /* synthetic */ PushRegistratorHMS this$0;

            {
                this.this$0 = this$0;
            }

            public void run() {
                int pushStatus;
                try {
                    this.this$0.getHMSTokenTask(context2, registeredHandler3);
                } catch (ApiException e) {
                    ApiException e2 = e;
                    OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "HMS ApiException getting Huawei push token!", e2);
                    if (e2.getStatusCode() == 907135000) {
                        pushStatus = -26;
                    } else {
                        pushStatus = -27;
                    }
                    registeredHandler3.complete((String) null, pushStatus);
                }
            }
        };
        new Thread(runnable, "OS_HMS_GET_TOKEN");
        thread.start();
    }

    /* access modifiers changed from: private */
    public synchronized void getHMSTokenTask(@NonNull Context context, @NonNull PushRegistrator.RegisteredHandler registeredHandler2) throws ApiException {
        StringBuilder sb;
        Context context2 = context;
        PushRegistrator.RegisteredHandler callback = registeredHandler2;
        synchronized (this) {
            if (!OSUtils.hasAllHMSLibrariesForPushKit()) {
                callback.complete((String) null, -28);
            } else {
                String pushToken = HmsInstanceId.getInstance(context2).getToken(AGConnectServicesConfig.fromContext(context2).getString(HMS_CLIENT_APP_ID), "HCM");
                if (!TextUtils.isEmpty(pushToken)) {
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
                    new StringBuilder();
                    OneSignal.Log(log_level, sb.append("Device registered for HMS, push token = ").append(pushToken).toString());
                    callback.complete(pushToken, 1);
                } else {
                    waitForOnNewPushTokenEvent(callback);
                }
            }
        }
    }

    private static void doTimeOutWait() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            InterruptedException interruptedException = e;
        }
    }

    /* access modifiers changed from: package-private */
    public void waitForOnNewPushTokenEvent(@NonNull PushRegistrator.RegisteredHandler registeredHandler2) {
        PushRegistrator.RegisteredHandler callback = registeredHandler2;
        doTimeOutWait();
        if (!callbackSuccessful) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "HmsMessageServiceOneSignal.onNewToken timed out.");
            callback.complete((String) null, -25);
        }
    }
}
