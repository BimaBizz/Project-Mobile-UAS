package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.onesignal.OneSignalDbContract;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationSummaryManager {
    NotificationSummaryManager() {
    }

    static void updatePossibleDependentSummaryOnDismiss(Context context, OneSignalDb oneSignalDb, int androidNotificationId) {
        StringBuilder sb;
        Context context2 = context;
        OneSignalDb db = oneSignalDb;
        String[] strArr = {OneSignalDbContract.NotificationTable.COLUMN_NAME_GROUP_ID};
        new StringBuilder();
        Cursor cursor = db.query(OneSignalDbContract.NotificationTable.TABLE_NAME, strArr, sb.append("android_notification_id = ").append(androidNotificationId).toString(), (String[]) null, (String) null, (String) null, (String) null);
        if (cursor.moveToFirst()) {
            String group = cursor.getString(cursor.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_GROUP_ID));
            cursor.close();
            if (group != null) {
                updateSummaryNotificationAfterChildRemoved(context2, db, group, true);
                return;
            }
            return;
        }
        cursor.close();
    }

    static void updateSummaryNotificationAfterChildRemoved(Context context, OneSignalDb db, String group, boolean dismissed) {
        try {
            Cursor cursor = internalUpdateSummaryNotificationAfterChildRemoved(context, db, group, dismissed);
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            if (0 != 0) {
                Cursor cursor2 = null;
                if (!cursor2.isClosed()) {
                    Cursor cursor3 = null;
                    cursor3.close();
                }
            }
            throw th2;
        }
    }

    private static Cursor internalUpdateSummaryNotificationAfterChildRemoved(Context context, OneSignalDb oneSignalDb, String str, boolean z) {
        NotificationGenerationJob notificationGenerationJob;
        JSONObject jSONObject;
        ContentValues contentValues;
        StringBuilder sb;
        Context context2 = context;
        OneSignalDb db = oneSignalDb;
        String group = str;
        boolean dismissed = z;
        String[] strArr = new String[2];
        strArr[0] = OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID;
        String[] strArr2 = strArr;
        strArr2[1] = OneSignalDbContract.NotificationTable.COLUMN_NAME_CREATED_TIME;
        Cursor cursor = db.query(OneSignalDbContract.NotificationTable.TABLE_NAME, strArr2, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{group}, (String) null, (String) null, "_id DESC");
        int notifsInGroup = cursor.getCount();
        if (notifsInGroup == 0) {
            cursor.close();
            Integer androidNotifId = getSummaryNotificationId(db, group);
            if (androidNotifId == null) {
                return cursor;
            }
            OneSignalNotificationManager.getNotificationManager(context2).cancel(androidNotifId.intValue());
            new ContentValues();
            ContentValues values = contentValues;
            values.put(dismissed ? OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED : OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, 1);
            new StringBuilder();
            int update = db.update(OneSignalDbContract.NotificationTable.TABLE_NAME, values, sb.append("android_notification_id = ").append(androidNotifId).toString(), (String[]) null);
            return cursor;
        } else if (notifsInGroup == 1) {
            cursor.close();
            if (getSummaryNotificationId(db, group) == null) {
                return cursor;
            }
            restoreSummary(context2, group);
            return cursor;
        } else {
            try {
                boolean moveToFirst = cursor.moveToFirst();
                Long datetime = Long.valueOf(cursor.getLong(cursor.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_CREATED_TIME)));
                cursor.close();
                if (getSummaryNotificationId(db, group) == null) {
                    return cursor;
                }
                new NotificationGenerationJob(context2);
                NotificationGenerationJob notifJob = notificationGenerationJob;
                notifJob.restoring = true;
                notifJob.shownTimeStamp = datetime;
                new JSONObject();
                JSONObject payload = jSONObject;
                JSONObject put = payload.put("grp", group);
                notifJob.jsonPayload = payload;
                GenerateNotification.updateSummaryNotification(notifJob);
                return cursor;
            } catch (JSONException e) {
                JSONException jSONException = e;
            }
        }
    }

    private static void restoreSummary(Context context, String group) {
        Context context2 = context;
        Cursor cursor = null;
        try {
            cursor = OneSignalDbHelper.getInstance(context2).query(OneSignalDbContract.NotificationTable.TABLE_NAME, NotificationRestorer.COLUMNS_FOR_RESTORE, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{group}, (String) null, (String) null, (String) null);
            NotificationRestorer.showNotificationsFromCursor(context2, cursor, 0);
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

    static Integer getSummaryNotificationId(OneSignalDb db, String str) {
        StringBuilder sb;
        String group = str;
        Integer androidNotifId = null;
        Cursor cursor = null;
        try {
            cursor = db.query(OneSignalDbContract.NotificationTable.TABLE_NAME, new String[]{OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1", new String[]{group}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                return null;
            }
            androidNotifId = Integer.valueOf(cursor.getInt(cursor.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID)));
            cursor.close();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            return androidNotifId;
        } catch (Throwable th) {
            Throwable th2 = th;
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th2;
        }
    }

    static void clearNotificationOnSummaryClick(Context context, OneSignalDbHelper oneSignalDbHelper, String str) {
        OneSignalDbHelper dbHelper = oneSignalDbHelper;
        String group = str;
        Integer groupId = getSummaryNotificationId(dbHelper, group);
        boolean isGroupless = group.equals(OneSignalNotificationManager.getGrouplessSummaryKey());
        NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager(context);
        Integer mostRecentId = OneSignalNotificationManager.getMostRecentNotifIdFromGroup(dbHelper, group, isGroupless);
        if (mostRecentId == null) {
            return;
        }
        if (OneSignal.getClearGroupSummaryClick()) {
            if (isGroupless) {
                groupId = Integer.valueOf(OneSignalNotificationManager.getGrouplessSummaryId());
            }
            if (groupId != null) {
                notificationManager.cancel(groupId.intValue());
                return;
            }
            return;
        }
        OneSignal.cancelNotification(mostRecentId.intValue());
    }
}
