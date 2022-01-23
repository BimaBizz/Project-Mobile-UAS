package com.onesignal;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import com.onesignal.OneSignalDbContract;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.shaded.apache.commons.logging.LogFactory;

public class OSNotificationPayload {
    public List<ActionButton> actionButtons;
    public JSONObject additionalData;
    public BackgroundImageLayout backgroundImageLayout;
    public String bigPicture;
    public String body;
    public String collapseId;
    public String fromProjectNumber;
    public String groupKey;
    public String groupMessage;
    public String largeIcon;
    public String launchURL;
    public String ledColor;
    public int lockScreenVisibility = 1;
    public String notificationID;
    public int priority;
    public String rawPayload;
    public String smallIcon;
    public String smallIconAccentColor;
    public String sound;
    public String templateId;
    public String templateName;
    public String title;

    public OSNotificationPayload() {
    }

    public OSNotificationPayload(JSONObject jSONObject) {
        List<ActionButton> list;
        Object obj;
        JSONObject jsonObject = jSONObject;
        this.notificationID = jsonObject.optString("notificationID");
        this.title = jsonObject.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        this.body = jsonObject.optString("body");
        this.additionalData = jsonObject.optJSONObject("additionalData");
        this.smallIcon = jsonObject.optString("smallIcon");
        this.largeIcon = jsonObject.optString("largeIcon");
        this.bigPicture = jsonObject.optString("bigPicture");
        this.smallIconAccentColor = jsonObject.optString("smallIconAccentColor");
        this.launchURL = jsonObject.optString("launchURL");
        this.sound = jsonObject.optString("sound");
        this.ledColor = jsonObject.optString("ledColor");
        this.lockScreenVisibility = jsonObject.optInt("lockScreenVisibility");
        this.groupKey = jsonObject.optString("groupKey");
        this.groupMessage = jsonObject.optString("groupMessage");
        if (jsonObject.has("actionButtons")) {
            new ArrayList();
            this.actionButtons = list;
            JSONArray jsonArray = jsonObject.optJSONArray("actionButtons");
            for (int i = 0; i < jsonArray.length(); i++) {
                new ActionButton(jsonArray.optJSONObject(i));
                boolean add = this.actionButtons.add(obj);
            }
        }
        this.fromProjectNumber = jsonObject.optString("fromProjectNumber");
        this.collapseId = jsonObject.optString("collapseId");
        this.priority = jsonObject.optInt(LogFactory.PRIORITY_KEY);
        this.rawPayload = jsonObject.optString("rawPayload");
    }

    public static class ActionButton {
        public String icon;
        public String id;
        public String text;

        public ActionButton() {
        }

        public ActionButton(JSONObject jSONObject) {
            JSONObject jsonObject = jSONObject;
            this.id = jsonObject.optString(CommonProperties.ID);
            this.text = jsonObject.optString(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
            this.icon = jsonObject.optString("icon");
        }

        public JSONObject toJSONObject() {
            JSONObject jSONObject;
            new JSONObject();
            JSONObject json = jSONObject;
            try {
                JSONObject put = json.put(CommonProperties.ID, this.id);
                JSONObject put2 = json.put(PropertyTypeConstants.PROPERTY_TYPE_TEXT, this.text);
                JSONObject put3 = json.put("icon", this.icon);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return json;
        }
    }

    public static class BackgroundImageLayout {
        public String bodyTextColor;
        public String image;
        public String titleTextColor;

        public BackgroundImageLayout() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: org.json.JSONArray} */
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
            java.lang.String r6 = "notificationID"
            r7 = r0
            java.lang.String r7 = r7.notificationID     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "title"
            r7 = r0
            java.lang.String r7 = r7.title     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "body"
            r7 = r0
            java.lang.String r7 = r7.body     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r0
            org.json.JSONObject r5 = r5.additionalData     // Catch:{ Throwable -> 0x0111 }
            if (r5 == 0) goto L_0x003b
            r5 = r1
            java.lang.String r6 = "additionalData"
            r7 = r0
            org.json.JSONObject r7 = r7.additionalData     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
        L_0x003b:
            r5 = r1
            java.lang.String r6 = "smallIcon"
            r7 = r0
            java.lang.String r7 = r7.smallIcon     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "largeIcon"
            r7 = r0
            java.lang.String r7 = r7.largeIcon     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "bigPicture"
            r7 = r0
            java.lang.String r7 = r7.bigPicture     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "smallIconAccentColor"
            r7 = r0
            java.lang.String r7 = r7.smallIconAccentColor     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "launchURL"
            r7 = r0
            java.lang.String r7 = r7.launchURL     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "sound"
            r7 = r0
            java.lang.String r7 = r7.sound     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "ledColor"
            r7 = r0
            java.lang.String r7 = r7.ledColor     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "lockScreenVisibility"
            r7 = r0
            int r7 = r7.lockScreenVisibility     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "groupKey"
            r7 = r0
            java.lang.String r7 = r7.groupKey     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "groupMessage"
            r7 = r0
            java.lang.String r7 = r7.groupMessage     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r0
            java.util.List<com.onesignal.OSNotificationPayload$ActionButton> r5 = r5.actionButtons     // Catch:{ Throwable -> 0x0111 }
            if (r5 == 0) goto L_0x00e2
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0111 }
            r8 = r5
            r5 = r8
            r6 = r8
            r6.<init>()     // Catch:{ Throwable -> 0x0111 }
            r2 = r5
            r5 = r0
            java.util.List<com.onesignal.OSNotificationPayload$ActionButton> r5 = r5.actionButtons     // Catch:{ Throwable -> 0x0111 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Throwable -> 0x0111 }
            r3 = r5
        L_0x00bf:
            r5 = r3
            boolean r5 = r5.hasNext()     // Catch:{ Throwable -> 0x0111 }
            if (r5 == 0) goto L_0x00d9
            r5 = r3
            java.lang.Object r5 = r5.next()     // Catch:{ Throwable -> 0x0111 }
            com.onesignal.OSNotificationPayload$ActionButton r5 = (com.onesignal.OSNotificationPayload.ActionButton) r5     // Catch:{ Throwable -> 0x0111 }
            r4 = r5
            r5 = r2
            r6 = r4
            org.json.JSONObject r6 = r6.toJSONObject()     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONArray r5 = r5.put(r6)     // Catch:{ Throwable -> 0x0111 }
            goto L_0x00bf
        L_0x00d9:
            r5 = r1
            java.lang.String r6 = "actionButtons"
            r7 = r2
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
        L_0x00e2:
            r5 = r1
            java.lang.String r6 = "fromProjectNumber"
            r7 = r0
            java.lang.String r7 = r7.fromProjectNumber     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "collapseId"
            r7 = r0
            java.lang.String r7 = r7.collapseId     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "priority"
            r7 = r0
            int r7 = r7.priority     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
            r5 = r1
            java.lang.String r6 = "rawPayload"
            r7 = r0
            java.lang.String r7 = r7.rawPayload     // Catch:{ Throwable -> 0x0111 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ Throwable -> 0x0111 }
        L_0x010e:
            r5 = r1
            r0 = r5
            return r0
        L_0x0111:
            r5 = move-exception
            r2 = r5
            r5 = r2
            r5.printStackTrace()
            goto L_0x010e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSNotificationPayload.toJSONObject():org.json.JSONObject");
    }
}
