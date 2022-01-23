package com.onesignal.outcomes.model;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class OSOutcomeSource {
    private static final String DIRECT = "direct";
    private static final String INDIRECT = "indirect";
    @Nullable
    private OSOutcomeSourceBody directBody;
    @Nullable
    private OSOutcomeSourceBody indirectBody;

    public OSOutcomeSource(@Nullable OSOutcomeSourceBody directBody2, @Nullable OSOutcomeSourceBody indirectBody2) {
        this.directBody = directBody2;
        this.indirectBody = indirectBody2;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject json = jSONObject;
        if (this.directBody != null) {
            JSONObject put = json.put(DIRECT, this.directBody.toJSONObject());
        }
        if (this.indirectBody != null) {
            JSONObject put2 = json.put(INDIRECT, this.indirectBody.toJSONObject());
        }
        return json;
    }

    public OSOutcomeSourceBody getDirectBody() {
        return this.directBody;
    }

    public OSOutcomeSource setDirectBody(@Nullable OSOutcomeSourceBody directBody2) {
        this.directBody = directBody2;
        return this;
    }

    public OSOutcomeSourceBody getIndirectBody() {
        return this.indirectBody;
    }

    public OSOutcomeSource setIndirectBody(@Nullable OSOutcomeSourceBody indirectBody2) {
        this.indirectBody = indirectBody2;
        return this;
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("OSOutcomeSource{directBody=").append(this.directBody).append(", indirectBody=").append(this.indirectBody).append('}').toString();
    }
}
