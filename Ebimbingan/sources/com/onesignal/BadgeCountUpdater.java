package com.onesignal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.annotation.RequiresApi;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbContract;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.ShortcutBadger;

class BadgeCountUpdater {
    private static int badgesEnabled = -1;

    BadgeCountUpdater() {
    }

    private static boolean areBadgeSettingsEnabled(Context context) {
        boolean z;
        boolean z2;
        Context context2 = context;
        if (badgesEnabled != -1) {
            if (badgesEnabled == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            return z2;
        }
        try {
            Bundle bundle = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 128).metaData;
            if (bundle != null) {
                badgesEnabled = "DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 0 : 1;
            } else {
                badgesEnabled = 1;
            }
        } catch (PackageManager.NameNotFoundException e) {
            badgesEnabled = 0;
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e);
        }
        if (badgesEnabled == 1) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private static boolean areBadgesEnabled(Context context) {
        Context context2 = context;
        return areBadgeSettingsEnabled(context2) && OSUtils.areNotificationsEnabled(context2);
    }

    static void update(OneSignalDb oneSignalDb, Context context) {
        OneSignalDb db = oneSignalDb;
        Context context2 = context;
        if (areBadgesEnabled(context2)) {
            if (Build.VERSION.SDK_INT >= 23) {
                updateStandard(context2);
            } else {
                updateFallback(db, context2);
            }
        }
    }

    @RequiresApi(api = 23)
    private static void updateStandard(Context context) {
        Context context2 = context;
        int runningCount = 0;
        StatusBarNotification[] activeNotifications = OneSignalNotificationManager.getActiveNotifications(context2);
        int length = activeNotifications.length;
        for (int i = 0; i < length; i++) {
            if (!NotificationLimitManager.isGroupSummary(activeNotifications[i])) {
                runningCount++;
            }
        }
        updateCount(runningCount, context2);
    }

    private static void updateFallback(OneSignalDb db, Context context) {
        Cursor cursor = db.query(OneSignalDbContract.NotificationTable.TABLE_NAME, (String[]) null, OneSignalDbHelper.recentUninteractedWithNotificationsWhere().toString(), (String[]) null, (String) null, (String) null, (String) null, NotificationLimitManager.MAX_NUMBER_OF_NOTIFICATIONS_STR);
        int notificationCount = cursor.getCount();
        cursor.close();
        updateCount(notificationCount, context);
    }

    static void updateCount(int i, Context context) {
        int count = i;
        Context context2 = context;
        if (areBadgeSettingsEnabled(context2)) {
            try {
                ShortcutBadger.applyCountOrThrow(context2, count);
            } catch (ShortcutBadgeException e) {
                ShortcutBadgeException shortcutBadgeException = e;
            }
        }
    }
}
