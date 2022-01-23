package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.util.BroadcastHelper;
import java.util.Arrays;
import java.util.List;

public class AdwHomeBadger implements Badger {
    public static final String CLASSNAME = "CNAME";
    public static final String COUNT = "COUNT";
    public static final String INTENT_UPDATE_COUNTER = "org.adw.launcher.counter.SEND";
    public static final String PACKAGENAME = "PNAME";

    public AdwHomeBadger() {
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
        Intent putExtra2 = intent2.putExtra(CLASSNAME, componentName2.getClassName());
        Intent putExtra3 = intent2.putExtra(COUNT, badgeCount);
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
        String[] strArr = new String[2];
        strArr[0] = "org.adw.launcher";
        String[] strArr2 = strArr;
        strArr2[1] = "org.adwfreak.launcher";
        return Arrays.asList(strArr2);
    }
}
