package com.onesignal.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

public class SonyHomeBadger implements Badger {
    private static final String INTENT_ACTION = "com.sonyericsson.home.action.UPDATE_BADGE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME";
    private static final String INTENT_EXTRA_MESSAGE = "com.sonyericsson.home.intent.extra.badge.MESSAGE";
    private static final String INTENT_EXTRA_PACKAGE_NAME = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME";
    private static final String INTENT_EXTRA_SHOW_MESSAGE = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE";
    private static final String PROVIDER_COLUMNS_ACTIVITY_NAME = "activity_name";
    private static final String PROVIDER_COLUMNS_BADGE_COUNT = "badge_count";
    private static final String PROVIDER_COLUMNS_PACKAGE_NAME = "package_name";
    private static final String PROVIDER_CONTENT_URI = "content://com.sonymobile.home.resourceprovider/badge";
    private static final String SONY_HOME_PROVIDER_NAME = "com.sonymobile.home.resourceprovider";
    private final Uri BADGE_CONTENT_URI = Uri.parse(PROVIDER_CONTENT_URI);
    private AsyncQueryHandler mQueryHandler;

    public SonyHomeBadger() {
    }

    public void executeBadge(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Context context2 = context;
        ComponentName componentName2 = componentName;
        int badgeCount = i;
        if (sonyBadgeContentProviderExists(context2)) {
            executeBadgeByContentProvider(context2, componentName2, badgeCount);
        } else {
            executeBadgeByBroadcast(context2, componentName2, badgeCount);
        }
    }

    public List<String> getSupportLaunchers() {
        String[] strArr = new String[2];
        strArr[0] = "com.sonyericsson.home";
        String[] strArr2 = strArr;
        strArr2[1] = "com.sonymobile.home";
        return Arrays.asList(strArr2);
    }

    private static void executeBadgeByBroadcast(Context context, ComponentName componentName, int i) {
        Intent intent;
        Context context2 = context;
        ComponentName componentName2 = componentName;
        int badgeCount = i;
        new Intent(INTENT_ACTION);
        Intent intent2 = intent;
        Intent putExtra = intent2.putExtra(INTENT_EXTRA_PACKAGE_NAME, componentName2.getPackageName());
        Intent putExtra2 = intent2.putExtra(INTENT_EXTRA_ACTIVITY_NAME, componentName2.getClassName());
        Intent putExtra3 = intent2.putExtra(INTENT_EXTRA_MESSAGE, String.valueOf(badgeCount));
        Intent putExtra4 = intent2.putExtra(INTENT_EXTRA_SHOW_MESSAGE, badgeCount > 0);
        context2.sendBroadcast(intent2);
    }

    private void executeBadgeByContentProvider(Context context, ComponentName componentName, int i) {
        AsyncQueryHandler asyncQueryHandler;
        Context context2 = context;
        ComponentName componentName2 = componentName;
        int badgeCount = i;
        if (badgeCount >= 0) {
            ContentValues contentValues = createContentValues(badgeCount, componentName2);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.mQueryHandler == null) {
                    new AsyncQueryHandler(this, context2.getApplicationContext().getContentResolver()) {
                        final /* synthetic */ SonyHomeBadger this$0;

                        {
                            this.this$0 = this$0;
                        }
                    };
                    this.mQueryHandler = asyncQueryHandler;
                }
                insertBadgeAsync(contentValues);
                return;
            }
            insertBadgeSync(context2, contentValues);
        }
    }

    private void insertBadgeAsync(ContentValues contentValues) {
        this.mQueryHandler.startInsert(0, (Object) null, this.BADGE_CONTENT_URI, contentValues);
    }

    private void insertBadgeSync(Context context, ContentValues contentValues) {
        Uri insert = context.getApplicationContext().getContentResolver().insert(this.BADGE_CONTENT_URI, contentValues);
    }

    private ContentValues createContentValues(int badgeCount, ComponentName componentName) {
        ContentValues contentValues;
        ComponentName componentName2 = componentName;
        new ContentValues();
        ContentValues contentValues2 = contentValues;
        contentValues2.put(PROVIDER_COLUMNS_BADGE_COUNT, Integer.valueOf(badgeCount));
        contentValues2.put(PROVIDER_COLUMNS_PACKAGE_NAME, componentName2.getPackageName());
        contentValues2.put(PROVIDER_COLUMNS_ACTIVITY_NAME, componentName2.getClassName());
        return contentValues2;
    }

    private static boolean sonyBadgeContentProviderExists(Context context) {
        boolean exists = false;
        if (context.getPackageManager().resolveContentProvider(SONY_HOME_PROVIDER_NAME, 0) != null) {
            exists = true;
        }
        return exists;
    }
}
