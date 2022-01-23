package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.util.CloseHelper;
import java.util.Arrays;
import java.util.List;

public class SamsungHomeBadger implements Badger {
    private static final String[] CONTENT_PROJECTION;
    private static final String CONTENT_URI = "content://com.sec.badge/apps?notify=true";
    private DefaultBadger defaultBadger;

    static {
        String[] strArr = new String[2];
        strArr[0] = "_id";
        String[] strArr2 = strArr;
        strArr2[1] = "class";
        CONTENT_PROJECTION = strArr2;
    }

    public SamsungHomeBadger() {
        DefaultBadger defaultBadger2;
        if (Build.VERSION.SDK_INT >= 21) {
            new DefaultBadger();
            this.defaultBadger = defaultBadger2;
        }
    }

    public void executeBadge(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Context context2 = context;
        ComponentName componentName2 = componentName;
        int badgeCount = i;
        if (this.defaultBadger == null || !this.defaultBadger.isSupported(context2)) {
            Uri mUri = Uri.parse(CONTENT_URI);
            ContentResolver contentResolver = context2.getContentResolver();
            try {
                Cursor cursor = contentResolver.query(mUri, CONTENT_PROJECTION, "package=?", new String[]{componentName2.getPackageName()}, (String) null);
                if (cursor != null) {
                    String entryActivityName = componentName2.getClassName();
                    boolean entryActivityExist = false;
                    while (cursor.moveToNext()) {
                        int update = contentResolver.update(mUri, getContentValues(componentName2, badgeCount, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                        if (entryActivityName.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            entryActivityExist = true;
                        }
                    }
                    if (!entryActivityExist) {
                        Uri insert = contentResolver.insert(mUri, getContentValues(componentName2, badgeCount, true));
                    }
                }
                CloseHelper.close(cursor);
            } catch (Throwable th) {
                CloseHelper.close((Cursor) null);
                throw th;
            }
        } else {
            this.defaultBadger.executeBadge(context2, componentName2, badgeCount);
        }
    }

    private ContentValues getContentValues(ComponentName componentName, int i, boolean isInsert) {
        ContentValues contentValues;
        ComponentName componentName2 = componentName;
        int badgeCount = i;
        new ContentValues();
        ContentValues contentValues2 = contentValues;
        if (isInsert) {
            contentValues2.put("package", componentName2.getPackageName());
            contentValues2.put("class", componentName2.getClassName());
        }
        contentValues2.put("badgecount", Integer.valueOf(badgeCount));
        return contentValues2;
    }

    public List<String> getSupportLaunchers() {
        String[] strArr = new String[2];
        strArr[0] = "com.sec.android.app.launcher";
        String[] strArr2 = strArr;
        strArr2[1] = "com.sec.android.app.twlauncher";
        return Arrays.asList(strArr2);
    }
}
