package com.onesignal;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OneSignal;
import java.util.HashMap;
import java.util.Set;

class OneSignalPrefs {
    static final String PREFS_EXISTING_PURCHASES = "ExistingPurchases";
    public static final String PREFS_GT_APP_ID = "GT_APP_ID";
    public static final String PREFS_GT_DO_NOT_SHOW_MISSING_GPS = "GT_DO_NOT_SHOW_MISSING_GPS";
    public static final String PREFS_GT_FIREBASE_TRACKING_ENABLED = "GT_FIREBASE_TRACKING_ENABLED";
    public static final String PREFS_GT_PLAYER_ID = "GT_PLAYER_ID";
    public static final String PREFS_GT_REGISTRATION_ID = "GT_REGISTRATION_ID";
    public static final String PREFS_GT_SOUND_ENABLED = "GT_SOUND_ENABLED";
    public static final String PREFS_GT_UNSENT_ACTIVE_TIME = "GT_UNSENT_ACTIVE_TIME";
    public static final String PREFS_GT_VIBRATE_ENABLED = "GT_VIBRATE_ENABLED";
    public static final String PREFS_ONESIGNAL = OneSignal.class.getSimpleName();
    public static final String PREFS_ONESIGNAL_ACCEPTED_NOTIFICATION_LAST = "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST";
    public static final String PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST = "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST";
    public static final String PREFS_ONESIGNAL_EMAIL_ID_LAST = "PREFS_ONESIGNAL_EMAIL_ID_LAST";
    public static final String PREFS_ONESIGNAL_PERMISSION_ACCEPTED_LAST = "ONESIGNAL_PERMISSION_ACCEPTED_LAST";
    public static final String PREFS_ONESIGNAL_PLAYER_ID_LAST = "ONESIGNAL_PLAYER_ID_LAST";
    public static final String PREFS_ONESIGNAL_PUSH_TOKEN_LAST = "ONESIGNAL_PUSH_TOKEN_LAST";
    public static final String PREFS_ONESIGNAL_SUBSCRIPTION = "ONESIGNAL_SUBSCRIPTION";
    public static final String PREFS_ONESIGNAL_SUBSCRIPTION_LAST = "ONESIGNAL_SUBSCRIPTION_LAST";
    public static final String PREFS_ONESIGNAL_SYNCED_SUBSCRIPTION = "ONESIGNAL_SYNCED_SUBSCRIPTION";
    public static final String PREFS_ONESIGNAL_USERSTATE_DEPENDVALYES_ = "ONESIGNAL_USERSTATE_DEPENDVALYES_";
    public static final String PREFS_ONESIGNAL_USERSTATE_SYNCVALYES_ = "ONESIGNAL_USERSTATE_SYNCVALYES_";
    public static final String PREFS_ONESIGNAL_USER_PROVIDED_CONSENT = "ONESIGNAL_USER_PROVIDED_CONSENT";
    public static final String PREFS_OS_ATTRIBUTED_INFLUENCES = "PREFS_OS_ATTRIBUTED_INFLUENCES";
    public static final String PREFS_OS_CACHED_IAMS = "PREFS_OS_CACHED_IAMS";
    public static final String PREFS_OS_CLEAR_GROUP_SUMMARY_CLICK = "OS_CLEAR_GROUP_SUMMARY_CLICK";
    public static final String PREFS_OS_CLICKED_CLICK_IDS_IAMS = "PREFS_OS_CLICKED_CLICK_IDS_IAMS";
    public static final String PREFS_OS_DISMISSED_IAMS = "PREFS_OS_DISPLAYED_IAMS";
    public static final String PREFS_OS_EMAIL_ID = "OS_EMAIL_ID";
    public static final String PREFS_OS_ETAG_PREFIX = "PREFS_OS_ETAG_PREFIX_";
    public static final String PREFS_OS_FILTER_OTHER_GCM_RECEIVERS = "OS_FILTER_OTHER_GCM_RECEIVERS";
    public static final String PREFS_OS_HTTP_CACHE_PREFIX = "PREFS_OS_HTTP_CACHE_PREFIX_";
    public static final String PREFS_OS_IMPRESSIONED_IAMS = "PREFS_OS_IMPRESSIONED_IAMS";
    public static final String PREFS_OS_LAST_LOCATION_TIME = "OS_LAST_LOCATION_TIME";
    public static final String PREFS_OS_LAST_SESSION_TIME = "OS_LAST_SESSION_TIME";
    static final String PREFS_OS_OUTCOMES_V2 = "PREFS_OS_OUTCOMES_V2";
    public static final String PREFS_OS_RECEIVE_RECEIPTS_ENABLED = "PREFS_OS_RECEIVE_RECEIPTS_ENABLED";
    public static final String PREFS_OS_RESTORE_TTL_FILTER = "OS_RESTORE_TTL_FILTER";
    public static final String PREFS_OS_UNSENT_ATTRIBUTED_ACTIVE_TIME = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
    public static final String PREFS_PLAYER_PURCHASES = "GTPlayerPurchases";
    static final String PREFS_PURCHASE_TOKENS = "purchaseTokens";
    public static final String PREFS_TRIGGERS = "OneSignalTriggers";
    public static WritePrefHandlerThread prefsHandler;
    static HashMap<String, HashMap<String, Object>> prefsToApply;

    OneSignalPrefs() {
    }

    static {
        initializePool();
    }

    public static class WritePrefHandlerThread extends HandlerThread {
        private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
        private long lastSyncTime = 0;
        @Nullable
        private Handler mHandler;
        private boolean threadStartCalled;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        WritePrefHandlerThread(String name) {
            super(name);
        }

        /* access modifiers changed from: protected */
        public void onLooperPrepared() {
            Handler handler;
            super.onLooperPrepared();
            new Handler(getLooper());
            this.mHandler = handler;
            scheduleFlushToDisk();
        }

        /* access modifiers changed from: private */
        public synchronized void startDelayedWrite() {
            synchronized (this) {
                if (OneSignal.appContext != null) {
                    startThread();
                    scheduleFlushToDisk();
                }
            }
        }

        private void startThread() {
            if (!this.threadStartCalled) {
                start();
                this.threadStartCalled = true;
            }
        }

        private synchronized void scheduleFlushToDisk() {
            Runnable runnable;
            synchronized (this) {
                if (this.mHandler != null) {
                    this.mHandler.removeCallbacksAndMessages((Object) null);
                    if (this.lastSyncTime == 0) {
                        this.lastSyncTime = System.currentTimeMillis();
                    }
                    long delay = (this.lastSyncTime - System.currentTimeMillis()) + 200;
                    new Runnable(this) {
                        final /* synthetic */ WritePrefHandlerThread this$0;

                        {
                            this.this$0 = this$0;
                        }

                        public void run() {
                            this.this$0.flushBufferToDisk();
                        }
                    };
                    boolean postDelayed = this.mHandler.postDelayed(runnable, delay);
                }
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: private */
        public void flushBufferToDisk() {
            for (String pref : OneSignalPrefs.prefsToApply.keySet()) {
                SharedPreferences.Editor editor = OneSignalPrefs.getSharedPrefsByName(pref).edit();
                HashMap<String, Object> prefHash = OneSignalPrefs.prefsToApply.get(pref);
                HashMap<String, Object> hashMap = prefHash;
                HashMap<String, Object> hashMap2 = hashMap;
                synchronized (hashMap) {
                    try {
                        for (String key : prefHash.keySet()) {
                            Object value = prefHash.get(key);
                            if (value instanceof String) {
                                SharedPreferences.Editor putString = editor.putString(key, (String) value);
                            } else if (value instanceof Boolean) {
                                SharedPreferences.Editor putBoolean = editor.putBoolean(key, ((Boolean) value).booleanValue());
                            } else if (value instanceof Integer) {
                                SharedPreferences.Editor putInt = editor.putInt(key, ((Integer) value).intValue());
                            } else if (value instanceof Long) {
                                SharedPreferences.Editor putLong = editor.putLong(key, ((Long) value).longValue());
                            } else if (value instanceof Set) {
                                SharedPreferences.Editor putStringSet = editor.putStringSet(key, (Set) value);
                            }
                        }
                        prefHash.clear();
                        editor.apply();
                    } catch (Throwable th) {
                        while (true) {
                            Throwable th2 = th;
                            HashMap<String, Object> hashMap3 = hashMap2;
                            throw th2;
                        }
                    }
                }
            }
            this.lastSyncTime = System.currentTimeMillis();
        }
    }

    public static void initializePool() {
        HashMap<String, HashMap<String, Object>> hashMap;
        Object obj;
        Object obj2;
        Object obj3;
        WritePrefHandlerThread writePrefHandlerThread;
        new HashMap<>();
        prefsToApply = hashMap;
        new HashMap();
        HashMap<String, Object> put = prefsToApply.put(PREFS_ONESIGNAL, obj);
        new HashMap();
        HashMap<String, Object> put2 = prefsToApply.put(PREFS_PLAYER_PURCHASES, obj2);
        new HashMap();
        HashMap<String, Object> put3 = prefsToApply.put(PREFS_TRIGGERS, obj3);
        new WritePrefHandlerThread("OSH_WritePrefs");
        prefsHandler = writePrefHandlerThread;
    }

    public static void startDelayedWrite() {
        prefsHandler.startDelayedWrite();
    }

    public static void saveString(String prefsName, String key, String value) {
        save(prefsName, key, value);
    }

    public static void saveStringSet(@NonNull String prefsName, @NonNull String key, @NonNull Set<String> value) {
        save(prefsName, key, value);
    }

    public static void saveBool(String prefsName, String key, boolean value) {
        save(prefsName, key, Boolean.valueOf(value));
    }

    public static void saveInt(String prefsName, String key, int value) {
        save(prefsName, key, Integer.valueOf(value));
    }

    public static void saveLong(String prefsName, String key, long value) {
        save(prefsName, key, Long.valueOf(value));
    }

    public static void saveObject(String prefsName, String key, Object value) {
        save(prefsName, key, value);
    }

    private static void save(String prefsName, String str, Object obj) {
        String key = str;
        Object value = obj;
        HashMap<String, Object> pref = prefsToApply.get(prefsName);
        HashMap<String, Object> hashMap = pref;
        HashMap<String, Object> hashMap2 = hashMap;
        synchronized (hashMap) {
            try {
                Object put = pref.put(key, value);
                startDelayedWrite();
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    HashMap<String, Object> hashMap3 = hashMap2;
                    throw th2;
                }
            }
        }
    }

    static String getString(String prefsName, String key, String defValue) {
        return (String) get(prefsName, key, String.class, defValue);
    }

    static boolean getBool(String prefsName, String key, boolean defValue) {
        return ((Boolean) get(prefsName, key, Boolean.class, Boolean.valueOf(defValue))).booleanValue();
    }

    static int getInt(String prefsName, String key, int defValue) {
        return ((Integer) get(prefsName, key, Integer.class, Integer.valueOf(defValue))).intValue();
    }

    static long getLong(String prefsName, String key, long defValue) {
        return ((Long) get(prefsName, key, Long.class, Long.valueOf(defValue))).longValue();
    }

    @Nullable
    public static Set<String> getStringSet(@NonNull String prefsName, @NonNull String key, @Nullable Set<String> defValue) {
        return (Set) get(prefsName, key, Set.class, defValue);
    }

    static Object getObject(String prefsName, String key, Object defValue) {
        return get(prefsName, key, Object.class, defValue);
    }

    /* JADX INFO: finally extract failed */
    @Nullable
    private static Object get(String str, String str2, Class cls, Object obj) {
        String prefsName = str;
        String key = str2;
        Class type = cls;
        Object defValue = obj;
        HashMap<String, Object> pref = prefsToApply.get(prefsName);
        HashMap<String, Object> hashMap = pref;
        HashMap<String, Object> hashMap2 = hashMap;
        synchronized (hashMap) {
            try {
                if (!type.equals(Object.class) || !pref.containsKey(key)) {
                    Object cachedValue = pref.get(key);
                    if (cachedValue != null || pref.containsKey(key)) {
                        Object obj2 = cachedValue;
                        return obj2;
                    }
                    SharedPreferences prefs = getSharedPrefsByName(prefsName);
                    if (prefs == null) {
                        return defValue;
                    }
                    if (type.equals(String.class)) {
                        return prefs.getString(key, (String) defValue);
                    }
                    if (type.equals(Boolean.class)) {
                        return Boolean.valueOf(prefs.getBoolean(key, ((Boolean) defValue).booleanValue()));
                    }
                    if (type.equals(Integer.class)) {
                        return Integer.valueOf(prefs.getInt(key, ((Integer) defValue).intValue()));
                    }
                    if (type.equals(Long.class)) {
                        return Long.valueOf(prefs.getLong(key, ((Long) defValue).longValue()));
                    }
                    if (type.equals(Set.class)) {
                        return prefs.getStringSet(key, (Set) defValue);
                    }
                    if (type.equals(Object.class)) {
                        return Boolean.valueOf(prefs.contains(key));
                    }
                    return null;
                }
                return 1;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    HashMap<String, Object> hashMap3 = hashMap2;
                    throw th2;
                }
            }
        }
    }

    static synchronized SharedPreferences getSharedPrefsByName(String str) {
        SharedPreferences sharedPreferences;
        StringBuilder sb;
        Throwable th;
        String prefsName = str;
        synchronized (OneSignalPrefs.class) {
            if (OneSignal.appContext == null) {
                new StringBuilder();
                String msg = sb.append("OneSignal.appContext null, could not read ").append(prefsName).append(" from getSharedPreferences.").toString();
                new Throwable();
                OneSignal.Log(OneSignal.LOG_LEVEL.WARN, msg, th);
                sharedPreferences = null;
            } else {
                sharedPreferences = OneSignal.appContext.getSharedPreferences(prefsName, 0);
            }
        }
        return sharedPreferences;
    }
}
