package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

public class OSEmailSubscriptionStateChanges {
    OSEmailSubscriptionState from;
    OSEmailSubscriptionState to;

    public OSEmailSubscriptionStateChanges() {
    }

    public OSEmailSubscriptionState getTo() {
        return this.to;
    }

    public OSEmailSubscriptionState getFrom() {
        return this.from;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject mainObj = jSONObject;
        try {
            JSONObject put = mainObj.put("from", this.from.toJSONObject());
            JSONObject put2 = mainObj.put("to", this.to.toJSONObject());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mainObj;
    }

    public String toString() {
        return toJSONObject().toString();
    }
}
