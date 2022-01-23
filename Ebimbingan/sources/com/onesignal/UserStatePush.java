package com.onesignal;

import org.json.JSONException;

class UserStatePush extends UserState {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UserStatePush(String inPersistKey, boolean load) {
        super(inPersistKey, load);
    }

    /* access modifiers changed from: package-private */
    public UserState newInstance(String persistKey) {
        UserStatePush userStatePush;
        new UserStatePush(persistKey, false);
        return userStatePush;
    }

    /* access modifiers changed from: protected */
    public void addDependFields() {
        try {
            putOnSyncValues("notification_types", Integer.valueOf(getNotificationTypes()));
        } catch (JSONException e) {
            JSONException jSONException = e;
        }
    }

    private int getNotificationTypes() {
        int subscribableStatus = getDependValues().optInt("subscribableStatus", 1);
        if (subscribableStatus < -2) {
            return subscribableStatus;
        }
        if (!getDependValues().optBoolean("androidPermission", true)) {
            return 0;
        }
        if (!getDependValues().optBoolean("userSubscribePref", true)) {
            return -2;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    public boolean isSubscribed() {
        return getNotificationTypes() > 0;
    }
}
