package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

class PushRegistratorFCM extends PushRegistratorAbstractGoogle {
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
    private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
    private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
    private FirebaseApp firebaseApp;

    PushRegistratorFCM() {
    }

    static void disableFirebaseInstanceIdService(Context context) {
        ComponentName componentName;
        Context context2 = context;
        int componentState = OSUtils.getResourceString(context2, "gcm_defaultSenderId", (String) null) == null ? 2 : 1;
        PackageManager pm = context2.getPackageManager();
        try {
            new ComponentName(context2, FirebaseInstanceIdService.class);
            pm.setComponentEnabledSetting(componentName, componentState, 1);
        } catch (NoClassDefFoundError e) {
            NoClassDefFoundError noClassDefFoundError = e;
        } catch (IllegalArgumentException e2) {
            IllegalArgumentException illegalArgumentException = e2;
        }
    }

    /* access modifiers changed from: package-private */
    public String getProviderName() {
        return "FCM";
    }

    /* access modifiers changed from: package-private */
    public String getToken(String str) throws Throwable {
        String senderId = str;
        initFirebaseApp(senderId);
        return FirebaseInstanceId.getInstance(this.firebaseApp).getToken(senderId, "FCM");
    }

    private void initFirebaseApp(String str) {
        FirebaseOptions.Builder builder;
        String senderId = str;
        if (this.firebaseApp == null) {
            new FirebaseOptions.Builder();
            this.firebaseApp = FirebaseApp.initializeApp(OneSignal.appContext, builder.setGcmSenderId(senderId).setApplicationId(getAppId()).setApiKey(getApiKey()).setProjectId(getProjectId()).build(), FCM_APP_NAME);
        }
    }

    @NonNull
    private static String getAppId() {
        if (OneSignal.remoteParams.fcmParams.appId != null) {
            return OneSignal.remoteParams.fcmParams.appId;
        }
        return FCM_DEFAULT_APP_ID;
    }

    @NonNull
    private static String getApiKey() {
        String str;
        if (OneSignal.remoteParams.fcmParams.apiKey != null) {
            return OneSignal.remoteParams.fcmParams.apiKey;
        }
        String str2 = str;
        new String(Base64.decode(FCM_DEFAULT_API_KEY_BASE64, 0));
        return str2;
    }

    @NonNull
    private static String getProjectId() {
        if (OneSignal.remoteParams.fcmParams.projectId != null) {
            return OneSignal.remoteParams.fcmParams.projectId;
        }
        return FCM_DEFAULT_PROJECT_ID;
    }
}
