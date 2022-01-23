package com.onesignal.shortcutbadger.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

public class HuaweiHomeBadger implements Badger {
    public HuaweiHomeBadger() {
    }

    @SuppressLint({"NewApi"})
    public void executeBadge(Context context, ComponentName componentName, int badgeCount) throws ShortcutBadgeException {
        Bundle bundle;
        Context context2 = context;
        new Bundle();
        Bundle localBundle = bundle;
        localBundle.putString("package", context2.getPackageName());
        localBundle.putString("class", componentName.getClassName());
        localBundle.putInt("badgenumber", badgeCount);
        Bundle call = context2.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, localBundle);
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList(new String[]{"com.huawei.android.launcher"});
    }
}
