package com.onesignal;

import com.microsoft.appcenter.ingestion.models.properties.LongTypedProperty;
import com.onesignal.LocationController;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

abstract class UserState {
    public static final int DEVICE_TYPE_ANDROID = 1;
    public static final int DEVICE_TYPE_EMAIL = 11;
    public static final int DEVICE_TYPE_FIREOS = 2;
    public static final int DEVICE_TYPE_HUAWEI = 13;
    private static final String[] LOCATION_FIELDS;
    private static final Set<String> LOCATION_FIELDS_SET;
    private static final Object LOCK;
    static final int PUSH_STATUS_FIREBASE_FCM_ERROR_IOEXCEPTION = -11;
    static final int PUSH_STATUS_FIREBASE_FCM_ERROR_MISC_EXCEPTION = -12;
    static final int PUSH_STATUS_FIREBASE_FCM_ERROR_SERVICE_NOT_AVAILABLE = -9;
    static final int PUSH_STATUS_FIREBASE_FCM_INIT_ERROR = -8;
    public static final int PUSH_STATUS_HMS_API_EXCEPTION_OTHER = -27;
    public static final int PUSH_STATUS_HMS_ARGUMENTS_INVALID = -26;
    public static final int PUSH_STATUS_HMS_TOKEN_TIMEOUT = -25;
    static final int PUSH_STATUS_INVALID_FCM_SENDER_ID = -6;
    static final int PUSH_STATUS_MISSING_ANDROID_SUPPORT_LIBRARY = -3;
    static final int PUSH_STATUS_MISSING_FIREBASE_FCM_LIBRARY = -4;
    public static final int PUSH_STATUS_MISSING_HMS_PUSHKIT_LIBRARY = -28;
    static final int PUSH_STATUS_NO_PERMISSION = 0;
    static final int PUSH_STATUS_OUTDATED_ANDROID_SUPPORT_LIBRARY = -5;
    static final int PUSH_STATUS_OUTDATED_GOOGLE_PLAY_SERVICES_APP = -7;
    public static final int PUSH_STATUS_SUBSCRIBED = 1;
    static final int PUSH_STATUS_UNSUBSCRIBE = -2;
    public static final String TAGS = "tags";
    private JSONObject dependValues;
    private String persistKey;
    private JSONObject syncValues;

    /* access modifiers changed from: protected */
    public abstract void addDependFields();

    /* access modifiers changed from: package-private */
    public abstract boolean isSubscribed();

    /* access modifiers changed from: package-private */
    public abstract UserState newInstance(String str);

    static {
        Object obj;
        Set<String> set;
        new Object();
        LOCK = obj;
        String[] strArr = new String[7];
        strArr[0] = "lat";
        String[] strArr2 = strArr;
        strArr2[1] = LongTypedProperty.TYPE;
        String[] strArr3 = strArr2;
        strArr3[2] = "loc_acc";
        String[] strArr4 = strArr3;
        strArr4[3] = "loc_type";
        String[] strArr5 = strArr4;
        strArr5[4] = "loc_bg";
        String[] strArr6 = strArr5;
        strArr6[5] = "loc_time_stamp";
        String[] strArr7 = strArr6;
        strArr7[6] = "ad_id";
        LOCATION_FIELDS = strArr7;
        new HashSet(Arrays.asList(LOCATION_FIELDS));
        LOCATION_FIELDS_SET = set;
    }

    public ImmutableJSONObject getDependValues() {
        ImmutableJSONObject immutableJSONObject;
        ImmutableJSONObject immutableJSONObject2;
        try {
            ImmutableJSONObject immutableJSONObject3 = immutableJSONObject2;
            new ImmutableJSONObject(getDependValuesCopy());
            return immutableJSONObject3;
        } catch (JSONException e) {
            e.printStackTrace();
            new ImmutableJSONObject();
            return immutableJSONObject;
        }
    }

    /* access modifiers changed from: package-private */
    public void setDependValues(JSONObject jSONObject) {
        JSONObject dependValues2 = jSONObject;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                this.dependValues = dependValues2;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject getDependValuesCopy() throws JSONException {
        JSONObject jSONObject;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                JSONObject jSONObject2 = jSONObject;
                new JSONObject(this.dependValues.toString());
                return jSONObject2;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    public ImmutableJSONObject getSyncValues() {
        ImmutableJSONObject immutableJSONObject;
        ImmutableJSONObject immutableJSONObject2;
        try {
            ImmutableJSONObject immutableJSONObject3 = immutableJSONObject2;
            new ImmutableJSONObject(getSyncValuesCopy());
            return immutableJSONObject3;
        } catch (JSONException e) {
            e.printStackTrace();
            new ImmutableJSONObject();
            return immutableJSONObject;
        }
    }

    public JSONObject getSyncValuesCopy() throws JSONException {
        JSONObject jSONObject;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                JSONObject jSONObject2 = jSONObject;
                new JSONObject(this.syncValues.toString());
                return jSONObject2;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    public void setSyncValues(JSONObject jSONObject) {
        JSONObject syncValues2 = jSONObject;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                this.syncValues = syncValues2;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    UserState(String inPersistKey, boolean load) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        this.persistKey = inPersistKey;
        if (load) {
            loadState();
            return;
        }
        new JSONObject();
        this.dependValues = jSONObject;
        new JSONObject();
        this.syncValues = jSONObject2;
    }

    /* access modifiers changed from: package-private */
    public UserState deepClone(String persistKey2) {
        UserState clonedUserState = newInstance(persistKey2);
        try {
            clonedUserState.dependValues = getDependValuesCopy();
            clonedUserState.syncValues = getSyncValuesCopy();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return clonedUserState;
    }

    private Set<String> getGroupChangeFields(UserState userState) {
        HashMap hashMap;
        UserState changedTo = userState;
        try {
            if (this.dependValues.optLong("loc_time_stamp") != changedTo.dependValues.getLong("loc_time_stamp")) {
                new HashMap();
                HashMap hashMap2 = hashMap;
                Object put = hashMap2.put("loc_bg", changedTo.dependValues.opt("loc_bg"));
                Object put2 = hashMap2.put("loc_time_stamp", changedTo.dependValues.opt("loc_time_stamp"));
                putValues(changedTo.syncValues, hashMap2);
                return LOCATION_FIELDS_SET;
            }
        } catch (Throwable th) {
            Throwable th2 = th;
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void putOnSyncValues(String str, Object obj) throws JSONException {
        String key = str;
        Object value = obj;
        Object obj2 = LOCK;
        Object obj3 = obj2;
        synchronized (obj2) {
            try {
                JSONObject put = this.syncValues.put(key, value);
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj4 = obj3;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void putOnDependValues(String str, Object obj) throws JSONException {
        String key = str;
        Object value = obj;
        Object obj2 = LOCK;
        Object obj3 = obj2;
        synchronized (obj2) {
            try {
                JSONObject put = this.dependValues.put(key, value);
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj4 = obj3;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void putValues(JSONObject jSONObject, HashMap<String, Object> hashMap) throws JSONException {
        JSONObject jsonObject = jSONObject;
        HashMap<String, Object> values = hashMap;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                for (Map.Entry<String, Object> entry : values.entrySet()) {
                    JSONObject put = jsonObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void removeFromSyncValues(String str) {
        String key = str;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                Object remove = this.syncValues.remove(key);
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void removeFromSyncValues(List<String> list) {
        List<String> keys = list;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                for (String key : keys) {
                    Object remove = this.syncValues.remove(key);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void removeFromDependValues(String str) {
        String key = str;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                Object remove = this.dependValues.remove(key);
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void removeFromDependValues(List<String> list) {
        List<String> keys = list;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                for (String key : keys) {
                    Object remove = this.dependValues.remove(key);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setLocation(LocationController.LocationPoint locationPoint) {
        HashMap hashMap;
        HashMap hashMap2;
        LocationController.LocationPoint point = locationPoint;
        try {
            new HashMap();
            HashMap hashMap3 = hashMap;
            Object put = hashMap3.put("lat", point.lat);
            Object put2 = hashMap3.put(LongTypedProperty.TYPE, point.log);
            Object put3 = hashMap3.put("loc_acc", point.accuracy);
            Object put4 = hashMap3.put("loc_type", point.type);
            putValues(this.syncValues, hashMap3);
            new HashMap();
            HashMap hashMap4 = hashMap2;
            Object put5 = hashMap4.put("loc_bg", point.bg);
            Object put6 = hashMap4.put("loc_time_stamp", point.timeStamp);
            putValues(this.dependValues, hashMap4);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void clearLocation() {
        HashMap hashMap;
        HashMap hashMap2;
        try {
            new HashMap();
            HashMap hashMap3 = hashMap;
            Object put = hashMap3.put("lat", (Object) null);
            Object put2 = hashMap3.put(LongTypedProperty.TYPE, (Object) null);
            Object put3 = hashMap3.put("loc_acc", (Object) null);
            Object put4 = hashMap3.put("loc_type", (Object) null);
            Object put5 = hashMap3.put("loc_bg", (Object) null);
            Object put6 = hashMap3.put("loc_time_stamp", (Object) null);
            putValues(this.syncValues, hashMap3);
            new HashMap();
            HashMap hashMap4 = hashMap2;
            Object put7 = hashMap4.put("loc_bg", (Object) null);
            Object put8 = hashMap4.put("loc_time_stamp", (Object) null);
            putValues(this.dependValues, hashMap4);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject generateJsonDiff(UserState userState, boolean isSessionCall) {
        UserState newState = userState;
        addDependFields();
        newState.addDependFields();
        JSONObject sendJson = generateJsonDiff(this.syncValues, newState.syncValues, (JSONObject) null, getGroupChangeFields(newState));
        if (!isSessionCall && sendJson.toString().equals("{}")) {
            return null;
        }
        try {
            if (!sendJson.has("app_id")) {
                JSONObject put = sendJson.put("app_id", this.syncValues.optString("app_id"));
            }
            if (this.syncValues.has("email_auth_hash")) {
                JSONObject put2 = sendJson.put("email_auth_hash", this.syncValues.optString("email_auth_hash"));
            }
            if (this.syncValues.has("external_user_id_auth_hash")) {
                JSONObject put3 = sendJson.put("external_user_id_auth_hash", this.syncValues.optString("external_user_id_auth_hash"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return sendJson;
    }

    private void loadState() {
        StringBuilder sb;
        JSONObject dependValues2;
        StringBuilder sb2;
        JSONObject jSONObject;
        JSONObject syncValues2;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        int subscribableStatus;
        HashMap hashMap;
        String str = OneSignalPrefs.PREFS_ONESIGNAL;
        new StringBuilder();
        String dependValuesStr = OneSignalPrefs.getString(str, sb.append(OneSignalPrefs.PREFS_ONESIGNAL_USERSTATE_DEPENDVALYES_).append(this.persistKey).toString(), (String) null);
        if (dependValuesStr == null) {
            new JSONObject();
            setDependValues(jSONObject3);
            boolean userSubscribePref = true;
            try {
                if (this.persistKey.equals("CURRENT_STATE")) {
                    subscribableStatus = OneSignalPrefs.getInt(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_SUBSCRIPTION, 1);
                } else {
                    subscribableStatus = OneSignalPrefs.getInt(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_SYNCED_SUBSCRIPTION, 1);
                }
                if (subscribableStatus == PUSH_STATUS_UNSUBSCRIBE) {
                    subscribableStatus = 1;
                    userSubscribePref = false;
                }
                new HashMap();
                HashMap hashMap2 = hashMap;
                Object put = hashMap2.put("subscribableStatus", Integer.valueOf(subscribableStatus));
                Object put2 = hashMap2.put("userSubscribePref", Boolean.valueOf(userSubscribePref));
                putValues(this.dependValues, hashMap2);
            } catch (JSONException e) {
                JSONException jSONException = e;
            }
        } else {
            try {
                new JSONObject(dependValuesStr);
                setDependValues(dependValues2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        String str2 = OneSignalPrefs.PREFS_ONESIGNAL;
        new StringBuilder();
        String syncValuesStr = OneSignalPrefs.getString(str2, sb2.append(OneSignalPrefs.PREFS_ONESIGNAL_USERSTATE_SYNCVALYES_).append(this.persistKey).toString(), (String) null);
        if (syncValuesStr == null) {
            try {
                new JSONObject();
                syncValues2 = jSONObject2;
                JSONObject put3 = syncValues2.put("identifier", OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_GT_REGISTRATION_ID, (String) null));
            } catch (JSONException e3) {
                e3.printStackTrace();
                return;
            }
        } else {
            JSONObject jSONObject4 = jSONObject;
            new JSONObject(syncValuesStr);
            syncValues2 = jSONObject4;
        }
        setSyncValues(syncValues2);
    }

    /* access modifiers changed from: package-private */
    public void persistState() {
        StringBuilder sb;
        StringBuilder sb2;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                String str = OneSignalPrefs.PREFS_ONESIGNAL;
                new StringBuilder();
                OneSignalPrefs.saveString(str, sb.append(OneSignalPrefs.PREFS_ONESIGNAL_USERSTATE_SYNCVALYES_).append(this.persistKey).toString(), this.syncValues.toString());
                String str2 = OneSignalPrefs.PREFS_ONESIGNAL;
                new StringBuilder();
                OneSignalPrefs.saveString(str2, sb2.append(OneSignalPrefs.PREFS_ONESIGNAL_USERSTATE_DEPENDVALYES_).append(this.persistKey).toString(), this.dependValues.toString());
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void persistStateAfterSync(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject inDependValues = jSONObject;
        JSONObject inSyncValues = jSONObject2;
        if (inDependValues != null) {
            JSONObject generateJsonDiff = generateJsonDiff(this.dependValues, inDependValues, this.dependValues, (Set<String>) null);
        }
        if (inSyncValues != null) {
            JSONObject generateJsonDiff2 = generateJsonDiff(this.syncValues, inSyncValues, this.syncValues, (Set<String>) null);
            mergeTags(inSyncValues, (JSONObject) null);
        }
        if (inDependValues != null || inSyncValues != null) {
            persistState();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void mergeTags(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONObject newTags;
        Object obj;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject inSyncValues = jSONObject;
        JSONObject omitKeys = jSONObject2;
        if (inSyncValues.has(TAGS)) {
            try {
                JSONObject syncValues2 = getSyncValuesCopy();
                if (syncValues2.has(TAGS)) {
                    try {
                        JSONObject jSONObject6 = jSONObject5;
                        new JSONObject(syncValues2.optString(TAGS));
                        newTags = jSONObject6;
                    } catch (JSONException e) {
                        JSONException jSONException = e;
                        new JSONObject();
                        newTags = jSONObject4;
                    }
                } else {
                    new JSONObject();
                    newTags = jSONObject3;
                }
                JSONObject curTags = inSyncValues.optJSONObject(TAGS);
                Iterator<String> keys = curTags.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    if ("".equals(curTags.optString(key))) {
                        Object remove = newTags.remove(key);
                    } else if (omitKeys == null || !omitKeys.has(key)) {
                        JSONObject put = newTags.put(key, curTags.optString(key));
                    }
                }
                Object obj2 = LOCK;
                obj = obj2;
                synchronized (obj2) {
                    if (newTags.toString().equals("{}")) {
                        Object remove2 = this.syncValues.remove(TAGS);
                    } else {
                        JSONObject put2 = this.syncValues.put(TAGS, newTags);
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public JSONObject generateJsonDiffFromIntoSyncValued(JSONObject jSONObject, Set<String> set) {
        JSONObject changedTo = jSONObject;
        Set<String> includeFields = set;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                JSONObject generateJsonDiff = JSONUtils.generateJsonDiff(this.syncValues, changedTo, this.syncValues, includeFields);
                return generateJsonDiff;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject generateJsonDiffFromSyncValued(UserState userState, Set<String> set) {
        UserState changedTo = userState;
        Set<String> includeFields = set;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                JSONObject generateJsonDiff = JSONUtils.generateJsonDiff(this.syncValues, changedTo.syncValues, (JSONObject) null, includeFields);
                return generateJsonDiff;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public JSONObject generateJsonDiffFromIntoDependValues(JSONObject jSONObject, Set<String> set) {
        JSONObject changedTo = jSONObject;
        Set<String> includeFields = set;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                JSONObject generateJsonDiff = JSONUtils.generateJsonDiff(this.dependValues, changedTo, this.dependValues, includeFields);
                return generateJsonDiff;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject generateJsonDiffFromDependValues(UserState userState, Set<String> set) {
        UserState changedTo = userState;
        Set<String> includeFields = set;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                JSONObject generateJsonDiff = JSONUtils.generateJsonDiff(this.dependValues, changedTo.dependValues, (JSONObject) null, includeFields);
                return generateJsonDiff;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    private static JSONObject generateJsonDiff(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject cur = jSONObject;
        JSONObject changedTo = jSONObject2;
        JSONObject baseOutput = jSONObject3;
        Set<String> includeFields = set;
        Object obj = LOCK;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                JSONObject cur2 = JSONUtils.generateJsonDiff(cur, changedTo, baseOutput, includeFields);
                return cur2;
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }

    public String toString() {
        StringBuilder sb;
        new StringBuilder();
        return sb.append("UserState{persistKey='").append(this.persistKey).append('\'').append(", dependValues=").append(this.dependValues).append(", syncValues=").append(this.syncValues).append('}').toString();
    }
}
