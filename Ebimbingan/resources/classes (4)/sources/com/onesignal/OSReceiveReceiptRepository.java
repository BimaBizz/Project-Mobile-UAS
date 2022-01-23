package com.onesignal;

import androidx.annotation.NonNull;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import org.json.JSONException;
import org.json.JSONObject;

class OSReceiveReceiptRepository {
    private static final String APP_ID = "app_id";
    private static final String PLAYER_ID = "player_id";

    OSReceiveReceiptRepository() {
    }

    /* access modifiers changed from: package-private */
    public void sendReceiveReceipt(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull OneSignalRestClient.ResponseHandler responseHandler) {
        JSONObject jSONObject;
        StringBuilder sb;
        String appId = str;
        String playerId = str2;
        String notificationId = str3;
        OneSignalRestClient.ResponseHandler responseHandler2 = responseHandler;
        try {
            new JSONObject();
            JSONObject jsonBody = jSONObject.put(APP_ID, appId).put(PLAYER_ID, playerId);
            new StringBuilder();
            OneSignalRestClient.put(sb.append("notifications/").append(notificationId).append("/report_received").toString(), jsonBody, responseHandler2);
        } catch (JSONException e) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Generating direct receive receipt:JSON Failed.", e);
        }
    }
}
