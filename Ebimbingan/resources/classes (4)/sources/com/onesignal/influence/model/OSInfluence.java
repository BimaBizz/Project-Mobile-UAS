package com.onesignal.influence.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSInfluence {
    private static final String INFLUENCE_CHANNEL = "influence_channel";
    private static final String INFLUENCE_IDS = "influence_ids";
    private static final String INFLUENCE_TYPE = "influence_type";
    @Nullable
    private JSONArray ids;
    private OSInfluenceChannel influenceChannel;
    private OSInfluenceType influenceType;

    private OSInfluence() {
    }

    public OSInfluence(@NonNull String jsonString) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        new JSONObject(jsonString);
        JSONObject jsonObject = jSONObject;
        String channel = jsonObject.getString(INFLUENCE_CHANNEL);
        String type = jsonObject.getString(INFLUENCE_TYPE);
        String ids2 = jsonObject.getString(INFLUENCE_IDS);
        this.influenceChannel = OSInfluenceChannel.fromString(channel);
        this.influenceType = OSInfluenceType.fromString(type);
        if (ids2.isEmpty()) {
            jSONArray2 = null;
        } else {
            jSONArray2 = jSONArray;
            new JSONArray(ids2);
        }
        this.ids = jSONArray2;
    }

    OSInfluence(@NonNull Builder builder) {
        Builder builder2 = builder;
        this.ids = builder2.ids;
        this.influenceType = builder2.influenceType;
        this.influenceChannel = builder2.influenceChannel;
    }

    public OSInfluenceChannel getInfluenceChannel() {
        return this.influenceChannel;
    }

    @NonNull
    public OSInfluenceType getInfluenceType() {
        return this.influenceType;
    }

    @Nullable
    public JSONArray getIds() {
        return this.ids;
    }

    @Nullable
    public String getDirectId() throws JSONException {
        return (this.ids == null || this.ids.length() <= 0) ? null : this.ids.getString(0);
    }

    public void setIds(@NonNull JSONArray ids2) {
        JSONArray jSONArray = ids2;
        this.ids = jSONArray;
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public JSONArray ids;
        /* access modifiers changed from: private */
        public OSInfluenceChannel influenceChannel;
        /* access modifiers changed from: private */
        public OSInfluenceType influenceType;

        public static Builder newInstance() {
            Builder builder;
            Builder builder2 = builder;
            new Builder();
            return builder2;
        }

        private Builder() {
        }

        public Builder setIds(@Nullable JSONArray ids2) {
            this.ids = ids2;
            return this;
        }

        public Builder setInfluenceType(@NonNull OSInfluenceType influenceType2) {
            this.influenceType = influenceType2;
            return this;
        }

        public Builder setInfluenceChannel(OSInfluenceChannel influenceChannel2) {
            this.influenceChannel = influenceChannel2;
            return this;
        }

        public OSInfluence build() {
            OSInfluence oSInfluence;
            new OSInfluence(this);
            return oSInfluence;
        }
    }

    public OSInfluence copy() {
        OSInfluence oSInfluence;
        new OSInfluence();
        OSInfluence influence = oSInfluence;
        influence.ids = this.ids;
        influence.influenceType = this.influenceType;
        influence.influenceChannel = this.influenceChannel;
        return influence;
    }

    public String toJSONString() throws JSONException {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject jsonObject = jSONObject;
        JSONObject put = jsonObject.put(INFLUENCE_CHANNEL, this.influenceChannel.toString());
        JSONObject put2 = jsonObject.put(INFLUENCE_TYPE, this.influenceType.toString());
        JSONObject put3 = jsonObject.put(INFLUENCE_IDS, this.ids != null ? this.ids.toString() : "");
        return jsonObject.toString();
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("SessionInfluence{influenceChannel=").append(this.influenceChannel).append(", influenceType=").append(this.influenceType).append(", ids=").append(this.ids).append('}').toString();
    }

    public boolean equals(Object obj) {
        Object o = obj;
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OSInfluence that = (OSInfluence) o;
        return this.influenceChannel == that.influenceChannel && this.influenceType == that.influenceType;
    }

    public int hashCode() {
        return (31 * this.influenceChannel.hashCode()) + this.influenceType.hashCode();
    }
}
