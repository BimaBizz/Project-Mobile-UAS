package com.onesignal.influence;

import androidx.annotation.NonNull;
import com.onesignal.OSLogger;
import com.onesignal.influence.model.OSInfluence;
import com.onesignal.influence.model.OSInfluenceChannel;
import com.onesignal.influence.model.OSInfluenceType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageTracker extends OSChannelTracker {
    private static final String IAM_ID = "iam_id";
    public static final String TAG = OSInAppMessageTracker.class.getCanonicalName();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OSInAppMessageTracker(@NonNull OSInfluenceDataRepository dataRepository, OSLogger logger) {
        super(dataRepository, logger);
    }

    public String getIdTag() {
        return IAM_ID;
    }

    /* access modifiers changed from: package-private */
    public OSInfluenceChannel getChannelType() {
        return OSInfluenceChannel.IAM;
    }

    /* access modifiers changed from: package-private */
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        String id = str;
        try {
            JSONArray lastChannelObjectReceived = getLastChannelObjects();
            try {
                new JSONArray();
                JSONArray auxLastChannelObjectReceived = jSONArray2;
                for (int i = 0; i < lastChannelObjectReceived.length(); i++) {
                    if (!id.equals(lastChannelObjectReceived.getJSONObject(i).getString(getIdTag()))) {
                        JSONArray put = auxLastChannelObjectReceived.put(lastChannelObjectReceived.getJSONObject(i));
                    }
                }
                lastChannelObjectReceived = auxLastChannelObjectReceived;
            } catch (JSONException e) {
                this.logger.error("Before KITKAT API, Generating tracker lastChannelObjectReceived get JSONObject ", e);
            }
            return lastChannelObjectReceived;
        } catch (JSONException e2) {
            this.logger.error("Generating IAM tracker getLastChannelObjects JSONObject ", e2);
            new JSONArray();
            return jSONArray;
        }
    }

    /* access modifiers changed from: package-private */
    public JSONArray getLastChannelObjects() throws JSONException {
        return this.dataRepository.getLastIAMsReceivedData();
    }

    /* access modifiers changed from: package-private */
    public int getChannelLimit() {
        return this.dataRepository.getIAMLimit();
    }

    /* access modifiers changed from: package-private */
    public int getIndirectAttributionWindow() {
        return this.dataRepository.getIAMIndirectAttributionWindow();
    }

    /* access modifiers changed from: package-private */
    public void saveChannelObjects(JSONArray channelObjects) {
        this.dataRepository.saveIAMs(channelObjects);
    }

    /* access modifiers changed from: package-private */
    public void initInfluencedTypeFromCache() {
        StringBuilder sb;
        setInfluenceType(this.dataRepository.getIAMCachedInfluenceType());
        if (this.influenceType != null && this.influenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        }
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal InAppMessageTracker initInfluencedTypeFromCache: ").append(toString()).toString());
    }

    /* access modifiers changed from: package-private */
    public void addSessionData(@NonNull JSONObject jsonObject, OSInfluence influence) {
    }

    public void cacheState() {
        OSInfluenceType influenceTypeToCache = this.influenceType == null ? OSInfluenceType.UNATTRIBUTED : this.influenceType;
        this.dataRepository.cacheIAMInfluenceType(influenceTypeToCache == OSInfluenceType.DIRECT ? OSInfluenceType.INDIRECT : influenceTypeToCache);
    }
}
