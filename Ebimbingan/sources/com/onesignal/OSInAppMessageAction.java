package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSInAppMessageAction {
    private static final String CLICK_NAME = "click_name";
    private static final String CLICK_URL = "click_url";
    private static final String CLOSE = "close";
    private static final String CLOSES_MESSAGE = "closes_message";
    private static final String FIRST_CLICK = "first_click";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String OUTCOMES = "outcomes";
    private static final String PROMPTS = "prompts";
    private static final String TAGS = "tags";
    private static final String URL = "url";
    private static final String URL_TARGET = "url_target";
    @NonNull
    String clickId;
    @Nullable
    public String clickName;
    @Nullable
    public String clickUrl;
    public boolean closesMessage;
    public boolean firstClick;
    @NonNull
    public List<OSInAppMessageOutcome> outcomes;
    @NonNull
    public List<OSInAppMessagePrompt> prompts;
    public OSInAppMessageTag tags;
    @Nullable
    public OSInAppMessageActionUrlType urlTarget;

    OSInAppMessageAction(@NonNull JSONObject jSONObject) throws JSONException {
        List<OSInAppMessageOutcome> list;
        List<OSInAppMessagePrompt> list2;
        OSInAppMessageTag oSInAppMessageTag;
        JSONObject json = jSONObject;
        new ArrayList();
        this.outcomes = list;
        new ArrayList();
        this.prompts = list2;
        this.clickId = json.optString("id", (String) null);
        this.clickName = json.optString("name", (String) null);
        this.clickUrl = json.optString("url", (String) null);
        this.urlTarget = OSInAppMessageActionUrlType.fromString(json.optString(URL_TARGET, (String) null));
        if (this.urlTarget == null) {
            this.urlTarget = OSInAppMessageActionUrlType.IN_APP_WEBVIEW;
        }
        this.closesMessage = json.optBoolean(CLOSE, true);
        if (json.has(OUTCOMES)) {
            parseOutcomes(json);
        }
        if (json.has("tags")) {
            new OSInAppMessageTag(json.getJSONObject("tags"));
            this.tags = oSInAppMessageTag;
        }
        if (json.has(PROMPTS)) {
            parsePrompts(json);
        }
    }

    private void parseOutcomes(JSONObject json) throws JSONException {
        Object obj;
        JSONArray outcomesJsonArray = json.getJSONArray(OUTCOMES);
        for (int i = 0; i < outcomesJsonArray.length(); i++) {
            new OSInAppMessageOutcome((JSONObject) outcomesJsonArray.get(i));
            boolean add = this.outcomes.add(obj);
        }
    }

    private void parsePrompts(JSONObject json) throws JSONException {
        Object obj;
        JSONArray promptsJsonArray = json.getJSONArray(PROMPTS);
        for (int i = 0; i < promptsJsonArray.length(); i++) {
            if (promptsJsonArray.get(i).equals("location")) {
                new OSInAppMessageLocationPrompt();
                boolean add = this.prompts.add(obj);
            }
        }
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
            java.lang.String r6 = "click_name"
            r7 = r0
            java.lang.String r7 = r7.clickName     // Catch:{ JSONException -> 0x0081 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0081 }
            r5 = r1
            java.lang.String r6 = "click_url"
            r7 = r0
            java.lang.String r7 = r7.clickUrl     // Catch:{ JSONException -> 0x0081 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0081 }
            r5 = r1
            java.lang.String r6 = "first_click"
            r7 = r0
            boolean r7 = r7.firstClick     // Catch:{ JSONException -> 0x0081 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0081 }
            r5 = r1
            java.lang.String r6 = "closes_message"
            r7 = r0
            boolean r7 = r7.closesMessage     // Catch:{ JSONException -> 0x0081 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0081 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0081 }
            r8 = r5
            r5 = r8
            r6 = r8
            r6.<init>()     // Catch:{ JSONException -> 0x0081 }
            r2 = r5
            r5 = r0
            java.util.List<com.onesignal.OSInAppMessageOutcome> r5 = r5.outcomes     // Catch:{ JSONException -> 0x0081 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ JSONException -> 0x0081 }
            r3 = r5
        L_0x0047:
            r5 = r3
            boolean r5 = r5.hasNext()     // Catch:{ JSONException -> 0x0081 }
            if (r5 == 0) goto L_0x0061
            r5 = r3
            java.lang.Object r5 = r5.next()     // Catch:{ JSONException -> 0x0081 }
            com.onesignal.OSInAppMessageOutcome r5 = (com.onesignal.OSInAppMessageOutcome) r5     // Catch:{ JSONException -> 0x0081 }
            r4 = r5
            r5 = r2
            r6 = r4
            org.json.JSONObject r6 = r6.toJSONObject()     // Catch:{ JSONException -> 0x0081 }
            org.json.JSONArray r5 = r5.put(r6)     // Catch:{ JSONException -> 0x0081 }
            goto L_0x0047
        L_0x0061:
            r5 = r1
            java.lang.String r6 = "outcomes"
            r7 = r2
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0081 }
            r5 = r0
            com.onesignal.OSInAppMessageTag r5 = r5.tags     // Catch:{ JSONException -> 0x0081 }
            if (r5 == 0) goto L_0x007e
            r5 = r1
            java.lang.String r6 = "tags"
            r7 = r0
            com.onesignal.OSInAppMessageTag r7 = r7.tags     // Catch:{ JSONException -> 0x0081 }
            org.json.JSONObject r7 = r7.toJSONObject()     // Catch:{ JSONException -> 0x0081 }
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0081 }
        L_0x007e:
            r5 = r1
            r0 = r5
            return r0
        L_0x0081:
            r5 = move-exception
            r2 = r5
            r5 = r2
            r5.printStackTrace()
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSInAppMessageAction.toJSONObject():org.json.JSONObject");
    }

    public enum OSInAppMessageActionUrlType {
        ;
        
        private String text;

        private OSInAppMessageActionUrlType(String text2) {
            String str = r8;
            int i = r9;
            this.text = text2;
        }

        public String toString() {
            return this.text;
        }

        public static OSInAppMessageActionUrlType fromString(String str) {
            String text2 = str;
            OSInAppMessageActionUrlType[] values = values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                OSInAppMessageActionUrlType type = values[i];
                if (type.text.equalsIgnoreCase(text2)) {
                    return type;
                }
            }
            return null;
        }

        public JSONObject toJSONObject() {
            JSONObject jSONObject;
            new JSONObject();
            JSONObject mainObj = jSONObject;
            try {
                JSONObject put = mainObj.put("url_type", this.text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return mainObj;
        }
    }
}
