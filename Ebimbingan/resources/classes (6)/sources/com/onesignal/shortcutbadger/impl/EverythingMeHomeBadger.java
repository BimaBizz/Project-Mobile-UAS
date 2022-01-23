package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

public class EverythingMeHomeBadger implements Badger {
    private static final String COLUMN_ACTIVITY_NAME = "activity_name";
    private static final String COLUMN_COUNT = "count";
    private static final String COLUMN_PACKAGE_NAME = "package_name";
    private static final String CONTENT_URI = "content://me.everything.badger/apps";

    public EverythingMeHomeBadger() {
    }

    public void executeBadge(Context context, ComponentName componentName, int badgeCount) throws ShortcutBadgeException {
        ContentValues contentValues;
        ComponentName componentName2 = componentName;
        new ContentValues();
        ContentValues contentValues2 = contentValues;
        contentValues2.put(COLUMN_PACKAGE_NAME, componentName2.getPackageName());
        contentValues2.put(COLUMN_ACTIVITY_NAME, componentName2.getClassName());
        contentValues2.put("count", Integer.valueOf(badgeCount));
        Uri insert = context.getContentResolver().insert(Uri.parse(CONTENT_URI), contentValues2);
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList(new String[]{"me.everything.launcher"});
    }
}
