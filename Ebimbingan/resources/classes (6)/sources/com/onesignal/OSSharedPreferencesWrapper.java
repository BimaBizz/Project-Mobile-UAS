package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

class OSSharedPreferencesWrapper implements OSSharedPreferences {
    OSSharedPreferencesWrapper() {
    }

    public String getOutcomesV2KeyName() {
        return "PREFS_OS_OUTCOMES_V2";
    }

    public String getPreferencesName() {
        return OneSignalPrefs.PREFS_ONESIGNAL;
    }

    public String getString(String prefsName, String key, String defValue) {
        return OneSignalPrefs.getString(prefsName, key, defValue);
    }

    public void saveString(String prefsName, String key, String value) {
        OneSignalPrefs.saveString(prefsName, key, value);
    }

    public boolean getBool(String prefsName, String key, boolean defValue) {
        return OneSignalPrefs.getBool(prefsName, key, defValue);
    }

    public void saveBool(String prefsName, String key, boolean value) {
        OneSignalPrefs.saveBool(prefsName, key, value);
    }

    public int getInt(String prefsName, String key, int defValue) {
        return OneSignalPrefs.getInt(prefsName, key, defValue);
    }

    public void saveInt(String prefsName, String key, int value) {
        OneSignalPrefs.saveInt(prefsName, key, value);
    }

    public long getLong(String prefsName, String key, long defValue) {
        return OneSignalPrefs.getLong(prefsName, key, defValue);
    }

    public void saveLong(String prefsName, String key, long value) {
        OneSignalPrefs.saveLong(prefsName, key, value);
    }

    @Nullable
    public Set<String> getStringSet(@NonNull String prefsName, @NonNull String key, @Nullable Set<String> defValue) {
        return OneSignalPrefs.getStringSet(prefsName, key, defValue);
    }

    public void saveStringSet(@NonNull String prefsName, @NonNull String key, @NonNull Set<String> value) {
        OneSignalPrefs.saveStringSet(prefsName, key, value);
    }

    public Object getObject(String prefsName, String key, Object defValue) {
        return OneSignalPrefs.getObject(prefsName, key, defValue);
    }

    public void saveObject(String prefsName, String key, Object value) {
        OneSignalPrefs.saveObject(prefsName, key, value);
    }
}
