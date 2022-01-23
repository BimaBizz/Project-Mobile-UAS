package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

class OSNotificationFormatHelper {
    public static final String PAYLOAD_OS_NOTIFICATION_ID = "i";
    public static final String PAYLOAD_OS_ROOT_CUSTOM = "custom";

    OSNotificationFormatHelper() {
    }

    static boolean isOneSignalIntent(@Nullable Intent intent) {
        Intent intent2 = intent;
        if (intent2 == null) {
            return false;
        }
        return isOneSignalBundle(intent2.getExtras());
    }

    static boolean isOneSignalBundle(@Nullable Bundle bundle) {
        return getOSNotificationIdFromBundle(bundle) != null;
    }

    @Nullable
    private static String getOSNotificationIdFromBundle(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle2 == null || bundle2.isEmpty()) {
            return null;
        }
        String custom = bundle2.getString("custom", (String) null);
        if (custom != null) {
            return getOSNotificationIdFromJsonString(custom);
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.");
        return null;
    }

    @Nullable
    static String getOSNotificationIdFromJson(@Nullable JSONObject jSONObject) {
        JSONObject jsonObject = jSONObject;
        if (jsonObject == null) {
            return null;
        }
        return getOSNotificationIdFromJsonString(jsonObject.optString("custom", (String) null));
    }

    @Nullable
    private static String getOSNotificationIdFromJsonString(@Nullable String jsonStr) {
        JSONObject jSONObject;
        try {
            new JSONObject(jsonStr);
            JSONObject customJSON = jSONObject;
            if (customJSON.has("i")) {
                return customJSON.optString("i", (String) null);
            }
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted JSON string. No 'i' field in custom.");
            return null;
        } catch (JSONException e) {
            JSONException jSONException = e;
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted JSON String, error parsing string as JSON.");
        }
    }
}
