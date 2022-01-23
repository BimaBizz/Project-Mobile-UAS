package com.onesignal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.OneSignal;

public class OneSignalHmsEventBridge {
    public OneSignalHmsEventBridge() {
    }

    public static void onNewToken(@NonNull Context context, @NonNull String str) {
        StringBuilder sb;
        Context context2 = context;
        String token = str;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("HmsMessageServiceOneSignal.onNewToken - HMS token: ").append(token).toString());
        PushRegistratorHMS.fireCallback(token);
    }

    public static void onMessageReceived(@NonNull Context context, @NonNull RemoteMessage message) {
        NotificationPayloadProcessorHMS.processDataMessageReceived(context, message.getData());
    }
}
