package com.onesignal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbContract;
import java.util.ArrayList;

class NotificationRestorer {
    static final String[] COLUMNS_FOR_RESTORE;
    static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private static final int RESTORE_KICKOFF_REQUEST_CODE = 2071862120;
    private static final int RESTORE_NOTIFICATIONS_DELAY_MS = 15000;
    public static boolean restored;

    NotificationRestorer() {
    }

    static {
        String[] strArr = new String[3];
        strArr[0] = OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID;
        String[] strArr2 = strArr;
        strArr2[1] = OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA;
        String[] strArr3 = strArr2;
        strArr3[2] = OneSignalDbContract.NotificationTable.COLUMN_NAME_CREATED_TIME;
        COLUMNS_FOR_RESTORE = strArr3;
    }

    static void asyncRestore(Context context) {
        Thread thread;
        Runnable runnable;
        final Context context2 = context;
        new Runnable() {
            public void run() {
                Thread.currentThread().setPriority(10);
                NotificationRestorer.restore(context2);
            }
        };
        new Thread(runnable, "OS_RESTORE_NOTIFS");
        thread.start();
    }

    @WorkerThread
    public static void restore(Context context) {
        Context context2 = context;
        if (OSUtils.areNotificationsEnabled(context2) && !restored) {
            restored = true;
            OneSignal.Log(OneSignal.LOG_LEVEL.INFO, "Restoring notifications");
            OneSignalDbHelper dbHelper = OneSignalDbHelper.getInstance(context2);
            StringBuilder dbQuerySelection = OneSignalDbHelper.recentUninteractedWithNotificationsWhere();
            skipVisibleNotifications(context2, dbQuerySelection);
            queryAndRestoreNotificationsAndBadgeCount(context2, dbHelper, dbQuerySelection);
        }
    }

    private static void queryAndRestoreNotificationsAndBadgeCount(Context context, OneSignalDbHelper oneSignalDbHelper, StringBuilder sb) {
        StringBuilder sb2;
        Context context2 = context;
        OneSignalDbHelper dbHelper = oneSignalDbHelper;
        StringBuilder dbQuerySelection = sb;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        new StringBuilder();
        OneSignal.Log(log_level, sb2.append("Querying DB for notifs to restore: ").append(dbQuerySelection.toString()).toString());
        Cursor cursor = null;
        try {
            cursor = dbHelper.query(OneSignalDbContract.NotificationTable.TABLE_NAME, COLUMNS_FOR_RESTORE, dbQuerySelection.toString(), (String[]) null, (String) null, (String) null, "_id DESC", NotificationLimitManager.MAX_NUMBER_OF_NOTIFICATIONS_STR);
            showNotificationsFromCursor(context2, cursor, DELAY_BETWEEN_NOTIFICATION_RESTORES_MS);
            BadgeCountUpdater.update(dbHelper, context2);
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th2;
        }
    }

    private static void skipVisibleNotifications(Context context, StringBuilder sb) {
        ArrayList arrayList;
        Context context2 = context;
        StringBuilder dbQuerySelection = sb;
        if (Build.VERSION.SDK_INT >= 23) {
            StatusBarNotification[] activeNotifs = OneSignalNotificationManager.getActiveNotifications(context2);
            if (activeNotifs.length != 0) {
                new ArrayList();
                ArrayList arrayList2 = arrayList;
                StatusBarNotification[] statusBarNotificationArr = activeNotifs;
                int length = statusBarNotificationArr.length;
                for (int i = 0; i < length; i++) {
                    boolean add = arrayList2.add(Integer.valueOf(statusBarNotificationArr[i].getId()));
                }
                StringBuilder append = dbQuerySelection.append(" AND android_notification_id NOT IN (").append(TextUtils.join(",", arrayList2)).append(")");
            }
        }
    }

    static void showNotificationsFromCursor(Context context, Cursor cursor, int i) {
        Intent intent;
        ComponentName componentName;
        Context context2 = context;
        Cursor cursor2 = cursor;
        int delay = i;
        if (cursor2.moveToFirst()) {
            boolean useExtender = NotificationExtenderService.getIntent(context2) != null;
            do {
                if (useExtender) {
                    Intent intent2 = NotificationExtenderService.getIntent(context2);
                    Intent addRestoreExtras = addRestoreExtras(intent2, cursor2);
                    NotificationExtenderService.enqueueWork(context2, intent2.getComponent(), 2071862121, intent2, false);
                } else {
                    new Intent();
                    Intent intent3 = addRestoreExtras(intent, cursor2);
                    new ComponentName(context2, RestoreJobService.class);
                    RestoreJobService.enqueueWork(context2, componentName, 2071862122, intent3, false);
                }
                if (delay > 0) {
                    OSUtils.sleep(delay);
                }
            } while (cursor2.moveToNext());
        }
    }

    private static Intent addRestoreExtras(Intent intent, Cursor cursor) {
        Intent intent2 = intent;
        Cursor cursor2 = cursor;
        int existingId = cursor2.getInt(cursor2.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID));
        String fullData = cursor2.getString(cursor2.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA));
        Intent putExtra = intent2.putExtra("json_payload", fullData).putExtra("android_notif_id", existingId).putExtra("restoring", true).putExtra("timestamp", Long.valueOf(cursor2.getLong(cursor2.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_CREATED_TIME))));
        return intent2;
    }

    static void startDelayedRestoreTaskFromReceiver(Context context) {
        Intent intent;
        ComponentName componentName;
        JobInfo.Builder jobBuilder;
        ComponentName componentName2;
        Context context2 = context;
        if (Build.VERSION.SDK_INT >= 21) {
            OneSignal.Log(OneSignal.LOG_LEVEL.INFO, "scheduleRestoreKickoffJob");
            new ComponentName(context2, RestoreKickoffJobService.class);
            new JobInfo.Builder(RESTORE_KICKOFF_REQUEST_CODE, componentName2);
            int schedule = ((JobScheduler) context2.getSystemService("jobscheduler")).schedule(jobBuilder.setOverrideDeadline(15000).setMinimumLatency(15000).build());
            return;
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.INFO, "scheduleRestoreKickoffAlarmTask");
        new Intent();
        Intent intentForService = intent;
        new ComponentName(context2.getPackageName(), NotificationRestoreService.class.getName());
        Intent component = intentForService.setComponent(componentName);
        PendingIntent pendingIntent = PendingIntent.getService(context2, RESTORE_KICKOFF_REQUEST_CODE, intentForService, 134217728);
        ((AlarmManager) context2.getSystemService("alarm")).set(1, System.currentTimeMillis() + 15000, pendingIntent);
    }
}
