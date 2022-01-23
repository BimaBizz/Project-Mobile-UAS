package com.onesignal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.onesignal.OneSignalSyncServiceUtils;

public class SyncService extends Service {
    public SyncService() {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        OneSignalSyncServiceUtils.SyncRunnable syncRunnable;
        Intent intent2 = intent;
        int i3 = i;
        int i4 = i2;
        new OneSignalSyncServiceUtils.LegacySyncRunnable(this);
        OneSignalSyncServiceUtils.doBackgroundSync(this, syncRunnable);
        return 1;
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        Intent intent2 = intent;
        return null;
    }
}
