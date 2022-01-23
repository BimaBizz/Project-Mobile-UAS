package com.onesignal.outcomes.model;

import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSOutcomeSourceBody {
    private static final String IAM_IDS = "in_app_message_ids";
    private static final String NOTIFICATION_IDS = "notification_ids";
    @Nullable
    private JSONArray inAppMessagesIds;
    @Nullable
    private JSONArray notificationIds;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OSOutcomeSourceBody() {
        /*
            r6 = this;
            r0 = r6
            r1 = r0
            org.json.JSONArray r2 = new org.json.JSONArray
            r5 = r2
            r2 = r5
            r3 = r5
            r3.<init>()
            org.json.JSONArray r3 = new org.json.JSONArray
            r5 = r3
            r3 = r5
            r4 = r5
            r4.<init>()
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.outcomes.model.OSOutcomeSourceBody.<init>():void");
    }

    public OSOutcomeSourceBody(@Nullable JSONArray notificationIds2, @Nullable JSONArray inAppMessagesIds2) {
        this.notificationIds = notificationIds2;
        this.inAppMessagesIds = inAppMessagesIds2;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject json = jSONObject;
        JSONObject put = json.put(NOTIFICATION_IDS, this.notificationIds);
        JSONObject put2 = json.put(IAM_IDS, this.inAppMessagesIds);
        return json;
    }

    @Nullable
    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    public void setNotificationIds(@Nullable JSONArray notificationIds2) {
        JSONArray jSONArray = notificationIds2;
        this.notificationIds = jSONArray;
    }

    @Nullable
    public JSONArray getInAppMessagesIds() {
        return this.inAppMessagesIds;
    }

    public void setInAppMessagesIds(@Nullable JSONArray inAppMessagesIds2) {
        JSONArray jSONArray = inAppMessagesIds2;
        this.inAppMessagesIds = jSONArray;
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("OSOutcomeSourceBody{notificationIds=").append(this.notificationIds).append(", inAppMessagesIds=").append(this.inAppMessagesIds).append('}').toString();
    }
}
