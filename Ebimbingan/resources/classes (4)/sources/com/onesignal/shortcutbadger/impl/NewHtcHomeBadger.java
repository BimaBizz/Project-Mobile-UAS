package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.util.BroadcastHelper;
import java.util.Arrays;
import java.util.List;

public class NewHtcHomeBadger implements Badger {
    public static final String COUNT = "count";
    public static final String EXTRA_COMPONENT = "com.htc.launcher.extra.COMPONENT";
    public static final String EXTRA_COUNT = "com.htc.launcher.extra.COUNT";
    public static final String INTENT_SET_NOTIFICATION = "com.htc.launcher.action.SET_NOTIFICATION";
    public static final String INTENT_UPDATE_SHORTCUT = "com.htc.launcher.action.UPDATE_SHORTCUT";
    public static final String PACKAGENAME = "packagename";

    public NewHtcHomeBadger() {
    }

    public void executeBadge(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent;
        Intent intent2;
        Throwable th;
        StringBuilder sb;
        Context context2 = context;
        ComponentName componentName2 = componentName;
        int badgeCount = i;
        new Intent(INTENT_SET_NOTIFICATION);
        Intent intent1 = intent;
        Intent putExtra = intent1.putExtra(EXTRA_COMPONENT, componentName2.flattenToShortString());
        Intent putExtra2 = intent1.putExtra(EXTRA_COUNT, badgeCount);
        new Intent(INTENT_UPDATE_SHORTCUT);
        Intent intent3 = intent2;
        Intent putExtra3 = intent3.putExtra(PACKAGENAME, componentName2.getPackageName());
        Intent putExtra4 = intent3.putExtra(COUNT, badgeCount);
        if (BroadcastHelper.canResolveBroadcast(context2, intent1) || BroadcastHelper.canResolveBroadcast(context2, intent3)) {
            context2.sendBroadcast(intent1);
            context2.sendBroadcast(intent3);
            return;
        }
        Throwable th2 = th;
        new StringBuilder();
        new ShortcutBadgeException(sb.append("unable to resolve intent: ").append(intent3.toString()).toString());
        throw th2;
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList(new String[]{"com.htc.launcher"});
    }
}
