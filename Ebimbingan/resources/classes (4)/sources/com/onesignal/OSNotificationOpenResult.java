package com.onesignal;

import com.microsoft.appcenter.ingestion.models.CommonProperties;
import com.onesignal.OneSignalDbContract;
import org.json.JSONException;
import org.json.JSONObject;

public class OSNotificationOpenResult {
    public OSNotificationAction action;
    public OSNotification notification;

    public OSNotificationOpenResult() {
    }

    @Deprecated
    public String stringify() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Object obj;
        new JSONObject();
        JSONObject mainObj = jSONObject;
        try {
            new JSONObject();
            JSONObject ac = jSONObject2;
            JSONObject put = ac.put("actionID", this.action.actionID);
            JSONObject put2 = ac.put(CommonProperties.TYPE, this.action.type.ordinal());
            JSONObject put3 = mainObj.put("action", ac);
            new JSONObject(this.notification.stringify());
            JSONObject put4 = mainObj.put(OneSignalDbContract.NotificationTable.TABLE_NAME, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mainObj.toString();
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        new JSONObject();
        JSONObject mainObj = jSONObject;
        try {
            new JSONObject();
            JSONObject jsonObjAction = jSONObject2;
            JSONObject put = jsonObjAction.put("actionID", this.action.actionID);
            JSONObject put2 = jsonObjAction.put(CommonProperties.TYPE, this.action.type.ordinal());
            JSONObject put3 = mainObj.put("action", jsonObjAction);
            JSONObject put4 = mainObj.put(OneSignalDbContract.NotificationTable.TABLE_NAME, this.notification.toJSONObject());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mainObj;
    }
}
