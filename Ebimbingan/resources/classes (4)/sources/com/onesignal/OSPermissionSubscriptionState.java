package com.onesignal;

import org.json.JSONObject;

public class OSPermissionSubscriptionState {
    OSEmailSubscriptionState emailSubscriptionStatus;
    OSPermissionState permissionStatus;
    OSSubscriptionState subscriptionStatus;

    public OSPermissionSubscriptionState() {
    }

    public OSPermissionState getPermissionStatus() {
        return this.permissionStatus;
    }

    public OSSubscriptionState getSubscriptionStatus() {
        return this.subscriptionStatus;
    }

    public OSEmailSubscriptionState getEmailSubscriptionStatus() {
        return this.emailSubscriptionStatus;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject mainObj = jSONObject;
        try {
            JSONObject put = mainObj.put("permissionStatus", this.permissionStatus.toJSONObject());
            JSONObject put2 = mainObj.put("subscriptionStatus", this.subscriptionStatus.toJSONObject());
            JSONObject put3 = mainObj.put("emailSubscriptionStatus", this.emailSubscriptionStatus.toJSONObject());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return mainObj;
    }

    public String toString() {
        return toJSONObject().toString();
    }
}
