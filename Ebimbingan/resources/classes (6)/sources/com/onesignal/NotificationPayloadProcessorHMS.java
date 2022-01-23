package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationPayloadProcessorHMS {
    NotificationPayloadProcessorHMS() {
    }

    static void handleHMSNotificationOpenIntent(@NonNull Activity activity, @Nullable Intent intent) {
        JSONObject jsonData;
        Activity activity2 = activity;
        Intent intent2 = intent;
        OneSignal.setAppContext(activity2);
        if (intent2 != null && (jsonData = covertHMSOpenIntentToJson(intent2)) != null) {
            handleProcessJsonOpenData(activity2, jsonData);
        }
    }

    @Nullable
    private static JSONObject covertHMSOpenIntentToJson(@Nullable Intent intent) {
        Intent intent2 = intent;
        if (!OSNotificationFormatHelper.isOneSignalIntent(intent2)) {
            return null;
        }
        JSONObject jsonData = NotificationBundleProcessor.bundleAsJSONObject(intent2.getExtras());
        reformatButtonClickAction(jsonData);
        return jsonData;
    }

    private static void reformatButtonClickAction(@NonNull JSONObject jSONObject) {
        JSONObject jsonData = jSONObject;
        try {
            String actionId = (String) NotificationBundleProcessor.getCustomJSONObject(jsonData).remove(GenerateNotification.BUNDLE_KEY_ACTION_ID);
            if (actionId != null) {
                JSONObject put = jsonData.put(GenerateNotification.BUNDLE_KEY_ACTION_ID, actionId);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static void handleProcessJsonOpenData(@NonNull Activity activity, @NonNull JSONObject jSONObject) {
        JSONArray jSONArray;
        Activity activity2 = activity;
        JSONObject jsonData = jSONObject;
        if (!NotificationOpenedProcessor.handleIAMPreviewOpen(activity2, jsonData)) {
            new JSONArray();
            OneSignal.handleNotificationOpen(activity2, jSONArray.put(jsonData), false, OSNotificationFormatHelper.getOSNotificationIdFromJson(jsonData));
        }
    }

    public static void processDataMessageReceived(@NonNull Context context, @Nullable String str) {
        Bundle bundle;
        Context context2 = context;
        String data = str;
        OneSignal.setAppContext(context2);
        if (data != null && (bundle = OSUtils.jsonStringToBundle(data)) != null && !NotificationBundleProcessor.processBundleFromReceiver(context2, bundle).processed()) {
            GcmBroadcastReceiver.startGCMService(context2, bundle);
        }
    }
}
