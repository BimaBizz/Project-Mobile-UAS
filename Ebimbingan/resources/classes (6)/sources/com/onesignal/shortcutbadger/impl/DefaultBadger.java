package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.util.BroadcastHelper;
import java.util.ArrayList;
import java.util.List;

public class DefaultBadger implements Badger {
    private static final String INTENT_ACTION = "android.intent.action.BADGE_COUNT_UPDATE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "badge_count_class_name";
    private static final String INTENT_EXTRA_BADGE_COUNT = "badge_count";
    private static final String INTENT_EXTRA_PACKAGENAME = "badge_count_package_name";

    public DefaultBadger() {
    }

    public void executeBadge(Context context, ComponentName componentName, int badgeCount) throws ShortcutBadgeException {
        Intent intent;
        Throwable th;
        StringBuilder sb;
        Context context2 = context;
        ComponentName componentName2 = componentName;
        new Intent(INTENT_ACTION);
        Intent intent2 = intent;
        Intent putExtra = intent2.putExtra(INTENT_EXTRA_BADGE_COUNT, badgeCount);
        Intent putExtra2 = intent2.putExtra(INTENT_EXTRA_PACKAGENAME, componentName2.getPackageName());
        Intent putExtra3 = intent2.putExtra(INTENT_EXTRA_ACTIVITY_NAME, componentName2.getClassName());
        if (BroadcastHelper.canResolveBroadcast(context2, intent2)) {
            context2.sendBroadcast(intent2);
            return;
        }
        Throwable th2 = th;
        new StringBuilder();
        new ShortcutBadgeException(sb.append("unable to resolve intent: ").append(intent2.toString()).toString());
        throw th2;
    }

    public List<String> getSupportLaunchers() {
        List<String> list;
        new ArrayList(0);
        return list;
    }

    /* access modifiers changed from: package-private */
    public boolean isSupported(Context context) {
        Intent intent;
        new Intent(INTENT_ACTION);
        return BroadcastHelper.canResolveBroadcast(context, intent);
    }
}
