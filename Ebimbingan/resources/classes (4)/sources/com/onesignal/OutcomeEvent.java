package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.influence.model.OSInfluenceType;
import com.onesignal.outcomes.model.OSOutcomeEventParams;
import com.onesignal.outcomes.model.OSOutcomeSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OutcomeEvent {
    private static final String NOTIFICATION_IDS = "notification_ids";
    private static final String OUTCOME_ID = "id";
    private static final String SESSION = "session";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    private String name;
    private JSONArray notificationIds;
    private OSInfluenceType session;
    private long timestamp;
    private Float weight;

    public OutcomeEvent(@NonNull OSInfluenceType session2, @Nullable JSONArray notificationIds2, @NonNull String name2, long timestamp2, float weight2) {
        this.session = session2;
        this.notificationIds = notificationIds2;
        this.name = name2;
        this.timestamp = timestamp2;
        this.weight = Float.valueOf(weight2);
    }

    public static OutcomeEvent fromOutcomeEventParamsV2toOutcomeEventV1(OSOutcomeEventParams oSOutcomeEventParams) {
        OutcomeEvent outcomeEvent;
        OSOutcomeEventParams outcomeEventParams = oSOutcomeEventParams;
        OSInfluenceType influenceType = OSInfluenceType.UNATTRIBUTED;
        JSONArray notificationId = null;
        if (outcomeEventParams.getOutcomeSource() != null) {
            OSOutcomeSource source = outcomeEventParams.getOutcomeSource();
            if (source.getDirectBody() != null && source.getDirectBody().getNotificationIds() != null && source.getDirectBody().getNotificationIds().length() > 0) {
                influenceType = OSInfluenceType.DIRECT;
                notificationId = source.getDirectBody().getNotificationIds();
            } else if (!(source.getIndirectBody() == null || source.getIndirectBody().getNotificationIds() == null || source.getIndirectBody().getNotificationIds().length() <= 0)) {
                influenceType = OSInfluenceType.INDIRECT;
                notificationId = source.getIndirectBody().getNotificationIds();
            }
        }
        new OutcomeEvent(influenceType, notificationId, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getWeight().floatValue());
        return outcomeEvent;
    }

    public OSInfluenceType getSession() {
        return this.session;
    }

    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    public String getName() {
        return this.name;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public float getWeight() {
        return this.weight.floatValue();
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject json = jSONObject;
        JSONObject put = json.put(SESSION, this.session);
        JSONObject put2 = json.put(NOTIFICATION_IDS, this.notificationIds);
        JSONObject put3 = json.put("id", this.name);
        JSONObject put4 = json.put(TIMESTAMP, this.timestamp);
        JSONObject put5 = json.put(WEIGHT, this.weight);
        return json;
    }

    public JSONObject toJSONObjectForMeasure() throws JSONException {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject json = jSONObject;
        if (this.notificationIds != null && this.notificationIds.length() > 0) {
            JSONObject put = json.put(NOTIFICATION_IDS, this.notificationIds);
        }
        JSONObject put2 = json.put("id", this.name);
        if (this.weight.floatValue() > 0.0f) {
            JSONObject put3 = json.put(WEIGHT, this.weight);
        }
        if (this.timestamp > 0) {
            JSONObject put4 = json.put(TIMESTAMP, this.timestamp);
        }
        return json;
    }

    public boolean equals(Object obj) {
        Object o = obj;
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutcomeEvent event = (OutcomeEvent) o;
        return this.session.equals(event.session) && this.notificationIds.equals(event.notificationIds) && this.name.equals(event.name) && this.timestamp == event.timestamp && this.weight.equals(event.weight);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.session;
        Object[] objArr2 = objArr;
        objArr2[1] = this.notificationIds;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.name;
        Object[] objArr4 = objArr3;
        objArr4[3] = Long.valueOf(this.timestamp);
        Object[] a = objArr4;
        a[4] = this.weight;
        int result = 1;
        Object[] objArr5 = a;
        int length = objArr5.length;
        for (int i = 0; i < length; i++) {
            Object element = objArr5[i];
            result = (31 * result) + (element == null ? 0 : element.hashCode());
        }
        return result;
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("OutcomeEvent{session=").append(this.session).append(", notificationIds=").append(this.notificationIds).append(", name='").append(this.name).append('\'').append(", timestamp=").append(this.timestamp).append(", weight=").append(this.weight).append('}').toString();
    }
}
