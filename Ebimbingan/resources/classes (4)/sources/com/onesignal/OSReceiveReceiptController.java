package com.onesignal;

import androidx.annotation.NonNull;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;

class OSReceiveReceiptController {
    private static OSReceiveReceiptController sInstance;
    private final OSReceiveReceiptRepository repository;

    private OSReceiveReceiptController() {
        OSReceiveReceiptRepository oSReceiveReceiptRepository;
        new OSReceiveReceiptRepository();
        this.repository = oSReceiveReceiptRepository;
    }

    public static synchronized OSReceiveReceiptController getInstance() {
        OSReceiveReceiptController oSReceiveReceiptController;
        OSReceiveReceiptController oSReceiveReceiptController2;
        synchronized (OSReceiveReceiptController.class) {
            if (sInstance == null) {
                new OSReceiveReceiptController();
                sInstance = oSReceiveReceiptController2;
            }
            oSReceiveReceiptController = sInstance;
        }
        return oSReceiveReceiptController;
    }

    /* access modifiers changed from: package-private */
    public void sendReceiveReceipt(@NonNull String str) {
        StringBuilder sb;
        OneSignalRestClient.ResponseHandler responseHandler;
        String notificationId = str;
        String appId = (OneSignal.appId == null || OneSignal.appId.isEmpty()) ? OneSignal.getSavedAppId() : OneSignal.appId;
        String playerId = OneSignal.getUserId();
        if (!isReceiveReceiptEnabled()) {
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "sendReceiveReceipt disable");
            return;
        }
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("sendReceiveReceipt appId: ").append(appId).append(" playerId: ").append(playerId).append(" notificationId: ").append(notificationId).toString());
        final String str2 = notificationId;
        new OneSignalRestClient.ResponseHandler(this) {
            final /* synthetic */ OSReceiveReceiptController this$0;

            {
                this.this$0 = this$0;
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String str) {
                StringBuilder sb;
                String str2 = str;
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                new StringBuilder();
                OneSignal.Log(log_level, sb.append("Receive receipt sent for notificationID: ").append(str2).toString());
            }

            /* access modifiers changed from: package-private */
            public void onFailure(int statusCode, String response, Throwable th) {
                StringBuilder sb;
                Throwable th2 = th;
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                new StringBuilder();
                OneSignal.Log(log_level, sb.append("Receive receipt failed with statusCode: ").append(statusCode).append(" response: ").append(response).toString());
            }
        };
        this.repository.sendReceiveReceipt(appId, playerId, notificationId, responseHandler);
    }

    private boolean isReceiveReceiptEnabled() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_RECEIVE_RECEIPTS_ENABLED, false);
    }
}
