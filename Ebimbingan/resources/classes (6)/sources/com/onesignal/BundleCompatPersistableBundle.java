package com.onesignal;

import android.os.Parcelable;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 22)
/* compiled from: BundleCompat */
class BundleCompatPersistableBundle implements BundleCompat<PersistableBundle> {
    private PersistableBundle mBundle;

    BundleCompatPersistableBundle() {
        PersistableBundle persistableBundle;
        new PersistableBundle();
        this.mBundle = persistableBundle;
    }

    BundleCompatPersistableBundle(PersistableBundle bundle) {
        this.mBundle = bundle;
    }

    public void putString(String key, String value) {
        this.mBundle.putString(key, value);
    }

    public void putInt(String key, Integer value) {
        this.mBundle.putInt(key, value.intValue());
    }

    public void putLong(String key, Long value) {
        this.mBundle.putLong(key, value.longValue());
    }

    public void putBoolean(String key, Boolean value) {
        this.mBundle.putBoolean(key, value.booleanValue());
    }

    public String getString(String key) {
        return this.mBundle.getString(key);
    }

    public Integer getInt(String key) {
        return Integer.valueOf(this.mBundle.getInt(key));
    }

    public Long getLong(String key) {
        return Long.valueOf(this.mBundle.getLong(key));
    }

    public boolean getBoolean(String key) {
        return this.mBundle.getBoolean(key);
    }

    public boolean getBoolean(String key, boolean value) {
        return this.mBundle.getBoolean(key, value);
    }

    public boolean containsKey(String key) {
        return this.mBundle.containsKey(key);
    }

    public PersistableBundle getBundle() {
        return this.mBundle;
    }

    public void setBundle(Parcelable bundle) {
        PersistableBundle persistableBundle = (PersistableBundle) bundle;
        this.mBundle = persistableBundle;
    }
}
