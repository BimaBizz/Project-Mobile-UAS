package com.onesignal;

import androidx.annotation.NonNull;
import org.json.JSONObject;

public interface OneSignalAPIClient {
    void get(String str, OneSignalApiResponseHandler oneSignalApiResponseHandler, @NonNull String str2);

    void getSync(String str, OneSignalApiResponseHandler oneSignalApiResponseHandler, @NonNull String str2);

    void post(String str, JSONObject jSONObject, OneSignalApiResponseHandler oneSignalApiResponseHandler);

    void postSync(String str, JSONObject jSONObject, OneSignalApiResponseHandler oneSignalApiResponseHandler);

    void put(String str, JSONObject jSONObject, OneSignalApiResponseHandler oneSignalApiResponseHandler);

    void putSync(String str, JSONObject jSONObject, OneSignalApiResponseHandler oneSignalApiResponseHandler);
}
