package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

public class VivoHomeBadger implements Badger {
    public VivoHomeBadger() {
    }

    public void executeBadge(Context context, ComponentName componentName, int badgeCount) throws ShortcutBadgeException {
        Intent intent;
        Context context2 = context;
        new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        Intent intent2 = intent;
        Intent putExtra = intent2.putExtra("packageName", context2.getPackageName());
        Intent putExtra2 = intent2.putExtra("className", componentName.getClassName());
        Intent putExtra3 = intent2.putExtra("notificationNum", badgeCount);
        context2.sendBroadcast(intent2);
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList(new String[]{"com.vivo.launcher"});
    }
}
