package com.onesignal;

import androidx.annotation.NonNull;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessage {
    private static final String DISPLAY_DURATION = "display_duration";
    private static final String END_TIME = "end_time";
    private static final String IAM_ID = "id";
    private static final String IAM_REDISPLAY_STATS = "redisplay";
    private static final String IAM_TRIGGERS = "triggers";
    private static final String IAM_VARIANTS = "variants";
    private boolean actionTaken;
    @NonNull
    private Set<String> clickedClickIds;
    private double displayDuration;
    private boolean displayedInSession = false;
    private Date endTime;
    boolean isPreview;
    @NonNull
    public String messageId;
    private OSInAppMessageRedisplayStats redisplayStats;
    private boolean triggerChanged = false;
    @NonNull
    public ArrayList<ArrayList<OSTrigger>> triggers;
    @NonNull
    public HashMap<String, HashMap<String, String>> variants;

    OSInAppMessage(boolean isPreview2) {
        OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats;
        new OSInAppMessageRedisplayStats();
        this.redisplayStats = oSInAppMessageRedisplayStats;
        this.isPreview = isPreview2;
    }

    OSInAppMessage(@NonNull String messageId2, @NonNull Set<String> clickIds, boolean displayedInSession2, OSInAppMessageRedisplayStats redisplayStats2) {
        OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats;
        new OSInAppMessageRedisplayStats();
        this.redisplayStats = oSInAppMessageRedisplayStats;
        this.messageId = messageId2;
        this.clickedClickIds = clickIds;
        this.displayedInSession = displayedInSession2;
        this.redisplayStats = redisplayStats2;
    }

    OSInAppMessage(JSONObject jSONObject) throws JSONException {
        OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats;
        Set<String> set;
        OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats2;
        JSONObject json = jSONObject;
        new OSInAppMessageRedisplayStats();
        this.redisplayStats = oSInAppMessageRedisplayStats;
        this.messageId = json.getString("id");
        this.variants = parseVariants(json.getJSONObject(IAM_VARIANTS));
        this.triggers = parseTriggerJson(json.getJSONArray(IAM_TRIGGERS));
        new HashSet();
        this.clickedClickIds = set;
        this.endTime = parseEndTimeJson(json);
        if (json.has(IAM_REDISPLAY_STATS)) {
            new OSInAppMessageRedisplayStats(json.getJSONObject(IAM_REDISPLAY_STATS));
            this.redisplayStats = oSInAppMessageRedisplayStats2;
        }
    }

    private Date parseEndTimeJson(JSONObject json) {
        try {
            String endTimeString = json.getString(END_TIME);
            if (endTimeString.equals("null")) {
                return null;
            }
            try {
                return OneSignalSimpleDateFormat.iso8601Format().parse(endTimeString);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        } catch (JSONException e2) {
            JSONException jSONException = e2;
            return null;
        }
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> parseVariants(org.json.JSONObject r15) throws org.json.JSONException {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            java.util.HashMap r9 = new java.util.HashMap
            r13 = r9
            r9 = r13
            r10 = r13
            r10.<init>()
            r2 = r9
            r9 = r1
            java.util.Iterator r9 = r9.keys()
            r3 = r9
        L_0x0011:
            r9 = r3
            boolean r9 = r9.hasNext()
            if (r9 == 0) goto L_0x005a
            r9 = r3
            java.lang.Object r9 = r9.next()
            java.lang.String r9 = (java.lang.String) r9
            r4 = r9
            r9 = r1
            r10 = r4
            org.json.JSONObject r9 = r9.getJSONObject(r10)
            r5 = r9
            java.util.HashMap r9 = new java.util.HashMap
            r13 = r9
            r9 = r13
            r10 = r13
            r10.<init>()
            r6 = r9
            r9 = r5
            java.util.Iterator r9 = r9.keys()
            r7 = r9
        L_0x0036:
            r9 = r7
            boolean r9 = r9.hasNext()
            if (r9 == 0) goto L_0x0052
            r9 = r7
            java.lang.Object r9 = r9.next()
            java.lang.String r9 = (java.lang.String) r9
            r8 = r9
            r9 = r6
            r10 = r8
            r11 = r5
            r12 = r8
            java.lang.String r11 = r11.getString(r12)
            java.lang.Object r9 = r9.put(r10, r11)
            goto L_0x0036
        L_0x0052:
            r9 = r2
            r10 = r4
            r11 = r6
            java.lang.Object r9 = r9.put(r10, r11)
            goto L_0x0011
        L_0x005a:
            r9 = r2
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSInAppMessage.parseVariants(org.json.JSONObject):java.util.HashMap");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.util.ArrayList<com.onesignal.OSTrigger>> parseTriggerJson(org.json.JSONArray r14) throws org.json.JSONException {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            java.util.ArrayList r8 = new java.util.ArrayList
            r12 = r8
            r8 = r12
            r9 = r12
            r9.<init>()
            r2 = r8
            r8 = 0
            r3 = r8
        L_0x000d:
            r8 = r3
            r9 = r1
            int r9 = r9.length()
            if (r8 >= r9) goto L_0x0050
            r8 = r1
            r9 = r3
            org.json.JSONArray r8 = r8.getJSONArray(r9)
            r4 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r12 = r8
            r8 = r12
            r9 = r12
            r9.<init>()
            r5 = r8
            r8 = 0
            r6 = r8
        L_0x0027:
            r8 = r6
            r9 = r4
            int r9 = r9.length()
            if (r8 >= r9) goto L_0x0047
            com.onesignal.OSTrigger r8 = new com.onesignal.OSTrigger
            r12 = r8
            r8 = r12
            r9 = r12
            r10 = r4
            r11 = r6
            org.json.JSONObject r10 = r10.getJSONObject(r11)
            r9.<init>(r10)
            r7 = r8
            r8 = r5
            r9 = r7
            boolean r8 = r8.add(r9)
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0047:
            r8 = r2
            r9 = r5
            boolean r8 = r8.add(r9)
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0050:
            r8 = r2
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSInAppMessage.parseTriggerJson(org.json.JSONArray):java.util.ArrayList");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v46, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v51, resolved type: org.json.JSONArray} */
    /* JADX WARNING: type inference failed for: r10v67, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r10v72, types: [org.json.JSONObject] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject toJSONObject() {
        /*
            r15 = this;
            r1 = r15
            org.json.JSONObject r10 = new org.json.JSONObject
            r14 = r10
            r10 = r14
            r11 = r14
            r11.<init>()
            r2 = r10
            r10 = r2
            java.lang.String r11 = "id"
            r12 = r1
            java.lang.String r12 = r12.messageId     // Catch:{ JSONException -> 0x0116 }
            org.json.JSONObject r10 = r10.put(r11, r12)     // Catch:{ JSONException -> 0x0116 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0116 }
            r14 = r10
            r10 = r14
            r11 = r14
            r11.<init>()     // Catch:{ JSONException -> 0x0116 }
            r3 = r10
            r10 = r1
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> r10 = r10.variants     // Catch:{ JSONException -> 0x0116 }
            java.util.Set r10 = r10.keySet()     // Catch:{ JSONException -> 0x0116 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ JSONException -> 0x0116 }
            r4 = r10
        L_0x002a:
            r10 = r4
            boolean r10 = r10.hasNext()     // Catch:{ JSONException -> 0x0116 }
            if (r10 == 0) goto L_0x007b
            r10 = r4
            java.lang.Object r10 = r10.next()     // Catch:{ JSONException -> 0x0116 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ JSONException -> 0x0116 }
            r5 = r10
            r10 = r1
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> r10 = r10.variants     // Catch:{ JSONException -> 0x0116 }
            r11 = r5
            java.lang.Object r10 = r10.get(r11)     // Catch:{ JSONException -> 0x0116 }
            java.util.HashMap r10 = (java.util.HashMap) r10     // Catch:{ JSONException -> 0x0116 }
            r6 = r10
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0116 }
            r14 = r10
            r10 = r14
            r11 = r14
            r11.<init>()     // Catch:{ JSONException -> 0x0116 }
            r7 = r10
            r10 = r6
            java.util.Set r10 = r10.keySet()     // Catch:{ JSONException -> 0x0116 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ JSONException -> 0x0116 }
            r8 = r10
        L_0x0057:
            r10 = r8
            boolean r10 = r10.hasNext()     // Catch:{ JSONException -> 0x0116 }
            if (r10 == 0) goto L_0x0073
            r10 = r8
            java.lang.Object r10 = r10.next()     // Catch:{ JSONException -> 0x0116 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ JSONException -> 0x0116 }
            r9 = r10
            r10 = r7
            r11 = r9
            r12 = r6
            r13 = r9
            java.lang.Object r12 = r12.get(r13)     // Catch:{ JSONException -> 0x0116 }
            org.json.JSONObject r10 = r10.put(r11, r12)     // Catch:{ JSONException -> 0x0116 }
            goto L_0x0057
        L_0x0073:
            r10 = r3
            r11 = r5
            r12 = r7
            org.json.JSONObject r10 = r10.put(r11, r12)     // Catch:{ JSONException -> 0x0116 }
            goto L_0x002a
        L_0x007b:
            r10 = r2
            java.lang.String r11 = "variants"
            r12 = r3
            org.json.JSONObject r10 = r10.put(r11, r12)     // Catch:{ JSONException -> 0x0116 }
            r10 = r2
            java.lang.String r11 = "display_duration"
            r12 = r1
            double r12 = r12.displayDuration     // Catch:{ JSONException -> 0x0116 }
            org.json.JSONObject r10 = r10.put(r11, r12)     // Catch:{ JSONException -> 0x0116 }
            r10 = r2
            java.lang.String r11 = "redisplay"
            r12 = r1
            com.onesignal.OSInAppMessageRedisplayStats r12 = r12.redisplayStats     // Catch:{ JSONException -> 0x0116 }
            org.json.JSONObject r12 = r12.toJSONObject()     // Catch:{ JSONException -> 0x0116 }
            org.json.JSONObject r10 = r10.put(r11, r12)     // Catch:{ JSONException -> 0x0116 }
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0116 }
            r14 = r10
            r10 = r14
            r11 = r14
            r11.<init>()     // Catch:{ JSONException -> 0x0116 }
            r4 = r10
            r10 = r1
            java.util.ArrayList<java.util.ArrayList<com.onesignal.OSTrigger>> r10 = r10.triggers     // Catch:{ JSONException -> 0x0116 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ JSONException -> 0x0116 }
            r5 = r10
        L_0x00af:
            r10 = r5
            boolean r10 = r10.hasNext()     // Catch:{ JSONException -> 0x0116 }
            if (r10 == 0) goto L_0x00ee
            r10 = r5
            java.lang.Object r10 = r10.next()     // Catch:{ JSONException -> 0x0116 }
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ JSONException -> 0x0116 }
            r6 = r10
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0116 }
            r14 = r10
            r10 = r14
            r11 = r14
            r11.<init>()     // Catch:{ JSONException -> 0x0116 }
            r7 = r10
            r10 = r6
            java.util.Iterator r10 = r10.iterator()     // Catch:{ JSONException -> 0x0116 }
            r8 = r10
        L_0x00cd:
            r10 = r8
            boolean r10 = r10.hasNext()     // Catch:{ JSONException -> 0x0116 }
            if (r10 == 0) goto L_0x00e7
            r10 = r8
            java.lang.Object r10 = r10.next()     // Catch:{ JSONException -> 0x0116 }
            com.onesignal.OSTrigger r10 = (com.onesignal.OSTrigger) r10     // Catch:{ JSONException -> 0x0116 }
            r9 = r10
            r10 = r7
            r11 = r9
            org.json.JSONObject r11 = r11.toJSONObject()     // Catch:{ JSONException -> 0x0116 }
            org.json.JSONArray r10 = r10.put(r11)     // Catch:{ JSONException -> 0x0116 }
            goto L_0x00cd
        L_0x00e7:
            r10 = r4
            r11 = r7
            org.json.JSONArray r10 = r10.put(r11)     // Catch:{ JSONException -> 0x0116 }
            goto L_0x00af
        L_0x00ee:
            r10 = r2
            java.lang.String r11 = "triggers"
            r12 = r4
            org.json.JSONObject r10 = r10.put(r11, r12)     // Catch:{ JSONException -> 0x0116 }
            r10 = r1
            java.util.Date r10 = r10.endTime     // Catch:{ JSONException -> 0x0116 }
            if (r10 == 0) goto L_0x0113
            java.text.SimpleDateFormat r10 = com.onesignal.OneSignalSimpleDateFormat.iso8601Format()     // Catch:{ JSONException -> 0x0116 }
            r5 = r10
            r10 = r5
            r11 = r1
            java.util.Date r11 = r11.endTime     // Catch:{ JSONException -> 0x0116 }
            java.lang.String r10 = r10.format(r11)     // Catch:{ JSONException -> 0x0116 }
            r6 = r10
            r10 = r2
            java.lang.String r11 = "end_time"
            r12 = r6
            org.json.JSONObject r10 = r10.put(r11, r12)     // Catch:{ JSONException -> 0x0116 }
        L_0x0113:
            r10 = r2
            r1 = r10
            return r1
        L_0x0116:
            r10 = move-exception
            r3 = r10
            r10 = r3
            r10.printStackTrace()
            goto L_0x0113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSInAppMessage.toJSONObject():org.json.JSONObject");
    }

    /* access modifiers changed from: package-private */
    public boolean takeActionAsUnique() {
        if (this.actionTaken) {
            return false;
        }
        this.actionTaken = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    public double getDisplayDuration() {
        return this.displayDuration;
    }

    /* access modifiers changed from: package-private */
    public void setDisplayDuration(double displayDuration2) {
        double d = displayDuration2;
        this.displayDuration = d;
    }

    /* access modifiers changed from: package-private */
    public boolean isTriggerChanged() {
        return this.triggerChanged;
    }

    /* access modifiers changed from: package-private */
    public void setTriggerChanged(boolean triggerChanged2) {
        boolean z = triggerChanged2;
        this.triggerChanged = z;
    }

    public boolean isDisplayedInSession() {
        return this.displayedInSession;
    }

    public void setDisplayedInSession(boolean displayedInSession2) {
        boolean z = displayedInSession2;
        this.displayedInSession = z;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public Set<String> getClickedClickIds() {
        return this.clickedClickIds;
    }

    /* access modifiers changed from: package-private */
    public boolean isClickAvailable(String clickId) {
        return !this.clickedClickIds.contains(clickId);
    }

    /* access modifiers changed from: package-private */
    public void clearClickIds() {
        this.clickedClickIds.clear();
    }

    /* access modifiers changed from: package-private */
    public void addClickId(String clickId) {
        boolean add = this.clickedClickIds.add(clickId);
    }

    /* access modifiers changed from: package-private */
    public OSInAppMessageRedisplayStats getRedisplayStats() {
        return this.redisplayStats;
    }

    /* access modifiers changed from: package-private */
    public void setRedisplayStats(int displayQuantity, long lastDisplayTime) {
        OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats;
        OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats2 = oSInAppMessageRedisplayStats;
        new OSInAppMessageRedisplayStats(displayQuantity, lastDisplayTime);
        this.redisplayStats = oSInAppMessageRedisplayStats2;
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("OSInAppMessage{messageId='").append(this.messageId).append('\'').append(", variants=").append(this.variants).append(", triggers=").append(this.triggers).append(", clickedClickIds=").append(this.clickedClickIds).append(", redisplayStats=").append(this.redisplayStats).append(", displayDuration=").append(this.displayDuration).append(", displayedInSession=").append(this.displayedInSession).append(", triggerChanged=").append(this.triggerChanged).append(", actionTaken=").append(this.actionTaken).append(", isPreview=").append(this.isPreview).append(", endTime=").append(this.endTime).append('}').toString();
    }

    public boolean equals(Object obj) {
        Object o = obj;
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return this.messageId.equals(((OSInAppMessage) o).messageId);
    }

    public int hashCode() {
        return this.messageId.hashCode();
    }

    public boolean isFinished() {
        Date now;
        if (this.endTime == null) {
            return false;
        }
        new Date();
        return this.endTime.before(now);
    }
}
