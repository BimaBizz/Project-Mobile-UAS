package com.onesignal;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSNotification {
    public int androidNotificationId;
    public DisplayType displayType;
    public List<OSNotificationPayload> groupedNotifications;
    public boolean isAppInFocus;
    public OSNotificationPayload payload;
    public boolean shown;

    public enum DisplayType {
    }

    public OSNotification() {
    }

    public OSNotification(JSONObject jSONObject) {
        OSNotificationPayload oSNotificationPayload;
        List<OSNotificationPayload> list;
        Object obj;
        JSONObject jsonObject = jSONObject;
        this.isAppInFocus = jsonObject.optBoolean("isAppInFocus");
        this.shown = jsonObject.optBoolean("shown", this.shown);
        this.androidNotificationId = jsonObject.optInt(GenerateNotification.BUNDLE_KEY_ANDROID_NOTIFICATION_ID);
        this.displayType = DisplayType.values()[jsonObject.optInt("displayType")];
        if (jsonObject.has("groupedNotifications")) {
            JSONArray jsonArray = jsonObject.optJSONArray("groupedNotifications");
            new ArrayList();
            this.groupedNotifications = list;
            for (int i = 0; i < jsonArray.length(); i++) {
                new OSNotificationPayload(jsonArray.optJSONObject(i));
                boolean add = this.groupedNotifications.add(obj);
            }
        }
        if (jsonObject.has("payload")) {
            new OSNotificationPayload(jsonObject.optJSONObject("payload"));
            this.payload = oSNotificationPayload;
        }
    }

    @Deprecated
    public String stringify() {
        JSONObject mainObj = toJSONObject();
        try {
            if (mainObj.has("additionalData")) {
                JSONObject put = mainObj.put("additionalData", mainObj.optJSONObject("additionalData").toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mainObj.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: org.json.JSONArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject toJSONObject() {
        /*
            r9 = this;
            r0 = r9
            org.json.JSONObject r5 = new org.json.JSONObject
            r8 = r5
            r5 = r8
            r6 = r8
            r6.<init>()
            r1 = r5
            r5 = r1
            java.lang.String r6 = "isAppInFocus"
            r7 = r0
            boolean r7 = r7.isAppInFocus     // Catch:{ JSONException -> 0x0085 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0085 }
            r5 = r1
            java.lang.String r6 = "shown"
            r7 = r0
            boolean r7 = r7.shown     // Catch:{ JSONException -> 0x0085 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0085 }
            r5 = r1
            java.lang.String r6 = "androidNotificationId"
            r7 = r0
            int r7 = r7.androidNotificationId     // Catch:{ JSONException -> 0x0085 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0085 }
            r5 = r1
            java.lang.String r6 = "displayType"
            r7 = r0
            com.onesignal.OSNotification$DisplayType r7 = r7.displayType     // Catch:{ JSONException -> 0x0085 }
            int r7 = r7.ordinal()     // Catch:{ JSONException -> 0x0085 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0085 }
            r5 = r0
            java.util.List<com.onesignal.OSNotificationPayload> r5 = r5.groupedNotifications     // Catch:{ JSONException -> 0x0085 }
            if (r5 == 0) goto L_0x0073
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0085 }
            r8 = r5
            r5 = r8
            r6 = r8
            r6.<init>()     // Catch:{ JSONException -> 0x0085 }
            r2 = r5
            r5 = r0
            java.util.List<com.onesignal.OSNotificationPayload> r5 = r5.groupedNotifications     // Catch:{ JSONException -> 0x0085 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ JSONException -> 0x0085 }
            r3 = r5
        L_0x0050:
            r5 = r3
            boolean r5 = r5.hasNext()     // Catch:{ JSONException -> 0x0085 }
            if (r5 == 0) goto L_0x006a
            r5 = r3
            java.lang.Object r5 = r5.next()     // Catch:{ JSONException -> 0x0085 }
            com.onesignal.OSNotificationPayload r5 = (com.onesignal.OSNotificationPayload) r5     // Catch:{ JSONException -> 0x0085 }
            r4 = r5
            r5 = r2
            r6 = r4
            org.json.JSONObject r6 = r6.toJSONObject()     // Catch:{ JSONException -> 0x0085 }
            org.json.JSONArray r5 = r5.put(r6)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x0050
        L_0x006a:
            r5 = r1
            java.lang.String r6 = "groupedNotifications"
            r7 = r2
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0085 }
        L_0x0073:
            r5 = r1
            java.lang.String r6 = "payload"
            r7 = r0
            com.onesignal.OSNotificationPayload r7 = r7.payload     // Catch:{ JSONException -> 0x0085 }
            org.json.JSONObject r7 = r7.toJSONObject()     // Catch:{ JSONException -> 0x0085 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0085 }
        L_0x0082:
            r5 = r1
            r0 = r5
            return r0
        L_0x0085:
            r5 = move-exception
            r2 = r5
            r5 = r2
            r5.printStackTrace()
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSNotification.toJSONObject():org.json.JSONObject");
    }
}
