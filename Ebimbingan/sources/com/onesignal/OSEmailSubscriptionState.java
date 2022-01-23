package com.onesignal;

import androidx.annotation.NonNull;
import org.json.JSONObject;

public class OSEmailSubscriptionState implements Cloneable {
    private String emailAddress;
    private String emailUserId;
    OSObservable<Object, OSEmailSubscriptionState> observable;

    OSEmailSubscriptionState(boolean asFrom) {
        OSObservable<Object, OSEmailSubscriptionState> oSObservable;
        new OSObservable<>("changed", false);
        this.observable = oSObservable;
        if (asFrom) {
            this.emailUserId = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_EMAIL_ID_LAST, (String) null);
            this.emailAddress = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST, (String) null);
            return;
        }
        this.emailUserId = OneSignal.getEmailId();
        this.emailAddress = OneSignalStateSynchronizer.getEmailStateSynchronizer().getRegistrationId();
    }

    /* access modifiers changed from: package-private */
    public void clearEmailAndId() {
        boolean changed = (this.emailUserId == null && this.emailAddress == null) ? false : true;
        this.emailUserId = null;
        this.emailAddress = null;
        if (changed) {
            boolean notifyChange = this.observable.notifyChange(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void setEmailUserId(@NonNull String str) {
        String id = str;
        boolean changed = false;
        if (id == null) {
            changed = this.emailUserId != null;
        } else if (!id.equals(this.emailUserId)) {
            changed = true;
        }
        this.emailUserId = id;
        if (changed) {
            boolean notifyChange = this.observable.notifyChange(this);
        }
    }

    public String getEmailUserId() {
        return this.emailUserId;
    }

    /* access modifiers changed from: package-private */
    public void setEmailAddress(@NonNull String str) {
        String email = str;
        boolean changed = !email.equals(this.emailAddress);
        this.emailAddress = email;
        if (changed) {
            boolean notifyChange = this.observable.notifyChange(this);
        }
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public boolean getSubscribed() {
        return (this.emailUserId == null || this.emailAddress == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void persistAsFrom() {
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_EMAIL_ID_LAST, this.emailUserId);
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST, this.emailAddress);
    }

    /* access modifiers changed from: package-private */
    public boolean compare(OSEmailSubscriptionState oSEmailSubscriptionState) {
        boolean z;
        OSEmailSubscriptionState from = oSEmailSubscriptionState;
        if ((this.emailUserId != null ? this.emailUserId : "").equals(from.emailUserId != null ? from.emailUserId : "")) {
            if ((this.emailAddress != null ? this.emailAddress : "").equals(from.emailAddress != null ? from.emailAddress : "")) {
                z = false;
                return z;
            }
        }
        z = true;
        return z;
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
            if (this.emailUserId != null) {
                JSONObject put = mainObj.put("emailUserId", this.emailUserId);
            } else {
                JSONObject put2 = mainObj.put("emailUserId", JSONObject.NULL);
            }
            if (this.emailAddress != null) {
                JSONObject put3 = mainObj.put("emailAddress", this.emailAddress);
            } else {
                JSONObject put4 = mainObj.put("emailAddress", JSONObject.NULL);
            }
            JSONObject put5 = mainObj.put("subscribed", getSubscribed());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return mainObj;
    }

    public String toString() {
        return toJSONObject().toString();
    }
}
