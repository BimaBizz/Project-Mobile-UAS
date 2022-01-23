package com.onesignal.influence;

import androidx.annotation.NonNull;
import com.onesignal.OSLogger;
import com.onesignal.influence.model.OSInfluence;
import com.onesignal.influence.model.OSInfluenceChannel;
import com.onesignal.influence.model.OSInfluenceType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSNotificationTracker extends OSChannelTracker {
    private static final String DIRECT_TAG = "direct";
    private static final String NOTIFICATIONS_IDS = "notification_ids";
    private static final String NOTIFICATION_ID = "notification_id";
    public static final String TAG = OSNotificationTracker.class.getCanonicalName();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OSNotificationTracker(@NonNull OSInfluenceDataRepository dataRepository, OSLogger logger) {
        super(dataRepository, logger);
    }

    public String getIdTag() {
        return "notification_id";
    }

    /* access modifiers changed from: package-private */
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        JSONArray jSONArray;
        String str2 = str;
        try {
            return getLastChannelObjects();
        } catch (JSONException e) {
            this.logger.error("Generating Notification tracker getLastChannelObjects JSONObject ", e);
            new JSONArray();
            return jSONArray;
        }
    }

    /* access modifiers changed from: package-private */
    public JSONArray getLastChannelObjects() throws JSONException {
        return this.dataRepository.getLastNotificationsReceivedData();
    }

    /* access modifiers changed from: package-private */
    public OSInfluenceChannel getChannelType() {
        return OSInfluenceChannel.NOTIFICATION;
    }

    /* access modifiers changed from: package-private */
    public int getChannelLimit() {
        return this.dataRepository.getNotificationLimit();
    }

    /* access modifiers changed from: package-private */
    public int getIndirectAttributionWindow() {
        return this.dataRepository.getNotificationIndirectAttributionWindow();
    }

    /* access modifiers changed from: package-private */
    public void saveChannelObjects(JSONArray channelObjects) {
        this.dataRepository.saveNotifications(channelObjects);
    }

    /* access modifiers changed from: package-private */
    public void initInfluencedTypeFromCache() {
        StringBuilder sb;
        OSInfluenceType influenceType = this.dataRepository.getNotificationCachedInfluenceType();
        setInfluenceType(influenceType);
        if (influenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        } else if (influenceType.isDirect()) {
            setDirectId(this.dataRepository.getCachedNotificationOpenId());
        }
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal NotificationTracker initInfluencedTypeFromCache: ").append(toString()).toString());
    }

    /* access modifiers changed from: package-private */
    public void addSessionData(@NonNull JSONObject jSONObject, OSInfluence oSInfluence) {
        JSONObject jsonObject = jSONObject;
        OSInfluence influence = oSInfluence;
        if (influence.getInfluenceType().isAttributed()) {
            try {
                JSONObject put = jsonObject.put(DIRECT_TAG, influence.getInfluenceType().isDirect());
                JSONObject put2 = jsonObject.put(NOTIFICATIONS_IDS, influence.getIds());
            } catch (JSONException e) {
                this.logger.error("Generating notification tracker addSessionData JSONObject ", e);
            }
        }
    }

    public void cacheState() {
        this.dataRepository.cacheNotificationInfluenceType(this.influenceType == null ? OSInfluenceType.UNATTRIBUTED : this.influenceType);
        this.dataRepository.cacheNotificationOpenId(this.directId);
    }
}
