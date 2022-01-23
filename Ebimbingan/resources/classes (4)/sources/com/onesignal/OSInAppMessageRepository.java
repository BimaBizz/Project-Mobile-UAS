package com.onesignal;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.WorkerThread;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbContract;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

class OSInAppMessageRepository {
    static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    private final OneSignalDbHelper dbHelper;

    OSInAppMessageRepository(OneSignalDbHelper dbHelper2) {
        this.dbHelper = dbHelper2;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public synchronized void saveInAppMessage(OSInAppMessage oSInAppMessage) {
        ContentValues contentValues;
        OSInAppMessage inAppMessage = oSInAppMessage;
        synchronized (this) {
            new ContentValues();
            ContentValues values = contentValues;
            values.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID, inAppMessage.messageId);
            values.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_DISPLAY_QUANTITY, Integer.valueOf(inAppMessage.getRedisplayStats().getDisplayQuantity()));
            values.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_LAST_DISPLAY, Long.valueOf(inAppMessage.getRedisplayStats().getLastDisplayTime()));
            values.put(OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS, inAppMessage.getClickedClickIds().toString());
            values.put(OneSignalDbContract.InAppMessageTable.COLUMN_DISPLAYED_IN_SESSION, Boolean.valueOf(inAppMessage.isDisplayedInSession()));
            if (this.dbHelper.update(OneSignalDbContract.InAppMessageTable.TABLE_NAME, values, "message_id = ?", new String[]{inAppMessage.messageId}) == 0) {
                this.dbHelper.insert(OneSignalDbContract.InAppMessageTable.TABLE_NAME, (String) null, values);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public synchronized List<OSInAppMessage> getCachedInAppMessages() {
        List<OSInAppMessage> list;
        List<OSInAppMessage> list2;
        JSONArray jSONArray;
        Object obj;
        OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats;
        synchronized (this) {
            List<OSInAppMessage> list3 = list;
            new ArrayList();
            List<OSInAppMessage> inAppMessages = list3;
            try {
                Cursor cursor = this.dbHelper.query(OneSignalDbContract.InAppMessageTable.TABLE_NAME, (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                if (cursor.moveToFirst()) {
                    do {
                        String messageId = cursor.getString(cursor.getColumnIndex(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID));
                        String clickIds = cursor.getString(cursor.getColumnIndex(OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS));
                        int displayQuantity = cursor.getInt(cursor.getColumnIndex(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_DISPLAY_QUANTITY));
                        long lastDisplay = cursor.getLong(cursor.getColumnIndex(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_LAST_DISPLAY));
                        boolean displayed = cursor.getInt(cursor.getColumnIndex(OneSignalDbContract.InAppMessageTable.COLUMN_DISPLAYED_IN_SESSION)) == 1;
                        new JSONArray(clickIds);
                        Set<String> clickIdsSet = OSUtils.newStringSetFromJSONArray(jSONArray);
                        new OSInAppMessageRedisplayStats(displayQuantity, lastDisplay);
                        new OSInAppMessage(messageId, clickIdsSet, displayed, oSInAppMessageRedisplayStats);
                        boolean add = inAppMessages.add(obj);
                    } while (cursor.moveToNext());
                }
                if (cursor != null) {
                    if (!cursor.isClosed()) {
                        cursor.close();
                    }
                }
            } catch (JSONException e) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Generating JSONArray from iam click ids:JSON Failed.", e);
                if (0 != 0) {
                    Cursor cursor2 = null;
                    if (!cursor2.isClosed()) {
                        Cursor cursor3 = null;
                        cursor3.close();
                    }
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                if (0 != 0) {
                    Cursor cursor4 = null;
                    if (!cursor4.isClosed()) {
                        Cursor cursor5 = null;
                        cursor5.close();
                    }
                }
                throw th2;
            }
            list2 = inAppMessages;
        }
        return list2;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public synchronized void cleanCachedInAppMessages() {
        JSONArray jSONArray;
        synchronized (this) {
            String[] strArr = new String[2];
            strArr[0] = OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID;
            String[] strArr2 = strArr;
            strArr2[1] = OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS;
            String[] retColumns = strArr2;
            String whereStr = "last_display < ?";
            String[] whereArgs = {String.valueOf((System.currentTimeMillis() / 1000) - IAM_CACHE_DATA_LIFETIME)};
            Set<String> oldMessageIds = OSUtils.newConcurrentSet();
            Set<String> oldClickedClickIds = OSUtils.newConcurrentSet();
            Cursor cursor = null;
            try {
                cursor = this.dbHelper.query(OneSignalDbContract.InAppMessageTable.TABLE_NAME, retColumns, whereStr, whereArgs, (String) null, (String) null, (String) null);
                if (cursor == null || cursor.getCount() == 0) {
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "Attempted to clean 6 month old IAM data, but none exists!");
                    if (cursor != null) {
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                    }
                } else {
                    if (cursor.moveToFirst()) {
                        do {
                            String oldMessageId = cursor.getString(cursor.getColumnIndex(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID));
                            String oldClickIds = cursor.getString(cursor.getColumnIndex(OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS));
                            boolean add = oldMessageIds.add(oldMessageId);
                            new JSONArray(oldClickIds);
                            boolean addAll = oldClickedClickIds.addAll(OSUtils.newStringSetFromJSONArray(jSONArray));
                        } while (cursor.moveToNext());
                    }
                    if (cursor != null) {
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                    }
                    this.dbHelper.delete(OneSignalDbContract.InAppMessageTable.TABLE_NAME, whereStr, whereArgs);
                    cleanInAppMessageIds(oldMessageIds);
                    cleanInAppMessageClickedClickIds(oldClickedClickIds);
                }
            } catch (JSONException e) {
                e.printStackTrace();
                if (cursor != null) {
                    if (!cursor.isClosed()) {
                        cursor.close();
                    }
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                throw th2;
            }
        }
    }

    private void cleanInAppMessageIds(Set<String> set) {
        Set<String> oldMessageIds = set;
        if (oldMessageIds != null && oldMessageIds.size() > 0) {
            Set<String> dismissedMessages = OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_DISMISSED_IAMS, (Set<String>) null);
            Set<String> impressionedMessages = OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_IMPRESSIONED_IAMS, (Set<String>) null);
            if (dismissedMessages != null && dismissedMessages.size() > 0) {
                boolean removeAll = dismissedMessages.removeAll(oldMessageIds);
                OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_DISMISSED_IAMS, dismissedMessages);
            }
            if (impressionedMessages != null && impressionedMessages.size() > 0) {
                boolean removeAll2 = impressionedMessages.removeAll(oldMessageIds);
                OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_IMPRESSIONED_IAMS, impressionedMessages);
            }
        }
    }

    private void cleanInAppMessageClickedClickIds(Set<String> set) {
        Set<String> clickedClickIds;
        Set<String> oldClickedClickIds = set;
        if (oldClickedClickIds != null && oldClickedClickIds.size() > 0 && (clickedClickIds = OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CLICKED_CLICK_IDS_IAMS, (Set<String>) null)) != null && clickedClickIds.size() > 0) {
            boolean removeAll = clickedClickIds.removeAll(oldClickedClickIds);
            OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CLICKED_CLICK_IDS_IAMS, clickedClickIds);
        }
    }
}
