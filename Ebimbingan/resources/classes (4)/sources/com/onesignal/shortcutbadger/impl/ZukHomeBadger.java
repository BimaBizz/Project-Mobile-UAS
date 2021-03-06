package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Collections;
import java.util.List;

public class ZukHomeBadger implements Badger {
    private final Uri CONTENT_URI = Uri.parse("content://com.android.badge/badge");

    public ZukHomeBadger() {
    }

    @TargetApi(11)
    public void executeBadge(Context context, ComponentName componentName, int badgeCount) throws ShortcutBadgeException {
        Bundle bundle;
        ComponentName componentName2 = componentName;
        new Bundle();
        Bundle extra = bundle;
        extra.putInt("app_badge_count", badgeCount);
        Bundle call = context.getContentResolver().call(this.CONTENT_URI, "setAppBadgeCount", (String) null, extra);
    }

    public List<String> getSupportLaunchers() {
        return Collections.singletonList("com.zui.launcher");
    }
}
