package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageDummyController extends OSInAppMessageController {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OSInAppMessageDummyController(OneSignalDbHelper dbHelper) {
        super(dbHelper);
    }

    public void initRedisplayData(OneSignalDbHelper dbHelper) {
    }

    /* access modifiers changed from: package-private */
    public void initWithCachedInAppMessages() {
    }

    /* access modifiers changed from: package-private */
    public void receivedInAppMessageJson(@NonNull JSONArray json) throws JSONException {
    }

    /* access modifiers changed from: package-private */
    public void onMessageActionOccurredOnMessage(@NonNull OSInAppMessage message, @NonNull JSONObject actionJson) {
    }

    /* access modifiers changed from: package-private */
    public void onMessageActionOccurredOnPreview(@NonNull OSInAppMessage message, @NonNull JSONObject actionJson) {
    }

    /* access modifiers changed from: package-private */
    public boolean isInAppMessageShowing() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public OSInAppMessage getCurrentDisplayedInAppMessage() {
        return null;
    }

    public void messageWasDismissed(@NonNull OSInAppMessage message) {
    }

    /* access modifiers changed from: package-private */
    public void displayPreviewMessage(@NonNull String previewUUID) {
    }

    public void messageTriggerConditionChanged() {
    }

    /* access modifiers changed from: package-private */
    public void addTriggers(Map<String, Object> map) {
    }

    /* access modifiers changed from: package-private */
    public void removeTriggersForKeys(Collection<String> collection) {
    }

    /* access modifiers changed from: package-private */
    public void setInAppMessagingEnabled(boolean enabled) {
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Object getTriggerValue(String str) {
        String str2 = str;
        return null;
    }
}
