package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OneSignalRemoteParams {
    public static final int DEFAULT_INDIRECT_ATTRIBUTION_WINDOW = 1440;
    public static final int DEFAULT_NOTIFICATION_LIMIT = 10;
    private static final String DIRECT_PARAM = "direct";
    private static final String ENABLED_PARAM = "enabled";
    private static final String FCM_API_KEY = "api_key";
    private static final String FCM_APP_ID = "app_id";
    private static final String FCM_PARENT_PARAM = "fcm";
    private static final String FCM_PROJECT_ID = "project_id";
    private static final String IAM_ATTRIBUTION_PARAM = "in_app_message_attribution";
    private static final int INCREASE_BETWEEN_RETRIES = 10000;
    private static final String INDIRECT_PARAM = "indirect";
    private static final int MAX_WAIT_BETWEEN_RETRIES = 90000;
    private static final int MIN_WAIT_BETWEEN_RETRIES = 30000;
    private static final String NOTIFICATION_ATTRIBUTION_PARAM = "notification_attribution";
    private static final String OUTCOMES_V2_SERVICE_PARAM = "v2_enabled";
    private static final String OUTCOME_PARAM = "outcomes";
    private static final String UNATTRIBUTED_PARAM = "unattributed";
    /* access modifiers changed from: private */
    public static int androidParamsRetries = 0;

    interface CallBack {
        void complete(Params params);
    }

    public OneSignalRemoteParams() {
    }

    static /* synthetic */ int access$008() {
        int i = androidParamsRetries;
        int i2 = i;
        androidParamsRetries = i + 1;
        return i2;
    }

    static class FCMParams {
        @Nullable
        String apiKey;
        @Nullable
        String appId;
        @Nullable
        String projectId;

        FCMParams() {
        }
    }

    public static class InfluenceParams {
        boolean directEnabled = false;
        int iamLimit = 10;
        boolean indirectEnabled = false;
        int indirectIAMAttributionWindow = OneSignalRemoteParams.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW;
        int indirectNotificationAttributionWindow = OneSignalRemoteParams.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW;
        int notificationLimit = 10;
        boolean outcomesV2ServiceEnabled = false;
        boolean unattributedEnabled = false;

        public InfluenceParams() {
        }

        public int getIndirectNotificationAttributionWindow() {
            return this.indirectNotificationAttributionWindow;
        }

        public int getNotificationLimit() {
            return this.notificationLimit;
        }

        public int getIndirectIAMAttributionWindow() {
            return this.indirectIAMAttributionWindow;
        }

        public int getIamLimit() {
            return this.iamLimit;
        }

        public boolean isDirectEnabled() {
            return this.directEnabled;
        }

        public boolean isIndirectEnabled() {
            return this.indirectEnabled;
        }

        public boolean isUnattributedEnabled() {
            return this.unattributedEnabled;
        }

        public String toString() {
            StringBuilder sb;
            new StringBuilder();
            return sb.append("InfluenceParams{indirectNotificationAttributionWindow=").append(this.indirectNotificationAttributionWindow).append(", notificationLimit=").append(this.notificationLimit).append(", indirectIAMAttributionWindow=").append(this.indirectIAMAttributionWindow).append(", iamLimit=").append(this.iamLimit).append(", directEnabled=").append(this.directEnabled).append(", indirectEnabled=").append(this.indirectEnabled).append(", unattributedEnabled=").append(this.unattributedEnabled).append('}').toString();
        }
    }

    static class Params {
        boolean clearGroupOnSummaryClick;
        boolean enterprise;
        FCMParams fcmParams;
        boolean firebaseAnalytics;
        String googleProjectNumber;
        InfluenceParams influenceParams;
        JSONArray notificationChannels;
        boolean receiveReceiptEnabled;
        boolean restoreTTLFilter;
        boolean useEmailAuth;
        boolean useUserIdAuth;

        Params() {
        }
    }

    static void makeAndroidParamsRequest(@NonNull CallBack callBack) {
        OneSignalRestClient.ResponseHandler responseHandler;
        StringBuilder sb;
        StringBuilder sb2;
        final CallBack callBack2 = callBack;
        new OneSignalRestClient.ResponseHandler() {
            /* access modifiers changed from: package-private */
            public void onFailure(int statusCode, String str, Throwable th) {
                Thread thread;
                Runnable runnable;
                String str2 = str;
                Throwable th2 = th;
                if (statusCode == 403) {
                    OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "403 error getting OneSignal params, omitting further retries!");
                    return;
                }
                new Runnable(this) {
                    final /* synthetic */ AnonymousClass1 this$0;

                    {
                        this.this$0 = this$0;
                    }

                    public void run() {
                        StringBuilder sb;
                        int sleepTime = OneSignalRemoteParams.MIN_WAIT_BETWEEN_RETRIES + (OneSignalRemoteParams.androidParamsRetries * 10000);
                        if (sleepTime > OneSignalRemoteParams.MAX_WAIT_BETWEEN_RETRIES) {
                            sleepTime = OneSignalRemoteParams.MAX_WAIT_BETWEEN_RETRIES;
                        }
                        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
                        new StringBuilder();
                        OneSignal.Log(log_level, sb.append("Failed to get Android parameters, trying again in ").append(sleepTime / 1000).append(" seconds.").toString());
                        OSUtils.sleep(sleepTime);
                        int access$008 = OneSignalRemoteParams.access$008();
                        OneSignalRemoteParams.makeAndroidParamsRequest(callBack2);
                    }
                };
                new Thread(runnable, "OS_PARAMS_REQUEST");
                thread.start();
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String response) {
                OneSignalRemoteParams.processJson(response, callBack2);
            }
        };
        OneSignalRestClient.ResponseHandler responseHandler2 = responseHandler;
        new StringBuilder();
        String params_url = sb.append("apps/").append(OneSignal.appId).append("/android_params.js").toString();
        String userId = OneSignal.getUserId();
        if (userId != null) {
            new StringBuilder();
            params_url = sb2.append(params_url).append("?player_id=").append(userId).toString();
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Starting request to get Android parameters.");
        OneSignalRestClient.get(params_url, responseHandler2, "CACHE_KEY_REMOTE_PARAMS");
    }

    /* access modifiers changed from: private */
    public static void processJson(String str, @NonNull CallBack callBack) {
        StringBuilder sb;
        JSONObject jSONObject;
        Params params;
        String json = str;
        CallBack callBack2 = callBack;
        try {
            JSONObject responseJson = jSONObject;
            new JSONObject(json);
            final JSONObject jSONObject2 = responseJson;
            new Params() {
                {
                    InfluenceParams influenceParams;
                    FCMParams fCMParams;
                    this.enterprise = jSONObject2.optBoolean("enterp", false);
                    this.useEmailAuth = jSONObject2.optBoolean("require_email_auth", false);
                    this.useUserIdAuth = jSONObject2.optBoolean("require_user_id_auth", false);
                    this.notificationChannels = jSONObject2.optJSONArray("chnl_lst");
                    this.firebaseAnalytics = jSONObject2.optBoolean("fba", false);
                    this.restoreTTLFilter = jSONObject2.optBoolean("restore_ttl_filter", true);
                    this.googleProjectNumber = jSONObject2.optString("android_sender_id", (String) null);
                    this.clearGroupOnSummaryClick = jSONObject2.optBoolean("clear_group_on_summary_click", true);
                    this.receiveReceiptEnabled = jSONObject2.optBoolean("receive_receipts_enable", false);
                    new InfluenceParams();
                    this.influenceParams = influenceParams;
                    if (jSONObject2.has(OneSignalRemoteParams.OUTCOME_PARAM)) {
                        OneSignalRemoteParams.processOutcomeJson(jSONObject2.optJSONObject(OneSignalRemoteParams.OUTCOME_PARAM), this.influenceParams);
                    }
                    new FCMParams();
                    this.fcmParams = fCMParams;
                    if (jSONObject2.has(OneSignalRemoteParams.FCM_PARENT_PARAM)) {
                        JSONObject fcm = jSONObject2.optJSONObject(OneSignalRemoteParams.FCM_PARENT_PARAM);
                        this.fcmParams.apiKey = fcm.optString(OneSignalRemoteParams.FCM_API_KEY, (String) null);
                        this.fcmParams.appId = fcm.optString(OneSignalRemoteParams.FCM_APP_ID, (String) null);
                        this.fcmParams.projectId = fcm.optString(OneSignalRemoteParams.FCM_PROJECT_ID, (String) null);
                    }
                }
            };
            callBack2.complete(params);
        } catch (NullPointerException | JSONException e) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "Error parsing android_params!: ", e);
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.FATAL;
            new StringBuilder();
            OneSignal.Log(log_level, sb.append("Response that errored from android_params!: ").append(json).toString());
        }
    }

    /* access modifiers changed from: private */
    public static void processOutcomeJson(JSONObject jSONObject, InfluenceParams influenceParams) {
        JSONObject outcomeJson = jSONObject;
        InfluenceParams influenceParams2 = influenceParams;
        if (outcomeJson.has(OUTCOMES_V2_SERVICE_PARAM)) {
            influenceParams2.outcomesV2ServiceEnabled = outcomeJson.optBoolean(OUTCOMES_V2_SERVICE_PARAM);
        }
        if (outcomeJson.has(DIRECT_PARAM)) {
            influenceParams2.directEnabled = outcomeJson.optJSONObject(DIRECT_PARAM).optBoolean("enabled");
        }
        if (outcomeJson.has(INDIRECT_PARAM)) {
            JSONObject indirect = outcomeJson.optJSONObject(INDIRECT_PARAM);
            influenceParams2.indirectEnabled = indirect.optBoolean("enabled");
            if (indirect.has(NOTIFICATION_ATTRIBUTION_PARAM)) {
                JSONObject indirectNotificationAttribution = indirect.optJSONObject(NOTIFICATION_ATTRIBUTION_PARAM);
                influenceParams2.indirectNotificationAttributionWindow = indirectNotificationAttribution.optInt("minutes_since_displayed", DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
                influenceParams2.notificationLimit = indirectNotificationAttribution.optInt("limit", 10);
            }
            if (indirect.has(IAM_ATTRIBUTION_PARAM)) {
                JSONObject indirectIAMAttribution = indirect.optJSONObject(IAM_ATTRIBUTION_PARAM);
                influenceParams2.indirectIAMAttributionWindow = indirectIAMAttribution.optInt("minutes_since_displayed", DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
                influenceParams2.iamLimit = indirectIAMAttribution.optInt("limit", 10);
            }
        }
        if (outcomeJson.has(UNATTRIBUTED_PARAM)) {
            influenceParams2.unattributedEnabled = outcomeJson.optJSONObject(UNATTRIBUTED_PARAM).optBoolean("enabled");
        }
    }
}
