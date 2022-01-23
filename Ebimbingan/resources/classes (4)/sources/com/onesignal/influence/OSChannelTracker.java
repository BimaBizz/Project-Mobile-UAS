package com.onesignal.influence;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OSLogger;
import com.onesignal.influence.model.OSInfluence;
import com.onesignal.influence.model.OSInfluenceChannel;
import com.onesignal.influence.model.OSInfluenceType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class OSChannelTracker {
    private static final String TIME = "time";
    @NonNull
    OSInfluenceDataRepository dataRepository;
    @Nullable
    String directId;
    @Nullable
    JSONArray indirectIds;
    @Nullable
    OSInfluenceType influenceType;
    protected OSLogger logger;

    /* access modifiers changed from: package-private */
    public abstract void addSessionData(@NonNull JSONObject jSONObject, OSInfluence oSInfluence);

    public abstract void cacheState();

    /* access modifiers changed from: package-private */
    public abstract int getChannelLimit();

    /* access modifiers changed from: package-private */
    public abstract OSInfluenceChannel getChannelType();

    public abstract String getIdTag();

    /* access modifiers changed from: package-private */
    public abstract int getIndirectAttributionWindow();

    /* access modifiers changed from: package-private */
    public abstract JSONArray getLastChannelObjects() throws JSONException;

    /* access modifiers changed from: package-private */
    public abstract JSONArray getLastChannelObjectsReceivedByNewId(String str);

    /* access modifiers changed from: package-private */
    public abstract void initInfluencedTypeFromCache();

    /* access modifiers changed from: package-private */
    public abstract void saveChannelObjects(JSONArray jSONArray);

    OSChannelTracker(@NonNull OSInfluenceDataRepository dataRepository2, OSLogger logger2) {
        this.dataRepository = dataRepository2;
        this.logger = logger2;
    }

    public void resetAndInitInfluence() {
        StringBuilder sb;
        this.directId = null;
        this.indirectIds = getLastReceivedIds();
        this.influenceType = this.indirectIds.length() > 0 ? OSInfluenceType.INDIRECT : OSInfluenceType.UNATTRIBUTED;
        cacheState();
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal OSChannelTracker resetAndInitInfluence: ").append(getIdTag()).append(" finish with influenceType: ").append(this.influenceType).toString());
    }

    public JSONArray getLastReceivedIds() {
        JSONArray jSONArray;
        StringBuilder sb;
        new JSONArray();
        JSONArray ids = jSONArray;
        try {
            JSONArray lastChannelObjectReceived = getLastChannelObjects();
            OSLogger oSLogger = this.logger;
            new StringBuilder();
            oSLogger.debug(sb.append("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: ").append(lastChannelObjectReceived).toString());
            long attributionWindow = ((long) (getIndirectAttributionWindow() * 60)) * 1000;
            long currentTime = System.currentTimeMillis();
            for (int i = 0; i < lastChannelObjectReceived.length(); i++) {
                JSONObject jsonObject = lastChannelObjectReceived.getJSONObject(i);
                if (currentTime - jsonObject.getLong(TIME) <= attributionWindow) {
                    JSONArray put = ids.put(jsonObject.getString(getIdTag()));
                }
            }
        } catch (JSONException e) {
            this.logger.error("Generating tracker getLastReceivedIds JSONObject ", e);
        }
        return ids;
    }

    public void saveLastId(String str) {
        StringBuilder sb;
        StringBuilder sb2;
        JSONObject jSONObject;
        StringBuilder sb3;
        JSONArray jSONArray;
        String id = str;
        OSLogger oSLogger = this.logger;
        new StringBuilder();
        oSLogger.debug(sb.append("OneSignal OSChannelTracker for: ").append(getIdTag()).append(" saveLastId: ").append(id).toString());
        if (id != null && !id.isEmpty()) {
            JSONArray lastChannelObjectsReceived = getLastChannelObjectsReceivedByNewId(id);
            OSLogger oSLogger2 = this.logger;
            new StringBuilder();
            oSLogger2.debug(sb2.append("OneSignal OSChannelTracker for: ").append(getIdTag()).append(" saveLastId with lastChannelObjectsReceived: ").append(lastChannelObjectsReceived).toString());
            try {
                new JSONObject();
                JSONArray put = lastChannelObjectsReceived.put(jSONObject.put(getIdTag(), id).put(TIME, System.currentTimeMillis()));
                int channelLimit = getChannelLimit();
                JSONArray channelObjectToSave = lastChannelObjectsReceived;
                if (lastChannelObjectsReceived.length() > channelLimit) {
                    int lengthDifference = lastChannelObjectsReceived.length() - channelLimit;
                    new JSONArray();
                    channelObjectToSave = jSONArray;
                    for (int i = lengthDifference; i < lastChannelObjectsReceived.length(); i++) {
                        try {
                            JSONArray put2 = channelObjectToSave.put(lastChannelObjectsReceived.get(i));
                        } catch (JSONException e) {
                            this.logger.error("Before KITKAT API, Generating tracker lastChannelObjectsReceived get JSONObject ", e);
                        }
                    }
                }
                OSLogger oSLogger3 = this.logger;
                new StringBuilder();
                oSLogger3.debug(sb3.append("OneSignal OSChannelTracker for: ").append(getIdTag()).append(" with channelObjectToSave: ").append(channelObjectToSave).toString());
                saveChannelObjects(channelObjectToSave);
            } catch (JSONException e2) {
                this.logger.error("Generating tracker newInfluenceId JSONObject ", e2);
            }
        }
    }

    @NonNull
    public OSInfluence getCurrentSessionInfluence() {
        JSONArray jSONArray;
        OSInfluence.Builder sessionInfluenceBuilder = OSInfluence.Builder.newInstance().setInfluenceType(OSInfluenceType.DISABLED);
        if (this.influenceType == null) {
            initInfluencedTypeFromCache();
        }
        if (this.influenceType.isDirect()) {
            if (isDirectSessionEnabled()) {
                new JSONArray();
                sessionInfluenceBuilder = OSInfluence.Builder.newInstance().setIds(jSONArray.put(this.directId)).setInfluenceType(OSInfluenceType.DIRECT);
            }
        } else if (this.influenceType.isIndirect()) {
            if (isIndirectSessionEnabled()) {
                sessionInfluenceBuilder = OSInfluence.Builder.newInstance().setIds(this.indirectIds).setInfluenceType(OSInfluenceType.INDIRECT);
            }
        } else if (isUnattributedSessionEnabled()) {
            sessionInfluenceBuilder = OSInfluence.Builder.newInstance().setInfluenceType(OSInfluenceType.UNATTRIBUTED);
        }
        return sessionInfluenceBuilder.setInfluenceChannel(getChannelType()).build();
    }

    private boolean isDirectSessionEnabled() {
        return this.dataRepository.isDirectInfluenceEnabled();
    }

    private boolean isIndirectSessionEnabled() {
        return this.dataRepository.isIndirectInfluenceEnabled();
    }

    private boolean isUnattributedSessionEnabled() {
        return this.dataRepository.isUnattributedInfluenceEnabled();
    }

    @Nullable
    public OSInfluenceType getInfluenceType() {
        return this.influenceType;
    }

    public void setInfluenceType(@NonNull OSInfluenceType influenceType2) {
        OSInfluenceType oSInfluenceType = influenceType2;
        this.influenceType = oSInfluenceType;
    }

    @Nullable
    public JSONArray getIndirectIds() {
        return this.indirectIds;
    }

    public void setIndirectIds(@Nullable JSONArray indirectIds2) {
        JSONArray jSONArray = indirectIds2;
        this.indirectIds = jSONArray;
    }

    @Nullable
    public String getDirectId() {
        return this.directId;
    }

    public void setDirectId(@Nullable String directId2) {
        String str = directId2;
        this.directId = str;
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("OSChannelTracker{tag=").append(getIdTag()).append(", influenceType=").append(this.influenceType).append(", indirectIds=").append(this.indirectIds).append(", directId='").append(this.directId).append('\'').append('}').toString();
    }

    public boolean equals(Object obj) {
        Object o = obj;
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OSChannelTracker tracker = (OSChannelTracker) o;
        return this.influenceType == tracker.influenceType && tracker.getIdTag().equals(getIdTag());
    }

    public int hashCode() {
        return (31 * this.influenceType.hashCode()) + getIdTag().hashCode();
    }
}
