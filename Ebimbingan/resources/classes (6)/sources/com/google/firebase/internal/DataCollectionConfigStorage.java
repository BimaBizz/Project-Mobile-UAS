package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class DataCollectionConfigStorage {
    @VisibleForTesting
    public static final String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";
    private static final String FIREBASE_APP_PREFS = "com.google.firebase.common.prefs:";
    private final Context applicationContext;
    private final AtomicBoolean dataCollectionDefaultEnabled;
    private final Publisher publisher;
    private final SharedPreferences sharedPreferences;

    public DataCollectionConfigStorage(Context context, String persistenceKey, Publisher publisher2) {
        StringBuilder sb;
        AtomicBoolean atomicBoolean;
        Context applicationContext2 = context;
        this.applicationContext = directBootSafe(applicationContext2);
        new StringBuilder();
        this.sharedPreferences = applicationContext2.getSharedPreferences(sb.append(FIREBASE_APP_PREFS).append(persistenceKey).toString(), 0);
        this.publisher = publisher2;
        new AtomicBoolean(readAutoDataCollectionEnabled());
        this.dataCollectionDefaultEnabled = atomicBoolean;
    }

    private static Context directBootSafe(Context context) {
        Context applicationContext2 = context;
        if (Build.VERSION.SDK_INT < 24 || ContextCompat.isDeviceProtectedStorage(applicationContext2)) {
            return applicationContext2;
        }
        return ContextCompat.createDeviceProtectedStorageContext(applicationContext2);
    }

    public boolean isEnabled() {
        return this.dataCollectionDefaultEnabled.get();
    }

    public void setEnabled(boolean z) {
        Event event;
        Object obj;
        boolean enabled = z;
        if (this.dataCollectionDefaultEnabled.compareAndSet(!enabled, enabled)) {
            this.sharedPreferences.edit().putBoolean(DATA_COLLECTION_DEFAULT_ENABLED, enabled).apply();
            new DataCollectionDefaultChange(enabled);
            new Event(DataCollectionDefaultChange.class, obj);
            this.publisher.publish(event);
        }
    }

    private boolean readAutoDataCollectionEnabled() {
        ApplicationInfo applicationInfo;
        if (this.sharedPreferences.contains(DATA_COLLECTION_DEFAULT_ENABLED)) {
            return this.sharedPreferences.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED, true);
        }
        try {
            PackageManager packageManager = this.applicationContext.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.applicationContext.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(DATA_COLLECTION_DEFAULT_ENABLED))) {
                return applicationInfo.metaData.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED);
            }
        } catch (PackageManager.NameNotFoundException e) {
            PackageManager.NameNotFoundException nameNotFoundException = e;
        }
        return true;
    }
}
