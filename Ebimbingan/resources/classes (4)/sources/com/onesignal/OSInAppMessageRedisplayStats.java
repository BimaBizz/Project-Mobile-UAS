package com.onesignal;

import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageRedisplayStats {
    private static final String DISPLAY_DELAY = "delay";
    private static final String DISPLAY_LIMIT = "limit";
    private long displayDelay;
    private int displayLimit;
    private int displayQuantity;
    private long lastDisplayTime;
    private boolean redisplayEnabled;

    OSInAppMessageRedisplayStats() {
        this.lastDisplayTime = -1;
        this.displayQuantity = 0;
        this.displayLimit = 1;
        this.displayDelay = 0;
        this.redisplayEnabled = false;
    }

    OSInAppMessageRedisplayStats(int displayQuantity2, long lastDisplayTime2) {
        this.lastDisplayTime = -1;
        this.displayQuantity = 0;
        this.displayLimit = 1;
        this.displayDelay = 0;
        this.redisplayEnabled = false;
        this.displayQuantity = displayQuantity2;
        this.lastDisplayTime = lastDisplayTime2;
    }

    OSInAppMessageRedisplayStats(JSONObject jSONObject) throws JSONException {
        JSONObject json = jSONObject;
        this.lastDisplayTime = -1;
        this.displayQuantity = 0;
        this.displayLimit = 1;
        this.displayDelay = 0;
        this.redisplayEnabled = false;
        this.redisplayEnabled = true;
        Object displayLimit2 = json.get(DISPLAY_LIMIT);
        Object displayDelay2 = json.get(DISPLAY_DELAY);
        if (displayLimit2 instanceof Integer) {
            this.displayLimit = ((Integer) displayLimit2).intValue();
        }
        if (displayDelay2 instanceof Long) {
            this.displayDelay = ((Long) displayDelay2).longValue();
        } else if (displayDelay2 instanceof Integer) {
            this.displayDelay = (long) ((Integer) displayDelay2).intValue();
        }
    }

    /* access modifiers changed from: package-private */
    public void setDisplayStats(OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats) {
        OSInAppMessageRedisplayStats displayStats = oSInAppMessageRedisplayStats;
        setLastDisplayTime(displayStats.getLastDisplayTime());
        setDisplayQuantity(displayStats.getDisplayQuantity());
    }

    /* access modifiers changed from: package-private */
    public long getLastDisplayTime() {
        return this.lastDisplayTime;
    }

    /* access modifiers changed from: package-private */
    public void setLastDisplayTime(long lastDisplayTime2) {
        long j = lastDisplayTime2;
        this.lastDisplayTime = j;
    }

    /* access modifiers changed from: package-private */
    public void incrementDisplayQuantity() {
        this.displayQuantity++;
    }

    /* access modifiers changed from: package-private */
    public int getDisplayQuantity() {
        return this.displayQuantity;
    }

    /* access modifiers changed from: package-private */
    public void setDisplayQuantity(int displayQuantity2) {
        int i = displayQuantity2;
        this.displayQuantity = i;
    }

    /* access modifiers changed from: package-private */
    public int getDisplayLimit() {
        return this.displayLimit;
    }

    /* access modifiers changed from: package-private */
    public void setDisplayLimit(int displayLimit2) {
        int i = displayLimit2;
        this.displayLimit = i;
    }

    /* access modifiers changed from: package-private */
    public long getDisplayDelay() {
        return this.displayDelay;
    }

    /* access modifiers changed from: package-private */
    public void setDisplayDelay(long displayDelay2) {
        long j = displayDelay2;
        this.displayDelay = j;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDisplayAgain() {
        StringBuilder sb;
        boolean result = this.displayQuantity < this.displayLimit;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("OSInAppMessage shouldDisplayAgain: ").append(result).toString());
        return result;
    }

    /* access modifiers changed from: package-private */
    public boolean isDelayTimeSatisfied() {
        StringBuilder sb;
        if (this.lastDisplayTime < 0) {
            return true;
        }
        long currentTimeInSeconds = System.currentTimeMillis() / 1000;
        long diffInSeconds = currentTimeInSeconds - this.lastDisplayTime;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("OSInAppMessage lastDisplayTime: ").append(this.lastDisplayTime).append(" currentTimeInSeconds: ").append(currentTimeInSeconds).append(" diffInSeconds: ").append(diffInSeconds).append(" displayDelay: ").append(this.displayDelay).toString());
        return diffInSeconds >= this.displayDelay;
    }

    public boolean isRedisplayEnabled() {
        return this.redisplayEnabled;
    }

    /* access modifiers changed from: package-private */
    public JSONObject toJSONObject() {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject json = jSONObject;
        try {
            JSONObject put = json.put(DISPLAY_LIMIT, this.displayLimit);
            JSONObject put2 = json.put(DISPLAY_DELAY, this.displayDelay);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json;
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("OSInAppMessageDisplayStats{lastDisplayTime=").append(this.lastDisplayTime).append(", displayQuantity=").append(this.displayQuantity).append(", displayLimit=").append(this.displayLimit).append(", displayDelay=").append(this.displayDelay).append('}').toString();
    }
}
