package com.onesignal.influence;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.influence.model.OSInfluenceType;
import org.json.JSONArray;
import org.json.JSONException;

class OSInfluenceDataRepository {
    protected static final String PREFS_OS_DIRECT_ENABLED = "PREFS_OS_DIRECT_ENABLED";
    protected static final String PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW = "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW";
    protected static final String PREFS_OS_IAM_LIMIT = "PREFS_OS_IAM_LIMIT";
    protected static final String PREFS_OS_INDIRECT_ENABLED = "PREFS_OS_INDIRECT_ENABLED";
    protected static final String PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN = "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN";
    protected static final String PREFS_OS_LAST_IAMS_RECEIVED = "PREFS_OS_LAST_IAMS_RECEIVED";
    protected static final String PREFS_OS_LAST_NOTIFICATIONS_RECEIVED = "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED";
    protected static final String PREFS_OS_NOTIFICATION_INDIRECT_ATTRIBUTION_WINDOW = "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW";
    protected static final String PREFS_OS_NOTIFICATION_LIMIT = "PREFS_OS_NOTIFICATION_LIMIT";
    protected static final String PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE = "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE";
    protected static final String PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE = "PREFS_OS_OUTCOMES_CURRENT_SESSION";
    protected static final String PREFS_OS_UNATTRIBUTED_ENABLED = "PREFS_OS_UNATTRIBUTED_ENABLED";
    private OSSharedPreferences preferences;

    public OSInfluenceDataRepository(OSSharedPreferences preferences2) {
        this.preferences = preferences2;
    }

    /* access modifiers changed from: package-private */
    public void cacheNotificationInfluenceType(@NonNull OSInfluenceType influenceType) {
        this.preferences.saveString(this.preferences.getPreferencesName(), PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, influenceType.toString());
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public OSInfluenceType getNotificationCachedInfluenceType() {
        return OSInfluenceType.fromString(this.preferences.getString(this.preferences.getPreferencesName(), PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, OSInfluenceType.UNATTRIBUTED.toString()));
    }

    /* access modifiers changed from: package-private */
    public void cacheIAMInfluenceType(@NonNull OSInfluenceType influenceType) {
        this.preferences.saveString(this.preferences.getPreferencesName(), PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, influenceType.toString());
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public OSInfluenceType getIAMCachedInfluenceType() {
        return OSInfluenceType.fromString(this.preferences.getString(this.preferences.getPreferencesName(), PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, OSInfluenceType.UNATTRIBUTED.toString()));
    }

    /* access modifiers changed from: package-private */
    public void cacheNotificationOpenId(@Nullable String id) {
        this.preferences.saveString(this.preferences.getPreferencesName(), PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, id);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public String getCachedNotificationOpenId() {
        return this.preferences.getString(this.preferences.getPreferencesName(), PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, (String) null);
    }

    /* access modifiers changed from: package-private */
    public void saveNotifications(@NonNull JSONArray notifications) {
        this.preferences.saveString(this.preferences.getPreferencesName(), PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, notifications.toString());
    }

    /* access modifiers changed from: package-private */
    public void saveIAMs(@NonNull JSONArray iams) {
        this.preferences.saveString(this.preferences.getPreferencesName(), PREFS_OS_LAST_IAMS_RECEIVED, iams.toString());
    }

    /* access modifiers changed from: package-private */
    public JSONArray getLastNotificationsReceivedData() throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        String notificationsReceived = this.preferences.getString(this.preferences.getPreferencesName(), PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, "[]");
        if (notificationsReceived != null) {
            jSONArray2 = jSONArray3;
            new JSONArray(notificationsReceived);
        } else {
            jSONArray2 = jSONArray;
            new JSONArray();
        }
        return jSONArray2;
    }

    /* access modifiers changed from: package-private */
    public JSONArray getLastIAMsReceivedData() throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        String iamReceived = this.preferences.getString(this.preferences.getPreferencesName(), PREFS_OS_LAST_IAMS_RECEIVED, "[]");
        if (iamReceived != null) {
            jSONArray2 = jSONArray3;
            new JSONArray(iamReceived);
        } else {
            jSONArray2 = jSONArray;
            new JSONArray();
        }
        return jSONArray2;
    }

    /* access modifiers changed from: package-private */
    public int getNotificationLimit() {
        return this.preferences.getInt(this.preferences.getPreferencesName(), PREFS_OS_NOTIFICATION_LIMIT, 10);
    }

    /* access modifiers changed from: package-private */
    public int getIAMLimit() {
        return this.preferences.getInt(this.preferences.getPreferencesName(), PREFS_OS_IAM_LIMIT, 10);
    }

    /* access modifiers changed from: package-private */
    public int getNotificationIndirectAttributionWindow() {
        return this.preferences.getInt(this.preferences.getPreferencesName(), PREFS_OS_NOTIFICATION_INDIRECT_ATTRIBUTION_WINDOW, OneSignalRemoteParams.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
    }

    /* access modifiers changed from: package-private */
    public int getIAMIndirectAttributionWindow() {
        return this.preferences.getInt(this.preferences.getPreferencesName(), PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW, OneSignalRemoteParams.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
    }

    /* access modifiers changed from: package-private */
    public boolean isDirectInfluenceEnabled() {
        return this.preferences.getBool(this.preferences.getPreferencesName(), PREFS_OS_DIRECT_ENABLED, false);
    }

    /* access modifiers changed from: package-private */
    public boolean isIndirectInfluenceEnabled() {
        return this.preferences.getBool(this.preferences.getPreferencesName(), PREFS_OS_INDIRECT_ENABLED, false);
    }

    /* access modifiers changed from: package-private */
    public boolean isUnattributedInfluenceEnabled() {
        return this.preferences.getBool(this.preferences.getPreferencesName(), PREFS_OS_UNATTRIBUTED_ENABLED, false);
    }

    /* access modifiers changed from: package-private */
    public void saveInfluenceParams(OneSignalRemoteParams.InfluenceParams influenceParams) {
        OneSignalRemoteParams.InfluenceParams influenceParams2 = influenceParams;
        this.preferences.saveBool(this.preferences.getPreferencesName(), PREFS_OS_DIRECT_ENABLED, influenceParams2.isDirectEnabled());
        this.preferences.saveBool(this.preferences.getPreferencesName(), PREFS_OS_INDIRECT_ENABLED, influenceParams2.isIndirectEnabled());
        this.preferences.saveBool(this.preferences.getPreferencesName(), PREFS_OS_UNATTRIBUTED_ENABLED, influenceParams2.isUnattributedEnabled());
        this.preferences.saveInt(this.preferences.getPreferencesName(), PREFS_OS_NOTIFICATION_LIMIT, influenceParams2.getNotificationLimit());
        this.preferences.saveInt(this.preferences.getPreferencesName(), PREFS_OS_NOTIFICATION_INDIRECT_ATTRIBUTION_WINDOW, influenceParams2.getIndirectNotificationAttributionWindow());
        this.preferences.saveInt(this.preferences.getPreferencesName(), PREFS_OS_IAM_LIMIT, influenceParams2.getIamLimit());
        this.preferences.saveInt(this.preferences.getPreferencesName(), PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW, influenceParams2.getIndirectIAMAttributionWindow());
    }
}
