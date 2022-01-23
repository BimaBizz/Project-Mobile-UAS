package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.util.BroadcastHelper;
import java.util.Arrays;
import java.util.List;

public class ApexHomeBadger implements Badger {
    private static final String CLASS = "class";
    private static final String COUNT = "count";
    private static final String INTENT_UPDATE_COUNTER = "com.anddoes.launcher.COUNTER_CHANGED";
    private static final String PACKAGENAME = "package";

    public ApexHomeBadger() {
    }

    public void executeBadge(Context context, ComponentName componentName, int badgeCount) throws ShortcutBadgeException {
        Intent intent;
        Throwable th;
        StringBuilder sb;
        Context context2 = context;
        ComponentName componentName2 = componentName;
        new Intent(INTENT_UPDATE_COUNTER);
        Intent intent2 = intent;
        Intent putExtra = intent2.putExtra(PACKAGENAME, componentName2.getPackageName());
        Intent putExtra2 = intent2.putExtra("count", badgeCount);
        Intent putExtra3 = intent2.putExtra(CLASS, componentName2.getClassName());
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
        return Arrays.asList(new String[]{"com.anddoes.launcher"});
    }
}
