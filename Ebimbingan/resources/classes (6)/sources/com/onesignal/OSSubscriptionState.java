package com.onesignal;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class OSSubscriptionState implements Cloneable {
    private boolean accepted;
    OSObservable<Object, OSSubscriptionState> observable;
    private String pushToken;
    private String userId;
    private boolean userSubscriptionSetting;

    OSSubscriptionState(boolean asFrom, boolean z) {
        OSObservable<Object, OSSubscriptionState> oSObservable;
        boolean permissionAccepted = z;
        new OSObservable<>("changed", false);
        this.observable = oSObservable;
        if (asFrom) {
            this.userSubscriptionSetting = OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_SUBSCRIPTION_LAST, false);
            this.userId = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_PLAYER_ID_LAST, (String) null);
            this.pushToken = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_PUSH_TOKEN_LAST, (String) null);
            this.accepted = OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_PERMISSION_ACCEPTED_LAST, false);
            return;
        }
        this.userSubscriptionSetting = OneSignalStateSynchronizer.getUserSubscribePreference();
        this.userId = OneSignal.getUserId();
        this.pushToken = OneSignalStateSynchronizer.getRegistrationId();
        this.accepted = permissionAccepted;
    }

    /* access modifiers changed from: package-private */
    public void changed(OSPermissionState state) {
        setAccepted(state.getEnabled());
    }

    /* access modifiers changed from: package-private */
    public void setUserId(@Nullable String str) {
        String id = str;
        boolean changed = false;
        if (id == null) {
            changed = this.userId != null;
        } else if (!id.equals(this.userId)) {
            changed = true;
        }
        this.userId = id;
        if (changed) {
            boolean notifyChange = this.observable.notifyChange(this);
        }
    }

    public String getUserId() {
        return this.userId;
    }

    /* access modifiers changed from: package-private */
    public void setPushToken(String str) {
        String id = str;
        if (id != null) {
            boolean changed = !id.equals(this.pushToken);
            this.pushToken = id;
            if (changed) {
                boolean notifyChange = this.observable.notifyChange(this);
            }
        }
    }

    public String getPushToken() {
        return this.pushToken;
    }

    /* access modifiers changed from: package-private */
    public void setUserSubscriptionSetting(boolean z) {
        boolean set = z;
        boolean changed = this.userSubscriptionSetting != set;
        this.userSubscriptionSetting = set;
        if (changed) {
            boolean notifyChange = this.observable.notifyChange(this);
        }
    }

    public boolean getUserSubscriptionSetting() {
        return this.userSubscriptionSetting;
    }

    private void setAccepted(boolean set) {
        boolean lastSubscribed = getSubscribed();
        this.accepted = set;
        if (lastSubscribed != getSubscribed()) {
            boolean notifyChange = this.observable.notifyChange(this);
        }
    }

    public boolean getSubscribed() {
        return this.userId != null && this.pushToken != null && this.userSubscriptionSetting && this.accepted;
    }

    /* access modifiers changed from: package-private */
    public void persistAsFrom() {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_SUBSCRIPTION_LAST, this.userSubscriptionSetting);
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_PLAYER_ID_LAST, this.userId);
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_PUSH_TOKEN_LAST, this.pushToken);
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_PERMISSION_ACCEPTED_LAST, this.accepted);
    }

    /* access modifiers changed from: package-private */
    public boolean compare(OSSubscriptionState oSSubscriptionState) {
        boolean z;
        OSSubscriptionState from = oSSubscriptionState;
        if (this.userSubscriptionSetting == from.userSubscriptionSetting) {
            if ((this.userId != null ? this.userId : "").equals(from.userId != null ? from.userId : "")) {
                if ((this.pushToken != null ? this.pushToken : "").equals(from.pushToken != null ? from.pushToken : "") && this.accepted == from.accepted) {
                    z = false;
                    return z;
                }
            }
        }
        z = true;
        return z;
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            CloneNotSupportedException cloneNotSupportedException = e;
            return null;
        }
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject mainObj = jSONObject;
        try {
            if (this.userId != null) {
                JSONObject put = mainObj.put("userId", this.userId);
            } else {
                JSONObject put2 = mainObj.put("userId", JSONObject.NULL);
            }
            if (this.pushToken != null) {
                JSONObject put3 = mainObj.put("pushToken", this.pushToken);
            } else {
                JSONObject put4 = mainObj.put("pushToken", JSONObject.NULL);
            }
            JSONObject put5 = mainObj.put("userSubscriptionSetting", this.userSubscriptionSetting);
            JSONObject put6 = mainObj.put("subscribed", getSubscribed());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mainObj;
    }

    public String toString() {
        return toJSONObject().toString();
    }
}
