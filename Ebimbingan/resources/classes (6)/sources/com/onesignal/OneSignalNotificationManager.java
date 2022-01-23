package com.onesignal;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.onesignal.OneSignalDbContract;
import java.util.ArrayList;
import java.util.Iterator;

public class OneSignalNotificationManager {
    private static final int GROUPLESS_SUMMARY_ID = -718463522;
    private static final String GROUPLESS_SUMMARY_KEY = "os_group_undefined";

    public OneSignalNotificationManager() {
    }

    static String getGrouplessSummaryKey() {
        return GROUPLESS_SUMMARY_KEY;
    }

    static int getGrouplessSummaryId() {
        return GROUPLESS_SUMMARY_ID;
    }

    static NotificationManager getNotificationManager(Context context) {
        return (NotificationManager) context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
    }

    @RequiresApi(api = 23)
    static Integer getGrouplessNotifsCount(Context context) {
        int groupCount = 0;
        StatusBarNotification[] activeNotifications = getActiveNotifications(context);
        int length = activeNotifications.length;
        for (int i = 0; i < length; i++) {
            StatusBarNotification statusBarNotification = activeNotifications[i];
            if (!NotificationCompat.isGroupSummary(statusBarNotification.getNotification()) && GROUPLESS_SUMMARY_KEY.equals(statusBarNotification.getNotification().getGroup())) {
                groupCount++;
            }
        }
        return Integer.valueOf(groupCount);
    }

    @RequiresApi(api = 23)
    static StatusBarNotification[] getActiveNotifications(Context context) {
        StatusBarNotification[] statusBarNotifications = new StatusBarNotification[0];
        try {
            statusBarNotifications = getNotificationManager(context).getActiveNotifications();
        } catch (Throwable th) {
            Throwable th2 = th;
        }
        return statusBarNotifications;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.RequiresApi(api = 23)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.ArrayList<android.service.notification.StatusBarNotification> getActiveGrouplessNotifications(android.content.Context r13) {
        /*
            r0 = r13
            java.util.ArrayList r10 = new java.util.ArrayList
            r12 = r10
            r10 = r12
            r11 = r12
            r11.<init>()
            r1 = r10
            r10 = r0
            android.service.notification.StatusBarNotification[] r10 = getActiveNotifications(r10)
            r2 = r10
            r10 = r2
            r3 = r10
            r10 = r3
            int r10 = r10.length
            r4 = r10
            r10 = 0
            r5 = r10
        L_0x0017:
            r10 = r5
            r11 = r4
            if (r10 >= r11) goto L_0x0055
            r10 = r3
            r11 = r5
            r10 = r10[r11]
            r6 = r10
            r10 = r6
            android.app.Notification r10 = r10.getNotification()
            r7 = r10
            r10 = r6
            boolean r10 = com.onesignal.NotificationLimitManager.isGroupSummary(r10)
            r8 = r10
            r10 = r7
            java.lang.String r10 = r10.getGroup()
            if (r10 == 0) goto L_0x0042
            r10 = r7
            java.lang.String r10 = r10.getGroup()
            java.lang.String r11 = getGrouplessSummaryKey()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0053
        L_0x0042:
            r10 = 1
        L_0x0043:
            r9 = r10
            r10 = r8
            if (r10 != 0) goto L_0x0050
            r10 = r9
            if (r10 == 0) goto L_0x0050
            r10 = r1
            r11 = r6
            boolean r10 = r10.add(r11)
        L_0x0050:
            int r5 = r5 + 1
            goto L_0x0017
        L_0x0053:
            r10 = 0
            goto L_0x0043
        L_0x0055:
            r10 = r1
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OneSignalNotificationManager.getActiveGrouplessNotifications(android.content.Context):java.util.ArrayList");
    }

    @RequiresApi(api = 23)
    static void assignGrouplessNotifications(Context context, ArrayList<StatusBarNotification> grouplessNotifs) {
        Notification.Builder builder;
        Notification.Builder grouplessNotifBuilder;
        Context context2 = context;
        Iterator<StatusBarNotification> it = grouplessNotifs.iterator();
        while (it.hasNext()) {
            StatusBarNotification grouplessNotif = it.next();
            if (Build.VERSION.SDK_INT >= 24) {
                grouplessNotifBuilder = Notification.Builder.recoverBuilder(context2, grouplessNotif.getNotification());
            } else {
                grouplessNotifBuilder = builder;
                new Notification.Builder(context2);
            }
            NotificationManagerCompat.from(context2).notify(grouplessNotif.getId(), grouplessNotifBuilder.setGroup(GROUPLESS_SUMMARY_KEY).build());
        }
    }

    static Integer getMostRecentNotifIdFromGroup(OneSignalDbHelper oneSignalDbHelper, String str, boolean z) {
        StringBuilder sb;
        String[] whereArgs;
        OneSignalDbHelper db = oneSignalDbHelper;
        String group = str;
        boolean isGroupless = z;
        String whereStr = isGroupless ? "group_id IS NULL" : "group_id = ?";
        new StringBuilder();
        String whereStr2 = sb.append(whereStr).append(" AND dismissed = 0 AND opened = 0 AND is_summary = 0").toString();
        if (isGroupless) {
            whereArgs = null;
        } else {
            String[] strArr = new String[1];
            whereArgs = strArr;
            strArr[0] = group;
        }
        Cursor cursor = db.query(OneSignalDbContract.NotificationTable.TABLE_NAME, (String[]) null, whereStr2, whereArgs, (String) null, (String) null, "created_time DESC", "1");
        if (!cursor.moveToFirst()) {
            cursor.close();
            return null;
        }
        Integer recentId = Integer.valueOf(cursor.getInt(cursor.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID)));
        cursor.close();
        return recentId;
    }
}
