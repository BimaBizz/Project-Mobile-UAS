package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import androidx.annotation.RequiresApi;
import com.onesignal.OneSignalDbContract;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class NotificationLimitManager {
    private static final int MAX_NUMBER_OF_NOTIFICATIONS_INT = 49;
    static final String MAX_NUMBER_OF_NOTIFICATIONS_STR = Integer.toString(MAX_NUMBER_OF_NOTIFICATIONS_INT);

    NotificationLimitManager() {
    }

    private static int getMaxNumberOfNotificationsInt() {
        return MAX_NUMBER_OF_NOTIFICATIONS_INT;
    }

    private static String getMaxNumberOfNotificationsString() {
        return MAX_NUMBER_OF_NOTIFICATIONS_STR;
    }

    static void clearOldestOverLimit(Context context, int i) {
        Context context2 = context;
        int notifsToMakeRoomFor = i;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                clearOldestOverLimitStandard(context2, notifsToMakeRoomFor);
            } else {
                clearOldestOverLimitFallback(context2, notifsToMakeRoomFor);
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            clearOldestOverLimitFallback(context2, notifsToMakeRoomFor);
        }
    }

    @RequiresApi(api = 23)
    static void clearOldestOverLimitStandard(Context context, int notifsToMakeRoomFor) throws Throwable {
        SortedMap<Long, Integer> sortedMap;
        StatusBarNotification[] activeNotifs = OneSignalNotificationManager.getActiveNotifications(context);
        int notifsToClear = (activeNotifs.length - getMaxNumberOfNotificationsInt()) + notifsToMakeRoomFor;
        if (notifsToClear >= 1) {
            new TreeMap<>();
            SortedMap<Long, Integer> activeNotifIds = sortedMap;
            StatusBarNotification[] statusBarNotificationArr = activeNotifs;
            int length = statusBarNotificationArr.length;
            for (int i = 0; i < length; i++) {
                StatusBarNotification activeNotif = statusBarNotificationArr[i];
                if (!isGroupSummary(activeNotif)) {
                    Object put = activeNotifIds.put(Long.valueOf(activeNotif.getNotification().when), Integer.valueOf(activeNotif.getId()));
                }
            }
            for (Map.Entry<Long, Integer> value : activeNotifIds.entrySet()) {
                OneSignal.cancelNotification(((Integer) value.getValue()).intValue());
                notifsToClear--;
                if (notifsToClear <= 0) {
                    return;
                }
            }
        }
    }

    static void clearOldestOverLimitFallback(Context context, int i) {
        StringBuilder sb;
        int notifsToMakeRoomFor = i;
        Cursor cursor = null;
        OneSignalDbHelper instance = OneSignalDbHelper.getInstance(context);
        try {
            String[] strArr = {OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID};
            String sb2 = OneSignalDbHelper.recentUninteractedWithNotificationsWhere().toString();
            new StringBuilder();
            cursor = instance.query(OneSignalDbContract.NotificationTable.TABLE_NAME, strArr, sb2, (String[]) null, (String) null, (String) null, "_id", sb.append(getMaxNumberOfNotificationsString()).append(notifsToMakeRoomFor).toString());
            int notifsToClear = (cursor.getCount() - getMaxNumberOfNotificationsInt()) + notifsToMakeRoomFor;
            if (notifsToClear >= 1) {
                do {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    OneSignal.cancelNotification(cursor.getInt(cursor.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID)));
                    notifsToClear--;
                } while (notifsToClear > 0);
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            } else if (cursor != null && !cursor.isClosed()) {
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

    @RequiresApi(api = 21)
    static boolean isGroupSummary(StatusBarNotification notif) {
        return (notif.getNotification().flags & 512) != 0;
    }
}
