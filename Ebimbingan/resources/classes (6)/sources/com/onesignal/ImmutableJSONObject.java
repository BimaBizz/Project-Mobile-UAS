package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

class ImmutableJSONObject {
    private final JSONObject jsonObject;

    public ImmutableJSONObject() {
        JSONObject jSONObject;
        new JSONObject();
        this.jsonObject = jSONObject;
    }

    public ImmutableJSONObject(JSONObject jsonObject2) {
        this.jsonObject = jsonObject2;
    }

    public long getLong(String name) throws JSONException {
        return this.jsonObject.getLong(name);
    }

    public boolean has(String name) {
        return this.jsonObject.has(name);
    }

    public Object opt(String name) {
        return this.jsonObject.opt(name);
    }

    public String optString(String name) {
        return this.jsonObject.optString(name);
    }

    public String optString(String name, String fallback) {
        return this.jsonObject.optString(name, fallback);
    }

    public boolean optBoolean(String name) {
        return this.jsonObject.optBoolean(name);
    }

    public boolean optBoolean(String name, boolean fallback) {
        return this.jsonObject.optBoolean(name, fallback);
    }

    public long optLong(String name) {
        return this.jsonObject.optLong(name);
    }

    public int optInt(String name) {
        return this.jsonObject.optInt(name);
    }

    public int optInt(String name, int fallback) {
        return this.jsonObject.optInt(name, fallback);
    }

    public JSONObject optJSONObject(String name) {
        return this.jsonObject.optJSONObject(name);
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("ImmutableJSONObject{jsonObject=").append(this.jsonObject).append('}').toString();
    }
}
