package com.onesignal.outcomes.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class OSOutcomeEventParams {
    private static final String OUTCOME_ID = "id";
    private static final String OUTCOME_SOURCES = "sources";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    @NonNull
    private String outcomeId;
    @Nullable
    private OSOutcomeSource outcomeSource;
    private long timestamp;
    private Float weight;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OSOutcomeEventParams(@NonNull String outcomeId2, @Nullable OSOutcomeSource outcomeSource2, float weight2) {
        this(outcomeId2, outcomeSource2, weight2, 0);
    }

    public OSOutcomeEventParams(@NonNull String outcomeId2, @Nullable OSOutcomeSource outcomeSource2, float weight2, long timestamp2) {
        this.outcomeId = outcomeId2;
        this.outcomeSource = outcomeSource2;
        this.weight = Float.valueOf(weight2);
        this.timestamp = timestamp2;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject json = jSONObject;
        JSONObject put = json.put("id", this.outcomeId);
        if (this.outcomeSource != null) {
            JSONObject put2 = json.put(OUTCOME_SOURCES, this.outcomeSource.toJSONObject());
        }
        if (this.weight.floatValue() > 0.0f) {
            JSONObject put3 = json.put(WEIGHT, this.weight);
        }
        if (this.timestamp > 0) {
            JSONObject put4 = json.put(TIMESTAMP, this.timestamp);
        }
        return json;
    }

    public String getOutcomeId() {
        return this.outcomeId;
    }

    public OSOutcomeSource getOutcomeSource() {
        return this.outcomeSource;
    }

    public Float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight2) {
        Float valueOf = Float.valueOf(weight2);
        this.weight = valueOf;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp2) {
        long j = timestamp2;
        this.timestamp = j;
    }

    public boolean isUnattributed() {
        return this.outcomeSource == null || (this.outcomeSource.getDirectBody() == null && this.outcomeSource.getIndirectBody() == null);
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("OSOutcomeEventParams{outcomeId='").append(this.outcomeId).append('\'').append(", outcomeSource=").append(this.outcomeSource).append(", weight=").append(this.weight).append(", timestamp=").append(this.timestamp).append('}').toString();
    }
}
