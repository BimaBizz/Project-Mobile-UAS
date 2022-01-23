package com.onesignal;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

public class OSInAppMessageOutcome {
    private static final String OUTCOME_NAME = "name";
    private static final String OUTCOME_UNIQUE = "unique";
    private static final String OUTCOME_WEIGHT = "weight";
    private String name;
    private boolean unique;
    private float weight;

    OSInAppMessageOutcome(@NonNull JSONObject jSONObject) throws JSONException {
        JSONObject json = jSONObject;
        this.name = json.getString("name");
        this.weight = json.has(OUTCOME_WEIGHT) ? (float) json.getDouble(OUTCOME_WEIGHT) : 0.0f;
        this.unique = json.has(OUTCOME_UNIQUE) && json.getBoolean(OUTCOME_UNIQUE);
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject mainObj = jSONObject;
        try {
            JSONObject put = mainObj.put("name", this.name);
            JSONObject put2 = mainObj.put(OUTCOME_WEIGHT, (double) this.weight);
            JSONObject put3 = mainObj.put(OUTCOME_UNIQUE, this.unique);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mainObj;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        String str = name2;
        this.name = str;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight2) {
        float f = weight2;
        this.weight = f;
    }

    public boolean isUnique() {
        return this.unique;
    }

    public void setUnique(boolean unique2) {
        boolean z = unique2;
        this.unique = z;
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("OSInAppMessageOutcome{name='").append(this.name).append('\'').append(", weight=").append(this.weight).append(", unique=").append(this.unique).append('}').toString();
    }
}
