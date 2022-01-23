package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import org.json.JSONException;
import org.json.JSONObject;

class OSTrigger {
    @NonNull
    public OSTriggerKind kind;
    @NonNull
    public OSTriggerOperator operatorType;
    @Nullable
    public String property;
    @NonNull
    String triggerId;
    @Nullable
    public Object value;

    public enum OSTriggerOperator {
        ;
        
        private String text;

        private OSTriggerOperator(String text2) {
            String str = r8;
            int i = r9;
            this.text = text2;
        }

        public String toString() {
            return this.text;
        }

        @NonNull
        public static OSTriggerOperator fromString(String str) {
            String text2 = str;
            OSTriggerOperator[] values = values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                OSTriggerOperator type = values[i];
                if (type.text.equalsIgnoreCase(text2)) {
                    return type;
                }
            }
            return EQUAL_TO;
        }

        public boolean checksEquality() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }
    }

    public enum OSTriggerKind {
        ;
        
        private String value;

        private OSTriggerKind(String value2) {
            String str = r8;
            int i = r9;
            this.value = value2;
        }

        public String toString() {
            return this.value;
        }

        @NonNull
        public static OSTriggerKind fromString(String str) {
            String value2 = str;
            OSTriggerKind[] values = values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                OSTriggerKind type = values[i];
                if (type.value.equalsIgnoreCase(value2)) {
                    return type;
                }
            }
            return UNKNOWN;
        }
    }

    OSTrigger(JSONObject jSONObject) throws JSONException {
        JSONObject json = jSONObject;
        this.triggerId = json.getString(CommonProperties.ID);
        this.kind = OSTriggerKind.fromString(json.getString("kind"));
        this.property = json.optString("property", (String) null);
        this.operatorType = OSTriggerOperator.fromString(json.getString("operator"));
        this.value = json.opt(CommonProperties.VALUE);
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject json = jSONObject;
        try {
            JSONObject put = json.put(CommonProperties.ID, this.triggerId);
            JSONObject put2 = json.put("kind", this.kind);
            JSONObject put3 = json.put("property", this.property);
            JSONObject put4 = json.put("operator", this.operatorType.toString());
            JSONObject put5 = json.put(CommonProperties.VALUE, this.value);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json;
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("OSTrigger{triggerId='").append(this.triggerId).append('\'').append(", kind=").append(this.kind).append(", property='").append(this.property).append('\'').append(", operatorType=").append(this.operatorType).append(", value=").append(this.value).append('}').toString();
    }
}
