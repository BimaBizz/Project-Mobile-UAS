package com.onesignal;

import androidx.annotation.NonNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSInAppMessageTag {
    private static final String ADD_TAGS = "adds";
    private static final String REMOVE_TAGS = "removes";
    private JSONObject tagsToAdd;
    private JSONArray tagsToRemove;

    OSInAppMessageTag(@NonNull JSONObject jSONObject) throws JSONException {
        JSONObject json = jSONObject;
        this.tagsToAdd = json.has(ADD_TAGS) ? json.getJSONObject(ADD_TAGS) : null;
        this.tagsToRemove = json.has(REMOVE_TAGS) ? json.getJSONArray(REMOVE_TAGS) : null;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject mainObj = jSONObject;
        try {
            if (this.tagsToAdd != null) {
                JSONObject put = mainObj.put(ADD_TAGS, this.tagsToAdd);
            }
            if (this.tagsToRemove != null) {
                JSONObject put2 = mainObj.put(REMOVE_TAGS, this.tagsToRemove);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mainObj;
    }

    public JSONObject getTagsToAdd() {
        return this.tagsToAdd;
    }

    public void setTagsToAdd(JSONObject tagsToAdd2) {
        JSONObject jSONObject = tagsToAdd2;
        this.tagsToAdd = jSONObject;
    }

    public JSONArray getTagsToRemove() {
        return this.tagsToRemove;
    }

    public void setTagsToRemove(JSONArray tagsToRemove2) {
        JSONArray jSONArray = tagsToRemove2;
        this.tagsToRemove = jSONArray;
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("OSInAppMessageTag{adds=").append(this.tagsToAdd).append(", removes=").append(this.tagsToRemove).append('}').toString();
    }
}
