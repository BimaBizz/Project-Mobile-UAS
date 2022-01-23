package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

public class NovaHomeBadger implements Badger {
    private static final String CONTENT_URI = "content://com.teslacoilsw.notifier/unread_count";
    private static final String COUNT = "count";
    private static final String TAG = "tag";

    public NovaHomeBadger() {
    }

    public void executeBadge(Context context, ComponentName componentName, int badgeCount) throws ShortcutBadgeException {
        ContentValues contentValues;
        StringBuilder sb;
        ComponentName componentName2 = componentName;
        new ContentValues();
        ContentValues contentValues2 = contentValues;
        new StringBuilder();
        contentValues2.put("tag", sb.append(componentName2.getPackageName()).append("/").append(componentName2.getClassName()).toString());
        contentValues2.put("count", Integer.valueOf(badgeCount));
        Uri insert = context.getContentResolver().insert(Uri.parse(CONTENT_URI), contentValues2);
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList(new String[]{"com.teslacoilsw.launcher"});
    }
}
