package com.onesignal;

import com.microsoft.appcenter.utils.PrefStorageConstants;
import org.json.JSONObject;

public class OSPermissionState implements Cloneable {
    private boolean enabled;
    OSObservable<Object, OSPermissionState> observable;

    OSPermissionState(boolean asFrom) {
        OSObservable<Object, OSPermissionState> oSObservable;
        new OSObservable<>("changed", false);
        this.observable = oSObservable;
        if (asFrom) {
            this.enabled = OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_ACCEPTED_NOTIFICATION_LAST, false);
            return;
        }
        refreshAsTo();
    }

    /* access modifiers changed from: package-private */
    public void refreshAsTo() {
        setEnabled(OSUtils.areNotificationsEnabled(OneSignal.appContext));
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    private void setEnabled(boolean z) {
        boolean set = z;
        boolean changed = this.enabled != set;
        this.enabled = set;
        if (changed) {
            boolean notifyChange = this.observable.notifyChange(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void persistAsFrom() {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_ACCEPTED_NOTIFICATION_LAST, this.enabled);
    }

    /* access modifiers changed from: package-private */
    public boolean compare(OSPermissionState from) {
        return this.enabled != from.enabled;
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable th) {
            Throwable th2 = th;
            return null;
        }
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject;
        new JSONObject();
        JSONObject mainObj = jSONObject;
        try {
            JSONObject put = mainObj.put(PrefStorageConstants.KEY_ENABLED, this.enabled);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return mainObj;
    }

    public String toString() {
        return toJSONObject().toString();
    }
}
